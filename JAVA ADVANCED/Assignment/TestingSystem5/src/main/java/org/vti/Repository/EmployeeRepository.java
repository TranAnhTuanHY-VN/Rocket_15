package org.vti.Repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.Employee;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class EmployeeRepository {

	private HibernateUtils hibernateUtils;

	public EmployeeRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Employee> query = session.createQuery("FROM Employee");

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

	public void createAccount(Employee employee) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(employee);

			session.getTransaction().commit();
		} catch (Exception e){
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
