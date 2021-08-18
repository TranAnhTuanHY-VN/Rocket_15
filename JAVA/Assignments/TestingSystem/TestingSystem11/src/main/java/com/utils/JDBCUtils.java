package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private Connection connection;
    private static Properties properties;

    /**
     * Constructor for class JdbcUtils.
     *
     * @Description: .
     * @author: TranAnhTuan
     * @create_date: August 9, 2021
     * @version: 1.0
     * @modifer: NNDuy
     * @modifer_date: August 9, 2021
     * @throws IOException
     */
    public JDBCUtils() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream("src/main/java/com/resource/database.properties"));
        properties.load(new FileInputStream("src/main/java/com/resource/message.properties"));
    }

    /**
     * This method is used for connecting to database.
     *
     * @Description: .
     * @author: TranAnhTuan
     * @create_date: August 9, 2021
     * @version: 1.0
     * @modifer: TranANhTuan
     * @modifer_date: August 9, 2021
     * @return
     * @throws SQLException
     */
    public void isConnectForTesting() throws SQLException, ClassNotFoundException {
        String url = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        // Get a Database Connection
        connection = DriverManager.getConnection(url, username, password);
        System.out.println("Connect success!");
    }

    /**
     * This method is used for connecting to database.
     *
     * @Description: .
     * @author: TranAnhTuan
     * @create_date: August 9, 2021
     * @version: 1.0
     * @modifer: TranAnhTuan
     * @modifer_date: August 9, 2021
     * @return: Connection
     * @throws SQLException
     */
    public Connection connect() throws SQLException, ClassNotFoundException {
        String url = properties.getProperty("dbUrl");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        //Get a Database Connection
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public static Properties getMessage(){
        return properties;
    }

    /**
     * This method is used for closing database.
     *
     * @Description: .
     * @author: TranAnhTuan
     * @create_date: August 9,2021
     * @version: 1.0
     * @modifer: NNDuy
     * @modifer_date: August 9, 2021
     * @throws SQLException
     */
    public void disconnect() throws SQLException {
        connection.close();
    }
}
