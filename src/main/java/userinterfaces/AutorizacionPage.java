package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutorizacionPage extends PageObject {

    public static Target TXT_TRANSACCIONES = Target.the("Menú transacciones")
            .located(By.id("menu__section-1"));

    public static Target TXT_CLIENTE_ACTUAL = Target.the("texto cliente actual")
            .located(By.id("md-list-0__item-0"));

    public static Target TXT_CLIENTE_POTENCIAL = Target.the("texto cliente potencial")
            .locatedBy("//a[text()='Cliente Potencial']");

    public static Target FECHA = Target.the("")
            .locatedBy("//h4[contains(text(),'Datos básicos')]");

    public static Target VALOR_PENSION_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("valor pension")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[2]"));

    public static Target VALOR_MESADA_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("valor mesada")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[5]"));

    public static Target VALOR_BONO_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("valor bono")
            .located(By.xpath("//label[contains(text(),'Valor del Bono act')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target BONO_A_PARTIR_EDAD_DEFINIDA = Target.the("bono")
            .located(By.xpath("//label[contains(text(),'Valor del Bono actualizado')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target MESADA_CON_BENEFICIARIO = Target.the("mesada")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[11]"));

    public static Target VALOR_PENSION_A_PARTIR = Target.the("pension")
            .located(By.xpath("//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span"));

    public static Target VALOR_MESADA_A_PARTIR = Target.the("valor mesada")
            .located(By.xpath("//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span"));

    public static Target TARJETA_CUENTA_INDIVIDUAL = Target.the("tarjeta expandible de cuenta individual")
            .located(By.id("card-title-icon-chevron-individualAccount"));

    public static Target TARJETA_BENEFICIARIO = Target.the("tarjeta expandible beneficiario")
            .located(By.id("card-title-icon-chevron-beneficiares"));

    public static Target FECHA_NACIMIENTO = Target.the("fecha nacimiento")
            .located(By.xpath("(//label[@class='body-regular-fc-medium body-regular-fc-primary d-block'])[4]"));

    public static Target PARENTESCO_BENEFICIARIO = Target.the("parentesco beneficiario")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[2]"));

    public static Target FECHA_NACIMIENTO_BENEFICIARIO = Target.the("fecha de nacimiento beneficiario")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[3]"));

    public static Target GENERO_BENEFICIARIO = Target.the("genero del beneficiario")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[4]"));

    public static Target SEMANAS_TOTALES_COTIZADAS = Target.the("semanas totales cotizadas")
            .located(By.xpath("(//label[@class='body-regular-fc-medium body-regular-fc-primary d-block'])[8]"));

    public static Target SALDO_CAI= Target.the("saldo cai")
            .located(By.xpath("//label[contains(text(),'Valor Cuenta Individual')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target SBC = Target.the("salario basico de cotizacion")
            .located(By.xpath("//label[contains(text(),'Salario Actual')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target FECHA_PRIMERA_SOLICITUD = Target.the("fecha de primera solicitud")
            .located(By.xpath("//label[contains(text(),'Fecha de primera cotización')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target GENERO = Target.the("genero")
            .located(By.xpath("(//label[@class='body-regular-fc-medium body-regular-fc-primary d-block'])[7]"));

    public static Target VALOR_PENSION_A_PARTIR_EDAD_DEFINIDA_75 = Target.the("valor pension")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span)[2]"));

    public static Target VALOR_MESADA_A_PARTIR_EDAD_DEFINIDA_75 = Target.the("valor mesada")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span)[2]"));

    public static Target VALOR_PENSION_A_PARTIR_EDAD_DEFINIDA_50 = Target.the("valor pension")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span)[3]"));

    public static Target VALOR_MESADA_A_PARTIR_EDAD_DEFINIDA_50 = Target.the("valor mesada")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span)[3]"));

    public static Target VALOR_PENSION_A_PARTIR_EDAD_DEFINIDA_12 = Target.the("valor pension")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span)[4]"));

    public static Target VALOR_MESADA_A_PARTIR_EDAD_DEFINIDA_12 = Target.the("valor mesada")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span)[4]"));

    public static Target VALOR_PENSION_A_PARTIR_EDAD_DEFINIDA_0 = Target.the("valor pension")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span)[5]"));

    public static Target VALOR_MESADA_A_PARTIR_EDAD_DEFINIDA_0 = Target.the("valor mesada")
            .located(By.xpath("(//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span)[5]"));

    public static Target FIDELIDAD_PERSONALIZADA_A_PARTIR_UNA_EDAD_100 = Target.the("fidelidad")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[1]"));

    public static Target FIDELIDAD_PERSONALIZADA_A_PARTIR_UNA_EDAD_75 = Target.the("fidelidad")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[2]"));

    public static Target FIDELIDAD_PERSONALIZADA_A_PARTIR_UNA_EDAD_50 = Target.the("fidelidad")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[3]"));

    public static Target FIDELIDAD_PERSONALIZADA_A_PARTIR_UNA_EDAD_0 = Target.the("fidelidad")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[5]"));

    public static Target FIDELIDAD_PROPIA_A_PARTIR_UNA_EDAD = Target.the("fidelidad")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[4]"));

    public static Target FECHA_CUENTA_INDIVIDUAL = Target.the("fecha de cuenta individual")
            .located(By.id("individualAccountDate"));

    public static Target VALOR_APORTES_RPM_NO_BONO = Target.the("valor de aportes RPM no bono")
            .located(By.xpath("//*[@id=\"AnticipatedPensionFromDefinedAge\"]/div/div/section/div/div[4]/div/div[2]/section/div[5]/label[2]"));
}
