package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.IniciarSesionPage.VALIDACION_ENSAYO;

public class EnsayoQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_ENSAYO).viewedBy(actor).asString();
    }

    public static EnsayoQuestion is() {
        return new EnsayoQuestion();
    }

}
