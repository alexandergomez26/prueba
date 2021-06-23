package tasks.SeleccionTipoDeCalculoAsesoriaPensional;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.ServiceExcelDrive;
import interactions.Espera;
import interactions.SeleccionarTodosLos;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.json.JSONObject;
import java.util.List;
import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.SeleccionTipoDeCalculoAsesoriaPensionalPage.BTN_ASESORIA_PENSIONAL;

public class SeleccionarTipoDeCalculoAsesoria implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_ASESORIA_PENSIONAL),
                Click.on(BTN_ASESORIA_PENSIONAL),
                Espera.cantidadDeMiliSegundos(7000),
                SeleccionarTodosLos.periodos(),
                WaitUntil.the(PESTANA, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(240).seconds(),
                Click.on(PESTANA2)
                );

        System.out.println("La fecha de nacimiento es: " + FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue());
        System.out.println("Genero: " + GENERO_2.resolveFor(actor).getTextValue());
        System.out.println("Semanas cotizadas: " + SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue());
        System.out.println("Fecha primera solicitud: " + FECHA_PRIMERA_SOLICITUD_2.resolveFor(actor).getTextValue());
        System.out.println("SBC: " + SBC_2.resolveFor(actor).getTextValue());
        System.out.println("Saldo CAI: " + SALDO_CAI_2.resolveFor(actor).getTextValue());
        System.out.println("Valor Pension: " + VALOR_PENSION_ASESORIA_PENSIONAL.resolveFor(actor).getText());
        System.out.println("Valor de la Mesada: " + VALOR_MESADA_ASESORIA_PENSIONAL.resolveFor(actor).getText());
        System.out.println("Edad pension: " + EDAD_PENSION_ASESORIA_PENSIONAL.resolveFor(actor).getText());
        System.out.println("Fecha de Cuenta Individual: " + FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getTextValue());



        DatosPension datosPension = new DatosPension(
                1,
                FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue(),
                SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue(),
                SALDO_CAI_2.resolveFor(actor).getTextValue(),
                SBC_2.resolveFor(actor).getTextValue(),
                FECHA_PRIMERA_SOLICITUD_2.resolveFor(actor).getTextValue(),
                GENERO_2.resolveFor(actor).getTextValue(),
                EDAD_PENSION_ASESORIA_PENSIONAL.resolveFor(actor).getTextValue(),
                VALOR_PENSION_ASESORIA_PENSIONAL.resolveFor(actor).getTextValue(),
                VALOR_MESADA_ASESORIA_PENSIONAL.resolveFor(actor).getTextValue(),
                FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getTextValue()

        );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);

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
        json.put("D8", "");
        json.put("B8", "");
        json.put("D9", "");


        ServiceExcelDrive.setDataCell(json);

        System.out.println("Valor Pension Json: " + ServiceExcelDrive.getDataCell("D36"));
    }
    public static SeleccionarTipoDeCalculoAsesoria pensional(List<String> datos){
        return Tasks.instrumented(SeleccionarTipoDeCalculoAsesoria.class, datos.get(0));
    }
}
