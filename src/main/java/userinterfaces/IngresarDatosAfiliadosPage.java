package userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatosAfiliadosPage extends PageObject {
    public static Target LBL_TIPO_DOCUMENTO = Target.the("Label selección tipo de documento")
            .located(By.id("selectComponent"));

    public static Target OPT_CC = Target.the("Opción Cédula de ciudadanía")
            .located(By.id("CC"));

    public static Target TXT_NUMERO_DOCUMENTO = Target.the("Caja de texto para ingresar número de documento")
            .located(By.id("ClientForm--form-container-item-document-1"));

    public static Target BTN_CONTINUAR = Target.the("Botón de continuar para ingresar datos afiliado")
            .located(By.id("BtnClientForm"));

    public static Target TXT_TEXTO_DATOS_BASICOS = Target.the("Texto para validar redirección a la vista datos básicos")
            .located(By.className("BasicDataForm__title"));

    public static Target TXT_VALIDACION_CLIENTE_ACTUAL = Target.the("Texto de validación documento no existente cliente actual")
            .locatedBy("//p[contains(.,'Se presentó un error mientras se ejecutaba una operación. Usuario no encontrado en la base de datos, utilice la opción Cliente Potencial.')]");

    public static Target TXT_DOCUMENTO_VALIDO = Target.the("Texto de la validación documento valido cliente actual")
            .located(By.className("invalid-feedback"));

    public static Target TXT_VALIDACION_CLIENTE_POTENCIAL = Target.the("Texto de validación documento no existente cliente potencial")
            .locatedBy("//p[contains(.,'Se presentó un error mientras se ejecutaba una operación. Usuario encontrado en la base de datos, utilice la opción Cliente Actual.')]");





    public static Target BTN_PROYECTAR_PENSION_EN_COLPENSIONES = Target.the("Botón de proyectar pensión en Colpensiones")
            .located(By.id("BtnRPMPensionCard"));  //RPM

    public static Target TXT_VALIDACION_PENSION_REGIMEN_PRIMA_MEDIA = Target.the("Texto de validación de la pensión en el régimen prima media")
            .locatedBy("//h4[contains(.,'Resultados de pensión en el régimen de prima media')]"); //RPM




    public static Target BTN_ACEPTAR_DOBLE_ASESORIA = Target.the("Boton para aceptar doble asesoria")
            .located(By.id("BtnModalPrimary"));

    public static Target TXT_NUMERO_ASESORIA = Target.the("Caja de texto para ingresar el numero de la asesoria")
            .located(By.id("BasicDataCard--form-container-item-basicData.asesorId"));

    public static Target TXT_SALARIO_ACTUAL = Target.the("Caja de texto para ingresar el numero de la asesoria")
            .located(By.id("BasicDataCard--form-container-item-currentSalary"));


    public static Target BTN_REALIZAR_SIMULACION_DOBLE_ASESORIA = Target.the("Boton para aceptar doble asesoria")
            .located(By.id("BtnGenerateReport"));





}
