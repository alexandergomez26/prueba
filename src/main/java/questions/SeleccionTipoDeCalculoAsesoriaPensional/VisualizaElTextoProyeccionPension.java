package questions.SeleccionTipoDeCalculoAsesoriaPensional;

import Utils.exceldata.ServiceExcelDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import questions.CompararResultados;
import questions.SeleccionTipoDeCalculoPensionVejez.VisualizaElTextoCalculo;

import static userinterfaces.SeleccionTipoDeCalculoAsesoriaPensionalPage.TXT_PROYECCION_PENSION_RETIRO_PROGRAMADO;
import static userinterfaces.SeleccionTipoDeCalculoAsesoriaPensionalPage.TXT_PROYECCION_REGIMEN_AHORRO_INDIVIDUAL_REGIMEN_PRIMA;

public class VisualizaElTextoProyeccionPension implements Question<Boolean> {

    String resultadoExcel;

    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println("Ingresó a la Question");

        resultadoExcel = ServiceExcelDrive.getDataCell("D45");

        System.out.println();

        System.out.println("Valor Excel Simulador: " + resultadoExcel);

        return resultadoExcel.equals("true");

    }
    public static VisualizaElTextoProyeccionPension retiroProgramado( ){
        return new VisualizaElTextoProyeccionPension();
    }
}
