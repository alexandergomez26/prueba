package tasks;

import interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;

import static userinterfaces.IniciarSesionPage.*;

public class IngresarEtapaEsperarPropuesta implements Task {


    public IngresarEtapaEsperarPropuesta(String datos) {
        int pos=Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ESPERAR_PROPUESTA),
                Espera.cantidadDeMiliSegundos(4000)
        );



    }
    public static IngresarEtapaEsperarPropuesta enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarEtapaEsperarPropuesta.class, datos.get(0));
    }
}


