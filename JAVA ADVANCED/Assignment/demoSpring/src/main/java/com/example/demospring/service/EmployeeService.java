package com.example.demospring.service;

import java.util.List;

import com.example.demospring.entity.Employee;
import com.example.demospring.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repository;

	public List<Employee> getAllEmployee() {
		return repository.getAllEmployee();
	}

	public Employee getEmployeeByID(short id) {
		return repository.getEmployeeByID(id);
	}

	public Employee getEmployeeByName(String name) {
		return repository.getEmployeeByName(name);
	}

	public void createEmployee(Employee employee) {
		repository.createEmployee(employee);
	}

	public void updateEmployee(short id, String newName) {
		repository.updateEmployee(id, newName);
	}

	public void updateEmployee(Employee employee) {
		repository.updateEmployee(employee);
	}

	public void deleteEmployee(short id) {
		repository.deleteEmployee(id);
	}

	public boolean isEmployeeExistsByID(short id) {
		return repository.isEmployeeExistsByID(id);
	}

	public boolean isEmployeeExistsByName(String name) {
		return repository.isEmployeeExistsByName(name);
	}
}
