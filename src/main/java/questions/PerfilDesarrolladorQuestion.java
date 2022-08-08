package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.IniciarSesionPage.VALIDACION_DESARROLLADOR_FULLSTACK;

public class PerfilDesarrolladorQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_DESARROLLADOR_FULLSTACK).viewedBy(actor).asString();
    }

    public static PerfilDesarrolladorQuestion is() {
        return new PerfilDesarrolladorQuestion();
    }

}