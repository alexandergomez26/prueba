package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.IngresarEdadDefinida.PuedeVisualizarLaProyeccion;
import tasks.SeleccionTipoDeCalculoPensionInvalidezSobrevivencia.SeleccionarPensionInvalidezSobrevivencia;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarPensionInvalidezAEdadDefinidaStepDefinition {

    @Cuando("^por cliente ingresa en pensionn invalidez la edad definida (.*)$")
    public void porClienteIngresaEnPensionnInvalidezLaEdadDefinida(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarPensionInvalidezSobrevivencia.paraLaProyeccion(datos));
    }

    @Entonces("^puede visualizar el texto6 (.*)$")
    public void puedeVisualizarElTexto(String texto) {
        theActorInTheSpotlight().should(seeThat(PuedeVisualizarLaProyeccion.aEdadDefinida(texto)));
    }
}
