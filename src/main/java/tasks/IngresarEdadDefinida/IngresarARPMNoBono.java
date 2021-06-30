package tasks.IngresarEdadDefinida;

import Utils.exceldata.CreateModels;
import com.ibm.as400.util.commtrace.ESP;
import interactions.Espera;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static userinterfaces.FormularioDatosBasicoPage.BTN_ACEPTAR_INFO_BONO;
import static userinterfaces.IngresarEdadDefinidaPage.*;

public class IngresarARPMNoBono implements Task {

    private final DatosAfiliado datosAfiliado;

    public IngresarARPMNoBono(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_A_RPM_NO_BONO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Enter.theValue(datosAfiliado.getBono()).into(TXT_A_RPM_NO_BONO),
                Click.on(BTN_CONTINUAR_DATOS_BASICOS),
                Espera.cantidadDeMiliSegundos(4000),
                Click.on(TXT_FECHA_INICIAL_RPM),
                Click.on(TXT_ANO_INICIAL),
                Click.on(OPCT_ANO_INICIAL),
                Click.on(TXT_MES_INICIAL),
                Click.on(OPCT_MES_INICIAL),
                Click.on(OPCT_DIA_INICIAL),
                Click.on(TXT_FECHA_FINAL_RPM),
                Click.on(TXT_MES_FECHA_FINAL_RPM),
                Click.on(OPCT_DIA_FINAL_RPM),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO_RPM),
                Click.on(BTN_CONTINUAR_APORTES_NO_BONO),
                Espera.cantidadDeMiliSegundos(5000)



        );
    }
    public static IngresarARPMNoBono enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarARPMNoBono.class, datos.get(0));
    }
}