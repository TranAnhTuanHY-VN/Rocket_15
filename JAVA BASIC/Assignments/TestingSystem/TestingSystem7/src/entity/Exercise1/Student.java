package entity.Exercise1;

public class Student {
    private int ID;
    private String name;
    public static String college = "Đại học Bách khoa";
    public static int moneyGroup;
    public static int COUNT;
    public static int maxStudent = 7;

    public Student(int ID, String name) throws Exception {
       // Question 5: Count students created
        if (COUNT > maxStudent) {
            throw new Exception("Không thể tạo quá 7 sinh viên!");
        }
        COUNT++;
        this.ID = ID;
        this.name = name;
        moneyGroup+=100;
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
//Question 4:
    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static int getMoneyGroup() {
        return moneyGroup;
    }

    public static void setMoneyGroup(int moneyGroup) {
        Student.moneyGroup = moneyGroup;
    }

    public static void subMoneyGroup(int money) {
        Student.moneyGroup -=money;
    }

    public static void addMoneyGroup(int money) {
        Student.moneyGroup +=money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", college= '" + college +
                '}';
    }
}
