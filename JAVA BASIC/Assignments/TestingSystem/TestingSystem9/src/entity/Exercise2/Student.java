package entity.Exercise2;

public class Student {
    private int ID;
    public static int COUNT;
    private String name;

    public Student(String name) {
        COUNT++;
        this.ID = COUNT;
        this.name = name;
    }

    /**
     * @deprecated replace by{@link #getIDv2()}
     *
     */
    @Deprecated
    public int getID() {
        return ID;
    }

    public String getIDv2() {
        return "MSV: " + ID;
    }



    public String getName() {
        return name;
    }
}
