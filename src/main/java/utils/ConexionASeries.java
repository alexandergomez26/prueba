package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionASeries {

    Connection conn;

    public Connection conectar() throws SQLException {

        if(conn == null) {

            conn = DriverManager.getConnection("jdbc:as400://protec2.proteccion.local/protec2;",
                    "extransp", "a1b2c3d4");

            if (conn != null) {
                System.out.println("exitoso.....");
            } else {
                System.out.println("Fallo......");
            }
        }
        return conn;
    }
}


