package tasks.DobleAsesoria;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import models.DatosInicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.IniciarSesionPage;

import java.util.List;

import static userinterfaces.IniciarSesionPage.BTN_NO_MANTENER_SESION_INICIADA;
import static userinterfaces.IniciarSesionPage.TXT_CONTRASENIA;

public class IniciarSesionDobleAsesoria implements Task {

    private final DatosInicioSesion datosInicioSesion;

    public IniciarSesionDobleAsesoria(String datos) {
        int pos=Integer.parseInt(datos);
        datosInicioSesion = CreateModels.setDatosInicioSesion(pos, ConstantesGenerales.DATA_TO_TEST_LOGIN);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IniciarSesionPage.TXT_CORREO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Enter.theValue(datosInicioSesion.getCorreo()).into(IniciarSesionPage.TXT_CORREO),
                Click.on(IniciarSesionPage.BTN_SIGUIENTE),
                (WaitUntil.the(IniciarSesionPage.TXT_CONTRASENIA, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(10).seconds()),
                Enter.theValue(datosInicioSesion.getContrasenia()).into(TXT_CONTRASENIA),
                Click.on(IniciarSesionPage.BTN_INICIAR_SESION));
        actor.attemptsTo(Check.whether(BTN_NO_MANTENER_SESION_INICIADA.resolveFor(actor).
                        isVisible()).andIfSo(Click.on(BTN_NO_MANTENER_SESION_INICIADA)).otherwise()
                );
    }

    public static IniciarSesionDobleAsesoria enElAplicativo(List<String> datos){
        return Tasks.instrumented(IniciarSesionDobleAsesoria.class, datos.get(0));
    }
}
