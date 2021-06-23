package stepdefinitions;

import Utils.exceldata.ServiceExcelDrive;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.CompararDatosSetDatos;
import questions.CompararResultados;
import questions.CompararResultadosSimulador;
import questions.IngresarEdadDefinida.PuedeVisualizarLaProyeccion;
import tasks.FormularioDatosBasicos.IngresarDatos;
import tasks.FormularioDatosBasicos.IngresarDatosBeneficiario;
import tasks.FormularioDatosBasicos.IngresarDatosClientePotencialConBonoEmitido;
import tasks.FormularioDatosBasicos.IngresarDatosIngresoAntesDeJunio;
import tasks.IngresarEdadDefinida.*;
import tasks.SeleccionTipoDeCalculoPensionInvalidezSobrevivencia.SeleccionarPensionInvalidezSobrevivencia;

import java.util.List;
import java.util.regex.Matcher;

import static Utils.Constants.ActorConstants.ACTOR_DEFAULT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class IngresarEdadDefinidaStepDefinitions {

    @Before
    public static void inicializar() {
        setTheStage(new OnlineCast());
        theActor(ACTOR_DEFAULT);


    }

    @Cuando("^por cliente actual ingresa la edad definida (.*)$")
    public void porClienteActualIngresaLaEdadDefinida(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarEdadDefinida.paraLaProyeccion(datos));
    }

    @Cuando("^por cliente modifica la fidelidad (.*)$")
    public void porClienteModificaLaFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidad.enElAplicativo(datos));
    }

    @Cuando("^por cliente con beneficiario modifica la fidelidad (.*)$")
    public void porClienteConBeneficiarioModificaLaFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadEdadDefinidaBeneficiario.enElAplicativo(datos));
    }

    @Cuando("^por cliente con bono modifica la fidelidad (.*)$")
    public void porClienteConBonoModificaLaFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadEdadDefinidaBono.enElAplicativo(datos));
    }

    @Cuando("^por cliente actual luego de ingresar beneficiario ingresa la edad definida (.*)$")
    public void porClienteActualLuegoDeIngresarBeneficiarioIngresaLaEdadDefinida(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarEdadDefinidaBeneficiario.paraLaProyeccion(datos));
    }

    @Cuando("^por cliente actual ingresa en modalidad bono la edad definida (.*)$")
    public void porClienteActualIngresaLaEdadDefinidaEnBonoModalidadDos(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarEdadDefinidaBonoModalidadDos.paraLaProyeccion(datos));
    }

    @Entonces("^puede visualizar su resultado$")
    public void puedeVisualizarSuResultado() {
        theActorInTheSpotlight().should(seeThat(CompararResultados.pension(), is(true)));
        System.out.println("SuccessFul");
    }


    @Cuando("^ingresa los datos de cliente potencial (.*)$")
    public void ingresaLosDatosDeClientePotencial(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatos.clientePotencial(datos));
    }

    @Cuando("^ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 (.*)$")
    public void ingresaDatosDeClientePotencialConIngresoALaVidaLaboralAntesDeJunio30(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosIngresoAntesDeJunio.EnClientePotencial(datos));
    }

    @Cuando("^ingresa datos de cliente potencial con bono emitido (.*)$")
    public void ingresaDatosDeClientePotencialConBonoEmitido(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosClientePotencialConBonoEmitido.EnClientePotencial(datos));
    }

    @Cuando("^por cliente potencial ingresa la edad definida (.*)$")
    public void porClientePotencialIngresaLaEdadDefinida(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarEdadDefinida.paraLaProyeccion(datos));
    }

    @Cuando("^por cliente potencial luego de ingresar beneficiario ingresa la edad definida (.*)$")
    public void porClientePotencialLuegoDeIngresarBeneficiarioIngresaLaEdadDefinida(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarEdadDefinidaBeneficiario.paraLaProyeccion(datos));
    }

    @Cuando("^registra un beneficiario (.*)$")
    public void registraUnBeneficiario(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarBeneficiario.enElAplicativo(datos));
    }

    @Cuando("^ingresa los datos del cliente potencial con beneficiario (.*)$")
    public void ingresaLosDatosDelClientePotencialConBeneficiario(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosBeneficiario.EnClientePotencial(datos));
    }


}
