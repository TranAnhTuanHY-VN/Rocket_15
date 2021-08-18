package com.company.Ex2Q2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private Gender gender;
    private LocalDate birthDay;
    private String address;

    public enum Gender {
        MALE,FEMALE,UNKLNOWN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirtDay() {
        return birthDay;
    }

    public void setBirtDay(LocalDate birtDay) {
        this.birthDay = birtDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person() {
    }

    public Person(String name, Gender gender, LocalDate birtDay, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birtDay;
        this.address = address;
    }

    public void inputInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời nhập thông tin:");
        System.out.println("Tên: ");
        this.name = scan.nextLine();
        System.out.println("Gender(1.MALE,2.FEMALE,0.UNKNOWN): ");
        int flagGender = scan.nextInt();
        switch (flagGender) {
            case 1:
                this.gender = Gender.MALE;
                break;
            case 2:
                this.gender = Gender.FEMALE;
                break;
            case 0:
                this.gender = Gender.UNKLNOWN;
                break;
        }
//        System.out.println("BirthDay(yyyy-MM-dd): ");
//        this.birthDay = LocalDate.parse(scan.nextLine());
        scan.nextLine();
        System.out.println("Address: ");
       address = scan.nextLine();
    }

    public String showInfor() {
        return "Person [Name: "+ name + ", gender: " + gender + ", birthDay: "+ birthDay + ", Address: "+ address +"]";
    }

}

