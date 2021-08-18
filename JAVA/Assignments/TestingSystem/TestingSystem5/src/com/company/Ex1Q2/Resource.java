package com.company.Ex1Q2;

import java.util.Scanner;

public class Resource {
    private TuyenSinh tuyenSinh;
    private Scanner scan;

    public Resource() {
        tuyenSinh  = new TuyenSinh();
        scan =   new Scanner(System.in);
    }

    public void Q2(){
        mainProgram();
    }

    private void mainProgram() {
        int choose;
        do {
            do {
                System.out.println();
                System.out.println("===================================");
                System.out.println("===========FUNCTION LIST===========");
                System.out.println("1. Insert contestant");
                System.out.println("2. Show list contestant");
                System.out.println("3. Search contestant by ID");
                System.out.println("0. Exit");
                System.out.println("===================================");
                System.out.println("Enter your choose: ");
                choose = scan.nextInt();
            }while (choose<0 || choose>3);
            switch (choose) {
                case 0:
                    return;
                case 1:
                    tuyenSinh.insertContestant();
                    break;
                case 2:
                    tuyenSinh.showListContestant();
                    break;
                case 3:
                    int ID;
                    System.out.println("Enter contestant's ID you want search:");
                    ID = scan.nextInt();
                    tuyenSinh.searchContestant(ID);
                    break;
            }
        }while (true);
    }

}
