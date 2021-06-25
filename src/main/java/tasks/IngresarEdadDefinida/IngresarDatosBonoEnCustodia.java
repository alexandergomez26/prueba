package tasks.IngresarEdadDefinida;

import interactions.AceptarBono;
import interactions.Espera;
import interactions.SeleccionarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import java.util.Collections;
import java.util.List;

public class IngresarDatosBonoEnCustodia implements Task {


    private final String datos;

    public IngresarDatosBonoEnCustodia(String datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                interactions.ConsultarAfiliadoBonoEnCustodia.enClienteActual(Collections.singletonList(datos)),
                AceptarBono.enElAplicativo(),
                Espera.cantidadDeMiliSegundos(5000)
        );

    }
    public static IngresarDatosBonoEnCustodia enClienteActual(List<String> datos){
        return Tasks.instrumented(IngresarDatosBonoEnCustodia.class, datos.get(0));
    }
}
