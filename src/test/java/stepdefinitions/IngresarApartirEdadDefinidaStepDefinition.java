package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.CompararResultados;
import tasks.formulariodatosbasicos.IngresarDatos;
import tasks.formulariodatosbasicos.IngresarDatosBeneficiario;
import tasks.formulariodatosbasicos.IngresarDatosClientePotencialConBonoEmitido;
import tasks.formulariodatosbasicos.IngresarDatosIngresoAntesDeJunio;
import tasks.ingresarapartiredaddefinida.*;
import java.util.List;
import static utils.constantes.ActorConstants.ACTOR_DEFAULT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.is;

public class IngresarApartirEdadDefinidaStepDefinition {

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

    @Y("^ingresa los datos de cliente potencial (.*)$")
    public void ingresaLosDatosDeClientePotencial(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatos.clientePotencial(datos));
    }

    @Y("^ingresa datos de cliente potencial con ingreso a la vida laboral antes de junio 30 (.*)$")
    public void ingresaDatosDeClientePotencialConIngresoALaVidaLaboralAntesDeJunio30(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosIngresoAntesDeJunio.enClientePotencial(datos));
    }

    @Cuando("^ingresa datos de cliente potencial con bono emitido (.*)$")
    public void ingresaDatosDeClientePotencialConBonoEmitido(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosClientePotencialConBonoEmitido.enClientePotencial(datos));
    }

    @Cuando("^registra un beneficiario (.*)$")
    public void registraUnBeneficiario(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarBeneficiario.enElAplicativo(datos));
    }

    @Y("^ingresa los datos del cliente potencial con beneficiario (.*)$")
    public void ingresaLosDatosDelClientePotencialConBeneficiario(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosBeneficiario.enClientePotencial(datos));
    }

    @Y("^por cliente actual ingresa la edad a partir de edad definida (.*)$")
    public void porClienteActualIngresaLaEdadApartirDeEdadDefinida(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarAPartirEdadDefinida.paraRealizarLaProyeccion(datos));
    }

    @Y("^por cliente ingresa a partir de la edad definida en RPM no bono (.*)$")
    public void porClienteIngresaAPartirDeLaEdadDefinidaEnRPMNoBono(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(IngresarAPartirEdadDefinidaRPMNoBono.paraRealizarLaProyeccion(datos));
    }

    @Y("^por cliente actual modifica la fidelidad (.*)$")
    public void porClienteActualModificaLaFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadAPartirEdadDefinida.enElAplicativo(datos));
    }

    @Y("^por cliente actual con bono modifica la fidelidad (.*)$")
    public void porClienteActualConBonoModificaLaFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadAPartirEdadDefinidaBono.enElAplicativo(datos));
    }

    @Y("^por cliente actual despues de ingresar beneficiario ingresa la edad a partir de edad definida (.*)$")
    public void porClienteActualDespuesDeIngresarBeneficiarioIngresaLaEdadApartirDeEdadDefinida(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarAPartirEdadDefinidaBeneficiario.paraRealizarLaProyeccion(datos));
    }


    @Y("^por cliente actual ingresa en modalidad bono la edad a partir de edad definida (.*)$")
    public void porClienteActualIngresaEnModalidadBonoLaEdadApartirDeEdadDefinida(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarAPartirEdadDefinidaBono.paraRealizarLaProyeccion(datos));
    }
}
