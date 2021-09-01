package com.company.Ex2Q1;

public class Student implements IStudent{
    private int ID;
    private String name;
    private int group;

    public int getGroup() {
        return group;
    }

    public Student(int ID, String name, int group) {
        this.ID = ID;
        this.name = name;
        this.group = group;
    }

    @Override
    public void rollUp() {
        System.out.println(name + " is rolling up....");
    }

    @Override
    public void learn() {
        System.out.println(name + " is learning....");
    }

    @Override
    public void clean() {
        System.out.println(name + " is cleaning....");
    }
}
