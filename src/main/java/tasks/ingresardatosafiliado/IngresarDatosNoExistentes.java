package tasks.ingresardatosafiliado;

import utils.exceldata.CreateModels;
import integrations.ConsultarBDMujeres;
import interactions.Espera;
import interactions.SeleccionarOpcionCliente;
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

public class IngresarDatosNoExistentes implements Task {

    private final ConsultarBDMujeres obj = new ConsultarBDMujeres();
    private final int posicion;
    private final DatosAfiliado datosAfiliado;

    public IngresarDatosNoExistentes(String datos) {
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarOpcionCliente.Potencial(),
                WaitUntil.the(LBL_TIPO_DOCUMENTO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                Enter.theValue(obj.list.get(posicion).getCedula()+datosAfiliado.getEdadDefinida()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR),
                Espera.cantidadDeMiliSegundos(4000)
                );

    }
    public static IngresarDatosNoExistentes enClientePotencial(List<String>datos){
        return Tasks.instrumented(IngresarDatosNoExistentes.class, datos.get(0));
    }
}
