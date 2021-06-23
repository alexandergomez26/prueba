package tasks.RegimenPrimaMedia;

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

public class CambiarFidelidadColpensiones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Mesada Colpensiones Fidelidad 100% : " + MESADA_COLPENSIONES.resolveFor(actor).getTextValue());
        System.out.println("Mesada Colpensiones Fidelidad 75% : " + MESADA_COLPENSIONES_75.resolveFor(actor).getTextValue());
        System.out.println("Mesada Colpensiones Fidelidad 50% : " + MESADA_COLPENSIONES_50.resolveFor(actor).getTextValue());
        System.out.println("Mesada Colpensiones Fidelidad Propia : " + MESADA_COLPENSIONES_10.resolveFor(actor).getTextValue());
        System.out.println("Mesada Colpensiones Fidelidad 0% : " + MESADA_COLPENSIONES_0.resolveFor(actor).getTextValue());


        DatosPension datosPension = new DatosPension(
                MESADA_COLPENSIONES_75.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_COLPENSIONES_75.resolveFor(actor).getTextValue()
        );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);
        Espera.cantidadDeMiliSegundos(5000);

        JSONObject json = new JSONObject();
        json.put("B42", datosPension.getMesadaColpensiones());
        json.put("B15", datosPension.getFidelidadPersonalizadaColpensiones());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Mesada Colpensiones 75%: " + ServiceExcelDrive.getDataCell("D34"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D42"));



        DatosPension datosPension2 = new DatosPension(
                MESADA_COLPENSIONES_50.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_COLPENSIONES_50.resolveFor(actor).getTextValue()
        );

        json.put("B42", datosPension2.getMesadaColpensiones());
        json.put("B15", datosPension2.getFidelidadPersonalizadaColpensiones());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Mesada Colpensiones 50%: " + ServiceExcelDrive.getDataCell("D34"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D42"));



        DatosPension datosPension3 = new DatosPension(
                MESADA_COLPENSIONES_10.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_COLPENSIONES_VARIABLE.resolveFor(actor).getTextValue()
        );

        json.put("B42", datosPension3.getMesadaColpensiones());
        json.put("B15", datosPension3.getFidelidadPersonalizadaColpensiones());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Mesada Colpensiones Propio: " + ServiceExcelDrive.getDataCell("D34"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D42"));


        DatosPension datosPension4 = new DatosPension(
                MESADA_COLPENSIONES_0.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_COLPENSIONES_0.resolveFor(actor).getTextValue()
        );

        json.put("B42", datosPension4.getMesadaColpensiones());
        json.put("B15", datosPension4.getFidelidadPersonalizadaColpensiones());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Mesada Colpensiones 0%: " + ServiceExcelDrive.getDataCell("D34"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D42"));


        DatosPension datosPension5 = new DatosPension(
                MESADA_COLPENSIONES.resolveFor(actor).getTextValue(),
                FIDELIDAD_PERSONALIZADA_COLPENSIONES_100.resolveFor(actor).getTextValue()
        );

        json.put("B42", datosPension5.getMesadaColpensiones());
        json.put("B15", datosPension5.getFidelidadPersonalizadaColpensiones());

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Mesada Colpensiones 100%: " + ServiceExcelDrive.getDataCell("D34"));
        System.out.println("Resultado Final: " + ServiceExcelDrive.getDataCell("D42"));

        //ServiceExcelDrive.setDataCell(json);

    }

    public static CambiarFidelidadColpensiones enElAplicativo(List<String> datos){
        return Tasks.instrumented(CambiarFidelidadColpensiones.class, datos.get(0));
    }
}


