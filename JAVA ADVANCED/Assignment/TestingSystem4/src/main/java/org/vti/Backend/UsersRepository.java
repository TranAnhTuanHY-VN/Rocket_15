package org.vti.Backend;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.Exam;
import org.vti.Entity.Users;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class UsersRepository {
    private HibernateUtils hibernateUtils;
    public UsersRepository(){
        hibernateUtils = HibernateUtils.getInstance();
    }

    @SuppressWarnings("unchecked")
    public List<Users> getAllUsers() {

        Session session = null;

        try {

            // get session
            session = hibernateUtils.openSession();

            // create hql query
            Query<Users> query = session.createQuery("FROM Users");

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
