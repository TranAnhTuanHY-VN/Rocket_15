package org.vti;

import org.vti.Entity.Group;
import org.vti.Repository.GroupRepository;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        GroupRepository repository = new GroupRepository();

//        System.out.println("\n**************|CREATE GROUP|****************");
//        Group groupCreate = new Group();
//        groupCreate.setName("Blue");
//        repository.createGroup(groupCreate);

        System.out.println("\n*************|GET ALL GROUPS|***************");
        List<Group> groups = repository.getAllGroups();
        for (Group group:groups){
            System.out.println(group);
        }

        System.out.println("\n************|GET GROUP BY ID|***************");
        Group groupByID = repository.getGroupByID((short) 2);
        System.out.println(groupByID);

        System.out.println("\n***********|GET GROUP BY NAME|**************");
        Group groupByName = repository.getGroupByName("Blue");
        System.out.println(groupByName);
    }
}
