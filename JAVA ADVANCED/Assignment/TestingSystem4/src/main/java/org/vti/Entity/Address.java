package org.vti.Entity;

import javax.persistence.*;

@Entity
@Table(name = "address",catalog = "TestingSystem")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;

    @OneToOne(mappedBy = "address")
    private Users users;

    @Column(name = "street",length = 45,nullable = false)
    private String street;

    @Column(name = "city",length = 45,nullable = false)
    private String city;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", users= id" + users.getId() +
                ", username=" + users.getUsername() +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
