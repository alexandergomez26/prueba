package tasks.SeleccionTipoDeCalculoAsesoriaPensional;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.ServiceExcelDrive;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.json.JSONObject;

import java.util.List;

import static userinterfaces.AutorizacionPage.*;

public class CambiarFidelidadAsesoriaPensionalBonos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Valor Capital Fidelidad 100% : " + VALOR_PENSION_ASESORIA_PENSIONAL_100_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada 100%: " + VALOR_MESADA_ASESORIA_PENSIONAL_100_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Capital Fidelidad 75% : " + VALOR_PENSION_ASESORIA_PENSIONAL_75_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada 75%: " + VALOR_MESADA_ASESORIA_PENSIONAL_75_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Capital Fidelidad 50% : " + VALOR_PENSION_ASESORIA_PENSIONAL_50_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada 50%: " + VALOR_MESADA_ASESORIA_PENSIONAL_50_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Capital Personalizada : " + VALOR_PENSION_ASESORIA_PENSIONAL_50_79_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada Personalizada : " + VALOR_MESADA_ASESORIA_PENSIONAL_50_79_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Capital Fidelidad 0% : " + VALOR_PENSION_ASESORIA_PENSIONAL_0_BONOS.resolveFor(actor).getTextValue());
        System.out.println("Valor Mesada 0%: " + VALOR_MESADA_ASESORIA_PENSIONAL_0_BONOS.resolveFor(actor).getTextValue());


        DatosPension datosPension = new DatosPension(
                VALOR_PENSION_ASESORIA_PENSIONAL_75_BONOS.resolveFor(actor).getTextValue(),
                VALOR_MESADA_ASESORIA_PENSIONAL_75_BONOS.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_75.resolveFor(actor).getTextValue(),
                1

        );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);

        JSONObject json = new JSONObject();
        json.put("E2", datosPension.getValorPensionNumero());
        json.put("B39", datosPension.getMesada());
        json.put("B15", datosPension.getFidelidadPropia());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador 75%: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador 75%: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));



        DatosPension datosPension2 = new DatosPension(
                VALOR_PENSION_ASESORIA_PENSIONAL_50_BONOS.resolveFor(actor).getTextValue(),
                VALOR_MESADA_ASESORIA_PENSIONAL_50_BONOS.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_50.resolveFor(actor).getTextValue(),
                1

        );

        json.put("E2", datosPension2.getValorPensionNumero());
        json.put("B39", datosPension2.getMesada());
        json.put("B15", datosPension2.getFidelidadPropia());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador 50%: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador 50%: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));



        DatosPension datosPension3 = new DatosPension(
                VALOR_PENSION_ASESORIA_PENSIONAL_50_79_BONOS.resolveFor(actor).getTextValue(),
                VALOR_MESADA_ASESORIA_PENSIONAL_50_79_BONOS.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_PROPIA.resolveFor(actor).getTextValue(),
                1

        );

        json.put("E2", datosPension3.getValorPensionNumero());
        json.put("B39", datosPension3.getMesada());
        json.put("B15", datosPension3.getFidelidadPropia2());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador Propio: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador Propio: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));


        DatosPension datosPension4 = new DatosPension(
                VALOR_PENSION_ASESORIA_PENSIONAL_0_BONOS.resolveFor(actor).getTextValue(),
                VALOR_MESADA_ASESORIA_PENSIONAL_0_BONOS.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_0.resolveFor(actor).getTextValue(),
                1

        );

        json.put("E2", datosPension4.getValorPensionNumero());
        json.put("B39", datosPension4.getMesada());
        json.put("B15", datosPension4.getFidelidadPropia());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador 0%: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador 0%: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));


        DatosPension datosPension5 = new DatosPension(
                VALOR_PENSION_ASESORIA_PENSIONAL_100_BONOS.resolveFor(actor).getTextValue(),
                VALOR_MESADA_ASESORIA_PENSIONAL_100_BONOS.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_100.resolveFor(actor).getTextValue(),
                1

        );

        json.put("E2", datosPension5.getValorPensionNumero());
        json.put("B39", datosPension5.getMesada());
        json.put("B15", datosPension5.getFidelidadPropia());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Capital Simulador 100%: " + ServiceExcelDrive.getDataCell("B23"));
        System.out.println("Mesada Simulador 100%: " + ServiceExcelDrive.getDataCell("D33"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D36"));

        ServiceExcelDrive.setDataCell(json);

    }

    public static CambiarFidelidadAsesoriaPensionalBonos enElAplicativo(List<String> datos){
        return Tasks.instrumented(CambiarFidelidadAsesoriaPensionalBonos.class, datos.get(0));
    }
}



