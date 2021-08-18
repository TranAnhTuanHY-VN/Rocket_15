package com.company;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        //Question 1:
//        System.out.println("Nhập xâu kí tự: ");
//        String a = scan.nextLine();
//        System.out.println("Số từ trong chuỗi là: " + countWords(a));
//        scan.close();


//        //Question 2:
//        String s1;
//        String s2;
//        System.out.println("Nhập chuỗi 1:");
//        s1 = scan.nextLine();
//        System.out.println("Nhập chuỗi 2:");
//        s2 = scan.nextLine();
//        System.out.println("Chuỗi sau khi ghép là: " + s1 + " " + s2);
//        //OR
//        System.out.println("Chuỗi sau khi ghép là: " + s1.concat(s2));
//        scan.close();


//        //Question 3:
//        String name;
//        System.out.println("Nhập vào tên:");
//        name = scan.next();
//        String firstCharacter = name.substring(0, 1).toUpperCase();
//        String leftCharacter = name.substring(1);
//        name = firstCharacter + leftCharacter;
//        System.out.println("Tên sau khi chuẩn hóa : " + name);
//        scan.close();


//        //Question 4:
//        String name;
//        System.out.println("Nhập tên : ");
//        name = scan.next();
//        name = name.toUpperCase();
//        for (int i = 0 ; i < name.length(); i++){
//            System.out.println("Ký tự thứ " + (i+1) + "là: " + name.charAt(i));
//        }


        //Questioin 6:
//        String fullName;
//        String lastName = "";
//        String firstName = "";
//        String middleName ;
//        int indexLastName = 0;
//        int indexFirstName = 0;
//        System.out.println("Nhập họ và tên của bạn: ");
//        fullName = scan.nextLine();
//        fullName = fullName.trim();
//        for (int i = 0; i < fullName.length() ; i++){
//            if (fullName.charAt(i) != ' '){
//                firstName = firstName + fullName.charAt(i);
//                indexFirstName = i+1;
//            }else {
//                break;
//            }
//        }
//        for (int j = (fullName.length()-1); j >= 0; j--){
//            if (fullName.charAt(j) != ' ') {
//                lastName = fullName.charAt(j) + lastName;
//                indexLastName = j-1;
//            } else {
//                break;
//            }
//        }
//        middleName = fullName.substring(indexFirstName,indexLastName);
//        middleName = middleName.trim();
//        System.out.println("Họ là:"+ firstName);
//        System.out.println("Họ đệm là:"+ middleName);
//        System.out.println("Tên là:"+ lastName);



//        //Quesiton 7:
//        String fullName;
//        System.out.println("Nhập họ tên đầy đủ");
//        fullName = scan.nextLine();
//        scan.close();
//// remove space characters
//        fullName = fullName.trim();
//        fullName = fullName.replaceAll("\\s+", " ");
//        System.out.println("Tên đã nhập sau khi bỏ dấu cách dư thừa: "+ fullName);
//        String[] words = fullName.split(" ");
//        fullName = "";
//        for (String word : words) {
//            String firstCharacter = word.substring(0, 1).toUpperCase();
//            String leftCharacter = word.substring(1);
//            word = firstCharacter + leftCharacter;
//            fullName += word + " ";
//        }
//        System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);


//        //Quesiton 8:
//        String[] groupName = {"Lập trình không khó!","Java with me","Python debug"};
//        System.out.println("Tên group có chứa \"Java\"");
//        for (String name: groupName) {
//            if (name.contains("Java")) {
//                System.out.println(name);
//            }
//        }


//        //Question 9:
//        String[] groupName = {"Lập trình không khó!","Java","Java with me","Python debug"};
//        for (String name: groupName) {
//            if (name.equals("Java")) {
//                System.out.println(name);
//            }
//        }


        //Question 10:

    }


    //Cont Word in String
    public static int countWords(String a) {
        if (a == null) {
            return -1;
        }
        int dem = 0;
        int size = a.length();
        boolean checkLoopSpace = true;
        char space = ' ';
        for (int i = 0; i < size; i++) {
            if (a.charAt(i) != space) {
                if (checkLoopSpace) {
                    dem++;
                    checkLoopSpace = false;
                }
            } else {
                checkLoopSpace = true;
            }
        }
        return dem;
    }


}
