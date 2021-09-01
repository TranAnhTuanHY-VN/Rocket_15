package com.vti.entity.E5Q3;

public abstract class Student extends Person {
    private int ID;

    public Student(int ID,String name) {
        super(name);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
