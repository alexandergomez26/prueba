package interactions;

import Utils.exceldata.CreateModels;
import integrations.PoolQuery;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.FormularioDatosBasicoPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.*;

public class IngresarAPartirEdad implements Interaction {

    private final PoolQuery obj = new PoolQuery();
    private int posicion;
    private DatosAfiliado datosAfiliado;
    private String datos;

    public IngresarAPartirEdad(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
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
