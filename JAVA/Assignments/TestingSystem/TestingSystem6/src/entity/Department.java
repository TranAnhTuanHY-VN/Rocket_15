package entity;

public class Department {
    public static int COUNT;
    private int ID;
    private String name;

    public Department(String name) {
        COUNT++;
        this.ID = COUNT;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
