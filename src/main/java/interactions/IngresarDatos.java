package interactions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import utils.exceldata.CreateModels;
import integrations.ConsultarBDMujeres;
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
import static userinterfaces.IngresarAPartirEdadDefinidaPage.TXT_A_RPM_NO_BONO;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.TXT_DATOS_HISTORIA_LABORAL;

public class IngresarDatos implements Interaction {

    private final ConsultarBDMujeres obj = new ConsultarBDMujeres();

    private final int posicion;
    private final DatosAfiliado datosAfiliado;

    public IngresarDatos(String datos) {
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
                Enter.theValue(datosAfiliado.getSemanasNBono()).into(TXT_A_RPM_NO_BONO)
                );
    }

    public static IngresarDatos cliente(List<String>datos){
        return Tasks.instrumented(IngresarDatos.class, datos.get(0));
    }
}



