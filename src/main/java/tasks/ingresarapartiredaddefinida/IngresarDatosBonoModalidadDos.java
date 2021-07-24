package tasks.ingresarapartiredaddefinida;

import utils.exceldata.CreateModels;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static userinterfaces.IngresarAPartirEdadDefinidaPage.*;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.BTN_CONTINUAR_REGISTRO_INFORMACION;

public class IngresarDatosBonoModalidadDos implements Task {

        private final DatosAfiliado datosAfiliado;

    public IngresarDatosBonoModalidadDos(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosAfiliado.getSemanas()).into(TXT_A_FECHA_DE_TRASLADO),
                Click.on(TXT_FECHA_PRIMERA_COTIZACION),
                Click.on(TXT_ANIO),//
                Click.on(OPCT_ANO_PRIMERA_COTIZACION),
                Click.on(OPCT_MES),//
                Click.on(OPCT_DIA_PRIMERA_COTIZACION),
                Click.on(BTN_CONTINUAR_DATOS_BASICOS),
                WaitUntil.the(TXT_SALARIO_A_JUNIO_30, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO_A_JUNIO_30),
                Click.on(BTN_CALCULAR_VALOR_BASICO_BONO),
                WaitUntil.the(BTN_CONTINUAR_REGISTRO_INFORMACION, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(BTN_CONTINUAR_REGISTRO_INFORMACION)
                );
    }
    public static IngresarDatosBonoModalidadDos enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarDatosBonoModalidadDos.class, datos.get(0));
    }
}
