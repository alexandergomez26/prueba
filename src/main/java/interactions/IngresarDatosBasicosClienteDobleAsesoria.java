package interactions;

import Utils.exceldata.CreateModels;
import integrations.PoolQueryProteccion;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_CONTINUAR;

public class IngresarDatosBasicosClienteDobleAsesoria implements Interaction {  // ////////////DA

    private final PoolQueryProteccion obj = new PoolQueryProteccion();
    private int posicion;
    private DatosAfiliado datosAfiliado;
    private String datos;

    public IngresarDatosBasicosClienteDobleAsesoria(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                // Enter.theValue(error+obj.list.get(posicion).getCedula()).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(datosAfiliado.getNumeroDocumento()+datosAfiliado.getEdadDefinida()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR)
                // Espera.cantidadDeMiliSegundos(3000)
        );
        /*
        try {
            WriteExcel.saveCaseIdExcel(FECHA2.resolveFor(actor).getTextValue());
            System.out.println("Prueba: " + FECHA2.resolveFor(actor).getTextValue());

            //WriteExcel.saveCaseIdExcel(FECHA2.resolveFor(actor).getText());
            // System.out.println("Prueba2: " + FECHA2.resolveFor(actor).getText());

        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }

         */
    }

    public static IngresarDatosBasicosClienteDobleAsesoria potencial(List<String> datos){
        return Tasks.instrumented(IngresarDatosBasicosClienteDobleAsesoria.class, datos.get(0));
    }
}

