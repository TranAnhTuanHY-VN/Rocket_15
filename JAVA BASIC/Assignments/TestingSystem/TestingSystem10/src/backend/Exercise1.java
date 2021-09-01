package backend;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * This class is backend of Exercise 1...
 *
 * @Description: .
 * @author: TranAnhTuan
 * @create_date: August 8, 2021
 * @version: 1.0
 * @modifer: TranAnhTuan
 * @modifer_date: August 8, 2021
 */
public class Exercise1 {

    private Properties properties;
    private Connection connection;
    private Scanner scanner = new Scanner(System.in);


    public Exercise1() throws IOException {
        //Read from database.properties
        properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));
        properties.load(new FileInputStream("src/resource/message.properties"));
    }

    public void Q1() throws SQLException {
        //Load from File output is properties
        String dbUrl = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        //Initialization connection to DB with host, username, password
        connection = DriverManager.getConnection(dbUrl, username, password);
        System.out.println(properties.get("connect.success"));
    }



    public void Q2() throws SQLException {
        //Create object Statement
        Statement statement = connection.createStatement();
        //Query statement
        String sql = "SELECT * FROM position";
        //Create ResultSet to handling result return then query statement
        ResultSet resultSet = statement.executeQuery(sql);
        //Print result:
        System.out.println();
        System.out.println("Thông tin của các phòng ban: ");
        while (resultSet.next()) {
            System.out.printf("%-5d ||",resultSet.getInt(1));
            System.out.printf(resultSet.getString(2));
            System.out.println();
        }
    }


    public void Q3() throws SQLException {
        // Create sql statement
        String sql = "INSERT INTO `Position`(PositionName)" +
                "VALUE               (        ?           )";
        //create object prepareStatement:
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // Input from keyboard
        System.out.println("Mời nhập PositionName: ");
        String positionName = scanner.nextLine();

        //insert data into statement
        preparedStatement.setString(1,positionName);

        //Insert:
        int effectedRows = preparedStatement.executeUpdate();
        //Handing result set
        if (effectedRows == 1) {
            System.out.println(properties.get("position.insert.complete"));
        } else {
            System.out.println(properties.get("position.insert.false"));
        }
    }

    public void Q4() throws SQLException {
        //Create sql statement
        String sql = "UPDATE position SET positionname = 'DEV' WHERE positionID = 5";
        //Create Statement object
        Statement statement = connection.createStatement();
        int effectedRows = statement.executeUpdate(sql);
        //Handing result set
        if (effectedRows == 1) {
            System.out.println(properties.get("position.update.complete"));
        } else {
            System.out.println(properties.get("position.update.false"));
        }
    }

    public void Q5() throws SQLException {
        // Create sql statement
        String sql = "DELETE FROM position WHERE PositionID = ?";
        //create object prepareStatement:
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // Input from keyboard
        System.out.println("Mời nhập PositionID muốn xóa: ");
        int positionID = scanner.nextInt();

        //insert data into statement
        preparedStatement.setInt(1,positionID);

        //Insert:
        int effectedRows = preparedStatement.executeUpdate();
        //Handing result set
        if (effectedRows == 1) {
            System.out.println(properties.get("position.delete.complete"));
        } else {
            System.out.println(properties.get("position.delete.false"));
        }
    }
}
