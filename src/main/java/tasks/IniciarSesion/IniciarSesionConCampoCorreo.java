package tasks.IniciarSesion;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import interactions.Espera;
import models.DatosInicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.IniciarSesionPage;

import java.util.List;

import static models.entity.DatosInicioSesionEntity.setDatosInicioSesion;

public class IniciarSesionConCampoCorreo implements Task {
    private DatosInicioSesion datosInicioSesion;
    private String datos3;
    public IniciarSesionConCampoCorreo(String datos3) {
        this.datos3 = datos3;
        int pos=Integer.parseInt(datos3);
        datosInicioSesion = CreateModels.setDatosInicioSesion(pos, ConstantesGenerales.DATA_TO_TEST_LOGIN);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(5000),
                Click.on(IniciarSesionPage.BTN_SIGUIENTE));
    }
    public static IniciarSesionConCampoCorreo vacio(List<String> datos3){
        return Tasks.instrumented(IniciarSesionConCampoCorreo.class, datos3.get(1));
    }
}
