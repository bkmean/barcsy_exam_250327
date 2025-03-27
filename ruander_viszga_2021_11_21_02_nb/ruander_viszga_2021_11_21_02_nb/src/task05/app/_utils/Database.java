package task05.app._utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Connection connection;
    private String connectionStringWithSSL
            = "jdbc:mysql://localhost:3306/best_motor_cycle_4u?useSSL=false";
    //You can try this connection string if the first failed
    private String connectionStringWithoutSSL
            = "jdbc:mysql://localhost:3306/best_motor_cycle_4u";

    public Connection createConnection() {
        try {
            connection = DriverManager.getConnection(
                    connectionStringWithSSL,
                    "root",
                    "");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
