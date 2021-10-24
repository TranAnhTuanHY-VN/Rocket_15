package com.demospringjpa.service;

import com.demospringjpa.entity.Department;
import com.demospringjpa.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService{

    @Autowired
    private IDepartmentRepository repository;

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    public Department getDepartmentByID(short id) {
        return repository.findById(id).get();
    }

    public Department getDepartmentByName(String name) {
        return repository.findByName(name);
    }

    public void createDepartment(Department department) {
        repository.save(department);
    }

    public void updateDepartment(Department department) {
        repository.save(department);
    }

    public void deleteDepartment(short id) {
        repository.deleteById(id);
    }

    public boolean isDepartmentExistsByID(short id) {
        return repository.existsById(id);
    }

    public boolean isDepartmentExistsByName(String name) {
        return repository.existsByName(name);
    }
}
