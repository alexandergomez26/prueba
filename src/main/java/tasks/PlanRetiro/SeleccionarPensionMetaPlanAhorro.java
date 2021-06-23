package tasks.PlanRetiro;


import interactions.AceptarBono;
import interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static userinterfaces.IngresarDatosPlanRetiroPage.*;


public class SeleccionarPensionMetaPlanAhorro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // AceptarBono.enElAplicativo(),
               //Click.on(BTN_CONTINUAR_FORM_DATOS_BASICOS),
               // Click.on(BTN_ACEPTAR_INFO_BONO),
                Espera.cantidadDeMiliSegundos(1000),
                Click.on(BTN_PLAN_RETIRO)
                );


    }

    public static SeleccionarPensionMetaPlanAhorro enElAplicativo(){
        return Tasks.instrumented(SeleccionarPensionMetaPlanAhorro.class);
    }
}
