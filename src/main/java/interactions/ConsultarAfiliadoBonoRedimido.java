package interactions;

import Utils.exceldata.CreateModels;
import integrations.ConsultarBDBonoRedimido;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_CONTINUAR;
import static userinterfaces.IngresarEdadDefinidaPage.*;


public class ConsultarAfiliadoBonoRedimido implements Interaction {

    private final ConsultarBDBonoRedimido obj = new ConsultarBDBonoRedimido();

    private final int posicion;
    private final DatosAfiliado datosAfiliado;


    public ConsultarAfiliadoBonoRedimido(String datos) {
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
                Espera.cantidadDeMiliSegundos(4000),
                Click.on(TXT_DATOS_HISTORIA_LABORAL),
                Click.on(TXT_FECHA_PRIMERA_COTIZACION),
                Espera.cantidadDeMiliSegundos(2000),
                Click.on(TXT_ANO_PRIMERA_COTIZACION),
                Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_ANO_PRIMERA_COTIZACION),
                Espera.cantidadDeMiliSegundos(2000),
                Click.on(OPCT_MES_PRIMERA_COTIZACION),
                Click.on(OPCT_DIA_PRIMERA_COTIZACION),
                Enter.theValue(datosAfiliado.getAportesObligatorios()).into(OPCT_APORTES_OBLIGATORIOS),
                Click.on(BTN_CONTINUAR_DATOS_BASICOS),
                Espera.cantidadDeMiliSegundos(4000)
        );

    }

    public static ConsultarAfiliadoBonoRedimido enClienteActual(List<String> datos){
        return Tasks.instrumented(ConsultarAfiliadoBonoRedimido.class, datos.get(0));
    }
}

