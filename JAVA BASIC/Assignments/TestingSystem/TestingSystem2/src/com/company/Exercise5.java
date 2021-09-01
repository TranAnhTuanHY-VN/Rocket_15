package com.company;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Question 1:
//        int a, b, c;
//        System.out.println("Nhập 3 số nguyên vào chương trình: ");
//        a = scan.nextInt();
//        b = scan.nextInt();
//        c = scan.nextInt();
//        System.out.println(a + " " + b + " " + c);


        //Question 2:
//        double a, b;
//        System.out.println("Nhập 2 số thực vào chương trình: ");
//        a = scan.nextDouble();
//        b = scan.nextDouble();
//        System.out.println(a + " " + b);


        //Question 3:
//        String name;
//        System.out.println("Enter your name: ");
//        name = scan.nextLine();
//        System.out.println(name);


        //Question 4:
//        int d,m,y;
//        System.out.println("Enter Date of Birth: ");
//        d = scan.nextInt();
//        System.out.println("Enter Month of Birth: ");
//        m = scan.nextInt();
//        System.out.println("Enter Year of Birth: ");
//        y = scan.nextInt();
//        LocalDate birthday = LocalDate.of(y,m,d);
//        System.out.println("Your Birthday is: "+ birthday);


        //Call Question 5:
//        createAccQ5();


        //Question 6:
//        createDepartmentQ6();

        //Question 7:
//        int n;
//        do {
//            System.out.println("Nhập vào số chẵn: ");
//            n = scan.nextInt();
//        }while(n%2!=0);
//        System.out.println("Số vừa nhập là "+n);


        //Question 8:
//        int n;
//        boolean check;
//        do {
//            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
//            n = scan.nextInt();
//            if(n==1 || n==2) {
//                switch (n) {
//                    case 1:
//                        createAccQ5();
//                        break;
//                    case 2:
//                        createDepartmentQ6();
//                        break;
//                }
//                check = true;
//            }else {
//                System.out.println("Mời bạn nhập lại!");
//                check = false;
//            }
//        }while (check != true);


        //Question 9:
        //Call method
//        addGrouptoAccQ9();


        //Question 10:
