package backend;

import entity.Exercise3.*;

import java.util.HashMap;

public class Exercise3 {
    public void Q2() {
        //Question 1:
        StudentE3<Integer> student1 = new StudentE3<Integer>(1, "Dang Van  A");

        StudentE3<Float> student2 = new StudentE3<Float>(2.0f, "Nguyen Thi B");

        StudentE3<Double> student3 = new StudentE3<Double>(3.0, "Nguyen Van C");

        // Question 2: T generic method print object
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
         print(4);
         print(4.0);
         print(student1);
    }


    public void Q4() {
        Integer[] arrayInt = {0,2,4,6,8};
        Float[] arrayFloat = {1.5f,2.5f,3.5f,4.5f};
        Long[] arrayLong = {100000L,200000L,300000L};
        Double[] arrayDouble = {100000.5,200000.5,300000.5};
        printArray(arrayInt);
    }


    public void Q5() {
        Employee employee1 = new Employee("Tran Anh Tuan", new Integer[]{1000, 1200, 1250});
        Employee employee2 = new Employee("Le Thi A", new Float[]{1000.3f, 1200.9f, 1250.6f});
        Employee employee3 = new Employee("Nguyen Van B", new Double[]{1000.5, 1200.5, 1250.5});

        Employee[] employees = {employee1, employee2, employee3};
        for (Employee employee : employees
        ) {
            System.out.println(employee);
            System.out.println(employee.getSalaryLast());
        }
    }


    public void Q6() {
        MyMap<Integer, String> studentList = new MyMap<>(2019604098,"Tran Anh Tuan");
        System.out.println("Key of myMath:");
        System.out.println(studentList.getKey());
        System.out.println("Value of myMath:");
        System.out.println(studentList.getValue());
    }


    public void Q7() {
        Phone<String, String> phone1 = new Phone<>("tanhtuan@gmail.com","0123456777");
        System.out.println(phone1);
        Phone<Integer, String> phone2 = new Phone<>(1,"0123456777");
        System.out.println(phone2);
        Phone<String, String> phone3 = new Phone<>("Tran Tuan","0123456777");
        System.out.println(phone3);
    }


    public void Q8() {
        Staff<Integer, String> staff1 = new Staff<>(1, "Nguyen Van A");
        System.out.println(staff1);
        Staff<Long, String> staff2 = new Staff<>(2L, "Nguyen Van B");
        System.out.println(staff2);

    }

    private <T> void print(T a) {
        System.out.println(a);
    }

    private <E> void printArray(E[] a) {
        for (E x : a
        ) {
            System.out.println(x);
        }
    }

}
