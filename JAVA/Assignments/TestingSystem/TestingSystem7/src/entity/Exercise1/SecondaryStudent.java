package entity.Exercise1;

public final class SecondaryStudent extends Student{
    public static int countSecondaryStudent;
    public SecondaryStudent(int ID, String name) throws Exception {
        super(ID, name);
        countSecondaryStudent++;
    }
}
