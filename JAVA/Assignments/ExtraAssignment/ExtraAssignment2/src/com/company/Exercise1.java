package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //Call method of Question 1:
//        convertMeasure();

        //Call method of Question 2:
//        convertTime();


        //Call method of Queestion 3:
//        minMax();


        //Call method of Question 4:
        subtract();
    }
    //Question 1:
    public static void convertMeasure(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời nhập vào một số: ");
        double cm = scan.nextDouble();
        double inch = cm/2.54;
        double foot = inch/12;
        System.out.printf("Bằng %.2f inch tương đương với %.2f foot",inch,foot);
    }


    //Question 2:
    public static void convertTime(){
        Scanner scan = new Scanner(System.in);
        int sInput;
        int h,m,s;
        System.out.println("Mời nhập vào số giây(s): ");
        sInput = scan.nextInt();
        if (sInput < 60) {
            s = sInput;
            System.out.printf("00:00:%02d",s);
        } else if (sInput < 3600) {
            m = sInput / 60;
            s = sInput - m * 60;
            System.out.printf("00:%02d:%02d", m, s);
        } else {
            h = sInput/3600;
            m = (sInput-h*3600)/60;
            s = sInput - h*3600 - m*60;
            System.out.printf("%02d:%02d:%02d",h,m,s);
        }
    }


    //Queestion 3:
    public static void minMax(){
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Nhập 4 số nguyên: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        int min, max;
        min = max = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        if (max < b) max = b;
        if (max < c) max = b;
        if (max < d) max = d;
        System.out.println("Min = "+ min + "\nMax = "+ max);
    }


    //Question 4:
    public static void subtract(){
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Nhập hai số: ");
        a = scan.nextInt();
        b = scan.nextInt();
        int sub = a - b;
        if (sub > 0) {
            System.out.println("Số thứ nhất lớn hơn số thứ hai.");
        } else if (sub < 0) {
            System.out.println("Số thứ nhất nhỏ hơn số thứ hai.");
        }
    }
}
