package com.company;

import java.time.LocalDate;

public class Exercise6 {
    public static void main(String[] args) {
        //Question1 + question3:
        printNumber();


        //Quesiton 2:
        printAccInfo();
    }

    //method of question 1:
    public static void printNumber(){
        int n1 = 1;
        System.out.println("Question 1:");
        while (n1<10){
            System.out.print(n1+ " ");
            n1++;
        }
        int n2=1;
        System.out.println();
        System.out.println("Question 2: ");
        while(n2<10) {
            if (n2%2==0){
                System.out.print(n2 + " ");
            }
            n2++;
        }
        System.out.println();
    }

    //method of question 2:
    public static void printAccInfo() {
        //Insert 3 departments
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "SALE";

        Department department2 = new Department();
        department2.departmentID = 2;
        department2.departmentName = "MARKETING";

        Department department3 = new Department();
        department3.departmentID = 3;
        department3.departmentName = "CODE";

        //Insert 3 positions
        Position position1 = new Position();
        position1.positionID = 1;
        position1.positionName = PositionName.DEV;

        Position position2 = new Position();
        position2.positionID = 2;
        position2.positionName = PositionName.PM;

        Position position3 = new Position();
        position3.positionID = 3;
        position3.positionName = PositionName.MASTER;


        //Insert 3 accounts
        Account account1 = new Account();
        account1.accountID = 1;
        account1.email = "a1@gmail.com";
        account1.userName = "account1";
        account1.fullName = "Duong Van A";
        account1.department = department1;
        account1.position = position2;
        account1.createDate = LocalDate.of(2021, 2, 20);


        Account account2;
        account2 = new Account();
        account2.accountID = 2;
        account2.email = "a2@gmail.com";
        account2.userName = "account2";
        account2.fullName = "Tran Van A";
        account2.department = department2;
        account2.position = position1;
        account2.createDate = LocalDate.of(2020, 12, 20);

        Account account3 = new Account();
        account3.accountID = 3;
        account3.email = "a3@gmail.com";
        account3.userName = "account3";
        account3.fullName = "Le Thi B";
        account3.department = department3;
        account3.position = position3;
        account3.createDate = LocalDate.of(2020, 10, 20);


        //Insert 3 groups:
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Group 1";
        group1.createDate = LocalDate.of(2021, 5, 20);
        group1.creator = account2;
        group1.account = new Account[]{account1};

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "Group 2";
        group2.createDate = LocalDate.of(2020, 10, 20);
        group2.creator = account3;
        group2.account = new Account[]{account1, account2};

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Group 3";
        group3.createDate = LocalDate.of(2021, 4, 20);
        group3.creator = account1;
        group3.account = new Account[]{account3};

        //Add group Account:
        account1.groups = new Group[]{group1, group2};
        account2.groups = new Group[]{group2};
        account3.groups = new Group[]{group3};
        Account[] accArray = {account1, account2, account3};
        System.out.println("Thông tin Account: ");
        for (Account accountInfo : accArray) {
            System.out.println("Email: " + accountInfo.email + " FullName: " + accountInfo.fullName + " Position: " + accountInfo.position.positionName);
        }
    }
}
