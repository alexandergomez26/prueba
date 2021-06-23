package questions.SeleccionRegimenPrimaMedia;

import Utils.exceldata.ServiceExcelDrive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import questions.CompararResultados;
import questions.PlanRetiro.SeVisualizaMensajeEnRetiroProgramado;

import static userinterfaces.IngresarDatosAfiliadosPage.TXT_VALIDACION_PENSION_REGIMEN_PRIMA_MEDIA;

public class VisualizaElTextoRegimenPrimaMedia implements Question<Boolean> {

    String resultadoExcel;

    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println("Ingresó a la Question");

        resultadoExcel = ServiceExcelDrive.getDataCell("D42");

        System.out.println();

        System.out.println("Valor Excel Simulador: " + resultadoExcel);

        return resultadoExcel.equals("true");

    }
    public static VisualizaElTextoRegimenPrimaMedia conPrestacionDefinida( ){
        return new VisualizaElTextoRegimenPrimaMedia();
    }
}

