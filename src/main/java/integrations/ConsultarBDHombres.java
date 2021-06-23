package integrations;

import Utils.ConexionASeries;
import models.DatosInicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarBDHombres {

    public List<DatosInicio> list = new ArrayList<>();

    private ConexionASeries obj = new ConexionASeries();

    public ConsultarBDHombres() {

        try {
            Class.forName("com.ibm.as400.access.AS400JDBCDriver");

            String query = "SELECT * FROM fpoblida.afiarc WHERE AFIES2= 'ACT' AND AFISEX = 'M'  AND AFIPRI = 'LITTEL'AND AFINUM < 200000";

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


