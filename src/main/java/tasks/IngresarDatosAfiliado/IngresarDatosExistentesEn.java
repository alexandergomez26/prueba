package tasks.IngresarDatosAfiliado;

import interactions.SeleccionarOpcionCliente;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static models.entity.DatosAfiliadoEntity.getDatosAfiliado;
import static models.entity.DatosAfiliadoEntity.setDatosAfiliado;
import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_CONTINUAR;

public class IngresarDatosExistentesEn implements Task {

    public IngresarDatosExistentesEn(DatosAfiliado datosAfiliado) {setDatosAfiliado(datosAfiliado);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarOpcionCliente.Potencial(),
                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                Enter.theValue(getDatosAfiliado().getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR)
        );

    }

    public static IngresarDatosExistentesEn clientePotencial(){
        return Tasks.instrumented(IngresarDatosExistentesEn.class);
    }
}
