package com.backend.businesslayer;

import com.backend.datalayer.AccountRepository;
import com.backend.datalayer.IUserRepository;
import com.entity.Account;
import com.utils.JDBCUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


/**
 * The class is account service
 * @author TranAnhTuan
 */
public class AccountService implements IUserService{
    IUserRepository iUserRepository;

    /**
     * The constructor of AccountService Class
     * @author TranAnhTuan
     * @create_date August 9,2021
     * @throws IOException
     */
    public AccountService() throws IOException {
        this.iUserRepository = new AccountRepository();
    }

    public List<Account> getListAccounts() throws SQLException, ClassNotFoundException {
        return iUserRepository.getListAccounts();
    }

    public Account getAccountByID(int id) throws Exception {
        //Handing business
        if (!isAccountExists(id)) {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("account.getAccountByID.cannotFindAccountById")+" " +id);
        }
        return iUserRepository.getAccountByID(id);
    }

    public boolean isAccountExists(String username) throws SQLException, ClassNotFoundException {
        return iUserRepository.isAccountExists(username);
    }

    public boolean isAccountExists(int id) throws SQLException, ClassNotFoundException {
        return iUserRepository.isAccountExists(id);
    }

    public void createAccount(String username, String fullName) throws Exception {
        if (isAccountExists(username)) {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("account.getAccountByID.usernameIsExists")
            );
        }
        iUserRepository.createAccount(username, fullName);
    }

    public void updateAccountUsernameByID(int id, String newUserName) throws SQLException, ClassNotFoundException {
        iUserRepository.updateAccountUsernameByID(id,newUserName);
    }

    public void updateAccountFullNameByID(int id, String newFullName) throws Exception {
        //Logic service
        if (!isAccountExists(id)) {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("account.getAccountByID.cannotFindAccountById") + " " + id
            );
        }
        iUserRepository.updateAccountFullNameByID(id, newFullName);
    }

    public void deleteAccount(int id) throws Exception {
        //logic service
        if (!isAccountExists(id)) {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("account.getAccountByID.cannotFindAccountById") + " " + id
            );
        }
        iUserRepository.deleteAccount(id);
    }
}
