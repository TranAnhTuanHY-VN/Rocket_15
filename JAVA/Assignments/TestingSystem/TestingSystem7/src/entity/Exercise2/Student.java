package entity.Exercise2;

public class Student {
    private final int ID;
    private String name;

    public Student(int ID, String name) {
        this.ID = ID;
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

    public static final void study() {
        System.out.println("Đang học bài....");
    }
}
