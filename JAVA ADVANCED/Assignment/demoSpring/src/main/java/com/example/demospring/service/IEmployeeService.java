package com.example.demospring.service;

import java.util.List;

import com.example.demospring.entity.Employee;

public interface IEmployeeService {

	public List<Employee> getAllEmployee();

	public Employee getEmployeeByID(short id);

	public Employee getEmployeeByName(String name);

	public void createEmployee(Employee employeeName);

	public void updateEmployee(short id, String newName);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(short id);

	public boolean isEmployeeExistsByID(short id);

	public boolean isEmployeeExistsByName(String name);

}
