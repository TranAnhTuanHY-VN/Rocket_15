package entity.Exercise3;

import java.util.Arrays;

public class Employee <E>{
    private int ID;
    public static int COUNT;
    private String name;
    private E[] salaries;


    public Employee() {
    }

    public Employee(String name, E[] salaries) {
        COUNT++;
        this.ID = COUNT;
        this.name = name;
        this.salaries = salaries;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E[] getSalaries() {
        return salaries;
    }

    public void setSalaries(E[] salaries) {
        this.salaries = salaries;
    }


    public String getSalaryLast(){
        return "Salary Last:  " + salaries[salaries.length-1];
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }
}
