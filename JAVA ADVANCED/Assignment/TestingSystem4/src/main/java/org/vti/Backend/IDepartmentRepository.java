package org.vti.Backend;

import org.vti.Entity.Department;

import java.util.List;

public interface IDepartmentRepository {
    List<Department> getAllDepartments();
    Department getDepartmentByID(short id);
    Department getDepartmentByName(String name);
    void createDepartment(Department department);
    void updateDepartment(short id, String newName);
    void updateDepartment(Department department);
    void deleteDepartment(short id);
    boolean isDepartmentExistsByID(short id);
    boolean isDepartmentExistsByName(String name);
}
