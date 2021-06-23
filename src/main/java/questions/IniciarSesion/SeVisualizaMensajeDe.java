package questions.IniciarSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IniciarSesionPage.TXT_MENSAJE_CORREO_ERRADO;

public class SeVisualizaMensajeDe implements Question<Boolean> {
    private String texto1;
    public SeVisualizaMensajeDe(String texto1) {
        this.texto1 = texto1;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_MENSAJE_CORREO_ERRADO.resolveFor(actor).isPresent()
                && (TXT_MENSAJE_CORREO_ERRADO.resolveFor(actor).getText().equals(texto1));
    }
    public static SeVisualizaMensajeDe deCorreoErrado(String texto1) {
        return new SeVisualizaMensajeDe(texto1);
    }
}
