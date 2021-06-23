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
import static userinterfaces.IngresarDatosAfiliadosPage.*;

public class IngresarDatosNoExistentesEn implements Task {
    public IngresarDatosNoExistentesEn(DatosAfiliado datosAfiliado) {
        setDatosAfiliado(datosAfiliado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        SeleccionarCliente.actual(),
                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                Enter.theValue(getDatosAfiliado().getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR));
    }
    public static IngresarDatosNoExistentesEn ClienteActual(List<DatosAfiliado> datos){
        return Tasks.instrumented(IngresarDatosNoExistentesEn.class, datos.get(1));
    }
}
