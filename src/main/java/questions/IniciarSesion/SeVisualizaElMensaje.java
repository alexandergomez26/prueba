package questions.IniciarSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IniciarSesionPage.TXT_MENSAJE_CONTRASENIA_ERRADA;
public class SeVisualizaElMensaje implements Question<Boolean> {
    private String texto2;
    public SeVisualizaElMensaje(String texto2) {
        this.texto2 = texto2;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_MENSAJE_CONTRASENIA_ERRADA.resolveFor(actor).isPresent()
                && TXT_MENSAJE_CONTRASENIA_ERRADA.resolveFor(actor).getText().equals(texto2) ;
    }
    public static SeVisualizaElMensaje deContraseniaErrada(String texto2) {
        return new SeVisualizaElMensaje(texto2);
    }
}
