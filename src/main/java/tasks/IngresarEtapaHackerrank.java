package tasks;

import interactions.Espera;
import models.DatosInicioSesion;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import utils.constantes.ConstantesGenerales;
import utils.exceldata.CreateModels;


import static userinterfaces.IniciarSesionPage.*;

public class IngresarEtapaHackerrank implements Task {


    private final DatosInicioSesion datosInicioSesion;

    public IngresarEtapaHackerrank(int datos) {

        datosInicioSesion = CreateModels.setDatosInicioSesion(datos, ConstantesGenerales.DATA_TO_TEST_LOGIN);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
               // Click.on(BTN_HACKERRANK),
                Espera.cantidadDeMiliSegundos(3000),
                Scroll.to(BTN_CONTINUAR_TEST),
                Click.on(BTN_CONTINUAR_TEST),
                Espera.cantidadDeMiliSegundos(3000)
                );

        Serenity.getWebdriverManager().getCurrentDriver().switchTo()
                .window((String)Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles().toArray()[1]);

        actor.attemptsTo(
                Enter.theValue(datosInicioSesion.getCorreo()).into(INPUT_CORREO_FORMULARIO_CONFIRMACION),
                Enter.theValue(datosInicioSesion.getContrasenia()).into(INPUT_CONTRASENIA_FORMULARIO_CONFIRMACION),
                Espera.cantidadDeMiliSegundos(3000),
                Click.on(BTN_LOGIN)
        );

        Serenity.getWebdriverManager().getCurrentDriver().switchTo()
                .window((String)Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles().toArray()[0]);

        actor.attemptsTo(
        Click.on(BTN_TEST_COMPLETO)
        );



    }
    public static IngresarEtapaHackerrank enElAplicativo(int datos){
        return Tasks.instrumented(IngresarEtapaHackerrank.class, datos);
    }
}