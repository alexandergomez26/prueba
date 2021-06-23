package tasks.DobleAsesoria;

import Utils.exceldata.CreateModels;
import interactions.*;
import models.DatosAfiliado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.SeleccionarUrlPage;
import java.util.Collections;
import java.util.List;
import static userinterfaces.IngresarDatosAfiliadosPage.TXT_NUMERO_ASESORIA;

public class IngresarDatosBasicosClientePotencial implements Task {


    private final DatosAfiliado datosAfiliado;
    private final String datos;

    public IngresarDatosBasicosClientePotencial(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavegarEnDobleAsesoria.enElAplicativo(SeleccionarUrlPage.ASPEN_DOBLE_ASESORIA),
                SeleccionarOpcionCliente.Potencial(),
                IngresarDatosBasicosCliente.potencial(Collections.singletonList(datos)),
                Enter.theValue(datosAfiliado.getNumeroAsesoria()).into(TXT_NUMERO_ASESORIA),
                interactions.IngresarDatosBasicosClientePotencial.enElAplicativo(Collections.singletonList(datos)),
                AceptarBono.enElAplicativo(),
                SeleccionarTodosLos.periodos()
        );

    }
    public static IngresarDatosBasicosClientePotencial enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarDatosBasicosClientePotencial.class, datos.get(0));
    }
}
