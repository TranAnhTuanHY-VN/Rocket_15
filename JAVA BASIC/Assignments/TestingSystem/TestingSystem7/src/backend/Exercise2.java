package backend;

import entity.Exercise2.MyMath;
import entity.Exercise2.PrimaryStudent;
import entity.Exercise2.SecondaryStudent;
import entity.Exercise2.Student;

public class Exercise2 {
    public void Q1() {
        System.out.println(MyMath.sum(9));
    }

    public void Q234() {
        PrimaryStudent primaryStudent = new PrimaryStudent(1, "Tran Tuan");
        SecondaryStudent secondaryStudent = new SecondaryStudent(2, "Dao Tung");
        PrimaryStudent.study();
        SecondaryStudent.study();
    }
}
