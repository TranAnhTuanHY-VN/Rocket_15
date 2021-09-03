package org.vti.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.vti.Entity.Group;

import java.util.List;

public class GroupRepository {
    private final SessionFactory sessionFactory;

    public GroupRepository(){
        sessionFactory = buildSessionFactory();
    }

    private SessionFactory buildSessionFactory(){
        //load configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        //add entity
        configuration.addAnnotatedClass(Group.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        return configuration.buildSessionFactory(serviceRegistry);
    }

    public void createGroup(Group group){
        Session session = null;
        try {
            //get session
            session = sessionFactory.openSession();
            session.beginTransaction();
            //create
            session.save(group);
            session.getTransaction().commit();
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public List<Group> getAllGroups(){
        Session session = null;
        try {
            //get session
            session = sessionFactory.openSession();

            //create hql query
            Query<Group> query = session.createQuery("FROM Group");
            return query.list();
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    public Group getGroupByID(short ID){
        Session session = null;
        try {
            //get session
            session = sessionFactory.openSession();
            //get group by ID
            Group group = session.get(Group.class,ID);

            return group;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public Group getGroupByName(String name){
        Session session = null;
        try {
            //get session
            session = sessionFactory.openSession();
            //create hql query
            Query<Group> query = session.createQuery("FROM Group WHERE name = :nameParameter");

            //set parameter
            query.setParameter("nameParameter",name);

            //get result
            Group group = query.uniqueResult();

            return group;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }



}
