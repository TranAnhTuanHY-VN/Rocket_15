package org.vti.Test;

import org.vti.Repository.DepartmentRepository;
import org.vti.Entity.Department;

import java.util.List;

public class DepartmentTest {
    public static void main(String[] args) {
        DepartmentRepository repository = new DepartmentRepository();

        System.out.println("***********GET ALL DEPARTMENTS***********");

        List<Department> departments = repository.getAllDepartments();

        for (Department department : departments) {
            System.out.println(department.toString());
        }
    }
}
