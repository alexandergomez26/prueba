package tasks.IniciarSesion;

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
import static userinterfaces.IniciarSesionPage.TXT_CONTRASENIA;

public class IniciarSesionConContrasenia implements Task {
    private DatosInicioSesion datosInicioSesion;
    private String datos2;
    public IniciarSesionConContrasenia(String datos2) {
        this.datos2 = datos2;
        int pos=Integer.parseInt(datos2);
        datosInicioSesion = CreateModels.setDatosInicioSesion(pos, ConstantesGenerales.DATA_TO_TEST_LOGIN);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(datosInicioSesion.getCorreo()).into(IniciarSesionPage.TXT_CORREO),
                Click.on(IniciarSesionPage.BTN_SIGUIENTE),
                Espera.cantidadDeMiliSegundos(3000),
                Enter.theValue(datosInicioSesion.getContrasenia()).into(TXT_CONTRASENIA),
                Click.on(IniciarSesionPage.BTN_INICIAR_SESION));
    }
    public static IniciarSesionConContrasenia Errada(List<String> datos2){
        return Tasks.instrumented(IniciarSesionConContrasenia.class, datos2.get(1));
    }
}
