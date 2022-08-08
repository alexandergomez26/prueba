package tasks;

import interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;
import static userinterfaces.IniciarSesionPage.*;

public class CerrarSesion implements Task {


    public CerrarSesion(String datos) {

        int pos=Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CERRAR_SESION),
                Espera.cantidadDeMiliSegundos(6000)
                );



    }
    public static CerrarSesion enElAplicativo(List<String> datos){
        return Tasks.instrumented(CerrarSesion.class, datos.get(0));
    }
}
