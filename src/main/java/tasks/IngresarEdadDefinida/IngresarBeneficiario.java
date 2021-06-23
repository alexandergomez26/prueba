package tasks.IngresarEdadDefinida;

import Utils.exceldata.WriteExcel;
import interactions.AceptarBono;
import interactions.IngresarDatos;
import interactions.SeleccionarCliente;
import models.DatosBeneficiario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import static userinterfaces.AutorizacionPage.FECHA;
import static userinterfaces.IngresarEdadDefinidaPage.*;
import java.util.Collections;
import java.util.List;



public class IngresarBeneficiario implements Task {

    private final String datos;

    public IngresarBeneficiario(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCliente.actual(),
                IngresarDatos.cliente(Collections.singletonList(datos)),
                Scroll.to(FECHA),
                Click.on(TXT_PARENTESCO_BENEFICIARIO),
                Click.on(OPCT_PARENTESCO_BENEFICIARIO),
                Click.on(OPCT_GENERO_BENEFICIARIO),
                Click.on(TXT_FECHA_NACIMIENTO_BENEFICIARIO),
                Click.on(TXT_ANO_NACIMIENTO_BENEFICIARIO),
                Click.on(OPCT_ANO_NACIMIENTO_BENEFICIARIO),
                Click.on(OPCT_MES_NACIMIENTO_BENEFICIARIO),
                Click.on(OPCT_DIA_NACIMIENTO_BENEFICIARIO),
                AceptarBono.enElAplicativo()
        );
/*
        DatosBeneficiario datosBeneficiario = new DatosBeneficiario("29/05/1990", "Conyuge", "M");
        try {
            WriteExcel.saveBeneficiario(datosBeneficiario);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }

*/

    }
    public static IngresarBeneficiario enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarBeneficiario.class, datos.get(0));
    }
}
