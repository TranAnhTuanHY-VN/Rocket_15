package com.backend.presentationlayer;

import com.backend.businesslayer.AccountService;
import com.backend.businesslayer.IUserService;
import com.entity.Account;
import com.utils.JDBCUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * The class is account controller
 * @author TranAnhTuan
 */
public class AccountController {
    IUserService iUserService;

    /**
     * The constructor of AccountController Class
     * @author TranAnhTuan
     * @create_date August 9,2021
     * @throws IOException
     */
    public AccountController() throws IOException {
        this.iUserService = new AccountService();
    }

    public List<Account> getListAccounts() throws SQLException, ClassNotFoundException {
        return iUserService.getListAccounts();
    }

    public Account getAccountByID(int id) throws Exception {
        return iUserService.getAccountByID(id);
    }

    public boolean isAccountExists(String username) throws SQLException, ClassNotFoundException {
        return iUserService.isAccountExists(username);
    }

    public boolean isAccountExists(int id) throws SQLException, ClassNotFoundException {
        return iUserService.isAccountExists(id);
    }

    public void createAccount(String username, String fullName) throws Exception {
        iUserService.createAccount(username, fullName);
    }

    public void updateAccountUsernameByID(int id, String newUserName) throws SQLException, ClassNotFoundException {
        iUserService.updateAccountUsernameByID(id,newUserName);
    }

    public void updateAccountFullNameByID(int id, String newFullName) throws Exception {
        iUserService.updateAccountFullNameByID(id, newFullName);
    }

    public void deleteAccount(int id) throws Exception {
        iUserService.deleteAccount(id);
    }
}
