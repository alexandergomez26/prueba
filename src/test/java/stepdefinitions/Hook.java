package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.IngresarDatosAfiliado.IngresarDatosExistentes;
import tasks.IngresarDatosAfiliado.IngresarDatosNoExistentes;
import tasks.IngresarEdadDefinida.*;
import tasks.IniciarSesion.IniciarSesion;
import userinterfaces.IniciarSesionPage;
import java.util.List;
import static Utils.Constants.ActorConstants.ACTOR_DEFAULT;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Hook {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public static void inicializar() {
        setTheStage(new OnlineCast());
        theActor(ACTOR_DEFAULT);
    }


    @Dado("^que el (.*) se encuentre en la pagina de ASPEN$")
    public void queElUsuarioSeEncuentreEnLaPaginaDeASPEN(String actor) {
        theActor(actor).attemptsTo(Open.browserOn(new IniciarSesionPage()));
    }


    @Dado("^que el (.*) se encuentre logueado en la pagina de ASPEN (.*)$")
    public void queElUsuarioSeEncuentreLogueadoEnLaPaginaDeASPEN(String actor ,List<String> datos ) {
        theActor(actor).attemptsTo(Open.browserOn(new IniciarSesionPage()));
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enElAplicativo(1));
    }

    @Cuando("^ingresa datos existentes en cliente actual (.*)$")
    public void ingresaDatosExistentesEnClienteActual(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosExistentes.enClienteActual(datos));
    }

    @Cuando("^ingresa datos de mujeres existentes en cliente actual (.*)$")
    public void ingresaDatosDeMujeresExistentesEnClienteActual(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatos.enClienteActual(datos));
    }

    @Cuando("^ingresa datos de afiliados con bono emitido en cliente actual (.*)$")
    public void ingresaDatosDeAfiliadosConBonoEmitidoEnClienteActual(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosBonoEmitido.enClienteActual(datos));
    }

    @Cuando("^ingresa datos de afiliados con bono redimido en cliente actual (.*)$")
    public void ingresaDatosDeAfiliadosConBonoRedimidoEnClienteActual(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosBonoRedimido.enClienteActual(datos));
    }

    @Cuando("^ingresa datos de afiliados con bono en custodia en cliente actual (.*)$")
    public void ingresaDatosDeAfiliadosConBonoEnCustodiaEnClienteActual(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosBonoEnCustodia.enClienteActual(datos));
    }

    @Cuando("^ingresa datos de hombres existentes en cliente actual (.*)$")
    public void ingresaDatosdeHombresExistentesEnClienteActual(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosHombre.enClienteActual(datos));
    }

    @Cuando("^ingresa datos de hombres en cliente actual (.*)$")
    public void ingresaDatosdeHombresEnClienteActual(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosParaHombre.enClienteActual(datos));
    }

    @Cuando("^selecciona ingreso a la vida laboral antes de junio 30/92 (.*)$")
    public void seleccionaIngresoALaVidaLaboralAntesDeJunio30(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosBonoModalidadDos.enElAplicativo(datos));
    }

    @Cuando("^selecciona ingreso a la vida laboral despues de junio 30/92 (.*)$")
    public void seleccionaIngresoALaVidaLaboralDespuesDeJunio30(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosBonoModalidadUno.enElAplicativo(datos));
    }

    @Cuando("^ingresa a RPM no bono (.*)$")
    public void ingresaARPMNoBono(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarARPMNoBono.enElAplicativo(datos));
    }

    @Cuando("^ingresa datos no existentes en cliente potencial (.*)$")
    public void ingresaDatosNoExistentesEnClientePotencial(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosNoExistentes.enClientePotencial(datos));
    }

}
