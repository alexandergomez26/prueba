package questions.IniciarSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IniciarSesionPage.TXT_MENSAJE_CONTRASENIA_VACIA;

public class SeVisualizaElSiguienteMensaje implements Question<Boolean> {

    private String texto4;
    public SeVisualizaElSiguienteMensaje(String texto4) { this.texto4 = texto4; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_MENSAJE_CONTRASENIA_VACIA.resolveFor(actor).isPresent()
                && TXT_MENSAJE_CONTRASENIA_VACIA.resolveFor(actor).getText().equals(texto4);
    }
    public static SeVisualizaElSiguienteMensaje deContraseniaVacia(String texto4){
        return new SeVisualizaElSiguienteMensaje(texto4);
    }
}
