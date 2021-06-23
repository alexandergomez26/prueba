package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection conectar() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proteccion",
                "root", "1234");

        if (conn != null) {
            System.out.println("exitoso.....");
        } else {
            System.out.println("Fallo......");
        }
        return conn;
    }
}
