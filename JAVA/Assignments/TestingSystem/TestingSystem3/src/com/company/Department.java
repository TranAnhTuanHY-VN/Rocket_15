package com.company;

import java.util.Comparator;

public class Department implements Comparator<Department> {
    int departmentID;
    String departmentName;

    @Override
    public String toString() {
        return "Department{" + "ID= " + departmentID + ", Name= " + departmentName + "}";
    }

    @Override
    public int compare(Department o1, Department o2) {
        return o1.departmentName.compareTo(o2.departmentName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        Department department = (Department) o;
        return departmentName.equals(department.departmentName);
    }
}

