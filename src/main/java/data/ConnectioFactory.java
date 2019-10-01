package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * ConnectioFactory
 */
public class ConnectioFactory {

    public static void Connection() {
        String url = "jdbc:sqlserver://SQLEXPRESS:1433;databasename=CEA;user=kirito;password=m41d3n1975";

        try {
            Connection conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Erro na conexão");
        }
    }
}