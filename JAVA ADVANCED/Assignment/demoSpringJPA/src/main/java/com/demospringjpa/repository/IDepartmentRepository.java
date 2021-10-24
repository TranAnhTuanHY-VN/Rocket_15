package com.demospringjpa.repository;

import com.demospringjpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department, Short> {
    public Department findByName(String name);
    public boolean existsByName(String name);
}
