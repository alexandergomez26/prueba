package questions;

import Utils.exceldata.ServiceExcelDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CompararResultados implements Question<Boolean> {

    String resultadoExcel;

    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println("Ingresó a la Question");

        resultadoExcel = ServiceExcelDrive.getDataCell("F47");


        System.out.println("Valor Excel Simulador: " + resultadoExcel);

        return resultadoExcel.equals("true");

    }
    public static CompararResultados pension( ){
        return new CompararResultados();
    }
}
