package entity.Exercise1;

public final class PrimaryStudent extends Student{
    public static int countPrimaryStudent;
    public PrimaryStudent(int ID, String name) throws Exception {
        super(ID, name);
        countPrimaryStudent++;
    }
}
