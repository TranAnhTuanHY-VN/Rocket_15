package org.vti.Backend;

import org.vti.Entity.Exam;

import java.util.List;

public interface IExamRepository {
    List<Exam> getAllExams();
    void createExam(Exam exam);
}
