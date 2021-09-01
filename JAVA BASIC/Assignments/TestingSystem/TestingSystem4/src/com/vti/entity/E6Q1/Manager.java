package com.vti.entity.E6Q1;

public class Manager extends User{

    public Manager(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return getSalaryRatio()*520;
    }
}
