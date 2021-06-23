package interactions;

import Utils.exceldata.CreateModels;
import Utils.exceldata.WriteExcel;
import integrations.ConsultarBDHombres;
import integrations.PoolQueryProteccion;
import models.DatosAfiliado;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import static userinterfaces.AutorizacionPage.*;
import java.util.List;
import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_A_RPM_NO_BONO;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_DATOS_HISTORIA_LABORAL;

public class IngresarDatos implements Interaction {

    private final PoolQueryProteccion obj = new PoolQueryProteccion();

    private final int posicion;
    private final DatosAfiliado datosAfiliado;
    private DatosPension datosPension;

    public IngresarDatos(String datos) {
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
                Click.on(TXT_DATOS_HISTORIA_LABORAL),
                Enter.theValue(datosAfiliado.getSemanasNBono()).into(TXT_A_RPM_NO_BONO)
                );

    }

    public static IngresarDatos cliente(List<String>datos){
        return Tasks.instrumented(IngresarDatos.class, datos.get(0));
    }
}



