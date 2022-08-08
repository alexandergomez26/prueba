package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterfaces.IniciarSesionPage.VALIDACION_NOTIFICACIONES;

public class NotificacionesQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_NOTIFICACIONES).viewedBy(actor).asString();
    }

    public static NotificacionesQuestion is() {
        return new NotificacionesQuestion();
    }


}