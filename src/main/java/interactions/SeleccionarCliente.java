package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.AutorizacionPage.TXT_CLIENTE_ACTUAL;
import static userinterfaces.AutorizacionPage.TXT_TRANSACCIONES;

public class SeleccionarCliente implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
/*
        BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String html = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElement(By.cssSelector("html")).getAttribute("innerHTML");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(html);
        System.out.println("----------------------------------------------------------------------------------------------------------");

*/
        actor.attemptsTo(
                Click.on(TXT_TRANSACCIONES));
                new Actions(BrowseTheWeb.as(actor).getDriver()).
                        moveToElement(TXT_TRANSACCIONES.resolveFor(actor)).build().perform();
        actor.attemptsTo(Click.on(TXT_CLIENTE_ACTUAL));
    }

    public static SeleccionarCliente actual(){
        return Tasks.instrumented(SeleccionarCliente.class);
    }
}
