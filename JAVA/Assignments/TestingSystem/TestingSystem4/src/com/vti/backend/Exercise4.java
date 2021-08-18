package com.vti.backend;

import com.vti.entity.E4Q2.Account;
import com.vti.entity.E4Q2.Circle;
import com.vti.entity.E4Q2.Date;
import com.vti.entity.Student;

import javax.xml.crypto.Data;

public class Exercise4 {
    public void Q1() {
        Student student1 = new Student("Tran Anh Tuan", "Hung Yen");
        student1.plusScore(8);
        Student student2 = new Student("Dao Thanh Tung", "Vinh Phuc");
        student2.plusScore(4);
        Student student3 = new Student("Dao Van Loi", "Hung Yen");
        student3.plusScore(3);

        Student[] students = {student1, student2, student3};
        for (Student studentInfo : students
        ) {
            System.out.println(studentInfo);
        }
    }

    public void Q2_circle() {
        //Circle:
        Circle circle = new Circle(30, "Hồng");
        System.out.println(circle);
        System.out.println("Area of circle: " + circle.getArea());
    }

    public void Q2_account() {
        Account account1 = new Account("acc1", "TranTuan", 100);
        Account account2 = new Account("acc2", "TranAnh", 150);
        Account[] accounts = {account1, account2};
        System.out.println("Thông tin các account: ");
        for (Account accInfo : accounts
        ) {
            System.out.println(accInfo);
        }
        account1.credit(50);
        System.out.println("Balance của account 1 sau khi credit 50: " + account1.getBalance());
        account2.debit(90);
        System.out.println("Balance cúa account 2 sau khi debit 90: "+ account2.getBalance());
        account1.transfer(account2,20);
        System.out.println("Balance của 2 account sau khi transfer:");
        for (Account accInfo : accounts
        ) {
            System.out.println(accInfo);
        }
    }
    public void Q2_Date(){
        Date date1 = new Date(20,05,2021);
        Date date2 = new Date(10,05,2020);
        Date[] dates = {date1,date2};
        for (Date date:dates
             ) {
            System.out.println(date);
        }
        for (Date date:dates
             ) {
            if (date.isLeapYear(date.getYear())) {
                System.out.println(date.getYear()+ " là năm nhuận");
            }else System.out.println(date.getYear()+ " không là năm nhuận");
        }


    }

}
