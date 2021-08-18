package backend;

import entity.Exercise4.MyMath;
import entity.Exercise4.MyNumber;
import entity.Exercise4.Salary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    public void Q1() {
        Salary<Integer> salary = new Salary<>(123);
        System.out.println(salary);
    }

    public void Q2() {
        MyNumber<Integer> myNumber = new MyNumber<>(1209);
        System.out.println(myNumber);
    }

    public void Q3() {
        MyMath<Integer> myMath = new MyMath<>();
        int maxInt = myMath.maximum(4,7,5);
        System.out.println(maxInt);
        double maxDouble = myMath.maximum(7.5,7.7,7.8);
        System.out.println(maxDouble);
    }

    public void Q4() {
        MyMath<Float> mathFloat = new MyMath<>();
        MyMath<Integer> mathInteger = new MyMath<>();

        // add
        System.out.println(mathInteger.add(new Integer(10), new Integer(10)));


        System.out.println(mathFloat.add(new Float(1.5f),new Float(2.5f),new Float(5.5f)));

        // subtract
        System.out.println(mathInteger.subtract(new Integer(10),new Integer(2)));


        System.out.println(mathFloat.subtract(new Float(1.5f),new Float(0.5f)));



    }

    public void Q5() {
        ArrayList<Object> inforCustomers = new ArrayList<>();
        inforCustomers.add("Nguyễn Văn Nam");
        inforCustomers.add(30);
        inforCustomers.add("Hà đông, Hà nội");

        for (Object object : inforCustomers) {
            System.out.println(object);
        }
    }
}
