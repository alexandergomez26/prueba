package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatosAfiliadosPage extends PageObject {

    public static final Target LBL_TIPO_DOCUMENTO = Target.the("Label selección tipo de documento")
            .located(By.id("selectComponent"));

    public static final Target OPT_CC = Target.the("Opción Cédula de ciudadanía")
            .located(By.id("CC"));

    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Caja de texto para ingresar número de documento")
            .located(By.id("ClientForm--form-container-item-document-1"));

    public static final Target BTN_CONTINUAR = Target.the("Botón de continuar para ingresar datos afiliado")
            .located(By.id("BtnClientForm"));

    public static final Target TXT_TEXTO_DATOS_BASICOS = Target.the("Texto para validar redirección a la vista datos básicos")
            .located(By.className("BasicDataForm__title"));
}
