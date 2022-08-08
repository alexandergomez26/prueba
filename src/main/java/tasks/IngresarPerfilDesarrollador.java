package tasks;

import interactions.Espera;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;
import static userinterfaces.IniciarSesionPage.*;

public class IngresarPerfilDesarrollador implements Task {


    public IngresarPerfilDesarrollador(String datos) {
        int pos=Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(3000),
                Click.on(DESARROLLADOR_FULL_STACK),
                Espera.cantidadDeMiliSegundos(3000)
        );

        Serenity.getWebdriverManager().getCurrentDriver().switchTo()
                .window((String)Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles().toArray()[1]);



    }
    public static IngresarPerfilDesarrollador enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarPerfilDesarrollador.class, datos.get(0));
    }
}

