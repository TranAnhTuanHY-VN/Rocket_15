package entity.Exercise4;

public class Salary<N extends Number> {
    private N salary;

    public N getSalary() {
        return salary;
    }

    public void setSalary(N salary) {
        this.salary = salary;
    }

    public Salary(N salary) {
        this.salary = salary;
    }
}
