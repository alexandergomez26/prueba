package tasks.ingresarapartiredaddefinida;

import utils.exceldata.CreateModels;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.*;

public class IngresarDatosBonoModalidadUno implements Task {

    private final DatosAfiliado datosAfiliado;

    public IngresarDatosBonoModalidadUno(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosAfiliado.getSemanasBono()).into(TXT_A_FECHA_DE_TRASLADO),
                Click.on(INGRESO_A_LA_VIDA_LABORAL),
                Click.on(DESPUES_DE_JUNIO),
                Click.on(TXT_FECHA_TRASLADO),
                Click.on(TXT_ANIO),//
                Click.on(OPCT_ANO_TRASLADO),
                Click.on(TXT_MES_INICIAL),
                Click.on(OPCT_MES),//
                Click.on(OPCT_DIA_TRASLADO),
                Click.on(BTN_CONTINUAR_DATOS_BASICOS),
                Click.on(TXT_FECHA_INICIAL),
                Click.on(TXT_ANIO),//
                Click.on(OPCT_ANO_INICIAL),
                Click.on(TXT_MES_INICIAL),
                Click.on(OPCT_MES_INICIAL),
                Click.on(OPCT_DIA_INICIAL),
                Click.on(TXT_FECHA_FINAL),
                Click.on(OPCT_MES),//
                Click.on(OPCT_DIA_FINAL),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO),
                Click.on(BTN_CONTINUAR_REGISTRO_BONO_MODALIDA_UNO)
        );
    }
    public static IngresarDatosBonoModalidadUno enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarDatosBonoModalidadUno.class, datos.get(0));
    }
}
