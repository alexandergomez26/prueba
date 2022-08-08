package tasks;

import interactions.Espera;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.IniciarSesionPage;

import java.util.ArrayList;
import java.util.List;
import static userinterfaces.IniciarSesionPage.*;

public class IngresarEtapaEnsayo implements Task {


    public IngresarEtapaEnsayo(String datos) {
        int pos = Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ENSAYO),
                Espera.cantidadDeMiliSegundos(4000),
                Scroll.to(BTN_CARGAR_ENSAYO),
               //Click.on(BTN_CARGAR_ENSAYO),
           Espera.cantidadDeMiliSegundos(2000)
                );

        List<String> window = new ArrayList<>(Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles());
        Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(window.get(window.size() - 1));

        IniciarSesionPage.BTN_CARGAR_ENSAYO.resolveFor(actor)
                .sendKeys(System.getProperty("user.dir") + "\\" + "src\\test\\resources\\archivos\\prueba.jpg");


        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(3000),
                Click.on(BTN_ENVIAR));
    }
    public static IngresarEtapaEnsayo enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarEtapaEnsayo.class, datos.get(0));
    }
}

