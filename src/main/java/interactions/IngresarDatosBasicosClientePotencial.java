package interactions;

import Utils.exceldata.CreateModels;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;
import static userinterfaces.AutorizacionPage.FECHA;
import static userinterfaces.FormularioDatosBasicoPage.*;
import static userinterfaces.FormularioDatosBasicoPage.TXT_VALOR_CUENTA_INDIVIDUAL;


public class IngresarDatosBasicosClientePotencial implements Interaction {


    private final DatosAfiliado datosAfiliado;

    public IngresarDatosBasicosClientePotencial(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FECHA),
                Enter.theValue(datosAfiliado.getNombre()).into(TXT_NOMBRE),
                WaitUntil.the(TXT_FECHA_NACIMIENTO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Click.on(TXT_FECHA_NACIMIENTO),
                Click.on(TXT_AÑO),
                Click.on(OPCT_AÑO_NACIMIENTO),
                Click.on(TXT_MES),
                Click.on(OPCT_MES_NACIMIENTO),
                Click.on(OPCT_DIA),
                Click.on(BTN_INGRESO_VIDA_LABORAL),
                Click.on(RBN_INGRESO_VIDA_LABORAL_DESPUES_JUNIO),
                Click.on(BTN_DATOS_HISTORIA_LABORAL),
                Click.on(TXT_FECHA_TRASLADO),
                Click.on(TXT_AÑO),
                Click.on(OPCT_AÑO_FECHA_TRASLADO),
                Click.on(TXT_MES),
                Click.on(OPCT_MES_FECHA_TRASLADO),
                Click.on(OPCT_DIA),
                Click.on(TXT_FECHA_PRIMERA_COTIZACION),
                Click.on(TXT_AÑO),
                Click.on(OPCT_AÑO_FECHA_PRIMERA_COTIZACION),
                Click.on(TXT_MES),
                Click.on(OPCT_MES_FECHA_PRIMERA_COTIZACION),
                Click.on(OPCT_DIA),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO_ACTUAL),
                Click.on(TXT_FECHA_VALOR_CUENTA_INDIVIDUAL),
                Click.on(OPCT_DIA_FECHA_VALOR_CUENTA_INDIVIDUAL),
                Enter.theValue(datosAfiliado.getValorCuentaIndividual()).into(TXT_VALOR_CUENTA_INDIVIDUAL)
        );

    }
    public static IngresarDatosBasicosClientePotencial enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarDatosBasicosClientePotencial.class, datos.get(0));
    }
}
