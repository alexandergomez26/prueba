package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.FormularioDatosBasicoPage.*;

public class SeleccionarTodosLos implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(5000),
                Click.on(RBN_SELECCIONAR_TODOS_LOS_PERIODOS),
                Espera.cantidadDeMiliSegundos(8000),
                //WaitUntil.the(BTN_CALCULAR_IBL, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_CALCULAR_IBL),
                Espera.cantidadDeMiliSegundos(10000),
                Click.on(BTN_REALIZAR_SIMULACION2));

    }

    public static SeleccionarTodosLos periodos(){
        return Tasks.instrumented(SeleccionarTodosLos.class);
    }
}
