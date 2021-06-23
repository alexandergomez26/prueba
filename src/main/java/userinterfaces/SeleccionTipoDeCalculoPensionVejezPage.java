package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionTipoDeCalculoPensionVejezPage extends PageObject {

    public static Target RBTN_PENSION_VEJEZ= Target.the("RadioButton para seleccionar la opción pensión vejez")
            .locatedBy("//label[@id='radioButtonProduct']/div");

    public static Target BTN_CALCULAR= Target.the("Botón que dirige a ingresar la edad de pensión")
            .located(By.id("BtnTypePensionCard"));

    public static Target TXT_CALCULO_PENSION_ANTCIPADA= Target.the("Texto para validar la seleccion tipo de calculo pension vejez")
            .located(By.className("h1-regular-fc-medium"));

    public static Target TXT_RETIRO_PROGRAMADO_A_EDAD_DEFINIDA= Target.the("Texto para validar la seleccion tipo de calculo pension vejez")
            .located(By.xpath("//h4[contains(text(),'Resultados de pensión en retiro programado a una edad definida')]"));

    public static Target A_EDAD_DEFINIDA= Target.the("Ingresar edad definida")
            .located(By.className("input-radio-defined-age"));

}
