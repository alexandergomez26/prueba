package tasks.IngresarEdadDefinida;

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
                interactions.ConsultarAfiliadoBonoRedimido.enClienteActual(Collections.singletonList(datos)),
                Click.on(BTN_CONTINUAR_FORM_DATOS_BASICOS),
                Espera.cantidadDeMiliSegundos(5000)
                );

    }
    public static IngresarDatosBonoRedimido enClienteActual(List<String> datos){
        return Tasks.instrumented(IngresarDatosBonoRedimido.class, datos.get(0));
    }
}
