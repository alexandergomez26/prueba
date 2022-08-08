package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;
import static userinterfaces.IniciarSesionPage.*;

public class IngresarPerfil implements Task {

     @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PERFIL)
        );


    }
    public static IngresarPerfil enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarPerfil.class, datos.get(0));
    }
}


