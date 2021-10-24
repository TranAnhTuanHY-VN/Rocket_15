package org.vti.Repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.Manager;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class ManagerRepository {
    private HibernateUtils hibernateUtils;

    public ManagerRepository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    @SuppressWarnings("unchecked")
    public List<Manager> getAllManager() {

        Session session = null;

        try {

            // get session
            session = hibernateUtils.openSession();

            // create hql query
            Query<Manager> query = session.createQuery("FROM Manager");

            return query.list();

        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void createAccount(Manager manager) {

        Session session = null;

        try {

            // get session
            session = hibernateUtils.openSession();
            session.beginTransaction();

            // create
            session.save(manager);

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
}
