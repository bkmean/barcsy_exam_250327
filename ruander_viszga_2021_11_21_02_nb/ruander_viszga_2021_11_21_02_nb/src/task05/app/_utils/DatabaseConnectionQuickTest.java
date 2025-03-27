package task05.app._utils;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;

/**
 * @author G
 */
public class DatabaseConnectionQuickTest {

    //Run this file (Shift + F6) to test your database connection!
    public static void main(String[] args) throws SQLException {
        //to test database connection
        Database base = new Database();
        base.createConnection();
        Connection connection = (Connection) base.getConnection();
        System.out.println(connection.isClosed()); //has to be: false
        connection.close();

    }
}
