package org.vti.Frontend;

import org.vti.Backend.GroupRepository;
import org.vti.Backend.IGroupRepository;
import org.vti.Entity.Group;

import java.util.List;

public class GroupTest {
    public static void main(String[] args) {
        IGroupRepository repository = new GroupRepository();

        //Load List before because it takes more time
        List<Group> groups = repository.getAllGroups();
        System.out.println("\n*************|GET ALL GROUPS|***************");

        for (Group group:groups){
            System.out.println(group);
        }

        System.out.println("\n************|GET GROUP BY ID|***************");
        Group groupByID = repository.getGroupByID((short) 2);
        System.out.println(groupByID);

        System.out.println("\n***********|GET GROUP BY NAME|**************");
        Group groupByName = repository.getGroupByName("Blue");
        System.out.println(groupByName);

        System.out.println("\n**************|CREATE GROUP|****************");
        Group groupCreate = new Group();
        groupCreate.setName("Blue");
        repository.createGroup(groupCreate);

        System.out.println("\n*************|UPDATE GROUP 1|***************");
        repository.updateGroup((short) 3, "newName");

        System.out.println("\n*************|UPDATE GROUP 2|***************");
        Group groupUpdate = new Group();
        groupUpdate.setId((short) 2);
        groupUpdate.setName("Security2");
        repository.updateGroup(groupUpdate);

        System.out.println("\n***************|DELETE GROUP|***************");
        repository.deleteGroup((short) 4);

        System.out.println("\n*********|CHECK GROUP EXISTS BY ID|*********");
        System.out.println(repository.isGroupExistsByID((short) 5));

        System.out.println("\n********|CHECK GROUP EXISTS BY NAME|********");
        System.out.println(repository.isGroupExistsByName("Blue"));
    }
}
