package com.company;



//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.Date;
import java.util.Date;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {
        //Insert 3 departments
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "SALE";

        Department department2 = new Department();
        department2.departmentID = 2;
        department2.departmentName = "MARKETING";

        Department department3 = new Department();
        department3.departmentID = 3;
        department3.departmentName = "CODE";

        //Insert 3 positions
        Position position1 = new Position();
        position1.positionID = 1;
        position1.positionName = PositionName.DEV;

        Position position2 = new Position();
        position2.positionID = 2;
        position2.positionName = PositionName.PM;

        Position position3 = new Position();
        position3.positionID = 3;
        position3.positionName = PositionName.MASTER;


        //Insert 3 accounts
        Account account1 = new Account();
        account1.accountID = 1;
        account1.email = "a1@gmail.com";
        account1.userName = "account1";
        account1.fullName = "Duong Van A";
        account1.department = department1;
        account1.position = position2;
        account1.createDate = LocalDate.of(2021,2,20);


        Account account2;
        account2 = new Account();
        account2.accountID = 2;
        account2.email = "a2@gmail.com";
        account2.userName = "account2";
        account2.fullName = "Tran Van A";
        account2.department = department2;
        account2.position = position1;
        account2.createDate = LocalDate.of(2020,12,20);

        Account account3 = new Account();
        account3.accountID = 3;
        account3.email = "a3@gmail.com";
        account3.userName = "account3";
        account3.fullName = "Le Thi B";
        account3.department = department3;
        account3.position = position3;
        account3.createDate = LocalDate.of(2020,10,20);


        //Insert 3 groups:
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Group 1";
        group1.createDate = LocalDate.of(2021,5,20);
        group1.creator = account2;
        group1.account =  new Account[]{account1};

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "Group 2";
        group2.createDate = LocalDate.of(2020,10,20);
        group2.creator = account3;
        group2.account = new Account[]{account1,account2};

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Group 3";
        group3.createDate = LocalDate.of(2021,4,20);
        group3.creator = account1;
        group3.account = new Account[]{account3};

        //Add group Account:
        account1.groups = new Group[]{group1, group2};
        account2.groups = new Group[]{group2};
        account3.groups = new Group[]{group3};


        //Insert typeQuestions
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeID = 1;
        typeQuestion1.typeName = TypeName.ESSAY;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeID = 2;
        typeQuestion2.typeName = TypeName.ESSAY;


        //Insert 3 categoryQuestion
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.CategoryID = 1;
        categoryQuestion1.CategoryName = "Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.CategoryID = 2;
        categoryQuestion2.CategoryName = "Python";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.CategoryID = 3;
        categoryQuestion3.CategoryName = "Javascript";


        //Insert 3 Questions
        Question question1 = new Question();
        question1.questionID = 1;
        question1.content = "Content Question 1";
        question1.category = categoryQuestion1;
        question1.type = typeQuestion1;
        question1.creator = account1;
        question1.createDate = LocalDate.of(2021,1,10);

        Question question2 = new Question();
        question2.questionID = 2;
        question2.content = "Content Question 2";
        question2.category = categoryQuestion3;
        question2.type = typeQuestion2;
        question2.creator = account3;
        question2.createDate = LocalDate.of(2021,7,10);

        Question question3 = new Question();
        question3.questionID = 3;
        question3.content = "Content Question 3";
        question3.category = categoryQuestion3;
        question3.type = typeQuestion2;
        question3.creator = account2;
        question3.createDate = LocalDate.of(2021,2,14);


        //Insert Answer
        Answer answer1 = new Answer();
        answer1.answerID = 1;
        answer1.content = "Answer 1";
        answer1.isCorrect = true;
        answer1.question = question1;

        Answer answer2 = new Answer();
        answer2.answerID = 2;
        answer2.content = "Answer 2";
        answer2.isCorrect = false;
        answer2.question = question2;

        Answer answer3 = new Answer();
        answer3.answerID = 3;
        answer3.content = "Answer 3";
        answer3.isCorrect = true;
        answer3.question = question3;


        //Insert Exam
        Exam exam1 = new Exam();
        exam1.examID = 1;
        exam1.code = "EX1";
        exam1.title = "Exam 1";
        exam1.Category = categoryQuestion2;
        exam1.timeDoExam = 40;
        exam1.creator = account3;
        exam1.createDate = LocalDate.of(2021,1,20);

        Exam exam2 = new Exam();
        exam2.examID = 2;
        exam2.code = "EX2";
        exam2.title = "Exam 2";
        exam2.Category = categoryQuestion1;
        exam2.timeDoExam = 90;
        exam2.creator = account1;
        exam2.createDate = LocalDate.of(2021,5,20);

        Exam exam3 = new Exam();
        exam3.examID = 3;
        exam3.code = "EX3";
        exam3.title = "Exam 3";
        exam3.Category = categoryQuestion1;
        exam3.timeDoExam = 40;
        exam3.creator = account1;
        exam3.createDate = LocalDate.of(2020,10,20);


        /*
        Question 1:
        createDate kiểu localDate:
                Locale vnLocale =  new Locale("vi","VI");
                String dateInVietNam = exam1.createDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy",vnLocale));
                System.out.println(exam1.createDate + " in VietNam: " + dateInVietNam);
        */
        /*
        Khi createDate kiểu Date
        Locale locale = new Locale("vn", "VN");
         DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
         String date = dateformat.format(exam1.createDate);
         System.out.println(exam1.code + ": " + date);
        */


        //Question 2:
//        String parttern = "yyyy - MM - dd - HH - mm - ss";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(parttern);
//        String date = simpleDateFormat.format(new Date());
//        System.out.println(date);


        //Question 3:
//        String formattedDate = exam1.createDate.format(DateTimeFormatter.ofPattern("yyyy"));
//        System.out.println(formattedDate);


        //Qustion 4:
//        String formattedDate = exam1.createDate.format(DateTimeFormatter.ofPattern("MM/yyyy"));
//        System.out.println(formattedDate);

        //Question 5:
        String formattedDate = exam1.createDate.format(DateTimeFormatter.ofPattern("MM-dd"));
        System.out.println(formattedDate);
    }
}
