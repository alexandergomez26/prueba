package questions.DobleAsesoria;

import Utils.Valores;
import Utils.ValoresDobleAsesoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import questions.CompararResultados;

import static userinterfaces.AutorizacionPage.VALOR_PENSION;

public class CompararResultadosDobleAsesoria implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("Valor Question: " + VALOR_PENSION.resolveFor(actor).getText());

        return ValoresDobleAsesoria.conMargenError(Text.of(VALOR_PENSION).viewedBy(actor).asString());

    }
    public static CompararResultadosDobleAsesoria pension( ){
        return new CompararResultadosDobleAsesoria();}
}