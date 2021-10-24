package org.vti.Backend;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.Address;
import org.vti.Entity.Users;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class AddressRepository {
    HibernateUtils hibernateUtils;
    public AddressRepository(){
        hibernateUtils = HibernateUtils.getInstance();
    }

    @SuppressWarnings("unchecked")
    public List<Address> getAllAddress() {

        Session session = null;

        try {

            // get session
            session = hibernateUtils.openSession();

            // create hql query
            Query<Address> query = session.createQuery("FROM Address ");

            return query.list();

        }catch (Exception  e) {
            System.out.println(e.getMessage());
            return null;
        }finally{
            if (session != null) {
                session.close();
            }
        }
    }
}

