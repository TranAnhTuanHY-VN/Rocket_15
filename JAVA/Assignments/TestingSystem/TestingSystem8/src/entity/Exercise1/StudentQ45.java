package entity.Exercise1;

public class StudentQ45 implements Comparable<StudentQ45>{
    private String name = null;

    public StudentQ45(String name) {
        this.name = name;
    }

    public StudentQ45() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentQ45{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentQ45 o) {
        return this.name.compareTo(o.getName());
    }


}
