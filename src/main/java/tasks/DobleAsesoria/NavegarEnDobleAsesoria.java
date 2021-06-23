package tasks.DobleAsesoria;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.SeleccionarUrlPage;

public class NavegarEnDobleAsesoria implements Task {

    private final SeleccionarUrlPage seleccionarUrlPage;

    public NavegarEnDobleAsesoria(SeleccionarUrlPage seleccionarUrlPage) {
        this.seleccionarUrlPage = seleccionarUrlPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(seleccionarUrlPage.url())
        );

    }


    public static NavegarEnDobleAsesoria enElAplicativo(SeleccionarUrlPage seleccionarUrlPage) {
        return Tasks.instrumented(NavegarEnDobleAsesoria.class, seleccionarUrlPage);
    }
}