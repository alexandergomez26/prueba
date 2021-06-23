package tasks.RegimenPrimaMedia;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import Utils.exceldata.ServiceExcelDrive;
import Utils.exceldata.WriteExcel;
import interactions.Espera;
import interactions.SeleccionarTodosLos;
import models.DatosAfiliado;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONObject;

import java.util.List;

import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.AutorizacionPage.SALDO_CAI_2;
import static userinterfaces.IngresarDatosAfiliadosPage.*;

public class SeleccionarTuPensionRegimenPrimaMedia implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PROYECTAR_PENSION_EN_COLPENSIONES, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Click.on(BTN_PROYECTAR_PENSION_EN_COLPENSIONES),
                SeleccionarTodosLos.periodos(),
                Espera.cantidadDeMiliSegundos(10000)
        );

        System.out.println("La fecha de nacimiento es: " + FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue());
        System.out.println("Genero: " + GENERO_2.resolveFor(actor).getTextValue());
        System.out.println("Semanas cotizadas: " + SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue());
        System.out.println("SBC: " + SBC_2.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada Colpensiones: " + MESADA_COLPENSIONES.resolveFor(actor).getText());
        System.out.println("ibl: " + IBL.resolveFor(actor).getText());
        System.out.println("Edad: " + EDAD_PENSION_COLPENSIONES.resolveFor(actor).getText());


        DatosPension datosPension = new DatosPension(
                FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue(),
                SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue(),
                SBC_2.resolveFor(actor).getTextValue(),
                GENERO_2.resolveFor(actor).getTextValue(),
                EDAD_PENSION_COLPENSIONES.resolveFor(actor).getTextValue(),
                MESADA_COLPENSIONES.resolveFor(actor).getTextValue(),
                IBL.resolveFor(actor).getTextValue()
                );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);

        JSONObject json = new JSONObject();
        json.put("B4", datosPension.getFechaNacimiento());
        json.put("D15", datosPension.getSalarioBasicoNumero());
        json.put("D14", datosPension.getSemanasCotizadasNumero());
        json.put("D4", datosPension.getGenero());
        json.put("B14", datosPension.getEdadNumero());
        json.put("B19", datosPension.getIblNumero());
        json.put("B42", datosPension.getMesadaColpensiones());
        json.put("D16", "0");
        json.put("B19", "0");
        json.put("D8", "");
        json.put("B8", "");
        json.put("D9", "");

        ServiceExcelDrive.setDataCell(json);

    }
    public static SeleccionarTuPensionRegimenPrimaMedia enClienteActual(List<String> datos){
        return Tasks.instrumented(SeleccionarTuPensionRegimenPrimaMedia.class, datos.get(0));
    }
}

