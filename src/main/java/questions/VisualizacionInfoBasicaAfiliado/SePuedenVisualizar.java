package questions.VisualizacionInfoBasicaAfiliado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.VisualizacionInfoDatosBasicosAfiliadoPage;

import static userinterfaces.VisualizacionInfoDatosBasicosAfiliadoPage.*;

public class SePuedenVisualizar implements Question<Boolean> {

    private String texto1;
    private String texto2;
    private String texto3;
    private String texto4;
    private String texto5;

    public SePuedenVisualizar(String texto1, String texto2, String texto3, String texto4, String texto5) {
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.texto4 = texto4;
        this.texto5 = texto5;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_TIPO_DOCUMENTO.resolveFor(actor).isPresent()
                && TXT_TIPO_DOCUMENTO.resolveFor(actor).getText().equals(texto1)
                && TXT_NUMERO_DOCUMENTO.resolveFor(actor).isPresent()
                && TXT_NUMERO_DOCUMENTO.resolveFor(actor).getText().equals(texto2)
                && TXT_NOMBRE.resolveFor(actor).isPresent()
                && TXT_NOMBRE.resolveFor(actor).getText().equals(texto3)
                && TXT_FECHA_NACIMIENTO.resolveFor(actor).isPresent()
                && TXT_FECHA_NACIMIENTO.resolveFor(actor).getText().equals(texto4)
                && TXT_GENERO.resolveFor(actor).isPresent()
                && TXT_GENERO.resolveFor(actor).getText().equals(texto5);
    }

    public static SePuedenVisualizar losCampos(String texto1, String texto2, String texto3, String texto4, String texto5){
        return new SePuedenVisualizar( texto1,  texto2,  texto3,  texto4,  texto5); }
}
