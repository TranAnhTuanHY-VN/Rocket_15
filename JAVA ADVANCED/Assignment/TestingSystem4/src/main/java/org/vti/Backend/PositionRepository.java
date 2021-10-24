package org.vti.Backend;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.Position;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class PositionRepository implements IPositionRepository {

	private HibernateUtils hibernateUtils;

	public PositionRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Position> getAllPositions() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Position> query = session.createQuery("FROM Position");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void createPosition(Position position) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(position);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
