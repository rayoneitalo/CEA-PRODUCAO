package data;

import java.sql.Connection;
import java.sql.DriverManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

    public static Connection getConnection() {

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);

            }
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cea", "root", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
