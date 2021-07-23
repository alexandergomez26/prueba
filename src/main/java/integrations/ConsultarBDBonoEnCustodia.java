package integrations;

import utils.ConexionASeries;
import models.DatosInicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarBDBonoEnCustodia {

    public List<DatosInicio> list = new ArrayList<>();

    public ConsultarBDBonoEnCustodia() {

        try {
            Class.forName("com.ibm.as400.access.AS400JDBCDriver");

            String query = "SELECT * FROM (\n" +
                    "\tSELECT * FROM fpoblida.afiarc WHERE AFIES2= 'ACT' ORDER BY afinum\n" +
                    ") afiarc, fpoblida.cuparc WHERE afiarc.AFIC01= CUPNRO\n" +
                    "AND CUPTIP = afiarc.AFITI1 AND CUPEST= 'CUS' AND CUPVA6 > 0 ORDER BY afiarc.afinum LIMIT 80";

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

