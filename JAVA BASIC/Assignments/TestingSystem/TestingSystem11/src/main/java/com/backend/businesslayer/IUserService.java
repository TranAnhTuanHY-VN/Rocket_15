package com.backend.businesslayer;

import com.entity.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * This class is interface of Account Service
 * @author TranAnhTuan
 */
public interface IUserService {
    /**
     * The method get list Account
     * @author TranAnhTuan
     */
    List<Account> getListAccounts() throws SQLException, ClassNotFoundException;

    /**
     * The method return Account has AccountID is parameter
     * @author TranAnhTuan
     */
    Account getAccountByID(int id) throws Exception;

    /**
     * The method check Account Exists by UserName
     * @author TranAnhTuan
     */
    boolean isAccountExists(String username) throws SQLException, ClassNotFoundException;

    /**
     * The method check Account Exists by ID
     * @author TranAnhTuan
     */
    boolean isAccountExists(int id) throws SQLException, ClassNotFoundException;

    /**
     * The method create account
     * @author TranAnhTuan
     */
    void createAccount(String username, String fullName) throws Exception;

    /**
     * The method update Account UserName by ID
     * @author TranANhTuan
     */
    void updateAccountUsernameByID(int id, String newUserName) throws SQLException, ClassNotFoundException;

    /**
     * The method update Account FullName by ID
     * @author TranANhTuan
     */
    void updateAccountFullNameByID(int id, String newFullName) throws Exception;

    /**
     * The method delete Account by ID
     * @author TranANhTuan
     */
    void deleteAccount(int id) throws Exception;
}
