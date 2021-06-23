package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.CompararResultados;
import questions.PlanRetiro.CompararResultadosPensionMeta;
import questions.PlanRetiro.SeVisualizaMensajeEnRetiroProgramado;
import questions.VisualizacionInfoBasicaAfiliado.VisualizaLosCamposDel;
import tasks.PlanRetiro.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class SeleccionarPensionMetaPlanAhorroPlanRetiroStepDefinition {

    @Cuando("^selecciona la opcion pension meta y plan de ahorro$")
    public void seleccionaLaOpcionPensionMetaYPlanDeAhorro() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarPensionMetaPlanAhorro.enElAplicativo()
                // IngresarDatosPlanRetiro.clientePotencial()
        );
    }

    @Cuando("^ingresa los datos en plan retiro (.*)$")
    public void ingresaLosDatosEnPlanRetiro(List<String> dato) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosPlanRetiro.clientePotencial(dato)
        );
    }


    @Entonces("^visualiza el siguiente mensaje3 (.*)$")
    public void visualizaElSiguienteMensaje3(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaMensajeEnRetiroProgramado.retiroProgramado(texto)));
    }


    @Cuando("^selecciona la opcion pension meta$")
    public void seleccionaLaOpcionPensionMeta() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarPensionMeta.enElAplicativo()
        );
    }

    @Entonces("^visualiza el siguiente mensaje4 (.*)$")
    public void visualizaElSiguienteMensaje4(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaMensajeEnRetiroProgramado.retiroProgramado(texto)));
    }

    @Cuando("^selecciona la opcion plan de ahorro$")
    public void seleccionaLaOpcionPlanDeAhorro() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarPlanAhorro.enElAplicativo()
        );
    }

    @Entonces("^visualiza el siguiente mensaje5 (.*)$")
    public void visualizaElSiguienteMensaje5(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaMensajeEnRetiroProgramado.retiroProgramado(texto)));

    }

    @Cuando("^ingresa los datos en pension meta (.*)$")
    public void ingresaLosDatosEnPensionMeta(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosPensionMeta.enElAplicativo(datos)
        );
    }

    @Cuando("^despues de ingresar el beneficiario ingresa los datos en pension meta (.*)$")
    public void despuesDeIngresarElBeneficiarioingresaLosDatosEnPensionMeta(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosPensionMetaConBeneficiario.enElAplicativo(datos)
        );
    }

    @Cuando("^despues de seleccionar la modalidad bono ingresa los datos en pension meta (.*)$")
    public void despuesDeSeleccionarLaModalidadBonoIgresaLosDatosEnPensionMeta(List<String>datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosPensionMetaModalidadBono.enElAplicativo(datos)
        );
    }

        @Cuando("^ingresa los datos en plan de ahorro (.*)$")
        public void ingresaLosDatosEnPlanDeAhorro(List<String>datos) {
            theActorInTheSpotlight().attemptsTo(
                    IngresarDatosPlanDeAhorro.enElAplicativo(datos)
            );
    }

    @Entonces("^puede visualizar la respuesta de pension meta$")
    public void puedeVisualizarLaRespuestaDePensionmeta() {
        theActorInTheSpotlight().should(seeThat(CompararResultadosPensionMeta.pension()));
        System.out.println("SuccessFul");
    }



}

