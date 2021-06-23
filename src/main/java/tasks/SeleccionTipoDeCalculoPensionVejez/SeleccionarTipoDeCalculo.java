package tasks.SeleccionTipoDeCalculoPensionVejez;

import Utils.exceldata.CreateModels;
import integrations.PoolQuery;
import interactions.Espera;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.IngresarEdadDefinidaPage;

import java.util.List;

import static userinterfaces.FormularioDatosBasicoPage.BTN_ACEPTAR_INFO_BONO;
import static userinterfaces.FormularioDatosBasicoPage.BTN_CONTINUAR_FORM_DATOS_BASICOS;
import static userinterfaces.IngresarEdadDefinidaPage.BTN_REALIZAR_SIMULACION;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_EDAD_DEFINIDA;
import static userinterfaces.SeleccionTipoDeCalculoPensionVejezPage.BTN_CALCULAR;


public class SeleccionarTipoDeCalculo implements Task {

    private final PoolQuery obj = new PoolQuery();
    private int posicion;
    private DatosAfiliado datosAfiliado;
    private String datos;

    public SeleccionarTipoDeCalculo(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
        posicion=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONTINUAR_FORM_DATOS_BASICOS),
                Click.on(BTN_ACEPTAR_INFO_BONO),
                Espera.cantidadDeMiliSegundos(3000),
                Click.on(IngresarEdadDefinidaPage.RBTN_PENSION_VEJEZ),
                Espera.cantidadDeMiliSegundos(4000),
                Click.on(BTN_CALCULAR),
                Espera.cantidadDeMiliSegundos(5000),
                Enter.theValue(obj.list.get(posicion).getEdad()).into(TXT_EDAD_DEFINIDA),
                //Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_EDAD_DEFINIDA),
                Click.on(BTN_REALIZAR_SIMULACION),
                Espera.cantidadDeMiliSegundos(4000)
                );
    }
    public static SeleccionarTipoDeCalculo pensionVejez(List<String> datos){
        return Tasks.instrumented(SeleccionarTipoDeCalculo.class, datos.get(0));
    }
}
