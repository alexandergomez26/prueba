package tasks;

import interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import java.util.List;


public class ConsultarInformacionPostulacion implements Task {


    public ConsultarInformacionPostulacion(String datos) {
        int pos=Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(3000)

        );





    }
    public static ConsultarInformacionPostulacion enElAplicativo(List<String> datos){
        return Tasks.instrumented(ConsultarInformacionPostulacion.class, datos.get(0));
    }
}


