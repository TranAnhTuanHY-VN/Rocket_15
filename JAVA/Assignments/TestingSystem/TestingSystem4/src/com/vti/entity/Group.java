package com.vti.entity;

import com.vti.entity.*;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private int         groupID;
    private String      groupName;
    private Account     creator;
    private LocalDate   createDate;
    private Account[]   account;



    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account[] getAccount() {
        return account;
    }

    public void setAccount(Account[] account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", account=" + Arrays.toString(account) +
                '}';
    }


    public Group(String s, Account creator, Account[] user, LocalDate of) {
    }
    //Question 2:
    //a)
    public Group() {
    }
    //b)
    public Group(String groupName, Account creator, LocalDate createDate, Account[] account) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        this.account = account;
    }
    //c)
    public Group(String groupName, Account creator, String[] userName, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        Account[] accounts = new Account[userName.length];
        for (int i = 0; i < userName.length; i++) {
            accounts[i] = new Account(userName[i]);
        }
    }
}
