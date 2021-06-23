package tasks.IniciarSesion;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
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

public class IniciarSesionConCorreo implements Task {

    private DatosInicioSesion datosInicioSesion;
    private String datos1;
    private String error = "error";
    private int num = 5555;

    public IniciarSesionConCorreo(String datos1) {
        this.datos1 = datos1;
        int pos=Integer.parseInt(datos1);
        datosInicioSesion = CreateModels.setDatosInicioSesion(pos, ConstantesGenerales.DATA_TO_TEST_LOGIN);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("num").into(IniciarSesionPage.TXT_CORREO),
                Click.on(IniciarSesionPage.BTN_SIGUIENTE));
    }

    public static IniciarSesionConCorreo errado(List<String> datos1){
        return Tasks.instrumented(IniciarSesionConCorreo.class, datos1.get(1));
    }
}
