package Ex2Q9_10;

import Utils.ScannerUtils;

import java.sql.SQLOutput;

public class Account {
    public static int COUNT;
    private int ID;
    private String fullName;
    private String usernamel;
    private String email;

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", usernamel='" + usernamel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Account() {
        System.out.println("NHẬP THÔNG TIN ACCOUNT:");
        COUNT++;
        this.ID= COUNT;
        System.out.println("Nhập tên tài khoản:");
        this.fullName = ScannerUtils.inputString();
        System.out.println("Nhập username:");
        this.usernamel = ScannerUtils.inputString();
        System.out.println("Nhập email:");
        this.email = ScannerUtils.inputString();
    }
}
