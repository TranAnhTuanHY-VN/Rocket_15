package frontend;

import backend.Exercise2;
import entity.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        //Question1+ 2:
        Q1_Q2();
        //Question 3:
        Q3();
        //Question 4:
        Q4();
    }

    public static void Q1_Q2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời nhập số 1: ");
        int num1 = scan.nextInt();
        System.out.println("Mời nhập số 2: ");
        int num2 = scan.nextInt();
        try {
            float result = Exercise2.divide(num1, num2);
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide 0!");
        } finally {
            System.out.println("Divide completed!");
        }
    }

    public static void Q3() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chỉ số mảng không hợp lệ!");
        }
    }

    public static void Q4() {
        Department[] department = new Department[3];
        department[0] = new Department("DEV");
        department[1] = new Department("TESTER");
        department[2] = new Department("CEO");
        try {
            System.out.println(department[10]);
        } catch (Exception e) {
            System.out.println("Cannot find department.");
        }
    }

    public static int inputAge() {
        int age;
        Scanner scan = new Scanner(System.in);
        age  = 5;
        return age;
    }
}
