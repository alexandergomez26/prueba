package tasks.PlanRetiro;

import Utils.exceldata.CreateModels;
import integrations.PoolQuery;
import interactions.Espera;
import interactions.IngresarLosDatosPlanRetiro;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import tasks.FormularioDatosBasicos.IngresarDatos;
import userinterfaces.IngresarDatosPlanRetiroPage;
import userinterfaces.IngresarEdadDefinidaPage;

import java.util.Collections;
import java.util.List;

import static userinterfaces.IngresarDatosPlanRetiroPage.*;
import static userinterfaces.FormularioDatosBasicoPage.TXT_VALOR_CUENTA_INDIVIDUAL;

public class IngresarDatosPlanRetiro implements Task {

    private PoolQuery obj = new PoolQuery();

    private int posicion;
    private String datos;

    public IngresarDatosPlanRetiro(String datos) {
        this.datos = datos;
        posicion=Integer.parseInt(datos);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarLosDatosPlanRetiro.enElAplicativo(Collections.singletonList(datos)),
                Enter.theValue(obj.list.get(posicion).getValorCuentaIndividual()).into(TXT_VALOR_ESPERADO_PENSION),

               /* Enter.theValue(obj.list.get(posicion).getEdad()).into(TXT_EDAD_RETIRO),
                Enter.theValue(obj.list.get(posicion).getValorCuentaIndividual()).into(TXT_VALOR_APORTE_INICIAL),
                Click.on(TXT_FECHA_APORTE_INICIAL),
                Click.on(OPCT_DIA2),
                Enter.theValue(obj.list.get(posicion).getValorCuentaIndividual()).into(TXT_VALOR_ESPERADO_PENSION),
                */
                Enter.theValue(obj.list.get(posicion).getValorCuentaIndividual()).into(TXT_VALOR_DEL_APORTE),
                Click.on(TXT_FECHA_INICIO_AHORRO),
                Click.on(OPCT_DIA2),
                Click.on(IngresarDatosPlanRetiroPage.BTN_CALCULAR_),
                Espera.cantidadDeMiliSegundos(1000)
                );

    }
    public static IngresarDatosPlanRetiro clientePotencial(List<String> datos){
        return Tasks.instrumented(IngresarDatosPlanRetiro.class, datos.get(0));
    }
}
