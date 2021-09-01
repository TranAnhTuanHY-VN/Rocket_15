package com.vti.entity;

public class Department {
    private int     departmentID;
    private String  departmentName;

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentID=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    //Question 1:
    //a)
    public Department(){

    }
    //b)
    public Department(String departmentName){
        this.departmentName = departmentName;
        this.departmentID = 0;
    }
}
