package interactions;

import Utils.exceldata.CreateModels;
import integrations.PoolQueryMujeres;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.IngresarEdadDefinidaPage.*;

public class IngresarAPartirEdad implements Interaction {

    private final PoolQueryMujeres obj = new PoolQueryMujeres();
    private final int posicion;

    public IngresarAPartirEdad(String datos) {
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        DatosAfiliado datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CALCULAR),
                Espera.cantidadDeMiliSegundos(4000));
                actor.attemptsTo(
                Click.on(CHECK_APARTIR_EDAD_DEFINIDA),
                Enter.theValue(obj.list.get(posicion).getEdad()).into(TXT_A_PARTIR_EDAD_DEFINIDA)
                // Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_A_PARTIR_EDAD_DEFINIDA)
        );
    }

    public static IngresarAPartirEdad definida(List<String>datos){
        return Tasks.instrumented(IngresarAPartirEdad.class, datos.get(0));
    }
}
