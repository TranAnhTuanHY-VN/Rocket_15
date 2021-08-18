package com.company;

import java.time.LocalDate;

public class Exam {
    int                 examID;
    String              code;
    String              title;
    CategoryQuestion    Category;
    int                 timeDoExam;
    Account             creator;
    LocalDate                createDate;
    Question[]          question;
}
