package tasks.IngresarEdadDefinida;

import interactions.AceptarBono;
import interactions.SeleccionarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresarDatos implements Task {

    private final String datos;

    public IngresarDatos(String datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        String html2 = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElement(By.cssSelector("html")).getAttribute("innerHTML");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(html2);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        actor.attemptsTo(
                SeleccionarCliente.actual(),
                interactions.IngresarDatos.cliente(Collections.singletonList(datos)),
                AceptarBono.enElAplicativo()
        );

    }
    public static IngresarDatos enClienteActual(List<String> datos){
        return Tasks.instrumented(IngresarDatos.class, datos.get(0));
    }
}
