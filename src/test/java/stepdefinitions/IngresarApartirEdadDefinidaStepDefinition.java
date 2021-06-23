package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.IngresarEdadDefinida.PuedeVisualizarLaProyeccion;
import tasks.IngresarApartirEdadDefinida.CambiarFidelidadAPartirEdadDefinida;
import tasks.IngresarApartirEdadDefinida.CambiarFidelidadAPartirEdadDefinidaBono;
import tasks.IngresarApartirEdadDefinida.IngresarAPartirEdadDefinidaBeneficiario;
import tasks.IngresarEdadDefinida.CambiarFidelidad;
import tasks.IngresarEdadDefinida.IngresarAPartirEdadDefinida;
import tasks.IngresarEdadDefinida.IngresarAPartirEdadDefinidaBono;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresarApartirEdadDefinidaStepDefinition {

    @Cuando("^por cliente actual ingresa la edad a partir de edad definida (.*)$")
    public void porClienteActualIngresaLaEdadApartirDeEdadDefinida(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarAPartirEdadDefinida.paraRealizarLaProyeccion(datos));
    }

    @Cuando("^por cliente actual modifica la fidelidad (.*)$")
    public void porClienteActualModificaLaFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadAPartirEdadDefinida.enElAplicativo(datos));
    }

    @Cuando("^por cliente actual con bono modifica la fidelidad (.*)$")
    public void porClienteActualConBonoModificaLaFidelidad(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadAPartirEdadDefinidaBono.enElAplicativo(datos));
    }

    @Cuando("^por cliente actual despues de ingresar beneficiario ingresa la edad a partir de edad definida (.*)$")
    public void porClienteActualDespuesDeIngresarBeneficiarioIngresaLaEdadApartirDeEdadDefinida(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarAPartirEdadDefinidaBeneficiario.paraRealizarLaProyeccion(datos));
    }


    @Cuando("^por cliente actual ingresa en modalidad bono la edad a partir de edad definida (.*)$")
    public void porClienteActualIngresaEnModalidadBonoLaEdadApartirDeEdadDefinida(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarAPartirEdadDefinidaBono.paraRealizarLaProyeccion(datos));
    }

    @Entonces("^puede visualizar el texto (.*)$")
    public void puedeVisualizarElTexto(String texto) {
        theActorInTheSpotlight().should(seeThat(PuedeVisualizarLaProyeccion.aEdadDefinida(texto)));
    }



}
