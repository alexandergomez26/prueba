package questions.SeleccionTipoDeCalculoPensionVejez;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.SeleccionTipoDeCalculoPensionVejezPage.TXT_RETIRO_PROGRAMADO_A_EDAD_DEFINIDA;


public class VisualizaElTextoCalculo implements Question<Boolean> {

    private String texto;
    public VisualizaElTextoCalculo(String texto) {
        this.texto = texto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_RETIRO_PROGRAMADO_A_EDAD_DEFINIDA.resolveFor(actor).isPresent()
                && TXT_RETIRO_PROGRAMADO_A_EDAD_DEFINIDA.resolveFor(actor).getText().equals(texto);
    }
    public static VisualizaElTextoCalculo pensionAnticipada(String texto) {
        return new VisualizaElTextoCalculo(texto);
    }
}
