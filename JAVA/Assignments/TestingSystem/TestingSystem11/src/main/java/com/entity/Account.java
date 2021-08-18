package com.entity;

/**
 * The class save Account's info
 * @author TranAnhTuan
 * @create_date August 9, 2021
 */
public class Account {
    private int accountID;
    private String username;
    private String fullName;

    public Account(int accountID, String username, String fullName) {
        this.accountID = accountID;
        this.username = username;
        this.fullName = fullName;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "AccountID=" + accountID +
                "    || username='" + username + '\'' +
                "    || fullName='" + fullName + '\'' ;
    }
}
