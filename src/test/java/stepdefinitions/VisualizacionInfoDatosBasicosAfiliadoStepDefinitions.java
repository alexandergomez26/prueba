package stepdefinitions;

import cucumber.api.java.es.Entonces;
import questions.IngresarDatosAfiliado.VisualizaElMensaje;
import questions.VisualizacionInfoBasicaAfiliado.SePuedenVisualizar;
import questions.VisualizacionInfoBasicaAfiliado.VisualizaLosCamposDel;
import questions.VisualizacionInfoBasicaAfiliado.VisualizaLosCamposDelSegundo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VisualizacionInfoDatosBasicosAfiliadoStepDefinitions {

    @Entonces("^visualiza los siguientes campos (.*) , (.*) , (.*) , (.*) , (.*)$")
    public void visualizaLosSiguientesCamposTipoDocumentoNúmeroDocumentoNombreFechaDeNacimientoGénero(String texto1, String texto2, String texto3, String texto4, String texto5) {
        theActorInTheSpotlight().should(seeThat(SePuedenVisualizar.losCampos(texto1,  texto2,  texto3,  texto4,  texto5)));
    }

    @Entonces("^Visualiza los campos del primer beneficiario$")
    public void visualizaLosCamposDelPrimerBeneficiario() {
        theActorInTheSpotlight().should(seeThat(VisualizaLosCamposDel.primerBeneficiario()));
    }

    @Entonces("^Visualiza los campos del segundo beneficiario$")
    public void visualizaLosCamposDelSegundoBeneficiario() {
        theActorInTheSpotlight().should(seeThat(VisualizaLosCamposDelSegundo.beneficiario()));
    }

}
