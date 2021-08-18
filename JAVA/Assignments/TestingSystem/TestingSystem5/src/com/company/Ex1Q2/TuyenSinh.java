package com.company.Ex1Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private ArrayList<Contestant> listContestant;
    private Scanner scan;

    public TuyenSinh(){
        listContestant =  new ArrayList<>();
        scan = new Scanner(System.in);
    }



    @Override
    public void insertContestant() {
        int ID, priorityLevel;
        String name, address, block;
        System.out.println("=====ENTER CONTESTANT INFORMATION=====");
        System.out.println("ID: ");
        ID = scan.nextInt();
        scan.nextLine();
        System.out.println("Name:");
        name = scan.nextLine();
        System.out.println("Address:");
        address = scan.nextLine();
        System.out.println("Priority level: ");
        priorityLevel = scan.nextInt();
        scan.nextLine();
        System.out.println("Block: ");
        block  = scan.nextLine();
        Block block1 = new Block(block);
        Contestant contestant = new Contestant(ID,name,address,priorityLevel,block1);
        listContestant.add(contestant);
    }

    @Override
    public void showListContestant() {
        for (Contestant contestantInfo : listContestant) {
            System.out.println(contestantInfo);
        }
    }

    @Override
    public void searchContestant(int ID) {
        for (Contestant contestant:listContestant
             ) {
            if (contestant.getID() == ID) {
                System.out.println(contestant);
            }
        }
    }
}
