package questions.DobleAsesoria;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IngresarEdadDefinidaPage.TXT_VALIDACION_DOBLE_ASESORIA;

public class VisualizarResultado implements Question<Boolean> {

    private final String texto;

    public VisualizarResultado(String texto) {
        this.texto = texto; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_VALIDACION_DOBLE_ASESORIA.resolveFor(actor).isPresent()
                && TXT_VALIDACION_DOBLE_ASESORIA.resolveFor(actor).getText().equals(texto);
    }
    public static VisualizarResultado dobleAsesoria(String texto){
        return new VisualizarResultado(texto);}
}
