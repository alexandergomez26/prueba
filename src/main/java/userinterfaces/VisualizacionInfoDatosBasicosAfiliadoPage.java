package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VisualizacionInfoDatosBasicosAfiliadoPage extends PageObject {

    public static Target TXT_TIPO_DOCUMENTO = Target.the("Label tipo documento")
            .locatedBy("//label[text()='Tipo documento']");

    public static Target TXT_NUMERO_DOCUMENTO = Target.the("Label numero documento")
            .locatedBy("//label[text()='Número documento']");

    public static Target TXT_NOMBRE = Target.the("Label nombre")
            .locatedBy("//label[text()='Nombre']");

    public static Target TXT_FECHA_NACIMIENTO = Target.the("Label fecha nacimiento")
            .locatedBy("//label[text()='Fecha de nacimiento']");

    public static Target TXT_GENERO = Target.the("Label género")
            .locatedBy("//label[text()='Género']");

    public static Target TXT_PARENTESCO_BENEFICIARIO1 = Target.the("Label Parentesco Beneficiario 1")
            .locatedBy("//label[text()='Parentesco Beneficiario 1']");

    public static Target TXT_BENEFICIARIO1_TIENE_DISCAPACIDAD = Target.the("Label beneficiario 1 tiene discapacidad")
            .locatedBy("//label[text()='¿El beneficiario 1 presenta alguna discapacidad?']");

    public static Target TXT_GENERO_BENEFICIARIO1 = Target.the("Label género beneficiario 1")
            .locatedBy("//label[text()='Género del beneficiario 1']");

    public static Target TXT_FECHA_NACIMIENTO_BENEFICIARIO1 = Target.the("Label fecha de nacomiento beneficiario 1")
            .locatedBy("//label[text()='Fecha de Nacimiento del beneficiario 1']");

    public static Target TXT_EDAD_BENEFICIARIO1 = Target.the("Label edad beneficiario 1")
            .locatedBy("//label[text()='Edad beneficiario 1']");

    public static Target TXT_PARENTESCO_BENEFICIARIO2 = Target.the("TXT_PARENTESCO_BENEFICIARIO 2")
            .locatedBy("//label[text()='Parentesco Beneficiario 2']");

    public static Target TXT_BENEFICIARIO2_TIENE_DISCAPACIDAD = Target.the("Label beneficiario 2 tiene discapacidad")
            .locatedBy("//label[text()='¿El beneficiario 2 presenta alguna discapacidad?']");

    public static Target TXT_GENERO_BENEFICIARIO2 = Target.the("Label género beneficiario 2")
            .locatedBy("//label[text()='Género del beneficiario 2']");

    public static Target TXT_FECHA_NACIMIENTO_BENEFICIARIO2 = Target.the("Label fecha de nacomiento beneficiario 2")
            .locatedBy("//label[text()='Fecha de Nacimiento del beneficiario 2']");

    public static Target TXT_EDAD_BENEFICIARIO2 = Target.the("Label edad beneficiario 2")
            .locatedBy("//label[text()='Edad beneficiario 2']");
}
