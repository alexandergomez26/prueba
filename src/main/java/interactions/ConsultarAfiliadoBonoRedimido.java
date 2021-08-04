package interactions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import utils.exceldata.CreateModels;
import integrations.ConsultarBDBonoRedimido;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_CONTINUAR;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.*;


public class ConsultarAfiliadoBonoRedimido implements Interaction {

    private final ConsultarBDBonoRedimido obj = new ConsultarBDBonoRedimido();

    private final int posicion;
    private final DatosAfiliado datosAfiliado;


    public ConsultarAfiliadoBonoRedimido(String datos) {
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_TIPO_DOCUMENTO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                Enter.theValue(obj.list.get(posicion).getCedula()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR),
                Espera.cantidadDeMiliSegundos(20000));

        BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String html = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElement(By.cssSelector("html")).getAttribute("innerHTML");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(html);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        actor.attemptsTo(
        WaitUntil.the(TXT_DATOS_HISTORIA_LABORAL, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(TXT_DATOS_HISTORIA_LABORAL),
                Click.on(TXT_FECHA_PRIMERA_COTIZACION),
                Click.on(TXT_ANIO),//
                Click.on(OPCT_ANO_PRIMERA_COTIZACION),
                Click.on(OPCT_MES),//
                Click.on(OPCT_DIA_PRIMERA_COTIZACION),
                Enter.theValue(datosAfiliado.getAportesObligatorios()).into(OPCT_APORTES_OBLIGATORIOS),
                Click.on(BTN_CONTINUAR_DATOS_BASICOS)
        );

    }

    public static ConsultarAfiliadoBonoRedimido enClienteActual(List<String> datos){
        return Tasks.instrumented(ConsultarAfiliadoBonoRedimido.class, datos.get(0));
    }
}

