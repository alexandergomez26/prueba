package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import models.DatosAfiliado;
import questions.IngresarDatosAfiliado.SeVisualizaElTexto;
import questions.IngresarDatosAfiliado.SeVisualizaLaValidacion;
import questions.IngresarDatosAfiliado.SeVisualizaLaValidacionCliente;
import questions.IngresarDatosAfiliado.VisualizaElMensaje;
import tasks.IngresarDatosAfiliado.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresarDatosAfiliadoStepDefinition {


    @Entonces("^se visualiza el texto (.*)$")
    public void SevisualizaElTextoDatosBásicosImportantesParaLaProyección(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElTexto.datosBasicos(texto)));
    }


    @Entonces("^se visualiza el siguiente texto (.*)$")
    public void seVisualizaElSiguienteTextoDatosBásicosImportantesParaLaProyección(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElTexto.datosBasicos(texto)));
    }

    @Cuando("^ingresa datos no existentes en cliente actual$")
    public void ingresaDatosNoExistentesEnClienteActual(List<DatosAfiliado> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosNoExistentesEn.ClienteActual(datos));
    }

    @Entonces("^visualiza la validacion (.*)$")
    public void visualizaLaValidacionSePresentóUnErrorMientrasSeEjecutabaUnaOperaciónUsuarioNoEncontradoEnLaBaseDeDatosUtiliceLaOpciónClientePotencial(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaLaValidacion.clienteActual(texto)));
    }

    @Cuando("^deja el campo numero de documento vacio$")
    public void dejaElCampoNumeroDeDocumentoVacio() {
        theActorInTheSpotlight().attemptsTo(DejarCampoNumeroDocumento.vacio());
    }

    @Entonces("^se visualiza el mensaje (.*)$")
    public void seVisualizaElMensajeIngresaUnDocumentoVálido(String texto) {
        theActorInTheSpotlight().should(seeThat(VisualizaElMensaje.documentoValido(texto)));
    }

    @Cuando("^ingresa datos existentes en cliente potencial$")
    public void ingresaDatosExistentesEnClientePotencial() {
        theActorInTheSpotlight().attemptsTo(IngresarDatosExistentesEn.clientePotencial());
    }

    @Entonces("^se visualiza la validacion (.*)$")
    public void seVisualizaLaValidacionSePresentóUnErrorMientrasSeEjecutabaUnaOperaciónUsuarioEncontradoEnLaBaseDeDatosUtiliceLaOpciónClienteActual(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaLaValidacionCliente.potencial(texto)));
    }

    @Cuando("^deja el campo numero de documento vacio en cliente potencial$")
    public void dejaElCampoNumeroDeDocumentoVacioEnClientePotencial(List<DatosAfiliado> datos) {
        theActorInTheSpotlight().attemptsTo(DejarCampoNumero.dpcumenroVacio(datos));
    }


    @Entonces("^se visualiza el siguiente mensaje (.*)$")
    public void seVisualizaElSiguienteMensajeIngresaUnDocumentoVálido(String texto) {
        theActorInTheSpotlight().should(seeThat(VisualizaElMensaje.documentoValido(texto)));
    }

}
