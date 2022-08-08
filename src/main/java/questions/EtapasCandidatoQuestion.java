package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IniciarSesionPage.*;

public class EtapasCandidatoQuestion implements Question<Boolean> {

        private final String texto1;
        private final String texto2;
        private final String texto3;
        private final String texto4;
        private final String texto5;
        private final String texto6;

public EtapasCandidatoQuestion(String texto1, String texto2,  String texto3,  String texto4,  String texto5,  String texto6) {
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.texto4 = texto4;
        this.texto5 = texto5;
        this.texto6 = texto6;
        }

@Override
public Boolean answeredBy (Actor actor){
            return BTN_HACKERRANK.resolveFor(actor).isPresent() && BTN_HACKERRANK.resolveFor(actor).getText().equals(texto1)
                && BTN_TEST_PSICOMETRICO.resolveFor(actor).isPresent() && BTN_TEST_PSICOMETRICO.resolveFor(actor).getText().equals(texto2)
                && BTN_TEST_GRIT.resolveFor(actor).isPresent() && BTN_TEST_GRIT.resolveFor(actor).getText().equals(texto3)
                && BTN_ENSAYO.resolveFor(actor).isPresent() && BTN_ENSAYO.resolveFor(actor).getText().equals(texto4)
                && BTN_ENTREVISTA_PSICOLOGICA.resolveFor(actor).isPresent() && BTN_ENTREVISTA_PSICOLOGICA.resolveFor(actor).getText().equals(texto5)
                && BTN_ENTREVISTA_TECNICA.resolveFor(actor).isPresent() && BTN_ENTREVISTA_TECNICA.resolveFor(actor).getText().equals(texto6);
        }

public static EtapasCandidatoQuestion enElAplicativo (String texto1, String texto2, String texto3, String texto4, String texto5, String texto6){
        return new EtapasCandidatoQuestion(texto1, texto2, texto3, texto4, texto5, texto6);
        }
}

