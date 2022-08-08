package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.IniciarSesionPage.VALIDACION_TEST_GRIT;

public class TestGritQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_TEST_GRIT).viewedBy(actor).asString();
    }

    public static TestGritQuestion is() {
        return new TestGritQuestion();
    }


}

