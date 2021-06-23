package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.SeleccionTipoDeCalculoAsesoriaPensional.VisualizaElTextoProyeccionPension;
import questions.SeleccionTipoDeCalculoPensionVejez.VisualizaElTextoCalculo;
import tasks.IngresarEdadDefinida.CambiarFidelidad;
import tasks.SeleccionTipoDeCalculoAsesoriaPensional.*;
import tasks.SeleccionTipoDeCalculoPensionVejez.SeleccionarTipoDeCalculo;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionTipoDeCalculoAsesoriaPensionalStepDefinition {

    @Cuando("^selecciona la opcion asesoria pensional (.*)$")
    public void seleccionaLaOpcionAsesoriaPensional(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoDeCalculoAsesoria.pensional(datos));
    }

    @Cuando("^por cliente modifica su fidelidad (.*)$")
    public void porClienteModificaSuFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadAsesoriaPensional.enElAplicativo(datos));
    }

    @Cuando("^por cliente con bono modifica su fidelidad (.*)$")
    public void porClienteConBonoModificaSuFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadAsesoriaPensionalBono.enElAplicativo(datos));
    }

    @Cuando("^por cliente con bonos modifica su fidelidad (.*)$")
    public void porClienteConBonosModificaSuFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadAsesoriaPensionalBonos.enElAplicativo(datos));
    }

    @Cuando("^despues de ingresar beneficiario selecciona la opcion asesoria pensional (.*)$")
    public void despuesDeIngresarBeneficiarioSeleccionaLaOpcionAsesoriaPensional(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoDeCalculoAsesoriaBeneficiario.pensional(datos));
    }

    @Cuando("^selecciona con modalidad bono la opcion asesoria pensional (.*)$")
    public void seleccionaLaOpcionAsesoriaPensionalConModalidadBono(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(SeleccionTipoDeCalculoBonoAsesoria.pensional(datos));
    }

    @Cuando("^selecciona con modalidad bonos la opcion asesoria pensional (.*)$")
    public void seleccionaConModalidadBonosLaOpcionAsesoriaPensional(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoDeCalculoBonosAsesoria.pensional(datos)); /////verificar para eliminar
    }

    @Entonces("^puede ver su resultado en asesoria pensional$")
    public void puedeVerSuResultadoEnAsesoriaPensional() {
        theActorInTheSpotlight().should(seeThat(VisualizaElTextoProyeccionPension.retiroProgramado()));
    }

    @Cuando("^cliente potencial selecciona la opcion asesoria pensional (.*)$")
    public void clientePotencialSeleccionaLaOpcionAsesoriaPensional(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoDeCalculoAsesoria.pensional(datos));
    }


}
