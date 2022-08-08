package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterfaces.IniciarSesionPage.VALIDACION_PERFIL;

public class PerfilQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_PERFIL).viewedBy(actor).asString();
    }

    public static PerfilQuestion is() {
        return new PerfilQuestion();
    }


}
