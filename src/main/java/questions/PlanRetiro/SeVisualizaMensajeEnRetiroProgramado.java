package questions.PlanRetiro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import questions.SeleccionTipoDeCalculoAsesoriaPensional.VisualizaElTextoProyeccionPension;

import static userinterfaces.SeleccionTipoDeCalculoAsesoriaPensionalPage.TXT_PROYECCION_PENSION_EN_RETIRO_PROGRAMADO;

public class SeVisualizaMensajeEnRetiroProgramado implements Question<Boolean> {

    private String texto;
    public SeVisualizaMensajeEnRetiroProgramado(String texto) {
        this.texto = texto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_PROYECCION_PENSION_EN_RETIRO_PROGRAMADO.resolveFor(actor).isPresent()
                && TXT_PROYECCION_PENSION_EN_RETIRO_PROGRAMADO.resolveFor(actor).getText().equals(texto);
    }
    public static SeVisualizaMensajeEnRetiroProgramado retiroProgramado(String texto) {
        return new SeVisualizaMensajeEnRetiroProgramado(texto);
    }
}
