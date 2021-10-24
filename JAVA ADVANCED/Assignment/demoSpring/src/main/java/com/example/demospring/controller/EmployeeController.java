package com.example.demospring.controller;

import java.util.List;

import com.example.demospring.entity.Employee;
import com.example.demospring.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "api/v1/employees")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@GetMapping()
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}

	@GetMapping(value = "/{id}")
	public Employee getEmployeeByID(@PathVariable(name = "id") short id) {
		return service.getEmployeeByID(id);
	}

	@PostMapping()
	public void createEmployee(@RequestBody Employee employee) {
		service.createEmployee(employee);
	}

	@PutMapping(value = "/{id}")
	public void updateEmployee(@PathVariable(name = "id") short id, @RequestBody Employee employee) {
		employee.setId(id);
		service.updateEmployee(employee);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteEmployee(@PathVariable(name = "id") short id) {
		service.deleteEmployee(id);
	}
}
