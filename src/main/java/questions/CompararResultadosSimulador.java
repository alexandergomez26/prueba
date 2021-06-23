package questions;

import Utils.Valores;
import Utils.exceldata.CreateModels;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static userinterfaces.AutorizacionPage.VALOR_PENSION;

public class CompararResultadosSimulador implements Question<Boolean> {

    private final DatosAfiliado datosAfiliado;
    private String data;

    public CompararResultadosSimulador (String data){
        this.data = data;
        int pos=Integer.parseInt(data);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println("Valores Excel: " + datosAfiliado.getResultadoSimulador());
        System.out.println("Valores Front: " + VALOR_PENSION.resolveFor(actor).getTextValue());

        return (VALOR_PENSION.resolveFor(actor).getTextValue()
                .replace("$","").replace(".","")).
                equals(datosAfiliado.getResultadoSimulador());


      // return Valores.conMargenError(Text.of(VALOR_PENSION).viewedBy(actor).asString());

    }
    public static CompararResultadosSimulador pension(List<String> data){
        return new CompararResultadosSimulador(data.get(0));
    }
}
