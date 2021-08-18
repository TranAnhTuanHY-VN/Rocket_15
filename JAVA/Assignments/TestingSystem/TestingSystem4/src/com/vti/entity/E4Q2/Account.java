package com.vti.entity.E4Q2;

public class Account {
    private String ID;
    private String name;
    private int balance;

    public Account(String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return this.balance += amount;
    }

    public int debit(int amount) {
        return this.balance -= amount;
    }

    public void transfer(Account acc, int amount) {
        this.balance -= amount;
        acc.balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
