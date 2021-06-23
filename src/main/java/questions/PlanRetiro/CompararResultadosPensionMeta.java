package questions.PlanRetiro;

import Utils.exceldata.ServiceExcelDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import questions.CompararResultados;

public class CompararResultadosPensionMeta implements Question<Boolean> {

    String resultadoExcel;

    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println("Ingresó a la Question");

        resultadoExcel = ServiceExcelDrive.getDataCell("D36");

        System.out.println();

        System.out.println("Valor Excel Simulador: " + resultadoExcel);

        return resultadoExcel.equals("true");

    }
    public static CompararResultadosPensionMeta pension( ){
        return new CompararResultadosPensionMeta();
    }
}

