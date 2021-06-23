package tasks.IngresarEdadDefinida;

import Utils.exceldata.CreateModels;
import integrations.PoolQuery;
import interactions.Espera;
import interactions.IngresarDatos;
import interactions.SeleccionarCliente;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Collections;
import java.util.List;

import static userinterfaces.FormularioDatosBasicoPage.BTN_ACEPTAR_INFO_BONO;
import static userinterfaces.FormularioDatosBasicoPage.BTN_CONTINUAR_FORM_DATOS_BASICOS;
import static userinterfaces.IngresarEdadDefinidaPage.*;

public class IngresarARPMNoBono implements Task {

    private DatosAfiliado datosAfiliado;
    private String datos;

    public IngresarARPMNoBono(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Espera.cantidadDeMiliSegundos(10),
               // SeleccionarCliente.actual(),
               // IngresarDatos.cliente(Collections.singletonList(datos)),
                Enter.theValue(datosAfiliado.getBono()).into(TXT_A_RPM_NO_BONO),
                Click.on(BTN_CONTINUAR_DATOS_BASICOS),
                Click.on(BTN_ACEPTAR_INFO_BONO),
                //Click.on(BTN_INFORMACION_IMPORTANTE), ///NUEVO Eliminar
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
                Click.on(BTN_CONTINUAR_APORTES_NO_BONO)


        );
    }
    public static IngresarARPMNoBono enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarARPMNoBono.class, datos.get(0));
    }
}