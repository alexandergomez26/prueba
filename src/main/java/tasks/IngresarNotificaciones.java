package tasks;

import interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;

import static userinterfaces.IniciarSesionPage.*;

public class IngresarNotificaciones implements Task {



    public IngresarNotificaciones(String datos) {
        int pos = Integer.parseInt(datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NOTIFICACION),
                Espera.cantidadDeMiliSegundos(3000)
                );




    }
    public static IngresarNotificaciones enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarNotificaciones.class, datos.get(0));
    }
}

