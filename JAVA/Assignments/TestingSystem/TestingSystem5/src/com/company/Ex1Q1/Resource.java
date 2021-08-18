package com.company.Ex1Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Resource {
    public Scanner scan;
    public ArrayList<News> listNew;

    public Resource() {
        scan = new Scanner(System.in);
        listNew = new ArrayList<>();
    }

    public void Q1() {
        mainMenu();
    }

    private void mainMenu() {
        do {
            int check;
            do {
                System.out.println("========================================");
                System.out.println("=============FUNCTION LIST==============");
                System.out.println("1. Insert News");
                System.out.println("2. View list news");
                System.out.println("3. Average rate");
                System.out.println("0. Exit.");
                System.out.println("========================================");
                System.out.println("Enter the selection: ");
                check = scan.nextInt();
            } while (check < 0 || check > 3);
            switch (check) {
                case 1:
                    String title, publishDate, author, content;
                    int rate1, rate2, rate3;
                    System.out.println("------Enter new's information------");
                    scan.nextLine();
                    System.out.println("Title: ");
                    title =  scan.nextLine();
                    System.out.println("Publish Date: ");
                    publishDate = scan.nextLine();
                    System.out.println("Author: ");
                    author = scan.nextLine();
                    System.out.println("Content: ");
                    content = scan.nextLine();
                    System.out.println("Rate 1:");
                    rate1 = scan.nextInt();
                    System.out.println("Rate 2:");
                    rate2 = scan.nextInt();
                    System.out.println("Rate 3:");
                    rate3=  scan.nextInt();
                    int[] rates = {rate1, rate2, rate3};
                    News news =  new News(title,publishDate,author,content,rates);
                    listNew.add(news);
                    break;
                case 2:
                    for (News newInfor : listNew
                    ) {
                        newInfor.Caculate();
                        newInfor.Display();
                    }
                    break;
                case 3:
                    System.out.println("Average Rate: ");
                    for (News newInfor : listNew
                    ) {
                        System.out.println("Title: "+  newInfor.getTitle() + ", AVGRate: "+newInfor.Caculate());
                    }
                    break;
                case 0:
                    return;
            }

        } while (true);
    }
}
