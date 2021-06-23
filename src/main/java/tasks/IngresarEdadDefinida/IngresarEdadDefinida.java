package tasks.IngresarEdadDefinida;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import Utils.exceldata.ServiceExcelDrive;
import interactions.Espera;
import models.DatosAfiliado;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.json.JSONObject;
import java.util.List;
import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.*;

public class IngresarEdadDefinida implements Task {

    private final DatosAfiliado datosAfiliado;

    public IngresarEdadDefinida(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(5000),
                WaitUntil.the(RBTN_PENSION_VEJEZ, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Espera.cantidadDeMiliSegundos(3000),
                 Click.on(RBTN_PENSION_VEJEZ),
                WaitUntil.the(CHECK_SELECCIONADO, WebElementStateMatchers.isVisible()).
                forNoMoreThan(20).seconds(),
                Click.on(BTN_CALCULAR),
                WaitUntil.the(TXT_EDAD_DEFINIDA, WebElementStateMatchers.isVisible()).
                                forNoMoreThan(20).seconds(),
                Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_EDAD_DEFINIDA),
                Click.on(BTN_REALIZAR_SIMULACION),
                WaitUntil.the(PESTANA, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(300).seconds(),
                Click.on(PESTANA),
                Click.on(PESTANA2),
                Click.on(PESTANA4)
                );

        System.out.println("La fecha de nacimiento es: " + FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue());
        System.out.println("Genero: " + GENERO_2.resolveFor(actor).getTextValue());
        System.out.println("Semanas cotizadas: " + SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue());
        System.out.println("Fecha primera solicitud: " + FECHA_PRIMERA_SOLICITUD_2.resolveFor(actor).getTextValue());
        System.out.println("SBC: " + SBC_2.resolveFor(actor).getTextValue());
        System.out.println("Saldo CAI: " + SALDO_CAI_2.resolveFor(actor).getTextValue());
        System.out.println("Edad: " + datosAfiliado.getEdadDefinida());
        System.out.println("Valor Pension: " + VALOR_PENSION.resolveFor(actor).getText());
        System.out.println("Valor de la Mesada: " + MESADA.resolveFor(actor).getText());
        System.out.println("Fecha de Cuenta Individual: " + FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getTextValue());

        DatosPension datosPension = new DatosPension(
                1,
                FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue(),
                SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue(),
                SALDO_CAI_2.resolveFor(actor).getTextValue(),
                SBC_2.resolveFor(actor).getTextValue(),
                FECHA_PRIMERA_SOLICITUD_2.resolveFor(actor).getTextValue(),
                GENERO_2.resolveFor(actor).getTextValue(),
                datosAfiliado.getEdadDefinida(),
                VALOR_PENSION.resolveFor(actor).getTextValue(),
                MESADA.resolveFor(actor).getTextValue(),
                FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getTextValue()
        );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);
        Espera.cantidadDeMiliSegundos(5000);

        JSONObject json = new JSONObject();
        json.put("B4", datosPension.getFechaNacimiento());
        json.put("B16", datosPension.getSaldoCaiNumero());
        json.put("D15", datosPension.getSalarioBasicoNumero());
        json.put("B18", datosPension.getFechaPrimeraSolicitud());
        json.put("D4", datosPension.getGenero());
        json.put("B14", datosPension.getEdadNumero());
        json.put("D14", datosPension.getSemanasCotizadasNumero());
        json.put("E2", datosPension.getValorPensionNumero());
        json.put("B39", datosPension.getMesada());
        json.put("D25", datosPension.getFechaCuentaIndividual());
        json.put("D16", "0");
        json.put("B19", "0");
        json.put("B8", "");
        json.put("D8", "");
        json.put("D9", "");

        System.out.println("Jasonnnnn: " + json);
        ServiceExcelDrive.setDataCell(json);
    }

    public static IngresarEdadDefinida paraLaProyeccion(List<String>datos){
        return Tasks.instrumented(IngresarEdadDefinida.class, datos.get(0));
    }
}
