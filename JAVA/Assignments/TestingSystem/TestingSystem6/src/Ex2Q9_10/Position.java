package Ex2Q9_10;

import Utils.ScannerUtils;

public class Position {
    public static int COUNT;
    private int ID;
    private PositionName name;

    public enum PositionName{
        DEV,TEST,PM,SCRUM_MASTER;
    }

    @Override
    public String toString() {
        return "Position{" +
                "ID=" + ID +
                ", mame=" + name +
                '}';
    }

    public Position() {
        COUNT++;
        this.ID= COUNT;
        System.out.println("Chọn vị trí 1.DEV,2.TEST,3.PM,4.SCUM_MASTER: ");
        while (true) {
            int choose = ScannerUtils.inputInt("Nhập kiểu số nguyên! ");
            switch (choose) {
                case 1:
                    this.name = PositionName.DEV;
                    return;
                case 2:
                    this.name = PositionName.TEST;
                    return;
                case 3:
                    this.name = PositionName.PM;
                    return;
                case 4:
                    this.name = PositionName.SCRUM_MASTER;
                    return;
                default:
                    System.out.println("Chọn lại:");
            }
        }
    }
}
