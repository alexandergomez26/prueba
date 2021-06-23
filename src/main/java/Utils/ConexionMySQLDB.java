package Utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConexionMySQLDB {

    private static Connection connection;
    private static int result;

   // public static int updateExecution(String query)throws SQLException{...}
    public static void consulta(){

        List<List<String>> list=new ArrayList<>();

        ResultSet rs;


        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");

            System.out.println(" Controlador JDBC cargado");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_proteccion",
                    "root", "1234");
                    //DriverManager.getConnection("jdbc:db2:protec2.proteccion.com.co", "extransp",
                    //"a1b2c3d4");

            Statement st = connection.createStatement();
           /* rs = st.executeQuery("select * from schema_viliv_qa_payments.tbl_viliv_shopping_cart limit 2");
            int i=0;
            while(rs.next()){


                System.out.println("|"+rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getInt(3)+"|"+rs.getDate(4)+"|"+rs.getDate(5));
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }

        }

    }

