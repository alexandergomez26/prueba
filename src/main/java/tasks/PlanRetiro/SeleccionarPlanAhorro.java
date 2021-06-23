package tasks.PlanRetiro;

import interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.IngresarDatosAfiliadosPage;
import userinterfaces.IngresarDatosPlanRetiroPage;

import static userinterfaces.FormularioDatosBasicoPage.*;

public class SeleccionarPlanAhorro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(BTN_CONTINUAR_FORM_DATOS_BASICOS),
               // Click.on(BTN_ACEPTAR_INFO_BONO),
                Click.on(RBN_PENSION_META),
                Espera.cantidadDeMiliSegundos(5000),
                Click.on(IngresarDatosPlanRetiroPage.BTN_PLAN_RETIRO)
        );


    }

    public static SeleccionarPlanAhorro enElAplicativo(){
        return Tasks.instrumented(SeleccionarPlanAhorro.class);
    }
}
