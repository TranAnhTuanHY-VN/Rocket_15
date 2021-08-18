package com.vti.entity;

public class Staff {
    private String fullName;
    private int age;
    private Gender gender;
    private String address;

    public enum Gender{
        MALE,FEMALE,UNKNOWN
    }

    public String getFullName() {
        return fullName;
    }

    public Staff(String fullName, int age, Gender gender, String address) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
