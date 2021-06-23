package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.PlanRetiro.SeVisualizaMensajeEnRetiroProgramado;
import questions.SeleccionRegimenPrimaMedia.VisualizaElTextoRegimenPrimaMedia;
import tasks.IngresarDatosAfiliado.IngresarDatosExistentes;
import tasks.IngresarEdadDefinida.CambiarFidelidad;
import tasks.RegimenPrimaMedia.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionarRegimenPrimaMediaStepDefinition {

    @Cuando("^selecciona la opcion pension en el Regimen de Prima Media (.*)$")
    public void seleccionaLaOpcionPensionEnElRegimenDePrimaMedia(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTuPensionRegimenPrimaMedia.enClienteActual(datos));
    }

    @Cuando("^por cliente actualiza su fidelidad en Colpensiones (.*)$")
    public void porClienteActualizaSuFidelidadEnColpensiones(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadColpensiones.enElAplicativo(datos));
    }

    @Cuando("^por cliente con beneficiario actualiza su fidelidad en Colpensiones (.*)$")
    public void porClienteConBeneficiarioActualizaSuFidelidadEnColpensiones(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(CambiarFidelidadColpensionesBeneficiario.enElAplicativo(datos));
    }

    @Cuando("^por cliente ingresa en modalidad bono para luego seleccionar la opcion pension en el Regimen de Prima Media (.*)$")
    public void porClienteIngresaEnModalidadBonoParaLuegoSeleccionarLaOpcionPensionEnElRegimenDePrimaMedia(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTuPensionRegimenPrimaMediaBono.enClienteActual(datos));
    }

    @Cuando("^ingresa un beneficiario selecciona la opcion pension en el Regimen de Prima Media (.*)$")
    public void ingresaUnBeneficiarioseleccionaLaOpcionPensionEnElRegimenDePrimaMedia(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarTuPensionColpensionesBeneficiario.enClienteActual(datos));
    }

    @Entonces("^puede ver su resultado en regimen de prima media(.*)$")
    public void puedeVerSuResultadoEnRegimendePrimaMedia(String texto) {
        theActorInTheSpotlight().should(seeThat(VisualizaElTextoRegimenPrimaMedia.conPrestacionDefinida()));
    }
}
