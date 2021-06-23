package interactions;

import Utils.exceldata.CreateModels;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import static userinterfaces.IngresarDatosPlanRetiroPage.*;

public class IngresarLosDatosPlanRetiro implements Interaction {



    private final DatosAfiliado datosAfiliado;

    public IngresarLosDatosPlanRetiro(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_EDAD_RETIRO),
                Enter.theValue(datosAfiliado.getValorCuentaIndividual()).into(TXT_VALOR_APORTE_INICIAL),
                Click.on(TXT_FECHA_APORTE_INICIAL),
                Click.on(OPCT_DIA2)
                );

    }
    public static IngresarLosDatosPlanRetiro enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarLosDatosPlanRetiro.class, datos.get(0));
    }
}
