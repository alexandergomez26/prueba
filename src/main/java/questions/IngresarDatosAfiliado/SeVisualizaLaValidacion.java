package questions.IngresarDatosAfiliado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IngresarDatosAfiliadosPage.TXT_VALIDACION_CLIENTE_ACTUAL;

public class SeVisualizaLaValidacion implements Question<Boolean> {

    private String texto;

    public SeVisualizaLaValidacion(String texto) { this.texto = texto; }
    @Override
    public Boolean answeredBy(Actor actor) {
        return  TXT_VALIDACION_CLIENTE_ACTUAL.resolveFor(actor).isPresent()
                && TXT_VALIDACION_CLIENTE_ACTUAL.resolveFor(actor).getText().equals(texto);
    }
    public static SeVisualizaLaValidacion clienteActual(String texto){ return new SeVisualizaLaValidacion(texto); }
}
