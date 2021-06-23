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
            .located(By.name("passwd"));
    public static Target BTN_INICIAR_SESION = Target.the("Botón para iniciar sesión")
            .located(By.id("idSIButton9"));
    public static Target TXT_BIENVENIDOS = Target.the("Texto para validar que se inició sesión")
            .locatedBy("//h1[@class='Home__title']");
    public static Target TXT_MANTENER_SESION_INICIADA = Target.the("Elemento para mentener la sesión iniciada")
            .locatedBy("//div[text()='¿Quiere mantener la sesi\u00F3n iniciada?']");
    public static Target BTN_NO_MANTENER_SESION_INICIADA = Target.the("Botón para no mantener la sesión iniciada")
            .located(By.id("idBtn_Back"));
    public static Target TXT_MENSAJE_CORREO_ERRADO = Target.the("Texto de validación correo errado")
            .located(By.id("usernameError"));
    public static Target TXT_MENSAJE_CONTRASENIA_ERRADA = Target.the("Texto de validación contraseña errada")
            .located(By.id("passwordError"));
    public static Target TXT_MENSAJE_CORREO_VACIO = Target.the("Texto de validación correo vacio")
            .located(By.id("usernameError"));
    public static Target TXT_MENSAJE_CONTRASENIA_VACIA = Target.the("Texto de validación contraseña vacia")
            .located(By.id("passwordError"));
}
