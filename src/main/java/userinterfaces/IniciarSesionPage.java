package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionPage extends PageObject {

    public static final Target TXT_CORREO = Target.the("Campo de texto para digitar correo")
            .located(By.id("email"));

    public static final Target BTN_ENTRAR = Target.the("Botón entrar")
            .located(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[2]/form/button"));

    public static final Target TXT_CONTRASENIA = Target.the("Campo de texto para digitar contraseña")
            .located(By.id("password"));

    public static final Target BTN_TEST_GRIT = Target.the("Botón test grit")
            .located(By.xpath("//p[contains(text(),'Test Grit')]"));

    public static final Target BTN_HACKERRANK = Target.the("Botón Hackerrank")
            .located(By.xpath("//p[contains(text(),'Hackerrank')]"));

    public static final Target BTN_TEST_COMPLETO = Target.the("Botón test completo ")
            .located(By.xpath("//button[contains(text(),'¡Ya completé mi test!')]"));

    public static final Target BTN_TEST_PSICOMETRICO = Target.the("Botón test psicometrico")
            .located(By.xpath("//p[contains(text(),'Test psicométrico')]"));

    public static final Target BTN_CONTINUAR = Target.the("Botón continuar")
            .located(By.xpath("//button[contains(text(),'Continuar')]"));

    public static final Target CHECK_ACEPTAR_TERMINOS= Target.the("check aceptar terminos")
            .located(By.id("agreeToTerms"));

    public static final Target SELECT_REGION_RESIDENCIA= Target.the("Select region de residencia ")
            .located(By.xpath("//*[@id=\"country\"]/option[50]"));

    public static final Target BTN_TOMAR_TEST = Target.the("Botón test grit")
            .located(By.xpath("//a[contains(text(),'¡Tomar test!')]"));

    public static final Target BTN_CONTINUAR_TEST = Target.the("Botón test grit")
            .located(By.xpath("//a[contains(text(),'Continuar Test')]"));

    public static final Target INPUT_CORREO_FORMULARIO_CONFIRMACION = Target.the(" input correo formulario confirmacion")
            .located(By.id("labeled-input-1"));

    public static final Target INPUT_CONTRASENIA_FORMULARIO_CONFIRMACION = Target.the(" input contraseña formulario confirmacion")
            .located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("boton login")
            .located(By.xpath("//span[contains(text(),'Login')]"));

    public static final Target BTN_ENSAYO = Target.the("Botón ensayo")
            .located(By.xpath("//p[contains(text(),'Ensayo')]"));

    public static final Target BTN_CARGAR_ENSAYO = Target.the("cargar ensayo")
            .located(By.xpath("//label[contains(text(),'Cargar ensayo')]"));

    public static final Target BTN_ENVIAR = Target.the("boton enviar ")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/section/article/div[3]/button"));

    public static final Target BTN_ENTREVISTA = Target.the("Botón entrevista")
            .located(By.xpath("//label[contains(text(),'Cargar ensayo')]"));

    public static final Target BTN_ENTREVISTA_PSICOLOGICA = Target.the("Botón entrevista psicologica")
            .located(By.xpath("//p[contains(text(),'Entrevista Psicológica')]"));

    public static final Target BTN_ENTREVISTA_TECNICA = Target.the("Botón entrevista tecnica")
            .located(By.xpath("//p[contains(text(),'Entrevista Técnica')]"));

    public static final Target BTN_ESPERAR_PROPUESTA = Target.the("Botón esperar propuesta")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div/div[2]/div/div/div/div[1]/div/div[4]/button/p"));

    public static final Target BTN_VISITA_DOMICILIARIA = Target.the("Botón visita domiciliaria")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div/div[2]/div/div/div/div[1]/div/div[5]/button/p"));

    public static final Target BTN_NOTIFICACION = Target.the("Botón notificacion")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/div/nav/ul/li[2]/a/span"));

    public static final Target BTN_AYUDA = Target.the("Botón ayuda")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/div/nav/ul/li[3]/a/img"));

    public static final Target BTN_PERFIL = Target.the("Botón perfil")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/div/nav/ul/li[4]/a/span"));

    public static final Target DESARROLLADOR_FULL_STACK = Target.the("Botón desarrollador full stack")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div/header/div/p/a"));

    public static final Target BTN_CERRAR_SESION = Target.the("Botón cerrar sesion")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/div/nav/div/div[2]/button"));

    public static final Target VALIDACION_DESARROLLADOR_FULLSTACK= Target.the("validación desarrollador fullstack")
            .located(By.xpath("//*[@id=\"hs_cos_wrapper_name\"]"));

    public static final Target VALIDACION_INFORMACION_RELACIONADA_POSTULACION= Target.the("validación desarrollador fullstack")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div/header/div/p"));

    public static final Target VALIDACION_CERRAR_SESION= Target.the("validación cerrar sesion")
            .located(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[5]/div/h2"));

    public static final Target VALIDACION_AYUDA= Target.the("validación ayuda")
            .located(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[6]/div/h2"));

    public static final Target VALIDACION_ENSAYO= Target.the("validación ensayo")
            .located(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[7]/div/h2"));

    public static final Target VALIDACION_NOTIFICACIONES= Target.the("validación notificaciones")
            .located(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[8]/div/h2"));

    public static final Target VALIDACION_PERFIL= Target.the("validación perfil")
            .located(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[9]/div/h2"));

    public static final Target VALIDACION_TEST_GRIT= Target.the("validación test grit")
            .located(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div[10]/div/h2"));

}
