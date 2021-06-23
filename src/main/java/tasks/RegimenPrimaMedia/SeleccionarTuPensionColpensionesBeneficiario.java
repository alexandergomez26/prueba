package tasks.RegimenPrimaMedia;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import Utils.exceldata.ServiceExcelDrive;
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
import org.json.JSONObject;

import java.util.List;

import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.AutorizacionPage.GENERO_BENEFICIARIO;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_PROYECTAR_PENSION_EN_COLPENSIONES;

public class SeleccionarTuPensionColpensionesBeneficiario implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PROYECTAR_PENSION_EN_COLPENSIONES, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Click.on(BTN_PROYECTAR_PENSION_EN_COLPENSIONES),
                SeleccionarTodosLos.periodos(),
                WaitUntil.the(PESTANA5, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(300).seconds(),
                 Click.on(PESTANA5)
        );

        System.out.println("La fecha de nacimiento es: " + FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue());
        System.out.println("Genero: " + GENERO_2.resolveFor(actor).getTextValue());
        System.out.println("Semanas cotizadas: " + SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue());
        System.out.println("SBC: " + SBC_2.resolveFor(actor).getTextValue());
        System.out.println("Valor de la Mesada Colpensiones: " + MESADA_COLPENSIONES.resolveFor(actor).getText());
        System.out.println("Parentesco Beneficiario: " + PARENTESCO_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("Fecha Nacimiento Beneficiario: " + FECHA_NACIMIENTO_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("Genero Beneficiario.: " + GENERO_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("ibl: " + IBL_COLPENSIONES.resolveFor(actor).getText());
        System.out.println("Edad: " + EDAD_PENSION_COLPENSIONES.resolveFor(actor).getText());


        DatosPension datosPension = new DatosPension(
                FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue(),
                SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue(),
                SBC_2.resolveFor(actor).getTextValue(),
                GENERO_2.resolveFor(actor).getTextValue(),
                EDAD_PENSION_COLPENSIONES.resolveFor(actor).getText(),
                MESADA_COLPENSIONES.resolveFor(actor).getTextValue(),
                PARENTESCO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                FECHA_NACIMIENTO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                GENERO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                IBL_COLPENSIONES.resolveFor(actor).getTextValue(),
                1
                );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON_BENEFICIARIO);

        JSONObject json = new JSONObject();
        json.put("B4", datosPension.getFechaNacimiento());
        json.put("D15", datosPension.getSalarioBasicoNumero());
        json.put("D4", datosPension.getGenero());
        json.put("B14", datosPension.getEdadNumero());
        json.put("D14", datosPension.getSemanasCotizadasNumero());
        json.put("B42", datosPension.getMesadaColpensiones());
        json.put("B8", datosPension.getFechaNacimientoBeneficiario());
        json.put("D8", datosPension.getGeneroBeneficiario());
        json.put("D9", datosPension.getParentescoBeneficiario());
        json.put("B19", datosPension.getIblNumero());
        json.put("D16", "0");



        ServiceExcelDrive.setDataCell(json);

    }
    public static SeleccionarTuPensionColpensionesBeneficiario enClienteActual(List<String> datos){
        return Tasks.instrumented(SeleccionarTuPensionColpensionesBeneficiario.class, datos.get(0));
    }
}


