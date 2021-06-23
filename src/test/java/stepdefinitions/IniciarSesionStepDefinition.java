package stepdefinitions;
import Utils.exceldata.WriteExcel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import models.DatosInicioSesion;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import questions.IniciarSesion.*;
import tasks.*;
import tasks.IniciarSesion.IniciarSesion;
import tasks.IniciarSesion.IniciarSesionConCampoCorreo;
import tasks.IniciarSesion.IniciarSesionConContrasenia;
import tasks.IniciarSesion.IniciarSesionConCorreo;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {


    @Cuando("^ingrese sus credenciales$")
    public void ingreseSusCredenciales(List<String>datos1) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enElAplicativo(1));
    }

    @Entonces("^visualiza el texto de (.*)$")
    public void visualizaElTextoDeBienvenidos(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualiza.elTexto(texto)));
    }

    @Cuando("^ingrese el correo de forma errada$")
    public void ingreseElCorreoDeFormaErrada(List<String>datos1) {
        theActorInTheSpotlight().attemptsTo(IniciarSesionConCorreo.errado(datos1));
    }

    @Entonces("^visualiza un mensaje de (.*)$")
    public void visualizaUnMensajeDeEscribaUnaDirecciónDeCorreoElectrónicoUnNúmeroDeTeléfonoOUnNombreSkypeVálidos(String texto1) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaMensajeDe.deCorreoErrado(texto1)));
    }

    @Cuando("^ingrese la contrasenia de forma errada$")
    public void ingreseLaContraseniaDeFormaErrada(List<String>datos2) {
        theActorInTheSpotlight().attemptsTo(IniciarSesionConContrasenia.Errada(datos2));
    }


    @Entonces("^visualiza el mensaje (.*)$")
    public void visualizaElMensajeSuCuentaOContraseñaNoEsCorrectaSiNoRecuerdaSuContraseñaPuedeRestablecerlaAhora(String texto2) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElMensaje.deContraseniaErrada(texto2)));
    }

    @Cuando("^Deje el campo correo vacio$")
    public void dejeElCampoCorreoVacio(List<String>datos3) {
        theActorInTheSpotlight().attemptsTo(IniciarSesionConCampoCorreo.vacio(datos3));
    }


    @Entonces("^visualiza el siguiente mensaje (.*)$")
    public void visualizaElSiguienteMensajeEscribaUnaDirecciónDeCorreoElectrónicoUnNúmeroDeTeléfonoOUnNombreSkypeVálidos(String texto3) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElSiguiente.mensajeDeCorreoVacio(texto3)));
    }

    @Cuando("^Deje el campo contrasenia vacio$")
    public void dejeElCampoContraseniaVacio(List<String>datos4) {
        theActorInTheSpotlight().attemptsTo(IniciarSesionConCampoContrasenia.vacio(datos4));
    }

    @Entonces("^visualiza el siguiente texto (.*)$")
    public void visualizaElSiguienteTextoEscribaSuContraseña(String texto4) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElSiguienteMensaje.deContraseniaVacia(texto4)));
    }
}
