package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.IniciarSesionPage.VALIDACION_INFORMACION_RELACIONADA_POSTULACION;

public class InformacionRelacionadaPostulacion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VALIDACION_INFORMACION_RELACIONADA_POSTULACION).viewedBy(actor).asString();
    }

    public static InformacionRelacionadaPostulacion is() {
        return new InformacionRelacionadaPostulacion();
    }

}