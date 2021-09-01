package com.company.Ex2Q2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resource personManagement = new Resource();

        int choose;
        do {
            loadMenu();
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    personManagement.input();
                    break;

                case 2:
                    personManagement.showInforStudents();
                    break;

                case 3:
                    personManagement.checkScholarship();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Nhập sai, vui lòng nhập lại !");
                    break;
            }

        } while (choose != 4);
    }

    private static void loadMenu() {
        System.out.println("==========MENU=========");
        System.out.println("=||1. Nhập student  ||=");
        System.out.println("=||2. Hiện student  ||=");
        System.out.println("=||3. Xét học bổng  ||=");
        System.out.println("=||4. Thoát         ||=");
        System.out.println("=======================");
    }
}
