package questions.VisualizacionInfoBasicaAfiliado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.VisualizacionInfoDatosBasicosAfiliadoPage.*;

public class VisualizaLosCamposDelSegundo implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_PARENTESCO_BENEFICIARIO2.resolveFor(actor).isPresent()
                && TXT_BENEFICIARIO2_TIENE_DISCAPACIDAD.resolveFor(actor).isPresent()
                && TXT_GENERO_BENEFICIARIO2.resolveFor(actor).isPresent()
                && TXT_FECHA_NACIMIENTO_BENEFICIARIO2.resolveFor(actor).isPresent()
                && TXT_EDAD_BENEFICIARIO2.resolveFor(actor).isPresent();
    }
    public static VisualizaLosCamposDelSegundo beneficiario() {
        return new VisualizaLosCamposDelSegundo();
    }
}
