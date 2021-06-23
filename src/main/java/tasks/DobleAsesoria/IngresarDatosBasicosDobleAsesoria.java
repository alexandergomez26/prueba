package tasks.DobleAsesoria;

import Utils.exceldata.CreateModels;
import Utils.exceldata.WriteExcel;
import interactions.AceptarBono;
import interactions.Espera;
import interactions.SeleccionarCliente;
import interactions.SeleccionarTodosLos;
import models.DatosAfiliado;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import userinterfaces.IngresarEdadDefinidaPage;
import userinterfaces.SeleccionarUrlPage;
import java.util.Collections;
import java.util.List;

import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_DATOS_HISTORIA_LABORAL;
import static userinterfaces.SeleccionarUrlPage.ASPEN_DOBLE_ASESORIA;

public class IngresarDatosBasicosDobleAsesoria implements Task {

    private final DatosAfiliado datosAfiliado;

    public IngresarDatosBasicosDobleAsesoria(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavegarEnDobleAsesoria.enElAplicativo(ASPEN_DOBLE_ASESORIA),
                Espera.cantidadDeMiliSegundos(5000),
                SeleccionarCliente.actual(),
                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                Enter.theValue(datosAfiliado.getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR),
                Click.on(BTN_ACEPTAR_DOBLE_ASESORIA),
                Enter.theValue(datosAfiliado.getNumeroAsesoria()).into(TXT_NUMERO_ASESORIA),
                Click.on(TXT_DATOS_HISTORIA_LABORAL),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO_ACTUAL),
                AceptarBono.enElAplicativo(),
                //Click.on(BTN_REALIZAR_SIMULACION_DOBLE_ASESORIA),
                SeleccionarTodosLos.periodos(),
                Espera.cantidadDeMiliSegundos(20000),
                Click.on(PESTANA),
                Click.on(PESTANA2)
        );


        System.out.println("La fecha de nacimiento es: " + FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue());
        System.out.println("Genero: " + GENERO_2.resolveFor(actor).getTextValue());
        System.out.println("Semanas cotizadas: " + SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue());
        System.out.println("Fecha primera solicitud: " + FECHA_PRIMERA_SOLICITUD_2.resolveFor(actor).getTextValue());
        System.out.println("SBC: " + SBC_2.resolveFor(actor).getTextValue());
        System.out.println("Saldo CAI: " + SALDO_CAI_2.resolveFor(actor).getTextValue());

        // WriteExcel.saveCaseIdExcel(datosPension);

        System.out.println("Prueba2: ");

        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(60000)

        );

    }

    public static IngresarDatosBasicosDobleAsesoria enClienteActual(List<String> datos){
        return Tasks.instrumented(IngresarDatosBasicosDobleAsesoria.class, datos.get(0));
    }
}

