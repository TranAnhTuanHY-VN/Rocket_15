package com.example.demospring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Employee", catalog = "CRUD")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "EmployeeID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "Name",length = 100, nullable = false)
    private String name;

    @Column(name = "Department",length = 100)
    private String department;

    @Column(name = "Phone",length = 11)
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(short id) {
        this.id = id;
    }

    public short getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
