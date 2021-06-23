package tasks.IngresarEdadDefinida;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.ServiceExcelDrive;
import interactions.Espera;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.json.JSONObject;

import java.util.List;

import static userinterfaces.AutorizacionPage.*;

public class CambiarFidelidadEdadDefinidaBeneficiario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Valor Capital Fidelidad 100% : " + VALOR_PENSION.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada 100%: " + MESADA.resolveFor(actor).getTextValue());
        System.out.println("Valor Capital Fidelidad 75% : " + VALOR_PENSION_EDAD_DEFINIDA_75.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada 75%: " + VALOR_MESADA_EDAD_DEFINIDA_75.resolveFor(actor).getTextValue());
        System.out.println("Valor Capital Fidelidad 50% : " + VALOR_PENSION_EDAD_DEFINIDA_50.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada 50%: " + VALOR_MESADA_EDAD_DEFINIDA_50.resolveFor(actor).getTextValue());
        System.out.println("Valor Capital Fidelidad " + FIDELIDAD_PERSONALIZADA.resolveFor(actor).getTextValue() + "% :" + VALOR_PENSION_EDAD_DEFINIDA_10.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada " + FIDELIDAD_PERSONALIZADA.resolveFor(actor).getTextValue() + "% :" + VALOR_MESADA_EDAD_DEFINIDA_10.resolveFor(actor).getTextValue());
        System.out.println("Valor Capital Fidelidad 0% : " + VALOR_PENSION_EDAD_DEFINIDA_0.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada 0%: " + VALOR_MESADA_EDAD_DEFINIDA_0.resolveFor(actor).getTextValue());
        System.out.println();

        DatosPension datosPension = new DatosPension(
                VALOR_PENSION_EDAD_DEFINIDA_75.resolveFor(actor).getTextValue(),
                VALOR_MESADA_EDAD_DEFINIDA_75.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_75.resolveFor(actor).getTextValue()
        );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);
        Espera.cantidadDeMiliSegundos(5000);

        JSONObject json = new JSONObject();
        json.put("E2", datosPension.getValorPensionNumero());
        json.put("B39", datosPension.getMesada());
        json.put("B15", datosPension.getFidelidadPersonalizada2());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador 75%: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador 75%: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));
        System.out.println();

        DatosPension datosPension2 = new DatosPension(
                VALOR_PENSION_EDAD_DEFINIDA_50.resolveFor(actor).getTextValue(),
                VALOR_MESADA_EDAD_DEFINIDA_50.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_50.resolveFor(actor).getTextValue()
        );

        json.put("E2", datosPension2.getValorPensionNumero());
        json.put("B39", datosPension2.getMesada());
        json.put("B15", datosPension2.getFidelidadPersonalizada2());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador 50%: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador 50%: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));
        System.out.println();

        DatosPension datosPension3 = new DatosPension(
                VALOR_PENSION_EDAD_DEFINIDA_10.resolveFor(actor).getTextValue(),
                VALOR_MESADA_EDAD_DEFINIDA_10.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA.resolveFor(actor).getTextValue()
        );

        json.put("E2", datosPension3.getValorPensionNumero());
        json.put("B39", datosPension3.getMesada());
        json.put("B15", datosPension3.getFidelidadPersonalizada2());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador Personalizado: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador Personalizado: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));
        System.out.println();

        DatosPension datosPension4 = new DatosPension(
                VALOR_PENSION_EDAD_DEFINIDA_0.resolveFor(actor).getTextValue(),
                VALOR_MESADA_EDAD_DEFINIDA_0.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_0.resolveFor(actor).getTextValue()
        );

        json.put("E2", datosPension4.getValorPensionNumero());
        json.put("B39", datosPension4.getMesada());
        json.put("B15", datosPension4.getFidelidadPersonalizada2());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador 0%: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador 0%: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));
        System.out.println();

        DatosPension datosPension5 = new DatosPension(
                VALOR_PENSION.resolveFor(actor).getTextValue(),
                MESADA.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_100.resolveFor(actor).getTextValue()
        );

        json.put("E2", datosPension5.getValorPensionNumero());
        json.put("B39", datosPension5.getMesada());
        json.put("B15", datosPension5.getFidelidadPersonalizada2());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador 100%: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador 100%: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));
        System.out.println();
    }

    public static CambiarFidelidadEdadDefinidaBeneficiario enElAplicativo(List<String> datos){
        return Tasks.instrumented(CambiarFidelidadEdadDefinidaBeneficiario.class, datos.get(0));
    }
}

