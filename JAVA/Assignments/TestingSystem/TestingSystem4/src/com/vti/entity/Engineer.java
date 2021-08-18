package com.vti.entity;

public class Engineer extends Staff {
    private String majors;

    public Engineer(String fullName, int age, Gender gender, String address, String majors) {
        super(fullName, age, gender, address);
        this.majors = majors;
    }

    @Override
    public String toString() {
        return super.toString() + "Engineer{" +
                "majors='" + majors + '\'' +
                '}';
    }
}
