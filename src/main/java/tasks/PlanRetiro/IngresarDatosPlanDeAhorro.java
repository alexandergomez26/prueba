package tasks.PlanRetiro;

import integrations.PoolQuery;
import interactions.Espera;
import interactions.IngresarLosDatosPlanRetiro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.IngresarDatosPlanRetiroPage;

import java.util.Collections;
import java.util.List;

import static userinterfaces.IngresarDatosPlanRetiroPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.BTN_CALCULAR;

public class IngresarDatosPlanDeAhorro implements Task {

    private PoolQuery obj = new PoolQuery();

    private int posicion;
    private String datos;

    public IngresarDatosPlanDeAhorro(String datos) {
        this.datos = datos;
        posicion=Integer.parseInt(datos);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarLosDatosPlanRetiro.enElAplicativo(Collections.singletonList(datos)),
                Click.on(TXT_FECHA_DE_APORTE_INICIAL),
                Click.on(OPCT_DIA2),


                Enter.theValue(obj.list.get(posicion).getValorCuentaIndividual()).into(TXT_VALOR_APORTE),
                Espera.cantidadDeMiliSegundos(2000),

                Click.on(OPCT_DIA2),
                Click.on(BTN_CALCULAR_),
                Espera.cantidadDeMiliSegundos(1000)  // Organizando.........
        );

    }
    public static IngresarDatosPlanDeAhorro enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarDatosPlanDeAhorro.class, datos.get(0));
    }
}
