package backend;


import utils.JDBCUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * This class is result of Exercise 3 in Testing System
 *
 * @Description: .
 * @author: TranAnhTuan
 * @create_date: August 8, 2021
 * @version: 1.0
 * @modifer: TranAnhTuan
 * @modifer_date: August 8, 2021
 */
public class Exercise3 {
    private Properties properties;
    private Connection connection;
    private Scanner scanner = new Scanner(System.in);
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
     * @throws IOException
     */
    public Exercise3() throws IOException {
        jdbcUtils = new JDBCUtils();
    }

    public void deleteDepartmentUsingProcedure(int id) throws Exception {
        boolean checkID = new Exercise2().isDepartmentIDExists(id);
        if (checkID) {
            connection = jdbcUtils.connect();
            String sql = "CALL sp_delete_department(    ?   )";
            //Create object Statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //Set data into statement
            preparedStatement.setInt(1, id);
            //Handing result
            preparedStatement.executeUpdate();
            System.out.println("Success!");
        } else {
            throw new Exception(
                    JDBCUtils.getMessage().getProperty("department.getDepartmentByID.cannotFindDepartmentById" + id)
            );
        }

    }
}
