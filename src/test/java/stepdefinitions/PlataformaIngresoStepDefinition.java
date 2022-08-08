package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.*;
import tasks.*;
import tasks.iniciarsesion.AbrirNavegador;
import tasks.iniciarsesion.IniciarSesion;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;
import static userinterfaces.SeleccionarUrlPage.PLATAFORMA_INGRESO;
import static utils.constantes.ActorConstants.ACTOR_DEFAULT;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PlataformaIngresoStepDefinition {
    @Managed(driver = "chrome")
    static WebDriver driver;

    @After
    public static void cerrar(){
        driver.quit();
    }

    @Before
    public static void inicializar() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR_DEFAULT);
    }

    @Dado("^que el (.*) se encuentre logueado en la plataforma de ingreso (.*)$")
    public void queElCandidatoSeEncuentreLogueadoEnLaPlataformaDeIngreso(String actor, List<String> datos ) {
        theActorInTheSpotlight().wasAbleTo(AbrirNavegador.en(PLATAFORMA_INGRESO));
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enElAplicativo(1));
    }

    @Cuando("^ingresa al modulo de ayuda (.*)$")
    public void ingresaAlModuloDeAyuda(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                tasks.IngresarAyuda.enElAplicativo(datos));
    }

    @Cuando("^ingresa a la etapa entrevista psicologica (.*)$")
    public void ingresaALaEtapaEntrevistaPsicologica(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarPerfilEntrevistaPsicologica.enElAplicativo(datos));
    }

    @Cuando("^ingresa a la etapa ensayo (.*)$")
    public void ingresaALaEtapaEnsayo(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEtapaEnsayo.enElAplicativo(datos));
    }

    @Cuando("^ingresa a la etapa Hackerrank (.*)$")
    public void ingresaALaEtapaHackerrank(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEtapaHackerrank.enElAplicativo(1));
    }

    @Cuando("^ingresa a la etapa test psicometrico (.*)$")
    public void ingresaALaEtapaTestPsicometrico(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEtapaTestPsicometrico.enElAplicativo(datos));
    }

    @Cuando("^ingresa a la etapa Test Grit (.*)$")
    public void ingresaALaEtapaTestGrit(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEtapaTestGrit.enElAplicativo(datos));
    }


    @Cuando("^ingresa al modulo notificaciones (.*)$")
    public void ingresaAlModuloNofiticaciones(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarNotificaciones.enElAplicativo(datos));
    }

    @Cuando("^ingresa al modulo perfil (.*)$")
    public void ingresaAlModuloPerfil(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarPerfil.enElAplicativo(datos));
    }

    @Cuando("^ingresa a la etapa esperar propuesta (.*)$")
    public void ingresaALaEtapaEsperarPropuesta(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEtapaEsperarPropuesta.enElAplicativo(datos));
    }

    @Cuando("^desee visualizar el perfil de desarrollador fullstack (.*)$")
    public void deseeVisualizarElPerfilDeDesarradorFullstack(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarPerfilDesarrollador.enElAplicativo(datos));
    }

    @Cuando("^desee consultar la información relacionada con la postulación (.*)$")
    public void deseeconsultarLaInformaciónRelacionadaConLaPostulación(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                ConsultarInformacionPostulacion.enElAplicativo(datos));
    }

    @Cuando("^desee visualizar todas las etapas de la postulacion (.*)$")
    public void deseeVisualizarTodasLasEtapasDeLaPostulacion(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                ConsultarInformacionPostulacion.enElAplicativo(datos));
    }



    @Cuando("^ingresa a la etapa visita domiciliaria (.*)$")
    public void ingresaALaEtapaVisitaDomiciliaria(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEtapaVisitaDomiciliaria.enElAplicativo(datos));
    }

    @Cuando("^el candidato cierre la sesion en la plataforma (.*)$")
    public void elCandidatoCierreSesionEnLaPlataforma(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                CerrarSesion.enElAplicativo(datos));
    }

    @Entonces("puede ver el mensaje (.*)$")
    public void youShouldSeeTheMessage(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                TestGritQuestion.is(), containsString(mensaje))
        );
    }

    @Entonces("puede visualizar el mensaje de escenario actualizado (.*)$")
    public void puedeVisualizarElMensajeDeEscenarioActualizado(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                CerrarSesionQuestion.is(), containsString(mensaje))
        );
    }

    @Entonces("se podra ver la modal (.*)$")
    public void sePodraVerLaModal(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                AyudaQuestion.is(), containsString(mensaje))
        );
    }

    @Entonces("se podra ver el mensaje en la pantalla (.*)$")
    public void sePodraVerElMensajeEnLaPantalla(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                NotificacionesQuestion.is(), containsString(mensaje))
        );
    }

    @Entonces("se podra ver el mensaje de creacion (.*)$")
    public void sePodraVerElMensajeDeCreacion(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                PerfilQuestion.is(), containsString(mensaje))
        );
    }

    @Entonces("se visualizara la modal (.*)$")
    public void seVisualizaraLaModal(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                EnsayoQuestion.is(), containsString(mensaje))
        );
    }

    @Entonces("se vera el resultado del filtro con el nombre (.*)$")
    public void seVeraElResultadoDelFiltroConElnombre(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                PerfilDesarrolladorQuestion.is(), containsString(mensaje))
        );
    }

    @Entonces("vera la información relacionada con la postulacion (.*)$")
    public void veraLaInformaciónRelacionadaConLaPostulacion(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                PerfilDesarrolladorQuestion.is(), containsString(mensaje))
        );
    }

    @Entonces("vera todas las etapas de la postulacion (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void veraTodasLasEtapasDeLaPostulacion(String texto1, String texto2, String texto3, String texto4, String texto5, String texto6) {
        theActorInTheSpotlight().should(seeThat(
                EtapasCandidatoQuestion.enElAplicativo(texto1, texto2, texto3, texto4, texto5, texto6))
        );
    }


}
