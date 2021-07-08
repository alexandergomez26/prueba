package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.IniciarSesionPage.TXT_CORREO;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.SeleccionarUrlPage;

public class AbrirNavegador implements Task {

    private final SeleccionarUrlPage seleccionarUrlPage;

    public AbrirNavegador(SeleccionarUrlPage seleccionarUrlPage) {
        this.seleccionarUrlPage = seleccionarUrlPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(seleccionarUrlPage.url()),
                WaitUntil.the(TXT_CORREO, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(120).seconds()
        );
    }

    public static AbrirNavegador en(SeleccionarUrlPage seleccionarUrlPage){
        return instrumented (AbrirNavegador.class, seleccionarUrlPage);
    }
}
