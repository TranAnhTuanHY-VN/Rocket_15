package com.company.Ex2Q1;

import java.util.Random;
import java.util.Scanner;

public class Resource {
    public void Q1() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Student[] students = new Student[10];
        System.out.println("Adding data.......");
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(i, "Student " + i, (random.nextInt(3) + 1));
        }
        System.out.println("Done!");
        int choose;
        do {
            System.out.println("=============================");
            System.out.println("1. All student roll up");
            System.out.println("2. Group 1 learn");
            System.out.println("3. Group 2 clean");
            System.out.println("=============================");
            System.out.println("Enter your choose: ");
            choose = scan.nextInt();
        } while (choose < 1 || choose > 3);
        switch (choose) {
            case 1:
                for (Student student : students
                ) {
                    student.rollUp();
                }
                break;
            case 2:
                for (Student student : students
                ) {
                    if (student.getGroup() == 1) {
                        student.learn();
                    }
                }
                break;
            case 3:
                for (Student student: students
                     ) {
                    if (student.getGroup() == 2) {
                        student.clean();
                    }
                }
                break;
        }
        System.out.println("Program Ended!");

    }

}
