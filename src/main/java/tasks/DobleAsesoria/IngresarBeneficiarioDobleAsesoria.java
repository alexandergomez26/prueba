package tasks.DobleAsesoria;

import Utils.exceldata.CreateModels;
import interactions.AceptarBono;
import interactions.SeleccionarCliente;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.IngresarEdadDefinidaPage;
import userinterfaces.SeleccionarUrlPage;
import java.util.List;

import static userinterfaces.IngresarDatosAfiliadosPage.*;
import static userinterfaces.IngresarDatosAfiliadosPage.BTN_REALIZAR_SIMULACION_DOBLE_ASESORIA;
import static userinterfaces.IngresarEdadDefinidaPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.OPCT_DIA_NACIMIENTO_BENEFICIARIO;

public class IngresarBeneficiarioDobleAsesoria implements Task {

    private final DatosAfiliado datosAfiliado;

    public IngresarBeneficiarioDobleAsesoria(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavegarEnDobleAsesoria.enElAplicativo(SeleccionarUrlPage.ASPEN_DOBLE_ASESORIA),
                SeleccionarCliente.actual(),
                Click.on(LBL_TIPO_DOCUMENTO),
                Click.on(OPT_CC),
                Enter.theValue(datosAfiliado.getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(BTN_CONTINUAR),
                Click.on(BTN_ACEPTAR_DOBLE_ASESORIA),
                Enter.theValue(datosAfiliado.getNumeroAsesoria()).into(TXT_NUMERO_ASESORIA),
                Click.on(TXT_PARENTESCO_BENEFICIARIO),
                Click.on(OPCT_PARENTESCO_BENEFICIARIO),
                Click.on(TXT_FECHA_NACIMIENTO_BENEFICIARIO),
                Click.on(TXT_ANO_NACIMIENTO_BENEFICIARIO),
                Click.on(OPCT_ANO_NACIMIENTO_BENEFICIARIO),
                Click.on(OPCT_DIA_NACIMIENTO_BENEFICIARIO),
                Click.on(IngresarEdadDefinidaPage.TXT_DATOS_HISTORIA_LABORAL),
                Enter.theValue(datosAfiliado.getSalarioActual()).into(TXT_SALARIO_ACTUAL),
                AceptarBono.enElAplicativo(),
                Click.on(BTN_REALIZAR_SIMULACION_DOBLE_ASESORIA),
                WaitUntil.the(TXT_TEXTO_DATOS_BASICOS, WebElementStateMatchers.isVisible()).
                forNoMoreThan(30).seconds()
        );

    }
    public static IngresarBeneficiarioDobleAsesoria enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarBeneficiarioDobleAsesoria.class, datos.get(0));
    }
}
