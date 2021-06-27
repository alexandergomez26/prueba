package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.CompararResultados;
import tasks.FormularioDatosBasicos.IngresarDatos;
import tasks.FormularioDatosBasicos.IngresarDatosBeneficiario;
import tasks.FormularioDatosBasicos.IngresarDatosClientePotencialConBonoEmitido;
import tasks.FormularioDatosBasicos.IngresarDatosIngresoAntesDeJunio;
import tasks.IngresarEdadDefinida.*;
import java.util.List;
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

    @Cuando("^registra un beneficiario (.*)$")
    public void registraUnBeneficiario(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarBeneficiario.enElAplicativo(datos));
    }

    @Cuando("^ingresa los datos del cliente potencial con beneficiario (.*)$")
    public void ingresaLosDatosDelClientePotencialConBeneficiario(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosBeneficiario.EnClientePotencial(datos));
    }

}
