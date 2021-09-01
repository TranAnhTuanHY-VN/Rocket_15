package backend;

import entity.Department;
import utils.JDBCUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;


/**
 * This class replaces Department Dao class
 *
 * @Description: .
 * @author: TranAnhTuan
 * @create_date: August 8, 2021
 * @version: 1.0
 * @modifer: TranAnhTuan
 * @modifer_date: August 8, 2021
 */
public class Exercise2 {
    private Connection connection;
    private final Scanner scanner = new Scanner(System.in);
    private JDBCUtils jdbcUtils;
    /**
     * Constructor for class Exercise2.
     *
     * @Description: .
     * @author: TranAnhTuan
     * @create_date: August 8, 2021
     * @version: 1.0
     * @modifer: TranAnhTuan
     * @modifer_date: August 8, 2021
     */
    public Exercise2() throws IOException {
        //Read from database.properties
        jdbcUtils = new JDBCUtils();
    }

    /**
     * Method return list of Department
     * @author: TranAnhTuan
     */
    public List<Department> getDepartments() throws SQLException, ClassNotFoundException {
        List<Department> departments = new ArrayList<>();
        //get connection
        connection = jdbcUtils.connect();
        //Create object Statement
        Statement statement = connection.createStatement();
        //Query statement
        String sql = "SELECT * FROM Department";
        //Create ResultSet to handling result return then query statement
        ResultSet resultSet = statement.executeQuery(sql);
        //Print result:
        while (resultSet.next()) {
            Department department = new Department();
            department.setID(resultSet.getInt(1));
            department.setName(resultSet.getString(2));

            //ADD to list
            departments.add(department);
        }
        
        return departments;
    }


    /**
     * The method return Department has ID's user input
     * @author: TranAnhTuan
     */
    public Department getDepartmentByID(int id) throws Exception {
        //get Connection
        connection = jdbcUtils.connect();
        //Query statement
        String sql = "SELECT * FROM `Department` WHERE DepartmentID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //insert data into statement
        preparedStatement.setInt(1,id);

        //Create ResultSet to handling result return then query statement
        ResultSet resultSet = preparedStatement.executeQuery();
        //Print result:
        if (resultSet.next()) {
            Department department = new Department();
            department.setID(resultSet.getInt(1));
            department.setName(resultSet.getString(2));

            return department;
        } else {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("department.getDepartmentByID.cannotFindDepartmentById") + id);
        }
    }


    /**
     * The method return True if DepartmentName exists and else return False.
     * @author: TranANhTuan
     */
    public boolean isDepartmentNameExists(String name) throws SQLException, ClassNotFoundException {
        //Get connection
        connection = jdbcUtils.connect();
        //Query statement
        String sql = "SELECT * FROM `Department` WHERE DepartmentName = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //insert data into statement
        preparedStatement.setString(1,name);

        //Create ResultSet to handling result return then query statement
        ResultSet resultSet = preparedStatement.executeQuery();
        //Print result:
        if (resultSet.next()) {
            
            return true;
        } else {
            
            return false;
        }
    }


    /**
     * The method return True if DepartmentID exists and else return False.
     * @author: TranANhTuan
     */
    public boolean isDepartmentIDExists(int id) throws SQLException, ClassNotFoundException {
        //Get connection
        connection = jdbcUtils.connect();

        //Query statement
        String sql = "SELECT * FROM `Department` WHERE DepartmentID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //insert data into statement
        preparedStatement.setInt(1,id);

        //Create ResultSet to handling result return then query statement
        ResultSet resultSet = preparedStatement.executeQuery();
        //Print result:
        if (resultSet.next()) {
            
            return true;
        } else {
            
            return false;
        }
    }

    /**
     * The method create department by Name
     * @author: TranAnhTuan
     */
    public void createDepartment(String name) throws Exception {
        boolean check = isDepartmentNameExists(name);
        if (check) {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("department.getDepartmentByID.departmentNameIsExists")
            );
        } else {
            //Query statement
            String sql = "INSERT INTO `Department`(DepartmentName) VALUE (   ?  )";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            //insert data into statement
            preparedStatement.setString(1,name);

            //Create ResultSet to handling result return then query statement
            preparedStatement.executeUpdate();
            System.out.println("Insert success!");
        }
        
    }

    /**
     * The method update DepartmentName with parameter is DepartmentID and DepartmentName
     * @author: TranAnhTuan
     */
    public void updateDepartmentName(int id, String newName) throws Exception {
        boolean checkID = isDepartmentIDExists(id);
        boolean checkName = isDepartmentNameExists(newName);
        if (checkID) {
            if (checkName) {
                throw new Exception(
                        JDBCUtils.getMessage().getProperty("department.getDepartmentByID.departmentNameIsExists")
                );
            } else {
                //Query statement
                String sql = "UPDATE `Department` SET departmentname = ? WHERE DepartmentID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                //insert data into statement
                preparedStatement.setString(1, newName);
                preparedStatement.setInt(2, id);

                //Create ResultSet to handling result return then query statement
                preparedStatement.executeUpdate();
                System.out.println("Update success!");
            }
        } else {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("department.getDepartmentByID.cannotFindDepartmentById" + id)
            );
        }
        
    }

    /**
     * The method delete Department with parameter is DepartmentID.
     */
    public void deleteDepartment(int id) throws Exception {
        boolean checkID = isDepartmentIDExists(id);
        if (checkID) {
            //SQL query
            String sql = "DELETE FROM `Department` WHERE DepartmentID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //insert data into statement
            preparedStatement.setInt(1, id);

            //Create ResultSet to handling result return then query statement
            preparedStatement.executeUpdate();
            System.out.println("Delete success!");

        } else {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("department.getDepartmentByID.cannotFindDepartmentById" + id)
            );
        }
    }
}
