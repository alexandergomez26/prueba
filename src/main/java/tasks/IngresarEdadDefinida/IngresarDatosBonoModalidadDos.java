package tasks.IngresarEdadDefinida;

import Utils.exceldata.CreateModels;
import interactions.Espera;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

import static userinterfaces.IngresarEdadDefinidaPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.BTN_CONTINUAR_REGISTRO_INFORMACION;

public class IngresarDatosBonoModalidadDos implements Task {

        private final DatosAfiliado datosAfiliado;

    public IngresarDatosBonoModalidadDos(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //SeleccionarCliente.actual(), //
               // IngresarDatos.cliente(Collections.singletonList(datos)),
                Enter.theValue(datosAfiliado.getSemanas()).into(TXT_A_FECHA_DE_TRASLADO),
                Click.on(INGRESO_A_LA_VIDA_LABORAL),
                Click.on(ANTES_DE_JUNIO),
                Click.on(TXT_FECHA_PRIMERA_COTIZACION),
                Click.on(TXT_ANO_PRIMERA_COTIZACION),
                Click.on(OPCT_ANO_PRIMERA_COTIZACION),
                Click.on(OPCT_MES_PRIMERA_COTIZACION),
                Click.on(OPCT_DIA_PRIMERA_COTIZACION),
                Click.on(BTN_CONTINUAR_DATOS_BASICOS),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO_A_JUNIO_30),
                Click.on(BTN_CALCULAR_VALOR_BASICO_BONO),
                Espera.cantidadDeMiliSegundos(4000),
                Click.on(BTN_CONTINUAR_REGISTRO_INFORMACION));
                System.out.println("Esperando");
                actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(6000)
                );
    }
    public static IngresarDatosBonoModalidadDos enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarDatosBonoModalidadDos.class, datos.get(0));
    }
}
