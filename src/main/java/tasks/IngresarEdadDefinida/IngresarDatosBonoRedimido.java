package tasks.IngresarEdadDefinida;

import interactions.AceptarBono;
import interactions.Espera;
import interactions.SeleccionarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.Collections;
import java.util.List;

import static userinterfaces.FormularioDatosBasicoPage.BTN_CONTINUAR_FORM_DATOS_BASICOS;

public class IngresarDatosBonoRedimido implements Task {

    private final String datos;

    public IngresarDatosBonoRedimido(String datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                interactions.ConsultarAfiliadoBonoRedimido.enClienteActual(Collections.singletonList(datos))
        );

    }
    public static IngresarDatosBonoRedimido enClienteActual(List<String> datos){
        return Tasks.instrumented(IngresarDatosBonoRedimido.class, datos.get(0));
    }
}
