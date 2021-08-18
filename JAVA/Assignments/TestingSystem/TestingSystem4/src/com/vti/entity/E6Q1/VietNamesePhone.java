package com.vti.entity.E6Q1;

public class VietNamesePhone extends Phone {
    public VietNamesePhone() {
    }

    @Override
    public void insertContact(String name, String phone) {
        System.out.println("Insert "+ name + "....");
    }

    @Override
    public void removeContact(String name) {
        System.out.println("Removing "+ name+ "...");
    }

    @Override
    public void updateContact(String name, String newPhone) {
        System.out.println("Updating "+ name +" contact.....");
    }

    @Override
    public void searchContact(String name) {
        System.out.println("Searching "+ name+ "....");
    }
}
