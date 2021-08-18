package Ex2Q9_10;

import Utils.ScannerUtils;

import javax.lang.model.element.NestingKind;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Group {
    public static int COUNT;
    private int ID;
    private String name;
    private LocalDate createDate;
    private Account[] member;

    @Override
    public String toString() {
        return "Group{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", member=" + Arrays.toString(member) +
                '}';
    }

    public void printInfoGroup() {
        System.out.println("THÔNG TIN GROUP");
        System.out.println("Group{" + "ID=" + ID + ", name='" + name + '\''+ ", createDate=" + createDate + '}');
        System.out.println("Thông tin thành viên trong nhóm:");
        for (Account accountInfo : member
        ) {
            System.out.println(accountInfo);
        }
    }

    public Group() {
        Scanner scan = new Scanner(System.in);
        System.out.println("NHẬP THÔNG TIN GROUP");
        COUNT++;
        this.ID = COUNT;
        System.out.println("Nhập tên Group:");
        this.name = ScannerUtils.inputString();
        System.out.println("Nhập số lượng thành viên muốn thêm vào GROUP:");
        int n = scan.nextInt();
        System.out.println("");
        member = new Account[n];
        for (int i = 0; i < n; i++) {
            Account acc = new Account();
            member[i] = acc;
        }
    }
}
