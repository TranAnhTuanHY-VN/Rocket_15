package org.vti.Backend;

import org.vti.Entity.Group;

import java.util.List;

public interface IGroupRepository {
    List<Group> getAllGroups();
    void createGroup(Group group);
    Group getGroupByID(short ID);
    Group getGroupByName(String name);
    void updateGroup(short ID, String newName);
    void updateGroup(Group group);
    void deleteGroup(short ID);
    boolean isGroupExistsByID(short ID);
    boolean isGroupExistsByName(String name);
}
