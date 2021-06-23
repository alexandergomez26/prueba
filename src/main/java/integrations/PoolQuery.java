package integrations;

import Utils.Conexion;
import models.DatosInicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PoolQuery {

   public List<DatosInicio> list = new ArrayList<>();

    private Conexion obj = new Conexion();

    public PoolQuery() {

        try {
            String query = "SELECT CORREO, CONTRASENA, CEDULA, EDAD, SALARIO, NOMBRE," +
                           " VALOR_CUENTA_INDIVIDUAL FROM USUARIO6 ";

            Statement statement = obj.conectar().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                DatosInicio persona = new DatosInicio();
                persona.setCorreo(resultSet.getString("CORREO"));
                persona.setContrasenia(resultSet.getString("CONTRASENA"));
                persona.setCedula(resultSet.getString("CEDULA"));
                persona.setEdad(resultSet.getString("EDAD"));
                persona.setSalario(resultSet.getString("SALARIO"));
                persona.setNombre(resultSet.getString("NOMBRE"));
                persona.setValorCuentaIndividual(resultSet.getString("VALOR_CUENTA_INDIVIDUAL"));
                list.add(persona);
            }

        }catch (SQLException e){
            System.err.println(e);
        }
    }
}
