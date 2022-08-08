package tasks;

import interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.List;

import static userinterfaces.IniciarSesionPage.*;

public class IngresarEtapaTestGrit implements Task {


    public IngresarEtapaTestGrit(String datos) {
        int pos = Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_TEST_GRIT),
                Espera.cantidadDeMiliSegundos(3000)
        );



    }
    public static IngresarEtapaTestGrit enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarEtapaTestGrit.class, datos.get(0));
    }
}
