package org.vti.Test;

import org.vti.Entity.Group;
import org.vti.Repository.GroupRepository;

import java.util.List;

public class GroupTest {
    public static void main(String[] args) {
        GroupRepository repository = new GroupRepository();

        System.out.println("***********GET ALL***********");

        List<Group> groups = repository.getAllGroups();

        for (Group group : groups) {
            System.out.println(group);
        }
    }
}
