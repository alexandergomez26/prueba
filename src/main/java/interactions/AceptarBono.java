package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static userinterfaces.FormularioDatosBasicoPage.*;

public class AceptarBono implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_CONTINUAR_FORM_DATOS_BASICOS, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(BTN_CONTINUAR_FORM_DATOS_BASICOS),
                WaitUntil.the(BTN_ACEPTAR_INFO_BONO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(BTN_ACEPTAR_INFO_BONO)
                );
    }

    public static AceptarBono enElAplicativo(){

        return Tasks.instrumented(AceptarBono.class);
    }
}
