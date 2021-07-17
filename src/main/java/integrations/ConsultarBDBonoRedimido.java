package integrations;

import Utils.ConexionASeries;
import models.DatosInicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarBDBonoRedimido {


    public List<DatosInicio> list = new ArrayList<>();

    public ConsultarBDBonoRedimido() {

        try {
            Class.forName("com.ibm.as400.access.AS400JDBCDriver");

            String query = "SELECT * FROM fpoblida.afiarc, FPOBLIDA.CUPARC WHERE AFIES2= 'ACT' \n" +
                    "AND AFIC01= CUPNRO AND CUPTIP= AFITI1  \n" +
                    "AND CUPEST= 'RED' AND CUPVA6>0 AND AFIFEC>=19660101";

            ConexionASeries obj = new ConexionASeries();
            Statement statement = obj.conectar().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                DatosInicio persona = new DatosInicio();
                persona.setCedula(resultSet.getString(2));

                list.add(persona);
            }

            System.out.println();
            System.out.println("lista: "+list);

        }catch (SQLException | ClassNotFoundException e){
            System.err.println(e);
        }
    }
}


