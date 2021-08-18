package Ex2Q11_12;

import Utils.ScannerUtils;

public class Account {
    public static int COUNT;
    private int ID;
    private String fullName;
    private String usernamel;
    private String email;
    private int age;

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", usernamel='" + usernamel + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
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
        System.out.println("Nhập tuổi:");
        this.age = inputAccountAge();
    }
// Question 11:
    private int inputAge() throws InvalidAgeInputtingException {
        int age = ScannerUtils.inputInt("Please input an age as int, please input again.");

        if (age < 0) {
            throw new InvalidAgeInputtingException("The age must be greater than 0, please input again.");
        }

        return age;
    }


    //Question 12:
    private int inputAccountAge() {
        while (true) {
            try {
                int age = inputAge();
                if (age < 18) {
                    System.out.println("Your age must be greater than 18, please input again.");
                } else {
                    return age;
                }
            } catch (InvalidAgeInputtingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
