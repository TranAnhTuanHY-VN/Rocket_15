package backend;

import utils.JDBCUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Exercise4 {
    private Properties properties;
    private Connection connection;
    private JDBCUtils jdbcUtils;


    /**
     * Constructor for class Exercise4.
     *
     * @Description: .
     * @author: TranAnhTuan
     * @create_date: August 8, 2021
     * @version: 1.0
     * @modifer: TranAnhTuan
     * @modifer_date: August 8, 2021
     * @throws IOException
     */
    public Exercise4() throws IOException {
        jdbcUtils = new JDBCUtils();
    }

    public void deleteDepartmentUsingTransaction(int id) throws SQLException, ClassNotFoundException {
        connection = jdbcUtils.connect();

        connection.setAutoCommit(false);

        //Delete Employee
        String sql1 = "DELETE FROM `Account` WHERE DepartmentID = ?";
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);

        //set parameter
        preparedStatement1.setInt(1,id);

        //Delete Department
        String sql2 = "DELETE FROM `Department` WHERE DepartmentID = ?";
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);

        //set parameter
        preparedStatement2.setInt(1, id);

        //excute query
        try {
            preparedStatement1.executeUpdate();
            System.out.println("Delete Account Success!");

            preparedStatement2.executeUpdate();
            System.out.println("Delete Department Success!");

            //commit transaction
            connection.commit();
            System.out.println("Transaction Commit!");
        } catch (Exception e) {
            System.out.println(e.getMessage());

            connection.rollback();
            System.out.println("Transaction Rollback!");
        }

        connection.setAutoCommit(false);
    }

}
