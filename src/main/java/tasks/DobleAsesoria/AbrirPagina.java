package tasks.DobleAsesoria;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import userinterfaces.SeleccionarUrlPage;

public class AbrirPagina implements Task {

    private SeleccionarUrlPage seleccionarUrlPage;

    public AbrirPagina(SeleccionarUrlPage seleccionarUrlPage) {
        this.seleccionarUrlPage = seleccionarUrlPage;
    }

    @Override
    @Step("{0} Abrir el navegador")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(seleccionarUrlPage.url())
        );

    }

    public static AbrirPagina en(SeleccionarUrlPage seleccionarUrlPage){
        return Tasks.instrumented(AbrirPagina.class, seleccionarUrlPage);
    }
}
