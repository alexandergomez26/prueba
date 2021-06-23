package questions.IniciarSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IniciarSesionPage.TXT_BIENVENIDOS;

public class SeVisualiza implements Question<Boolean> {

    private String texto;
    public SeVisualiza(String texto) {
        this.texto = texto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {


        return TXT_BIENVENIDOS.resolveFor(actor).isPresent()
                && (TXT_BIENVENIDOS.resolveFor(actor).getText()).equals(texto);
    }


    public static SeVisualiza elTexto(String texto) {
        return new SeVisualiza(texto);
    }
}
