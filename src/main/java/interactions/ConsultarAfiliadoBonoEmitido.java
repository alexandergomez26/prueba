package interactions;

import Utils.exceldata.CreateModels;
import integrations.ConsultarBDBonoEmitido;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_CONTINUAR;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_A_RPM_NO_BONO;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_DATOS_HISTORIA_LABORAL;

public class ConsultarAfiliadoBonoEmitido implements Interaction {

    private final ConsultarBDBonoEmitido obj = new ConsultarBDBonoEmitido();

    private final int posicion;
    private final DatosAfiliado datosAfiliado;

    public ConsultarAfiliadoBonoEmitido(String datos) {
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                Enter.theValue(obj.list.get(posicion).getCedula()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(TXT_DATOS_HISTORIA_LABORAL, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(320).seconds(),
                Click.on(TXT_DATOS_HISTORIA_LABORAL),
                Enter.theValue(datosAfiliado.getSemanasNBono()).into(TXT_A_RPM_NO_BONO)
        );

    }

    public static ConsultarAfiliadoBonoEmitido enClienteActual(List<String> datos){
        return Tasks.instrumented(ConsultarAfiliadoBonoEmitido.class, datos.get(0));
    }
}
