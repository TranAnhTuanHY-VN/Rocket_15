package entity.Exercise1;

public class Student {
    private final int ID;
    private String name;
    public static int COUNT;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Student(String name) {
        COUNT++;
        this.ID = COUNT;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
