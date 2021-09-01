package com.vti.entity.E6Q1;

public class Waiter extends User{
    public Waiter(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return getSalaryRatio()*220;
    }
}
