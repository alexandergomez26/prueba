package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.*;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.OPCT_DIA_NACIMIENTO_BENEFICIARIO;

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

