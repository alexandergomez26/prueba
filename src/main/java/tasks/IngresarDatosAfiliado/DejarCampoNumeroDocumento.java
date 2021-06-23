package tasks.IngresarDatosAfiliado;

import interactions.SeleccionarCliente;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static models.entity.DatosAfiliadoEntity.getDatosAfiliado;
import static models.entity.DatosAfiliadoEntity.setDatosAfiliado;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_CONTINUAR;
import static userinterfaces.IngresarDatosAfiliadosPage.TXT_NUMERO_DOCUMENTO;

public class DejarCampoNumeroDocumento implements Task {

    public DejarCampoNumeroDocumento(DatosAfiliado datosAfiliado) {setDatosAfiliado(datosAfiliado);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                Enter.theValue(getDatosAfiliado().getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR)
        );
    }
    public static DejarCampoNumeroDocumento vacio() {
        return Tasks.instrumented(DejarCampoNumeroDocumento.class); }
}
