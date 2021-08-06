package questions;

import utils.exceldata.ServiceExcelDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CompararResultados implements Question<Boolean> {

    private static final Logger logger = Logger.getLogger("co.com.viliv.interactions.Wait");

    String resultadoExcel;

    @Override
    public Boolean answeredBy(Actor actor) {

        logger.log(Level.INFO, "Ingresó a la Question");

        resultadoExcel = ServiceExcelDrive.getDataCell("F47");

        return resultadoExcel.equals("true");
    }
    public static CompararResultados pension( ){
        return new CompararResultados();
    }
}
