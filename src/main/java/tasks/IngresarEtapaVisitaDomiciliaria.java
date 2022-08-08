package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;
import static userinterfaces.IniciarSesionPage.*;

public class IngresarEtapaVisitaDomiciliaria implements Task {


    public IngresarEtapaVisitaDomiciliaria(String datos) {
        int pos=Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VISITA_DOMICILIARIA)

        );

    }
    public static IngresarEtapaVisitaDomiciliaria enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarEtapaVisitaDomiciliaria.class, datos.get(0));
    }
}

