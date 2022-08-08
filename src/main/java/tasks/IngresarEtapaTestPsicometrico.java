package tasks;

import interactions.Espera;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static userinterfaces.IniciarSesionPage.*;

public class IngresarEtapaTestPsicometrico implements Task {


    public IngresarEtapaTestPsicometrico(String datos) {
        int pos = Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_TEST_PSICOMETRICO),
                Espera.cantidadDeMiliSegundos(3000),
                Click.on(BTN_TOMAR_TEST),
                Espera.cantidadDeMiliSegundos(3000)
        );

        Serenity.getWebdriverManager().getCurrentDriver().switchTo()
                .window((String)Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles().toArray()[1]);

        actor.attemptsTo(
                Click.on(BTN_CONTINUAR),
                Espera.cantidadDeMiliSegundos(3000),
                Click.on(SELECT_REGION_RESIDENCIA),
                Click.on(CHECK_ACEPTAR_TERMINOS),
                Click.on(BTN_CONTINUAR),
                Espera.cantidadDeMiliSegundos(3000),
                Click.on(BTN_CONTINUAR),
                Espera.cantidadDeMiliSegundos(1000),
                Click.on(BTN_CONTINUAR),
                Espera.cantidadDeMiliSegundos(1000),
                Click.on(BTN_CONTINUAR)
        );

    }
    public static IngresarEtapaTestPsicometrico enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarEtapaTestPsicometrico.class, datos.get(0));
    }
}