package stepdefinitions;

import Utils.ConexionMySQLDB;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.Autorizacion.SeVisualizanLos;
import tasks.Autorizacion.Autorizacion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutorizacionStepDefinitions {

    @Cuando("^selecciona la opcion Transacciones$")
    public void seleccionaLaOpcionTransacciones() {
        //ConexionMySQLDB.consulta();
        theActorInTheSpotlight().attemptsTo(Autorizacion.delAplicativo());
    }

    @Entonces("^visualiza los siguientes textos (.*) , (.*) , (.*) , (.*) , (.*)$")
    public void visualizaLosSiguientesTextosProyeccionesPensionalesClienteActualClientePotencialCálculosMasivosAdministradorDelSistema(String texto1, String texto2, String texto3, String texto4, String texto5) {
       theActorInTheSpotlight().should(seeThat(SeVisualizanLos.SiguientesTextos(texto1,  texto2,  texto3,  texto4,  texto5)));
    }
}
