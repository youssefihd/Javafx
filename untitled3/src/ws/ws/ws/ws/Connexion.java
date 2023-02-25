package ws.ws.ws.ws;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    private static Connection connection;
    static {
        try {
            Class.forName("con.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_stock","root","");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
