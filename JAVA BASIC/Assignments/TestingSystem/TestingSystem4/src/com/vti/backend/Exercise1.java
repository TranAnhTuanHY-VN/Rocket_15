package com.vti.backend;

import com.vti.entity.*;

import java.time.LocalDate;

public class Exercise1 {
    public void Q1(){
        //a
        Department department1 = new Department();
        System.out.println(department1.getDepartmentName());
        System.out.println(department1.getDepartmentID());
        //b
        Department department2 = new Department("SALE");
        System.out.println(department2.getDepartmentName());
        System.out.println(department2.getDepartmentID());
    }
    public void Q2(){
        Position position3 = new Position();
        Account acc1 = new Account();
        Account acc2 = new Account(2,"Acc2@gmail.com","account 2", "Tran", "Tuan");
        Account acc3 = new Account(3, "Acc3@gmail.com", "account 3","Tran Tuan Anh", position3);
        Account acc4 = new Account(4,"acc4@gmail.com","account 4","Hoang Phi Hong", LocalDate.of(2020,12,20),position3);
        Account[] accounts = {acc1, acc2, acc3, acc4};
        for (Account acc:accounts
        ) {
            System.out.println(acc);
        }
    }

    public void Q3(){
        Position position3 = new Position();
        Account creator = new Account();
        Account acc1 = new Account();
        Account acc2 = new Account(2,"Acc2@gmail.com","account 2", "Tran", "Tuan");
        Account acc3 = new Account(3, "Acc3@gmail.com", "account 3","Tran Tuan Anh", position3);
        String[] user = {"user 2"};
        Account[] accounts = {acc1,acc2,acc3};
        Group group1 = new Group();
        Group group2 = new Group("Group 1", creator, LocalDate.of(2020,10,20),accounts);
        Group group3 = new Group("Group 2", creator, user, LocalDate.of(2021,5,20));
        Group[] groups = {group1, group2, group3};
        for (Group groupInfo:groups
             ) {
            System.out.println(groupInfo);
        }
    }
}
