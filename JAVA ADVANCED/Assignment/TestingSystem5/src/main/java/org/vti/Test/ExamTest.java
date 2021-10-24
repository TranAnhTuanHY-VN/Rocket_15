package org.vti.Test;

import org.vti.Entity.Exam;
import org.vti.Repository.ExamRepository;

import java.util.List;

public class ExamTest {

    public static void main(String[] args) {
        ExamRepository repository = new ExamRepository();

        System.out.println("====================GET ALL EXAMS=======================");

        List<Exam> Exams = repository.getAllExams();

        for (Exam exam : Exams
        ) {
            System.out.println(exam);
        }

//        System.out.println("\n\n===============CREATE EXAMS=========================");
//
//        Exam examCreate = new Exam();
//        examCreate.setTitle("Test in 2");
//        examCreate.setDuration((short) 185);
//
//        repository.createExam(examCreate);
    }
}
