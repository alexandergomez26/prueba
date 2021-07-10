package tasks.FormularioDatosBasicos;

import Utils.exceldata.CreateModels;
import interactions.*;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;
import static userinterfaces.FormularioDatosBasicoPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_DATOS_HISTORIA_LABORAL;

public class IngresarDatosClientePotencialConBonoEmitido implements Task {

    private final DatosAfiliado datosAfiliado;

    public IngresarDatosClientePotencialConBonoEmitido(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_NOMBRE, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Enter.theValue(datosAfiliado.getNombre()).into(TXT_NOMBRE),
                WaitUntil.the(TXT_FECHA_NACIMIENTO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Click.on(TXT_FECHA_NACIMIENTO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(TXT_ANIO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_ANIO_NACIMIENTO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(TXT_MES),
               // Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_MES_NACIMIENTO),
                Click.on(OPCT_DIA),
                Click.on(BTN_INGRESO_VIDA_LABORAL),
                Click.on(RBN_INGRESO_VIDA_LABORAL_CON_BONO_EMITIDO),
                Click.on(TXT_DATOS_HISTORIA_LABORAL),
                Enter.theValue(datosAfiliado.getSemanas()).into(TXT_A_FECHA_DE_TRASLADO),
                Click.on(TXT_FECHA_TRASLADO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(TXT_ANIO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_ANIO_FECHA_TRASLADO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(TXT_MES),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_MES_FECHA_TRASLADO),
                Click.on(OPCT_DIA),
                Click.on(TXT_FECHA_PRIMERA_COTIZACION),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(TXT_ANIO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_ANIO_FECHA_PRIMERA_COTIZACION_SISTEMA),
                Click.on(TXT_MES),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_MES_FECHA_PRIMERA_COTIZACION),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_DIA),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO_ACTUAL),
                Click.on(TXT_FECHA_VALOR_CUENTA_INDIVIDUAL),
                Click.on(OPCT_DIA_FECHA_VALOR_CUENTA_INDIVIDUAL),
                Enter.theValue(datosAfiliado.getValorCuentaIndividual()).into(TXT_VALOR_CUENTA_INDIVIDUAL),
                Click.on(TXT_FECHA_EMISION_BONO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(TXT_ANIOS),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_ANIO_FECHA_EMISION_BONO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_MES_EMISION_BONO),
                //Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_DIA_EMISION_BONO),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_VALOR_BONO),
                Click.on(BTN_CONTINUAR_FORM_DATOS_BASICOS),
                Espera.cantidadDeMiliSegundos(4000)
        );

    }
    public static IngresarDatosClientePotencialConBonoEmitido EnClientePotencial(List<String> datos){
        return Tasks.instrumented(IngresarDatosClientePotencialConBonoEmitido.class, datos.get(0));
    }
}

