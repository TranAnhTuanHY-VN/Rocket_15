package com.company.Ex2Q2;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {
    private int studentID;
    private float AVGPoint;
    private String email;

    public Student() {
        inputInfo();
    }

    public Student(String name, Gender gender, LocalDate birtDay, String address, int studentID, float AVGPoint, String email) {
        super(name, gender, birtDay, address);
        this.studentID = studentID;
        this.AVGPoint = AVGPoint;
        this.email = email;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public float getAVGPoint() {
        return AVGPoint;
    }

    public void setAVGPoint(float AVGPoint) {
        this.AVGPoint = AVGPoint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scan = new Scanner(System.in);
        System.out.println("StudentID: ");
        studentID = scan.nextInt();
        System.out.println("AVG POINT: ");
        AVGPoint = scan.nextFloat();
        scan.nextLine();
        System.out.println("Email:");
        email = scan.nextLine();
    }

    @Override
    public String showInfor() {
        return super.showInfor() + "Student ID: "+ studentID + ",AVG point:"+ AVGPoint+ ", Email: "+ email;
    }

    public boolean scholarship(Student student) {
        return student.AVGPoint > 8;
    }
}
