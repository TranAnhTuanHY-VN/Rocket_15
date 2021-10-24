package org.com.vti.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;

    @Size(min=6, max=50, message = "Name has at lease 6 characters and max 50 characters")
    private String name;

    @Min(value = 0,message = "Total member must be greater than or equal 0")
    private int totalMember;

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMember() {
        return totalMember;
    }

    public void setTotalMember(int totalMember) {
        this.totalMember = totalMember;
    }
}
