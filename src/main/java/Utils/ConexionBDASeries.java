package Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConexionBDASeries {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.ibm.as400.access.AS400JDBCDriver");
        //Class.forName("com.mysql.jdbc.Driver");
        //Class.forName("com.ibm.db2.jcc.DB2Driver");


        List<String> list = new ArrayList<>();


        try {

           // String query = "SELECT * FROM USUARIO6";

            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proteccion","root", "1234");


            String query = "SELECT * FROM fpoblida.afiarc WHERE AFIES2= 'ACT' AND AFISEX = 'F' AND AFIPRI = 'LITTEL'AND AFINUM < 100000";

            Connection conn = DriverManager.getConnection("jdbc:as400://protec2.proteccion.local/protec2;",
              "extransp", "a1b2c3d4");


            if (conn != null) {
                System.out.println("Conectado Correctamente");
            } else {
                System.out.println("fallo.....");
            }
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                list.add(resultSet.getString(1));
                list.add(resultSet.getString(2));
                list.add(resultSet.getString(3));
                list.add(resultSet.getString(4));
                list.add(resultSet.getString(5));
                list.add(resultSet.getString(6));
                list.add(resultSet.getString(7));



            }
            System.out.println();
            System.out.println("lista: "+list);

        }catch (SQLException e){
            System.err.println(e);
        }

    }

}

