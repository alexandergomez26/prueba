package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.IniciarSesionPage.VALIDACION_CERRAR_SESION;

public class CerrarSesionQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_CERRAR_SESION).viewedBy(actor).asString();
    }

    public static CerrarSesionQuestion is() {
        return new CerrarSesionQuestion();
    }


}