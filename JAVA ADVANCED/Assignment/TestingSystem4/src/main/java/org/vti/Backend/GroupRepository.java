package org.vti.Backend;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.vti.Entity.Group;
import org.vti.Utils.HibernateUtils;

import java.util.List;

public class GroupRepository implements IGroupRepository{
    private final HibernateUtils hibernateUtils;

    public GroupRepository(){
        hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Group> getAllGroups(){
        Session session = null;
        try {
            //get session
            session = hibernateUtils.openSession();

            //create hql query
            Query<Group> query = session.createQuery("FROM Group");
            return query.list();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public void createGroup(Group group){
        Session session = null;
        try {
            //get session
            session = hibernateUtils.openSession();
            session.beginTransaction();
            //create
            session.save(group);

            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public Group getGroupByID(short ID){
        Session session = null;
        try {
            //get session
            session = hibernateUtils.openSession();
            //get group by ID
            Group group = session.get(Group.class,ID);

            return group;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Group getGroupByName(String name){
        Session session = null;
        try {
            //get session
            session = hibernateUtils.openSession();
            //create hql query
            Query<Group> query = session.createQuery("FROM Group WHERE name = :nameParameter");

            //set parameter
            query.setParameter("nameParameter",name);

            //get result
            Group group = query.uniqueResult();

            return group;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public void updateGroup(short ID, String newName){
        Session session = null;
        try {
            //get session
            session = hibernateUtils.openSession();
            session.beginTransaction();
            //get group
            Group group = (Group) session.load(Group.class,ID);
            //update
            group.setName(newName);

            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        }finally {
            if (session !=  null){
                session.close();
            }
        }
    }

    @Override
    public void updateGroup(Group group){
        Session session = null;
        try {
            //get session
            session = hibernateUtils.openSession();
            session.beginTransaction();
            //update
            session.update(group);

            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public void deleteGroup(short ID){
        Session session = null;
        try {
            //get session
            session = hibernateUtils.openSession();
            session.beginTransaction();
            //get group
            Group group = (Group) session.load(Group.class,ID);
            //delete
            session.delete(group);

            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public boolean isGroupExistsByID(short ID){
        //get  group
        Group group = getGroupByID(ID);
        //return result
        if (group == null){
            return false;
        }

        return true;
    }

    @Override
    public boolean isGroupExistsByName(String name){
        Group group = getGroupByName(name);
        if (group == null){
            return false;
        }
        return true;
    }
}