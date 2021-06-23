package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.CompararResultados;
import questions.DobleAsesoria.CompararResultadosDobleAsesoria;
import questions.DobleAsesoria.VisualizarResultado;
import questions.IngresarEdadDefinida.PuedeVisualizarLaProyeccion;
import tasks.DobleAsesoria.*;
import tasks.FormularioDatosBasicos.IngresarDatos;
import tasks.FormularioDatosBasicos.IngresarDatosBeneficiario;
import tasks.FormularioDatosBasicos.IngresarDatosClientePotencialConBonoEmitido;
import tasks.FormularioDatosBasicos.IngresarDatosIngresoAntesDeJunio;
import tasks.IngresarDatosAfiliado.IngresarDatosExistentes;
import tasks.IngresarEdadDefinida.IngresarBeneficiario;
import tasks.IniciarSesion.IniciarSesion;
import userinterfaces.IniciarSesionPage;
import userinterfaces.SeleccionarUrlPage;

import java.util.List;

import static Utils.Constants.ActorConstants.ACTOR_DEFAULT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class IngresarDobleAsesoriaStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Actor");
    }

    @Dado("^que el (.*) este logueado en la pagina de ASPEN doble asesoria (.*)$")
    public void queElUsuarioEsteLogueadoEnLaPaginaDeASPENDobleAsesoria(String actor, List<String> datos) {
        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.en(SeleccionarUrlPage.ASPEN_DOBLE_ASESORIA));
        theActorInTheSpotlight().attemptsTo(IniciarSesionDobleAsesoria.enElAplicativo(datos));
    }

    @Cuando("^ingresa datos existentes en doble asesoria cliente actual (.*)$")
    public void ingresaDatosExistentesEnDobleAsesoriaClienteActual(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosBasicosDobleAsesoria.enClienteActual(datos));
    }

    @Cuando("^registra en doble asesoria un beneficiario (.*)$")
    public void registraEnDobleAsesoriaUnBeneficiario(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarBeneficiarioDobleAsesoria.enElAplicativo(datos));
    }

    @Cuando("^ingresa en doble asesoria los datos basicos de cliente potencial (.*)$")
    public void ingresaEnDobleAsesoriaLosDatosBasicosDeClientePotencial(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosBasicosClientePotencial.enElAplicativo(datos));
    }

    @Cuando("^ingresa en doble asesoria datos de cliente potencial con ingreso a la vida laboral antes de junio 30 (.*)$")
    public void ingresaEnDobleAsesoriaDatosDeClientePotencialConIngresoALaVidaLaboralAntesDeJunio30(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosIngresoAntesDeJunioDobleAsesoria.EnClientePotencial(datos));
    }

    @Cuando("^ingresa datos en doble asesoria del cliente potencial con bono emitido (.*)$")
    public void ingresaDatosEnDobleAsesoriaDelClientePotencialConBonoEmitido(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosClientePotencialConBonoEmitidoDobleAsesoria.EnClientePotencial(datos));
    }


    @Cuando("^ingresa en doble asesoria los datos del cliente potencial con beneficiario (.*)$")
    public void ingresaEnDobleAsesoriaLosDatosDelClientePotencialConBeneficiario(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosBeneficiarioDobleAsesoria.EnClientePotencial(datos));
    }

    @Entonces("^puede visualizar su resultado en doble asesoria$")
    public void puedeVisualizarSuResultadoEnDobleAsesoria() {
        theActorInTheSpotlight().should(seeThat(CompararResultadosDobleAsesoria.pension()));
    }


}
