package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionPage extends PageObject {

    public static Target TXT_CORREO = Target.the("Campo de texto para digitar correo")
            .located(By.id("i0116"));

    public static Target BTN_SIGUIENTE = Target.the("Botón para continuar a ingresar la clave")
            .located(By.id("idSIButton9"));

    public static Target TXT_CONTRASENIA = Target.the("Campo de texto para digitar contraseña")
            .located(By.id("i0118"));

    public static Target BTN_INICIAR_SESION = Target.the("Botón para iniciar sesión")
            .located(By.id("idSIButton9"));

    public static Target BTN_NO_MANTENER_SESION_INICIADA = Target.the("Botón para no mantener la sesión iniciada")
            .located(By.id("idBtn_Back"));

}
