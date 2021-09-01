package com.frontend;

import com.backend.presentationlayer.AccountController;
import com.entity.Account;
import com.utils.ScannerUtils;

import java.sql.SQLException;
import java.util.List;


/**
 * The program demo Excercise 1
 * @author TranAnhTuan
 * @create_date August 9, 2021
 */
public class Program1 {
    private static AccountController accountController;
    public static void main(String[] args) throws Exception {
        accountController = new AccountController();
        int choose;
        do {
            do {
                mainMenu();
                choose = ScannerUtils.inputInt();
            } while (choose < 0 || choose > 5);
            switch (choose) {
                case 0:
                    return;
                case 1:
                    System.out.println("==============||ACCOUNT LIST||===========");
                    getListAccounts();
                    break;
                case 2:
                    System.out.println("==========||GET ACCOUNT BY ID||==========");
                    try {
                        getAccountByID();
                        System.out.println("Get Account Success!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Get Account false!");
                    }
                    break;
                case 3:
                    System.out.println("============||CREATE ACCOUNT||===========");
                    try {
                        createAccount();
                        System.out.println("Create Account Success!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Create Account False!");
                    }
                    break;
                case 4:
                    System.out.println("============||UPDATE ACCOUNT||===========");
                    try {
                        updateAccount();
                        System.out.println("Update success!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Update false!");
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.println("============||DELETE ACCOUNT||===========");
                    try {
                        deleteAccount();
                        System.out.println("Delete success!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Delete false!");
                    }
                    break;
            }
        } while (true);

    }

    public static void mainMenu() {
        System.out.println();
        System.out.println("=========================================");
        System.out.println("=============FUNCTION LIST===============");
        System.out.println("=======|1. Get list account    |=========");
        System.out.println("=======|2. Get account by id   |=========");
        System.out.println("=======|3. Create account      |=========");
        System.out.println("=======|4. Update account      |=========");
        System.out.println("=======|5. Delete account      |=========");
        System.out.println("=======|0. Exit                |=========");
        System.out.println("=========================================");
        System.out.println("You choose:                ");
    }

    public static void getListAccounts() throws SQLException, ClassNotFoundException {
        List<Account> accountList = accountController.getListAccounts();

        for (Account account : accountList
        ) {
            System.out.println(account);
        }
    }

    public static void getAccountByID() throws Exception {
        System.out.println("Input AccountID: ");
        int id = ScannerUtils.inputId();
        Account account = accountController.getAccountByID(id);
        System.out.println(account);
    }

    private static void createAccount() throws Exception {
        System.out.println("Input username: ");
        String username = ScannerUtils.inputString("Please input username as String!");

        System.out.println("Input full name: ");
        String fullName = ScannerUtils.inputString("Please input full name as String!");

        accountController.createAccount(username, fullName);
    }

    private static void updateAccount() throws Exception {
        System.out.println("Input id: ");
        int id = ScannerUtils.inputId();

        System.out.println("Input full name: ");
        String fullName = ScannerUtils.inputString("Please input full name as String !");

        accountController.updateAccountFullNameByID(id, fullName);
    }

    private static void deleteAccount() throws Exception {
        System.out.println("Input id: ");
        int id = ScannerUtils.inputId();

        accountController.deleteAccount(id);
    }
}
