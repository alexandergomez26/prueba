package tasks.ingresardatosafiliado;

import interactions.IngresarDatos;
import interactions.SeleccionarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import java.util.Collections;
import java.util.List;


public class IngresarDatosExistentes implements Task {

    private final String datos;

    public IngresarDatosExistentes(String datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                IngresarDatos.cliente(Collections.singletonList(datos))
                );

    }
    public static IngresarDatosExistentes enClienteActual(List<String>datos){
        return Tasks.instrumented(IngresarDatosExistentes.class, datos.get(0));
    }
}
