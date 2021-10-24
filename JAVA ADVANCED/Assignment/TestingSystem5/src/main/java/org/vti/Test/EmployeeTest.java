package org.vti.Test;

import org.vti.Repository.EmployeeRepository;
import org.vti.Entity.Employee;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        List<Employee> employeeList = employeeRepository.getAllEmployees();

        for (Employee employeeInfo: employeeList
             ) {
            System.out.println(employeeInfo);
        }
    }
}
