package tasks.IngresarDatosAfiliado;

import interactions.AceptarBono;
import interactions.Espera;
import interactions.IngresarDatos;
import interactions.SeleccionarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Collections;
import java.util.List;

import static userinterfaces.SeleccionTipoDeCalculoAsesoriaPensionalPage.BTN_ASESORIA_PENSIONAL;

public class IngresarDatosExistentes implements Task {


    private String datos;

    public IngresarDatosExistentes(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                IngresarDatos.cliente(Collections.singletonList(datos))
                //AceptarBono.enElAplicativo(),
                //Espera.cantidadDeMiliSegundos(10000)
                );

    }
    public static IngresarDatosExistentes enClienteActual(List<String>datos){
        return Tasks.instrumented(IngresarDatosExistentes.class, datos.get(0));
    }
}
