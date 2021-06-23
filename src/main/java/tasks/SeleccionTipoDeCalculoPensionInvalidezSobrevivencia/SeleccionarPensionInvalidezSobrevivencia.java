package tasks.SeleccionTipoDeCalculoPensionInvalidezSobrevivencia;

import Utils.exceldata.CreateModels;
import integrations.PoolQuery;
import interactions.Espera;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.IngresarEdadDefinida.IngresarEdadDefinida;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.FormularioDatosBasicoPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.*;

public class SeleccionarPensionInvalidezSobrevivencia implements Task {

    private final PoolQuery obj = new PoolQuery();
    private int posicion;
    private DatosAfiliado datosAfiliado;
    private String datos;

    public SeleccionarPensionInvalidezSobrevivencia(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // Click.on(BTN_CONTINUAR_FORM_DATOS_BASICOS),     //Integrar
               // Click.on(BTN_ACEPTAR_INFO_BONO),         //Integrar
                Espera.cantidadDeMiliSegundos(2000),         //Integrar

                Click.on(RBTN_PENSION_INVALIDEZ_SOBREVIVENCIA),
                Espera.cantidadDeMiliSegundos(1000));

        //actor.attemptsTo(WaitUntil.the(CHECK_SELECCIONADO, WebElementStateMatchers.isVisible()).
              //  forNoMoreThan(20).seconds());
        actor.attemptsTo(

                Click.on(BTN_CALCULAR),        //Integrar
                Espera.cantidadDeMiliSegundos(4000),        //Integrar
                Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_EDAD_DEFINIDA),        //Integrar
                //Enter.theValue(obj.list.get(posicion).getEdad()).into(TXT_EDAD_DEFINIDA),

                Click.on(RBN_SELECCIONAR_TODOS_LOS_PERIODOS),        //Integrar
                WaitUntil.the(BTN_CALCULAR_IBL, isVisible()).forNoMoreThan(5).seconds(),       //Integrar
                Click.on(BTN_CALCULAR_IBL),        //Integrar
                Espera.cantidadDeMiliSegundos(10000),         //Integrar
                Click.on(BTN_REALIZAR_SIMULACION2),        //Integrar
                Espera.cantidadDeMiliSegundos(4000)
               // Click.on(BTN_REALIZAR_SIMULACION)
        );
    }
    public static SeleccionarPensionInvalidezSobrevivencia paraLaProyeccion(List<String> datos){
        return Tasks.instrumented(SeleccionarPensionInvalidezSobrevivencia.class, datos.get(0));
    }
}

