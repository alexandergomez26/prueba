package tasks.IngresarEdadDefinida;

import interactions.AceptarBono;
import interactions.Espera;
import interactions.SeleccionarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Collections;
import java.util.List;

public class IngresarDatosBonoEmitido implements Task {


    private final String datos;

    public IngresarDatosBonoEmitido(String datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                interactions.ConsultarAfiliadoBonoEmitido.enClienteActual(Collections.singletonList(datos)),
                AceptarBono.enElAplicativo()
        );

    }
    public static IngresarDatosBonoEmitido enClienteActual(List<String> datos){
        return Tasks.instrumented(IngresarDatosBonoEmitido.class, datos.get(0));
    }
}
