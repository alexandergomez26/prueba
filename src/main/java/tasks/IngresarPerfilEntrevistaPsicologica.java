package tasks;

import interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;

import static userinterfaces.IniciarSesionPage.*;

public class IngresarPerfilEntrevistaPsicologica implements Task {


    public IngresarPerfilEntrevistaPsicologica(String datos) {
        int pos=Integer.parseInt(datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ENTREVISTA),
                Espera.cantidadDeMiliSegundos(3000)
                );


    }
    public static IngresarPerfilEntrevistaPsicologica enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarPerfilEntrevistaPsicologica.class, datos.get(0));
    }
}


