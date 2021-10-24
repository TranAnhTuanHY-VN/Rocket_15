package org.vti.Test;

import org.vti.Repository.AccountRepository;
import org.vti.Entity.Account;
//import org.vti.Entity.Department;

import java.util.List;

public class AccountTest {
    public static void main(String[] args) {
        AccountRepository accountRepository = new AccountRepository();
        List<Account> accountList = accountRepository.getAllAccounts();

        for (Account accountInfo: accountList
             ) {
            System.out.println(accountInfo);
//            Department department = accountInfo.getDepartment();
//            System.out.println(department.getName());
//            System.out.println(accountInfo.getFullName());
        }
    }
}
