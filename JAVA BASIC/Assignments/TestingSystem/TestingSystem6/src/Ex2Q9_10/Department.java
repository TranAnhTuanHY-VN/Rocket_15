package Ex2Q9_10;

import Utils.ScannerUtils;

public class Department {
    public static int COUNT;
    private int ID;
    private String name;

    public Department(String name) {
        COUNT++;
        this.ID = COUNT;
        this.name = name;
    }

    public Department() {
        COUNT++;
        this.ID= COUNT;
        System.out.println("Nhập tên phòng:");
        this.name = ScannerUtils.inputString();
    }

    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
