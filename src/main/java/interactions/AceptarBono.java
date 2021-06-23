package interactions;

import Utils.exceldata.CreateModels;
import integrations.PoolQuery;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static userinterfaces.FormularioDatosBasicoPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.*;

public class AceptarBono implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_CONTINUAR_FORM_DATOS_BASICOS, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Click.on(BTN_CONTINUAR_FORM_DATOS_BASICOS),
                Click.on(BTN_ACEPTAR_INFO_BONO),
                Espera.cantidadDeMiliSegundos(3000)
                );
    }

    public static AceptarBono enElAplicativo(){

        return Tasks.instrumented(AceptarBono.class);
    }
}
