package com.company;
import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    int             accountID;
    String          email;
    String          userName;
    String          fullName;
    Department      department;
    Position        position;
    LocalDate       createDate;
    Group[]         groups;

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }

    //Question 2:
    //a)
    public Account() {
    }

    //b)
    public Account(int accountID, String email, String userName, String firtName, String lastName) {
        this.userName = userName;
        this.accountID = accountID;
        this.email = email;
        this. fullName = firtName + " " + lastName;
    }

    //c)
    public Account(int accountID, String email, String userName, String fullName, Position position) {
        this.userName = userName;
        this.accountID = accountID;
        this.email = email;
        this. fullName = fullName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    //d)
    public Account(int accountID, String email, String userName, String fullName, LocalDate createDate, Position position) {
        this.userName = userName;
        this.accountID = accountID;
        this.email = email;
        this. fullName = fullName;
        this.position = position;
        this.createDate = createDate;
    }
}
