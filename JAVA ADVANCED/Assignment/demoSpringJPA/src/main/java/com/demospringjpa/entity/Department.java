package com.demospringjpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Department", catalog = "TestingSystem")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DepartmentID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "TotalMember")
    private short totalMember;

    @Column(name = "DepartmentName", length = 30, nullable = false,unique = true)
    private String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public short getTotalMember() {
        return totalMember;
    }

    public void setTotalMember(short totalMember) {
        this.totalMember = totalMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", totalMember=" + totalMember +
                ", name='" + name + '\'' +
                '}';
    }
}
