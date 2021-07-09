package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutorizacionPage extends PageObject {

    public static Target TXT_TRANSACCIONES = Target.the("Menú transacciones")
            .located(By.xpath("//*[@id=\"menu__section-1\"]"));

    public static Target TXT_CLIENTE_ACTUAL = Target.the("texto cliente actual")
            .located(By.id("md-list-0__item-0"));

    public static Target TXT_CLIENTE_POTENCIAL = Target.the("texto cliente potencial")
            .locatedBy("//a[text()='Cliente Potencial']");

    public static Target FECHA = Target.the("")
            .locatedBy("//h4[contains(text(),'Datos básicos')]");

    public static Target VALOR_PENSION_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[2]"));

    public static Target VALOR_MESADA_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[5]"));

    public static Target VALOR_BONO_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("//label[contains(text(),'Valor del Bono act')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target BONO_A_PARTIR_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("//label[contains(text(),'Valor del Bono actualizado')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target MESADA_CON_BENEFICIARIO = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[11]"));

    public static Target VALOR_PENSION_A_PARTIR = Target.the("")
            .located(By.xpath("//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span"));

    public static Target VALOR_MESADA_A_PARTIR = Target.the("")
            .located(By.xpath("//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span"));

    public static Target PESTANA = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[6]"));

    public static Target PESTANA2 = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[5]"));

    public static Target PESTANA5 = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[3]"));

    public static Target FECHA_NACIMIENTO_2 = Target.the("")
            .located(By.xpath("(//label[@class='body-regular-fc-medium body-regular-fc-primary d-block'])[4]"));

    public static Target PARENTESCO_BENEFICIARIO = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[2]"));

    public static Target FECHA_NACIMIENTO_BENEFICIARIO = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[3]"));

    public static Target GENERO_BENEFICIARIO = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[4]"));

    public static Target SEMANAS_TOTALES_COTIZADAS_2 = Target.the("")
            .located(By.xpath("(//label[@class='body-regular-fc-medium body-regular-fc-primary d-block'])[8]"));

    public static Target SALDO_CAI_2= Target.the("")
            .located(By.xpath("//label[contains(text(),'Valor Cuenta Individual')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target SBC_2 = Target.the("")
            .located(By.xpath("//label[contains(text(),'Salario Actual')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target FECHA_PRIMERA_SOLICITUD_2 = Target.the("")
            .located(By.xpath("//label[contains(text(),'Fecha de primera cotización')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target GENERO_2 = Target.the("")
            .located(By.xpath("(//label[@class='body-regular-fc-medium body-regular-fc-primary d-block'])[7]"));

    public static Target VALOR_PENSION_A_PARTIR_EDAD_DEFINIDA_75 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span)[2]"));

    public static Target VALOR_MESADA_A_PARTIR_EDAD_DEFINIDA_75 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span)[2]"));

    public static Target VALOR_PENSION_A_PARTIR_EDAD_DEFINIDA_50 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span)[3]"));

    public static Target VALOR_MESADA_A_PARTIR_EDAD_DEFINIDA_50 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span)[3]"));

    public static Target VALOR_PENSION_A_PARTIR_EDAD_DEFINIDA_12 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span)[4]"));

    public static Target VALOR_MESADA_A_PARTIR_EDAD_DEFINIDA_12 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span)[4]"));

    public static Target VALOR_PENSION_A_PARTIR_EDAD_DEFINIDA_0 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span)[5]"));

    public static Target VALOR_MESADA_A_PARTIR_EDAD_DEFINIDA_0 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span)[5]"));

    public static Target FIDELIDAD_PERSONALIZADA_A_PARTIR_UNA_EDAD_100 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[1]"));

    public static Target FIDELIDAD_PERSONALIZADA_A_PARTIR_UNA_EDAD_75 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[2]"));

    public static Target FIDELIDAD_PERSONALIZADA_A_PARTIR_UNA_EDAD_50 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[3]"));

    public static Target FIDELIDAD_PERSONALIZADA_A_PARTIR_UNA_EDAD_0 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[5]"));

    public static Target FIDELIDAD_PROPIA_A_PARTIR_UNA_EDAD = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[4]"));

    public static Target FECHA_CUENTA_INDIVIDUAL = Target.the("")
            .located(By.xpath("//*[@id=\"IndividualAccount--intern-card\"]/div/div[2]/section/div[2]/label[2]"));

    public static Target VALOR_APORTES_RPM_NO_BONO = Target.the("")
            .located(By.xpath("//*[@id=\"IndividualAccount--intern-card\"]/div/div[2]/section/div[5]/label[2]"));
}
