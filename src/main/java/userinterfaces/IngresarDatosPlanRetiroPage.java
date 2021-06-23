package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatosPlanRetiroPage {

    public static Target BTN_PLAN_RETIRO = Target.the("Botón de plan de retiro")
            .located(By.id("BtnRetirementPlanCard"));

    public static Target TXT_EDAD_RETIRO = Target.the("Caja de texto para ingresar la edad de retiro")
            .located(By.id("ageInput"));

    public static Target TXT_VALOR_APORTE_INICIAL = Target.the("Caja de texto para ingresar el valor del aporte inicial")
            .located(By.id("initialValueInput"));

    public static Target TXT_FECHA_APORTE_INICIAL = Target.the("Campo fecha del aporte inicial")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/article[1]/div[1]/div[1]/div[1]/button[1]/*[1]"));

    public static Target OPCT_DIA2 = Target.the("Opción dia")
            .located(By.cssSelector(".CalendarMonthGrid_month__horizontal:nth-child(2) tr:nth-child(3) > .CalendarDay:nth-child(4)"));

    public static Target TXT_VALOR_ESPERADO_PENSION = Target.the("Caja de texto para ingresar el valor esperado de pensión")
            .located(By.id("expectedPensionInput"));

    public static Target TXT_VALOR_DEL_APORTE = Target.the("Caja de texto para ingresar el valor esperado de pensión")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/input[1]"));

    public static Target TXT_FECHA_INICIO_AHORRO = Target.the("Campo fecha de de inicio del ahorro")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/article[1]/div[1]/div[1]/div[1]/button[1]/*[1]"));

    public static Target OPCT_AÑO_NACIMIENTO2 = Target.the("Opción año nacimiento")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='1960']");

    public static Target BTN_CALCULAR_= Target.the("Botón calcular IBL")
            .located(By.id("BtnRetirementPlanCard"));

    public static Target TXT_VALOR_APORTE= Target.the("caja de texto para ingresar valor de aporte inicial")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/input[1]"));

    public static Target TXT_FECHA_DE_APORTE_INICIAL = Target.the("Campo fecha del aporte inicial")
            .located(By.id("datePicker"));


}
