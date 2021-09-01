package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        //Quesytion 1:
//        int n = random.nextInt();
//        System.out.println(n);


        //Question 2:
//        double x = random.nextDouble();
//        System.out.println(x);


        //Question 3:
//        String[] name = {"Tuan", "Toan", "Hang", "Truong","Hien"};
//        int randomindex = random.nextInt(name.length);
//        System.out.println(name[randomindex]);


        //Question 4:
//        int minDay = (int) LocalDate.of(1995,7,24).toEpochDay();
//        int maxDay = (int) LocalDate.of(1995,12,20).toEpochDay();
//        long randomInt = minDay + random.nextInt(maxDay-minDay);
//        LocalDate randomDate = LocalDate.ofEpochDay(randomInt);
//        System.out.println(randomDate);


        //Question 5:
//        int now = (int) LocalDate.now().toEpochDay();
//        int randomDate = now - random.nextInt(365);
//        LocalDate resultDate = LocalDate.ofEpochDay(randomDate);
//        System.out.println(resultDate);


        //Question 6:
//        int maxDay = (int) LocalDate.now().toEpochDay();
//        long randomDay = random.nextInt(maxDay);
//        LocalDate resultDate1 = LocalDate.ofEpochDay(randomDay);
//        System.out.println(resultDate1);


        //Question 7:
        int z = random.nextInt(900)+100;
        System.out.println(z);
    }
}
