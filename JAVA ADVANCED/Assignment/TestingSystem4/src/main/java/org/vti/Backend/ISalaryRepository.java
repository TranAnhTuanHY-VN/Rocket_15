package org.vti.Backend;

import org.vti.Entity.Salary;

import java.util.List;

public interface ISalaryRepository {
    List<Salary> getAllSalarys();
    void createSalary(Salary salary);
}
