package org.vti.Entity;

import org.vti.Entity.Enumerate.SalaryName;
import org.vti.Entity.Enumerate.SalaryNameConvert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Salary",catalog = "TestingSystem5")
public class Salary implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "SalaryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "SalaryName",nullable = false,unique = true)
    @Convert(converter = SalaryNameConvert.class)
    private SalaryName name;

    @OneToMany(mappedBy = "salary")
    private List<Account> accounts;

    public Salary() {
    }

    public void setId(short id) {
        this.id = id;
    }

    public short getId() {
        return id;
    }

    public SalaryName getName() {
        return name;
    }

    public void setName(SalaryName name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", name=" + name +
//                ", accounts=" + accounts +
                '}';
    }
}
