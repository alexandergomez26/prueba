package stepdefinitions;

import cucumber.api.java.es.Cuando;
import tasks.IngresarDatosAfiliado.IngresarDatosExistentes;
import tasks.SeleccionTipoDeCalculoPensionInvalidezSobrevivencia.SeleccionarPensionInvalidezSobrevivenciaAPartirEdad;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarPensionInvalidezAPartirEdadStepDefinition {

    @Cuando("^por cliente ingresa en pension invalidez a partir de la edad definida (.*)$")
    public void porClienteIngresaEnPensionInvalidezAPpartirDeLaedadDefinida(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarPensionInvalidezSobrevivenciaAPartirEdad.paraLaProyeccion(datos));
    }
}
