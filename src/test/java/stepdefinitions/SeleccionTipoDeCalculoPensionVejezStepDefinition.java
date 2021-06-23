package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.SeleccionTipoDeCalculoPensionVejez.VisualizaElTextoCalculo;
import tasks.SeleccionTipoDeCalculoPensionVejez.SeleccionarTipoDeCalculo;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionTipoDeCalculoPensionVejezStepDefinition {

    @Cuando("^selecciona la opcion pension vejez (.*)$")
    public void seleccionaLaOpcionPensionVejez(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoDeCalculo.pensionVejez(datos));
    }


    @Entonces("^visualiza el texto (.*)$")
    public void visualizaElTextoCálculoDePensiónAnticipada(String texto) {
        theActorInTheSpotlight().should(seeThat(VisualizaElTextoCalculo.pensionAnticipada(texto)));
    }

    @Cuando("^cliente potencial selecciona la opcion pension vejez$")
    public void clientePotencialSeleccionaLaOpcionPensionVejez(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(SeleccionarTipoDeCalculo.pensionVejez(datos));
    }


    @Entonces("^cliente potencial visualiza el texto Cálculo de Pensión Anticipada$")
    public void clientePotencialVisualizaElTextoCálculoDePensiónAnticipada(String texto) {
        theActorInTheSpotlight().should(seeThat(VisualizaElTextoCalculo.pensionAnticipada(texto)));
    }
}
