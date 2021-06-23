package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionTipoDeCalculoAsesoriaPensionalPage extends PageObject {

    public static Target BTN_ASESORIA_PENSIONAL= Target.the("Botón de asesoria pensional")
            .located(By.id("BtnPensionAdvisingCard"));

    public static Target TXT_PROYECCION_PENSION_RETIRO_PROGRAMADO= Target.the("Texto para validar la seleccion tipo de asesoria pensional")
            .located(By.className("h1-regular-fc-medium"));

    public static Target TXT_PROYECCION_REGIMEN_AHORRO_INDIVIDUAL= Target.the("Texto para validar la seleccion tipo de asesoria pensional")
            .located(By.xpath("//h4[contains(text(),'Resultados de pensión en el régimen de ahorro indi')]"));

    public static Target TXT_PROYECCION_REGIMEN_AHORRO_INDIVIDUAL_REGIMEN_PRIMA= Target.the("Texto para validar la seleccion tipo de asesoria pensional")
            .located(By.xpath("//h4[contains(text(),'Resultados de pensión en el régimen de ahorro indi')]"));

    public static Target TXT_PROYECCION_PENSION_EN_RETIRO_PROGRAMADO= Target.the("Texto para validar la seleccion pensión en retiro programado")
            .located(By.xpath("//h4[contains(text(),'Resultados Plan de Retiro')]"));
}
