package tasks.ingresarapartiredaddefinida;

import utils.exceldata.CreateModels;
import integrations.ConsultarBDHombres;
import interactions.AceptarBono;
import interactions.Espera;
import interactions.SeleccionarCliente;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;
import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_CONTINUAR;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.TXT_A_RPM_NO_BONO;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.TXT_DATOS_HISTORIA_LABORAL;

public class IngresarDatosHombre implements Task {

    private final ConsultarBDHombres hombre = new ConsultarBDHombres();

    private final int posicion;
    private final DatosAfiliado datosAfiliado;

    public IngresarDatosHombre(String datos) {
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                WaitUntil.the(LBL_TIPO_DOCUMENTO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                Enter.theValue(hombre.list.get(posicion).getCedula()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR),
                Espera.cantidadDeMiliSegundos(7000),
                WaitUntil.the(TXT_DATOS_HISTORIA_LABORAL, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(TXT_DATOS_HISTORIA_LABORAL),
                Enter.theValue(datosAfiliado.getSemanasNBono()).into(TXT_A_RPM_NO_BONO),
                AceptarBono.enElAplicativo()
        );

    }
    public static IngresarDatosHombre enClienteActual(List<String> datos){
        return Tasks.instrumented(IngresarDatosHombre.class, datos.get(0));
    }
}

