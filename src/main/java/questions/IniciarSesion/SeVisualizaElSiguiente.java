package questions.IniciarSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IniciarSesionPage.TXT_MENSAJE_CORREO_VACIO;

public class SeVisualizaElSiguiente implements Question<Boolean> {

    private String texto3;

    public SeVisualizaElSiguiente(String texto3) { this.texto3 = texto3; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_MENSAJE_CORREO_VACIO.resolveFor(actor).isPresent()
                && TXT_MENSAJE_CORREO_VACIO.resolveFor(actor).getText().equals(texto3) ;
    }

    public static SeVisualizaElSiguiente mensajeDeCorreoVacio(String texto3){
        return new SeVisualizaElSiguiente(texto3);
    }
}
