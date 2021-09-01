package utils;

import com.sun.org.apache.bcel.internal.generic.DLOAD;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerUntils {
    private static Scanner scan = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                return Integer.parseInt(scan.next().trim());
            } catch (Exception e) {
                System.out.println("Nhập lại:");
            }
        }
    }

    public static int inputIntPositive() {
        while (true) {
            try {
                int intPositive = Integer.parseInt(scan.next());
                if (intPositive >= 0) {
                    return intPositive;
                } else {
                    System.err.println("Nhập lại:");
                }
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static Float inputFloat(String message) {
        while (true) {
            try {
                return Float.parseFloat(scan.next());
            } catch (Exception e) {
                System.out.println("Nhập lại:");
            }
        }
    }

    public static Double inputDouble() {
        while (true) {
            try {
                return Double.parseDouble(scan.next());
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputString() {
        while (true) {
            String string = scan.nextLine().trim();
            if (!string.isEmpty()) {
                return string;
            } else {
                System.err.println("Nhập lại:");
            }
        }
    }


    public static LocalDate inputLocalDate() {
        System.out.println("Nhập theo định dạng yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            String localdate = scan.next().trim();
            try {
                if (format.parse(localdate) != null) {
                    LocalDate lc = LocalDate.parse(localdate);
                    return lc;
                }
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }
}
