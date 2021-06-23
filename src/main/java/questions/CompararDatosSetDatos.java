package questions;

import Utils.Valores;
import Utils.exceldata.CreateModels;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static userinterfaces.AutorizacionPage.VALOR_PENSION;

public class CompararDatosSetDatos implements Question<Boolean> {

    private final DatosAfiliado datosAfiliado;
    private String data;

    public CompararDatosSetDatos (String data){
        this.data = data;
        int pos=Integer.parseInt(data);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println("Valor Datos Excel: " + datosAfiliado.getResultadoSimulador());
        System.out.println("Valor Datos Front: " + VALOR_PENSION.resolveFor(actor).getTextValue());

         return Valores.conMargenError(Text.of(VALOR_PENSION).viewedBy(actor).asString());

    }
    public static CompararDatosSetDatos pension(List<String> data){
        return new CompararDatosSetDatos(data.get(0));
    }
}

