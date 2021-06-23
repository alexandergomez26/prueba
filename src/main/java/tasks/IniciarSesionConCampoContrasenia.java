package tasks;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import interactions.Espera;
import models.DatosInicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.IniciarSesionPage;

import java.util.List;

import static models.entity.DatosInicioSesionEntity.getDatosInicioSesion;
import static models.entity.DatosInicioSesionEntity.setDatosInicioSesion;

public class IniciarSesionConCampoContrasenia implements Task {
    private DatosInicioSesion datosInicioSesion;
    private String datos4;
    public IniciarSesionConCampoContrasenia(String datos4) {
        this.datos4 = datos4;
        int pos=Integer.parseInt(datos4);
        datosInicioSesion = CreateModels.setDatosInicioSesion(pos, ConstantesGenerales.DATA_TO_TEST_LOGIN);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosInicioSesion.getCorreo()).into(IniciarSesionPage.TXT_CORREO),
                Click.on(IniciarSesionPage.BTN_SIGUIENTE),
                Espera.cantidadDeMiliSegundos(3000),
                Click.on(IniciarSesionPage.BTN_INICIAR_SESION));
    }
    public static IniciarSesionConCampoContrasenia vacio(List<String> datos4){
        return Tasks.instrumented(IniciarSesionConCampoContrasenia.class, datos4.get(1));
    }
}
