package org.vti.Backend;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.Department;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class DepartmentRepository implements IDepartmentRepository {

	private HibernateUtils hibernateUtils;

	public DepartmentRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Department> getAllDepartments() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Department> query = session.createQuery("FROM Department");

			return query.list();

		}catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public Department getDepartmentByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			Department department = session.get(Department.class, id);

			return department;

		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public Department getDepartmentByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Department> query = session.createQuery("FROM Department WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Department department = query.uniqueResult();

			return department;

		} catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void createDepartment(Department department) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(department);

			session.getTransaction().commit();
		}catch (Exception e){
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void updateDepartment(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Department department = (Department) session.load(Department.class, id);

			// update
			department.setName(newName);

			session.getTransaction().commit();

		}catch (Exception e){
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void updateDepartment(Department department) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(department);

			session.getTransaction().commit();
		}catch (Exception e){
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void deleteDepartment(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Department department = (Department) session.load(Department.class, id);

			// delete
			session.delete(department);

			session.getTransaction().commit();

		}catch (Exception e){
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public boolean isDepartmentExistsByID(short id) {

		// get department
		Department department = getDepartmentByID(id);

		// return result
		if (department == null) {
			return false;
		}

		return true;
	}

	@Override
	public boolean isDepartmentExistsByName(String name) {
		Department department = getDepartmentByName(name);

		if (department == null) {
			return false;
		}
		return true;
	}
}
