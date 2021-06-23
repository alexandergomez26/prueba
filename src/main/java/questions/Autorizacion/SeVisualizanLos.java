package questions.Autorizacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.AutorizacionPage.*;

public class SeVisualizanLos implements Question<Boolean> {

    private String texto1;
    private String texto2;
    private String texto3;
    private String texto4;
    private String texto5;

    public SeVisualizanLos(String texto1, String texto2, String texto3, String texto4, String texto5) {
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.texto4 = texto4;
        this.texto5 = texto5;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_PROYECCIONES_PENSIONALES.resolveFor(actor).isPresent()
                && TXT_PROYECCIONES_PENSIONALES.resolveFor(actor).getText().equals(texto1)
                && TXT_CLIENTE_ACTUAL.resolveFor(actor).isPresent()
                && TXT_CLIENTE_ACTUAL.resolveFor(actor).getText().equals(texto2)
                && TXT_CLIENTE_POTENCIAL.resolveFor(actor).isPresent()
                && TXT_CLIENTE_POTENCIAL.resolveFor(actor).getText().equals(texto3)
                && TXT_CALCULOS_MASIVOS.resolveFor(actor).isPresent()
                && TXT_CALCULOS_MASIVOS.resolveFor(actor).getText().equals(texto4)
                && TXT_ADMINISTRADOR_DEL_SISTEMA.resolveFor(actor).isPresent()
                && TXT_ADMINISTRADOR_DEL_SISTEMA.resolveFor(actor).getText().equals(texto5);
    }

    public static SeVisualizanLos SiguientesTextos(String texto1, String texto2, String texto3, String texto4, String texto5){
        return new SeVisualizanLos( texto1,  texto2,  texto3,  texto4,  texto5); }
}
