package entity.Exercise3;

public class StudentE3<T> {
    private T ID;
    private String name;

    public StudentE3(T ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public T getID() {
        return ID;
    }

    public void setID(T ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "StudentE3{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
