package questions.IngresarEdadDefinida;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import questions.IngresarDatosAfiliado.SeVisualizaLaValidacion;
import userinterfaces.IngresarEdadDefinidaPage;

import static userinterfaces.IngresarEdadDefinidaPage.TXT_PROYECCION_A_PARTIR_EDAD_DEFINIDA;
import static userinterfaces.IngresarEdadDefinidaPage.TXT_PROYECCION_EDAD_DEFINIDA;

public class PuedeVisualizarLaProyeccion implements Question<Boolean> {

    private String texto;

    public PuedeVisualizarLaProyeccion(String texto) {
        this.texto = texto; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_PROYECCION_A_PARTIR_EDAD_DEFINIDA.resolveFor(actor).isPresent()
                && TXT_PROYECCION_A_PARTIR_EDAD_DEFINIDA.resolveFor(actor).getText().equals(texto);
    }
    public static PuedeVisualizarLaProyeccion aEdadDefinida(String texto){
        return new PuedeVisualizarLaProyeccion(texto);}
}
