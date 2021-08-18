package backend;

import entity.Exercise2.Student;

import java.util.Date;

public class Exercise2 {
    @SuppressWarnings("deprecation")
    public void Q1() {
        Date date = new Date(2020,10,9);
        System.out.println(date);
    }

    public void Q2() {
        Student student = new Student("Nguyễn Văn A");
        System.out.println("Tên của sinh viên: " + student.getName());
        System.out.println(student.getID());
        System.out.println(student.getIDv2());
    }
}
