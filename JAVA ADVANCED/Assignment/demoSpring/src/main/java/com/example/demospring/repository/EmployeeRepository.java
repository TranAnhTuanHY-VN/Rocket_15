package com.example.demospring.repository;


import com.example.demospring.entity.Employee;
import com.example.demospring.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

	private HibernateUtils hibernateUtils;

	public EmployeeRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Employee> query = session.createQuery("FROM Employee ");

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
	public Employee getEmployeeByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			Employee employee = session.get(Employee.class, id);

			return employee;

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
	@SuppressWarnings("unchecked")
	public Employee getEmployeeByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Employee> query = session.createQuery("FROM Employee WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Employee employee = query.uniqueResult();

			return employee;

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
	public void createEmployee(Employee employee) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(employee);

			session.getTransaction().commit();
		}catch (Exception e){
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void updateEmployee(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Employee employee = (Employee) session.load(Employee.class, id);

			// update
			employee.setName(newName);

			session.getTransaction().commit();

		}catch (Exception e){
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void updateEmployee(Employee employee) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(employee);

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
	public void deleteEmployee(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Employee employee = (Employee) session.load(Employee.class, id);

			// delete
			session.delete(employee);

			session.getTransaction().commit();

		}catch (Exception e){
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public boolean isEmployeeExistsByID(short id) {

		// get department
		Employee employee = getEmployeeByID(id);

		// return result
		if (employee == null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isEmployeeExistsByName(String name) {
		Employee employee = getEmployeeByName(name);

		if (employee == null) {
			return false;
		}
		return true;
	}

}
