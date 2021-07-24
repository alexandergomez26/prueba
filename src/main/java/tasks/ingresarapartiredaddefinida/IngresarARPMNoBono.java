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
                WaitUntil.the(TXT_FECHA_INICIAL_RPM, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(TXT_FECHA_INICIAL_RPM),
                Click.on(TXT_ANIO),//
                Click.on(OPCT_ANO_INICIAL),
                Click.on(TXT_MES_INICIAL),
                Click.on(OPCT_MES_INICIAL),
                Click.on(OPCT_DIA_INICIAL),
                Click.on(TXT_FECHA_FINAL_RPM),
                Click.on(OPCT_MES),//
                Click.on(OPCT_DIA_FINAL_RPM),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO_RPM),
                Click.on(BTN_CONTINUAR_APORTES_NO_BONO)
        );
    }
    public static IngresarARPMNoBono enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarARPMNoBono.class, datos.get(0));
    }
}