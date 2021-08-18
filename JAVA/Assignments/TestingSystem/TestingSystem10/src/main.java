import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class main {
    public static void main(String[] args) throws SQLException, IOException {
       Properties properties;
        properties = new Properties();
        properties.load(new FileInputStream("src/resource/database.properties"));
        properties.load(new FileInputStream("src/resource/message.properties"));
        String url = properties.getProperty("dbUrl");
        System.out.println(url);
    }
}
