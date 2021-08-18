package com.company;

import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {
        //Question 1:
        Account[] acc = new Account[5];
        for (int i = 0; i < acc.length; i++) {
            acc[i] = new Account();
            acc[i].email = "Email" + i;
            acc[i].userName = "User name " + i;
            acc[i].fullName = "Full name " + i;
            acc[i].createDate = LocalDate.now();
        }
        System.out.println(acc[1].fullName);
    }
}
