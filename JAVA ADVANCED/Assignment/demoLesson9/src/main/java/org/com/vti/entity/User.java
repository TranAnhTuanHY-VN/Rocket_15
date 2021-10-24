package org.com.vti.entity;

import java.time.LocalDate;

public class User {
    private String name;

    @Age(value = 18)
    private LocalDate birthDate;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
