package backend;

import entity.Exercise1.*;

public class Exercise1 {
    public void Q1_Q2() throws Exception {
        Student student1 = new Student(1, "Tran Anh Tuan");
        Student student2 = new Student(2,"Dao Thanh Tung");
        Student student3 = new Student(3,"Nguyen Van A");

        Student[] students = {student1, student2, student3};
        printListStudent(students);
        System.out.println();
        System.out.println("Chuyển các sinh viên sang Đại học Công Nghệ");
        Student.setCollege("Đại học Công Nghệ");
        printListStudent(students);
        System.out.print("Quỹ lớp hiện tại: ");
        System.out.println(Student.moneyGroup);
        System.out.print("Student 1 lấy 50k đi mua bim bim, kẹo, quỹ lớp còn:");
        Student.subMoneyGroup(50);
        System.out.println(Student.moneyGroup);
        System.out.print("Student 2 lấy 20k đi mua bánh mì, quỹ lớp còn:");
        Student.subMoneyGroup(20);
        System.out.println(Student.moneyGroup);
        System.out.print("Student 3 lấy 150k đi mua đồ dùng học tập cho nhóm, quỹ lớp còn:");
        Student.subMoneyGroup(150);
        System.out.println(Student.moneyGroup);
        System.out.print("Sau đó mỗi người nộp thêm 50k, quỹ lớp là:");
        Student.moneyGroup += students.length*50;
        System.out.println(Student.moneyGroup);
    }

    public void Q3() {
        int result1 = MyMath.max(5, 8);
        int result2 = MyMath.min(10, 90);
        int sum = MyMath.sum(result1,result2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(sum);
    }

    public void Q5() {
        System.out.println("Số sinh viên đã được tạo là: " + Student.COUNT);
    }

    public void Q6() throws Exception {
        Student[] students = new Student[6];
        students[0] = new PrimaryStudent(1, "Tran A");
        students[1] = new PrimaryStudent(2, "Nguyen B");
        students[2] = new SecondaryStudent(3, "Dao C");
        students[3] = new SecondaryStudent(4, "Le D");
        students[4] = new SecondaryStudent(5, "Hoang E");
        students[5] = new SecondaryStudent(6, "Dao F");
        System.out.println("Tổng số Strudent được tạo ra là: " + Student.COUNT);
        System.out.println("Tổng số Primary Student được tạo ra là: " + PrimaryStudent.countPrimaryStudent);
        System.out.println("Tổng số Secondary Student được tạo ra là: " + SecondaryStudent.countSecondaryStudent);
    }

    public void Q7() throws Exception {
        Student student1 = new PrimaryStudent(1,"Nguyễn Văn A");
        Student student2 = new PrimaryStudent(2,"Nguyễn Văn B");
        Student student3 = new SecondaryStudent(3,"Nguyễn Văn C");
        Student student4 = new SecondaryStudent(4,"Nguyễn Văn D");
        Student student5 = new SecondaryStudent(5,"Nguyễn Văn E");
        Student student6 = new SecondaryStudent(6,"Nguyễn Văn F");
        Student student7 = new SecondaryStudent(7,"Nguyễn Văn G");
        Student student8 = new SecondaryStudent(8,"Nguyễn Văn H");
        Student student9 = new SecondaryStudent(9,"Nguyễn Văn I");
    }

    public void Q8() throws Exception {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(5, 8);
        System.out.println("Diện tích hình chữ nhật: " + hinhChuNhat.dienTich(5,8));
        System.out.println("Chu vi hình chữ nhật: " + hinhChuNhat.chuVi(5,8));

        HinhTron hinhTron = new HinhTron(10);
        System.out.println("Diện tích hình tròn: " + hinhTron.dienTich(10));
        System.out.println("Chu vi hình tròn: " + hinhTron.chuVi(10));
    }


    public void printListStudent(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
