package com.backend.datalayer;

import com.entity.Account;
import com.utils.JDBCUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The class is account repository
 * @author TranAnhTuan
 */
public class AccountRepository implements IUserRepository {
    Connection connection;
    JDBCUtils jdbcUtils;

    /**
     * The constructor of AccountRepository Class
     * @author TranAnhTuan
     * @create_date August 9,2021
     */
    public AccountRepository() throws IOException {
        this.jdbcUtils = new JDBCUtils();
    }



    public List<Account> getListAccounts() throws SQLException, ClassNotFoundException {
        List<Account> accounts = new ArrayList<>();
        //Get connection
        connection = jdbcUtils.connect();
        //Create statement object
        Statement statement = connection.createStatement();
        //Execute query
        ResultSet resultSet = statement.executeQuery("SELECT AccountID, Username, FullName FROM `Account`");
        //Handing result
        while (resultSet.next()) {
            Account account = new Account(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
            accounts.add(account);
        }
        //Disconnect
        jdbcUtils.disconnect();
        return accounts;
    }


    public Account getAccountByID(int id) throws Exception {
        //Get connection
        connection = jdbcUtils.connect();
        //Create a statement object
        String sql = "SELECT AccountID, Username, FullName FROM `Account` WHERE AccountID = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //Set parameter
        preparedStatement.setInt(1, id);

        //Execute query
        ResultSet resultSet = preparedStatement.executeQuery();

        //Handing result
        Account account = new Account(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
        //Disconnect
        jdbcUtils.disconnect();
        return account;
    }


    public boolean isAccountExists(String username) throws SQLException, ClassNotFoundException {
       //Get connect
        connection = jdbcUtils.connect();

        //Create a statement
        String sql = "SELECT AccountID, Username, fullName FROM `Account` WHERE Username = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //Set parameter
        preparedStatement.setString(1, username);

        //Execute query
        ResultSet resultSet = preparedStatement.executeQuery();
        //Handing result
        if (resultSet.next()) {
            //Disconnect
            jdbcUtils.disconnect();
            return true;
        } else {
            //Disconnect
            jdbcUtils.disconnect();
            return false;
        }
    }


    public boolean isAccountExists(int id) throws SQLException, ClassNotFoundException {
        //Get connect
        connection = jdbcUtils.connect();

        //Create statement object
        String sql = "SELECT AccountID, Username, fullName FROM `Account` WHERE AccountID = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //Set parameter
        preparedStatement.setInt(1, id);

        //Execute query
        ResultSet resultSet = preparedStatement.executeQuery();

        //Handing result
        if (resultSet.next()) {
            //Disconnect
            jdbcUtils.disconnect();
            return true;
        } else {
            //Disconnect
            jdbcUtils.disconnect();
            return false;
        }
    }


    public void createAccount(String username, String fullName) throws SQLException, ClassNotFoundException {
        //Get connect
        connection = jdbcUtils.connect();

        //Create statement object
        String sql = "INSERT INTO `Account`(Username, FullName) VALUE(? , ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);


        //Set parameter
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, fullName);

        // Execute Query
        int resultSet = preparedStatement.executeUpdate();


        //Print message
        System.out.println(resultSet > 0 ? JDBCUtils.getMessage().getProperty("account.insert.complete"):
                JDBCUtils.getMessage().getProperty("account.insert.false"));

        //Disconnect
        jdbcUtils.disconnect();
    }


    public void updateAccountUsernameByID(int id, String newUserName) throws SQLException, ClassNotFoundException {
        //Get connect
        connection = jdbcUtils.connect();

        //Create statement object
        String sql = "UPDATE `Account` SET Username = ? WHERE AccountID = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //Set parameter
        preparedStatement.setString(1, newUserName);
        preparedStatement.setInt(2, id);

        //Execute Query
        int resultSet = preparedStatement.executeUpdate();

        //print message
        System.out.println(resultSet > 0 ? JDBCUtils.getMessage().getProperty("account.update.complete") :
                JDBCUtils.getMessage().getProperty("account.update.false"));
        //Disconnect
        jdbcUtils.disconnect();
    }


    public void updateAccountFullNameByID(int id, String newFullName) throws SQLException, ClassNotFoundException {
        //Get connect
        connection = jdbcUtils.connect();

        //Create statement object
        String sql = "UPDATE `Account` SET FullName = ? WHERE AccountID = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //Set parameter
        preparedStatement.setString(1, newFullName);
        preparedStatement.setInt(2, id);

        //Execute query
        int resultSet = preparedStatement.executeUpdate();

        //print message
        System.out.println(resultSet > 0 ? JDBCUtils.getMessage().getProperty("account.update.complete") :
                JDBCUtils.getMessage().getProperty("account.update.false"));
        //Disconnect
        jdbcUtils.disconnect();
    }


    public void deleteAccount(int id) throws SQLException, ClassNotFoundException {
        //Get connect
        connection = jdbcUtils.connect();
        //Create statement object
        String sql = "DELETE FROM `Account` WHERE AccountID = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //Set parameter
        preparedStatement.setInt(1, id);

        //Execute query
        int resultSet = preparedStatement.executeUpdate();

        //Print message
        System.out.println(resultSet > 0 ? JDBCUtils.getMessage().getProperty("account.delete.complete") :
                JDBCUtils.getMessage().getProperty("account.delete.false"));

        //Disconnect
        jdbcUtils.disconnect();
    }

}
