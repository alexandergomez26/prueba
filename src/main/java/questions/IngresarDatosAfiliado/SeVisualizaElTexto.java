package questions.IngresarDatosAfiliado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IngresarDatosAfiliadosPage.TXT_TEXTO_DATOS_BASICOS;

public class SeVisualizaElTexto implements Question<Boolean> {

    private String texto;

    public SeVisualizaElTexto(String texto) { this.texto = texto; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_TEXTO_DATOS_BASICOS.resolveFor(actor).isPresent()
                && TXT_TEXTO_DATOS_BASICOS.resolveFor(actor).getText().equals(texto);
    }
    public static SeVisualizaElTexto datosBasicos(String texto){ return new SeVisualizaElTexto(texto); }
}
