package questions.VisualizacionInfoBasicaAfiliado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.VisualizacionInfoDatosBasicosAfiliadoPage.*;

public class VisualizaLosCamposDel implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_PARENTESCO_BENEFICIARIO1.resolveFor(actor).isPresent()
                && TXT_BENEFICIARIO1_TIENE_DISCAPACIDAD.resolveFor(actor).isPresent()
                && TXT_GENERO_BENEFICIARIO1.resolveFor(actor).isPresent()
                && TXT_FECHA_NACIMIENTO_BENEFICIARIO1.resolveFor(actor).isPresent()
                && TXT_EDAD_BENEFICIARIO1.resolveFor(actor).isPresent();
    }

    public static VisualizaLosCamposDel primerBeneficiario() {
        return new VisualizaLosCamposDel();
    }
}
