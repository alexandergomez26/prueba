package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.IniciarSesionPage.VALIDACION_AYUDA;

public class AyudaQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_AYUDA).viewedBy(actor).asString();
    }

    public static AyudaQuestion is() {
        return new AyudaQuestion();
    }


}
