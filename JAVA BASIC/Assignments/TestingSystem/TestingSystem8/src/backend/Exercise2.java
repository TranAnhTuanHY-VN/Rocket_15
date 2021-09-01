package backend;

import entity.Exercise2.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    public void Q12() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Nguyen Van A", LocalDate.of(2020,10,20),10));
        students.add(new Student("Tran Thi D", LocalDate.of(2021,1,20),10));
        students.add(new Student("Ngo Van E", LocalDate.of(2021,5,20),10));
        students.add(new Student("Dao Van G", LocalDate.of(2021,7,20),10));
        students.add(new Student("Trinh Van B", LocalDate.of(2021,2,20),10));

        System.out.println("Danh sách ban đầu:");
        printList(students);
        System.out.println("Danh sách sau khi sắp xếp:");
        Collections.sort(students);
        printList(students);
    }

    public void printList(List<Student> students) {
        for (Student student : students
        ) {
            System.out.println(student);
        }
    }
}
