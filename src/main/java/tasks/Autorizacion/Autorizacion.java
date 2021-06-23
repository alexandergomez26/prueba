package tasks.Autorizacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.interactions.Actions;
import static userinterfaces.AutorizacionPage.TXT_TRANSACCIONES;

public class Autorizacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(TXT_TRANSACCIONES));
        new Actions(BrowseTheWeb.as(actor).getDriver()).
                moveToElement(TXT_TRANSACCIONES.resolveFor(actor)).build().perform();
    }

    public static Autorizacion delAplicativo(){

        return Tasks.instrumented(Autorizacion.class);
    }
}
