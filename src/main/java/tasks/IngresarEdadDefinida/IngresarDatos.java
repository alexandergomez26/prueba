package tasks.IngresarEdadDefinida;

import interactions.AceptarBono;
import interactions.SeleccionarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import java.util.Collections;
import java.util.List;

public class IngresarDatos implements Task {

    private final String datos;

    public IngresarDatos(String datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                interactions.IngresarDatos.cliente(Collections.singletonList(datos)),
                AceptarBono.enElAplicativo()
        );

    }
    public static IngresarDatos enClienteActual(List<String> datos){
        return Tasks.instrumented(IngresarDatos.class, datos.get(0));
    }
}
