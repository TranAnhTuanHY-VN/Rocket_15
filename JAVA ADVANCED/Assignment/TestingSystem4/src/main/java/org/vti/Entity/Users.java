package org.vti.Entity;

import javax.persistence.*;

@Entity
@Table(name = "users", catalog = "TestingSystem")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name = "username", nullable = false, length = 45, unique = true)
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + id +
                ", Username=" + username+
                ", Address= street:" + address.getStreet() +
                ",city: " + address.getCity() +
                '}';
    }
}
