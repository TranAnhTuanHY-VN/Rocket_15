package com.vti.entity.E6Q1;

public class Employee extends User {

    @Override
    public double calculatePay() {
          return getSalaryRatio()*420;
    }

    public Employee(String name, double salaryRatio) {
        super(name, salaryRatio);
    }
}
