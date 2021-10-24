package org.vti.Repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.DetailDepartment;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class DetailDepartmentRepository {

	private HibernateUtils hibernateUtils;

	public DetailDepartmentRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<DetailDepartment> getAllDetailDepartments() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<DetailDepartment> query = session.createQuery("FROM DetailDepartment");

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

	public void createDepartment(DetailDepartment department) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(department);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
