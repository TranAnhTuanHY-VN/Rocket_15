package com.company.Ex2Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Resource {
    ArrayList<Student> listStudent;
    Scanner scan;

    public Resource() {
        listStudent = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void input() {
        System.out.println("Nhập số sinh viên muốn nhập : ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ : " + (i+1));
            listStudent.add(new Student());
        }

    }

    public void showInforStudents() {
        for (Student student : listStudent) {
            student.showInfor();
        }
    }

    public void checkScholarship() {
        System.out.println("Enter studentID want check scholarship: ");
        int  ID = scan.nextInt();
        for (Student student : listStudent) {
            if (student.getStudentID()==ID) {
                if (student.scholarship(student)) {
                    System.out.println("Sinh viên này được học bổng !");
                } else {
                    System.out.println("Không được học bổng !");
                }
                break;
            }
        }
    }

}
