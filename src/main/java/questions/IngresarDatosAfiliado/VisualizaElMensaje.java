package questions.IngresarDatosAfiliado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IngresarDatosAfiliadosPage.TXT_DOCUMENTO_VALIDO;

public class VisualizaElMensaje implements Question<Boolean> {

    private String texto;

    public VisualizaElMensaje(String texto) { this.texto = texto; }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_DOCUMENTO_VALIDO.resolveFor(actor).isPresent()
                && TXT_DOCUMENTO_VALIDO.resolveFor(actor).getText().contains(texto);
    }
    public static VisualizaElMensaje documentoValido(String texto){ return new VisualizaElMensaje(texto); }
}
