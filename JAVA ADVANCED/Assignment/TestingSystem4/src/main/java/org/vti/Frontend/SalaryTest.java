package org.vti.Frontend;


import org.vti.Backend.ISalaryRepository;
import org.vti.Entity.Enumerate.SalaryName;
import org.vti.Entity.Salary;
import org.vti.Backend.SalaryRepository;

import java.util.List;

public class SalaryTest {
	public static void main(String[] args) {
		ISalaryRepository repository = new SalaryRepository();

		System.out.println("***********GET ALL SALARYS***********");

		List<Salary> Salarys = repository.getAllSalarys();

		for (Salary Salary : Salarys) {
			System.out.println(Salary);
		}

		System.out.println("\n\n***********CREATE SALARY***********");

		Salary SalaryCreate = new Salary();
		SalaryCreate.setName(SalaryName.PM);
		repository.createSalary(SalaryCreate);

	}
}
