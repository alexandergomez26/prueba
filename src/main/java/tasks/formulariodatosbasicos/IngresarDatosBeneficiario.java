package tasks.formulariodatosbasicos;


import interactions.AceptarBono;
import interactions.IngresarBeneficiario;
import interactions.IngresarDatosBasicosClientePotencial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import java.util.Collections;
import java.util.List;

public class IngresarDatosBeneficiario implements Task {


    private final String datos;

    public IngresarDatosBeneficiario(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarBeneficiario.enElAplicativo(),
                IngresarDatosBasicosClientePotencial.enElAplicativo(Collections.singletonList(datos)),
                AceptarBono.enElAplicativo()

        );

    }
    public static IngresarDatosBeneficiario enClientePotencial(List<String> datos){
        return Tasks.instrumented(IngresarDatosBeneficiario.class, datos.get(0));
    }
}

