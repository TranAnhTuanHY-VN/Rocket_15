package org.vti.Repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.Address;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class AddressRepository {

	private HibernateUtils hibernateUtils;

	public AddressRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Address> getAllAddresses() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Address> query = session.createQuery("FROM Address");

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

	public Address getAddressByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			Address address = session.get(Address.class, id);

			return address;

		}catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createAccount(Address address) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(address);

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
