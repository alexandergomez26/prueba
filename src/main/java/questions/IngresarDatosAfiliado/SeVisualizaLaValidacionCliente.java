package questions.IngresarDatosAfiliado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.IngresarDatosAfiliadosPage;

import static userinterfaces.IngresarDatosAfiliadosPage.TXT_VALIDACION_CLIENTE_POTENCIAL;

public class SeVisualizaLaValidacionCliente implements Question<Boolean> {

    private String texto;

    public SeVisualizaLaValidacionCliente(String texto) { this.texto = texto; }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_VALIDACION_CLIENTE_POTENCIAL.resolveFor(actor).isPresent()
                && TXT_VALIDACION_CLIENTE_POTENCIAL.resolveFor(actor).getText().equals(texto) ;
    }
    public static SeVisualizaLaValidacionCliente potencial(String texto){ return new SeVisualizaLaValidacionCliente(texto); }
}
