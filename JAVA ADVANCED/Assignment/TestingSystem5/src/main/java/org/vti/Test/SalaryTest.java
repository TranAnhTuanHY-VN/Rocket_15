package org.vti.Test;

import org.vti.Repository.SalaryRepository;
import org.vti.Entity.Salary;

import java.util.List;

public class SalaryTest {
    public static void main(String[] args) {
        SalaryRepository salaryRepository = new SalaryRepository();
        System.out.println("***********GET ALL SALARIES***********");

        List<Salary> Salaries = salaryRepository.getAllSalarys();

        for (Salary Salary : Salaries) {
            System.out.println(Salary);
        }
    }
}
