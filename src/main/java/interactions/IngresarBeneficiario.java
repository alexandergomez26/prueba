package interactions;

import Utils.exceldata.CreateModels;
import integrations.PoolQueryProteccion;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static userinterfaces.FormularioDatosBasicoPage.*;
import static userinterfaces.FormularioDatosBasicoPage.TXT_VALOR_CUENTA_INDIVIDUAL;
import static userinterfaces.IngresarEdadDefinidaPage.*;
import static userinterfaces.IngresarEdadDefinidaPage.OPCT_DIA_NACIMIENTO_BENEFICIARIO;

public class IngresarBeneficiario implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_PARENTESCO_BENEFICIARIO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(20).seconds(),
                Click.on(TXT_PARENTESCO_BENEFICIARIO),
                Click.on(OPCT_PARENTESCO_BENEFICIARIO),
                Click.on(TXT_FECHA_NACIMIENTO_BENEFICIARIO),
                Click.on(TXT_ANO_NACIMIENTO_BENEFICIARIO),
                Click.on(OPCT_ANO_NACIMIENTO_BENEFICIARIO),
                Click.on(OPCT_MES_NACIMIENTO_BENEFICIARIO),
                Click.on(OPCT_DIA_NACIMIENTO_BENEFICIARIO));

    }
    public static IngresarBeneficiario enElAplicativo(){
        return Tasks.instrumented(IngresarBeneficiario.class);
    }
}

