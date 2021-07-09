package tasks.IniciarSesion;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import interactions.Espera;
import models.DatosInicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.IniciarSesionPage.*;

public class IniciarSesion implements Task {

    private final DatosInicioSesion datosInicioSesion;

    public IniciarSesion(int datos) {

        datosInicioSesion = CreateModels.setDatosInicioSesion(datos, ConstantesGenerales.DATA_TO_TEST_LOGIN);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datosInicioSesion.getCorreo()).into(TXT_CORREO),
                Click.on(BTN_SIGUIENTE),
                (WaitUntil.the(TXT_CONTRASENIA, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(300).seconds()),
                Enter.theValue(datosInicioSesion.getContrasenia()).into(TXT_CONTRASENIA),
                Click.on(BTN_INICIAR_SESION),
                Check.whether(BTN_NO_MANTENER_SESION_INICIADA.resolveFor(actor).
                        isVisible()).andIfSo(Click.on(BTN_NO_MANTENER_SESION_INICIADA)).otherwise(),
                Espera.cantidadDeMiliSegundos(5000)
        );
    }

    public static IniciarSesion enElAplicativo(int datos){
        return Tasks.instrumented(IniciarSesion.class, datos);
    }
}
