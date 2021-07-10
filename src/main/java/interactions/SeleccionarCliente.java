package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.interactions.Actions;
import static userinterfaces.AutorizacionPage.TXT_CLIENTE_ACTUAL;
import static userinterfaces.AutorizacionPage.TXT_TRANSACCIONES;

public class SeleccionarCliente implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(8000),
                Click.on(TXT_TRANSACCIONES));
                new Actions(BrowseTheWeb.as(actor).getDriver()).
                        moveToElement(TXT_TRANSACCIONES.resolveFor(actor)).build().perform();
        actor.attemptsTo(Click.on(TXT_CLIENTE_ACTUAL));
    }

    public static SeleccionarCliente actual(){
        return Tasks.instrumented(SeleccionarCliente.class);
    }
}
