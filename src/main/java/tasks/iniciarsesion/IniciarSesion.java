package tasks.iniciarsesion;

import interactions.Espera;
import utils.constantes.ConstantesGenerales;
import utils.exceldata.CreateModels;
import models.DatosInicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static userinterfaces.IniciarSesionPage.*;

public class IniciarSesion implements Task {

    private final DatosInicioSesion datosInicioSesion;

    public IniciarSesion(int datos) {

        datosInicioSesion = CreateModels.setDatosInicioSesion(datos, ConstantesGenerales.DATA_TO_TEST_LOGIN);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.theValue(datosInicioSesion.getCorreo()).into(TXT_CORREO),
                    Enter.theValue(datosInicioSesion.getContrasenia()).into(TXT_CONTRASENIA),
                    Click.on(BTN_ENTRAR),
                    Espera.cantidadDeMiliSegundos(5000)
                );
    }

    public static IniciarSesion enElAplicativo(int datos){
        return Tasks.instrumented(IniciarSesion.class, datos);
    }
}
