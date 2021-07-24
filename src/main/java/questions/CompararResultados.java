package questions;

import utils.exceldata.ServiceExcelDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CompararResultados implements Question<Boolean> {

    String resultadoExcel;

    @Override
    public Boolean answeredBy(Actor actor) {

        resultadoExcel = ServiceExcelDrive.getDataCell("F47");

        return resultadoExcel.equals("true");
    }
    public static CompararResultados pension( ){
        return new CompararResultados();
    }
}