//        int n;
//        boolean check;
//        String checkContinue;
//        do {
//            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
//            n = scan.nextInt();
//            if(n==1 || n==2 || n==3){
//                switch (n) {
//                    case 1:
//                        createAccQ5();
//                        break;
//                    case 2:
//                        createDepartmentQ6();
//                        break;
//                    case 3:
//                        addGrouptoAccQ9();
//                        break;
//                }
//                System.out.println("Bạn có muốn tiếp tục chương trình?");
//                checkContinue = scan.next();
//                check = !checkContinue.equalsIgnoreCase("có");
//            }else {
//                System.out.println("Mời bạn nhập lại!");
//                check = false;
//            }
//        }while (!check);


        //Question 11:
        int n;
        boolean check;
        String checkContinue;
        do {
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
            n = scan.nextInt();
            if(n==1 || n==2 || n==3 || n==4){
                switch (n) {
                    case 1:
                        createAccQ5();
                        break;
                    case 2:
                        createDepartmentQ6();
                        break;
                    case 3:
                        addGrouptoAccQ9();
                        break;
                    case 4:
                        addRandomGrouptoAcc();
                        break;
                }
                System.out.println("Bạn có muốn tiếp tục chương trình?");
                checkContinue = scan.next();
                check = !checkContinue.equalsIgnoreCase("có");
            }else {
                System.out.println("Mời bạn nhập lại!");
                check = false;
            }
        }while (!check);



    }
    //Question 5:
    public static void createAccQ5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập thông tin Acc cần tạo: ");

        System.out.print("Nhap vao Account ID:");
        int id = scan.nextInt();

        System.out.print("Nhap vao username:");
        String userName = scan.nextLine();

        System.out.print("Nhap vao Department:");
        String department = scan.nextLine();

        System.out.print("Nhap vao Position ID (tu 1 -> 5):");
        int position = scan.nextInt();
        switch (position) {
            case 1:
                System.out.print("Dev");
                break;
            case 2:
                System.out.print("Test");
                break;
            case 3:
                System.out.print("ScrumMaster");
                break;
            case 4:
                System.out.print("PM");
                break;
            default:
                System.out.print("SA");
        }

        System.out.print("\nNhap vao group:");
        String group = scan.nextLine();

        System.out.print("\nNhap vao ngay:");
        String date = scan.nextLine();
    }

    //Question 6;
    public static void createDepartmentQ6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin Department cân tạo: ");
        Department dep = new Department();
        System.out.println("Nhập ID: ");
        dep.departmentID = sc.nextInt();
        System.out.println("Nhập Name: ");
        dep.departmentName = sc.next();
        System.out.println("Thông tin Department vừa nhập, ID: " + dep.departmentID + " Name: " + dep.departmentName);
    }

    //Quesiont9:
    public static void addGrouptoAccQ9() {
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
        account1.createDate = LocalDate.of(2021, 2, 20);


        Account account2;
        account2 = new Account();
        account2.accountID = 2;
        account2.email = "a2@gmail.com";
        account2.userName = "account2";
        account2.fullName = "Tran Van A";
        account2.department = department2;
        account2.position = position1;
        account2.createDate = LocalDate.of(2020, 12, 20);

        Account account3 = new Account();
        account3.accountID = 3;
        account3.email = "a3@gmail.com";
        account3.userName = "account3";
        account3.fullName = "Le Thi B";
        account3.department = department3;
        account3.position = position3;
        account3.createDate = LocalDate.of(2020, 10, 20);


        //Insert 3 groups:
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Group 1";
        group1.createDate = LocalDate.of(2021, 5, 20);
        group1.creator = account2;
        group1.account = new Account[]{account1};

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "Group 2";
        group2.createDate = LocalDate.of(2020, 10, 20);
        group2.creator = account3;
        group2.account = new Account[]{account1, account2};

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Group 3";
        group3.createDate = LocalDate.of(2021, 4, 20);
        group3.creator = account1;
        group3.account = new Account[]{account3};


        Scanner sc = new Scanner(System.in);
        Account[] acc = {account1, account2, account3};
        Group[] groups = {group1, group2, group3};
        int indexAcc = -1, indexGroup = -1;

        do {
            // Show danh sách acc và cho user nhập tên acc
            System.out.println("Danh sách user có trong hệ thống: ");
            for (Account account : acc) {
                System.out.println(account.userName);
            }
            System.out.println("Nhập username của account cần thực hiện:");
            String userNameInput = sc.nextLine();

            // Show danh sách acc và cho user nhập tên groups
            System.out.println("Danh sách Group có trong hệ thống:");
            for (Group group : groups) {
                System.out.println(group.groupName);
            }
            System.out.println("Nhập tên group cần thực hiện: ");
            String groupNameInput = sc.nextLine();


            for (int i = 0; i < acc.length; i++) {
                //Khi username trong hệ thống trùng với username nhập vào thì indexAcc = vị trí của Acc
                if (userNameInput.equalsIgnoreCase(acc[i].userName)) {
                    indexAcc = i;
                }
            }
            for (int j = 0; j < groups.length; j++) {
                //Khi groupname trong hệ thống trùng với groupname nhập vào thì indexGroup = vị trí của Group
                if (groupNameInput.equalsIgnoreCase(groups[j].groupName)) {
                    indexGroup = j;
                }
            }
        } while (indexAcc < 0 && indexGroup < 0) ;
        acc[indexAcc].groups = new Group[]{groups[indexGroup]};
        System.out.println("Bạn vừa Add group: " + groups[indexGroup].groupName + " cho Account: " + acc[indexAcc].userName);
        System.out.println("Account " + acc[indexAcc].userName + " thuộc: ");
        for (Group groupInFo : acc[indexAcc].groups) {
            System.out.println(groupInFo.groupName);
        }
    }
    public static void addRandomGrouptoAcc() {
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
        account1.createDate = LocalDate.of(2021, 2, 20);


        Account account2;
        account2 = new Account();
        account2.accountID = 2;
        account2.email = "a2@gmail.com";
        account2.userName = "account2";
        account2.fullName = "Tran Van A";
        account2.department = department2;
        account2.position = position1;
        account2.createDate = LocalDate.of(2020, 12, 20);

        Account account3 = new Account();
        account3.accountID = 3;
        account3.email = "a3@gmail.com";
        account3.userName = "account3";
        account3.fullName = "Le Thi B";
        account3.department = department3;
        account3.position = position3;
        account3.createDate = LocalDate.of(2020, 10, 20);


        //Insert 3 groups:
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Group 1";
        group1.createDate = LocalDate.of(2021, 5, 20);
        group1.creator = account2;
        group1.account = new Account[]{account1};

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "Group 2";
        group2.createDate = LocalDate.of(2020, 10, 20);
        group2.creator = account3;
        group2.account = new Account[]{account1, account2};

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Group 3";
        group3.createDate = LocalDate.of(2021, 4, 20);
        group3.creator = account1;
        group3.account = new Account[]{account3};

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Account[] acc = {account1, account2, account3};
        Group[] groups = {group1, group2, group3};
        int indexAcc = -1;
        int indexGroup;

        do {
            // Show danh sách acc và cho user nhập tên acc
            System.out.println("Danh sách user có trong hệ thống: ");
            for (Account account : acc) {
                System.out.println(account.userName);
            }
            System.out.println("Nhập username của account cần thực hiện:");
            String userNameInput = sc.nextLine();

            // chọn ngẫu nhiên group:
            String groupNameInput;
            indexGroup = random.nextInt(groups.length);
            groupNameInput = groups[indexGroup].groupName;

            for (int i = 0; i < acc.length; i++) {
                //Khi username trong hệ thống trùng với username nhập vào thì indexAcc = vị trí của Acc
                if (userNameInput.equalsIgnoreCase(acc[i].userName)) {
                    indexAcc = i;
                }
            }
            for (int j = 0; j < groups.length; j++) {
                //Khi groupname trong hệ thống trùng với groupname nhập vào thì indexGroup = vị trí của Group
                if (groupNameInput.equalsIgnoreCase(groups[j].groupName)) {
                    indexGroup = j;
                }
            }
        } while (indexAcc < 0 && indexGroup < 0);
        acc[indexAcc].groups = new Group[]{groups[indexGroup]};
        System.out.println("Bạn vừa Add group: " + groups[indexGroup].groupName + " cho Account: " + acc[indexAcc].userName);
        System.out.println("Account " + acc[indexAcc].userName + " thuộc: ");
        for (Group groupInFo : acc[indexAcc].groups) {
            System.out.println(groupInFo.groupName);
        }
    }
}