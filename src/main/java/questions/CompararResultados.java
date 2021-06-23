package questions;

import Utils.Valores;
import Utils.exceldata.ReaderExcel;
import Utils.exceldata.ServiceExcelDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import questions.DobleAsesoria.VisualizarResultado;
import userinterfaces.AutorizacionPage;

import java.io.IOException;

import static Utils.Constants.ConstantesGenerales.DATA_TO_TEST_SHEET_2;
import static Utils.Constants.ConstantesGenerales.EXCEL_FILE_PATH_2;
import static userinterfaces.AutorizacionPage.VALOR_PENSION;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_VALIDACION_DOBLE_ASESORIA;

public class CompararResultados implements Question<Boolean> {

    String resultadoExcel;

    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println("Ingresó a la Question");

        resultadoExcel = ServiceExcelDrive.getDataCell("D36");

        System.out.println();

        System.out.println("Valor Excel Simulador: " + resultadoExcel);

        return resultadoExcel.equals("true");

    }
    public static CompararResultados pension( ){
        return new CompararResultados();
    }
}
