package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutorizacionPage extends PageObject {
    public static Target TXT_TRANSACCIONES = Target.the("Menú transacciones")
            .located(By.id("menu__section-1"));

    public static Target TXT_PROYECCIONES_PENSIONALES = Target.the("texto proyecciones pensionales")
            .locatedBy("//h6[text()='Proyecciones Pensionales']");

    public static Target TXT_CLIENTE_ACTUAL = Target.the("texto cliente actual")
            .located(By.id("md-list-0__item-0"));

    public static Target TXT_CLIENTE_POTENCIAL = Target.the("texto cliente potencial")
            .locatedBy("//a[text()='Cliente Potencial']");

    public static Target TXT_CALCULOS_MASIVOS = Target.the("texto cálculos masivos")
            .locatedBy("//a[text()='Cálculos Masivos']");

    public static Target TXT_ADMINISTRADOR_DEL_SISTEMA = Target.the("")
            .locatedBy("//a[text()='Administrador del sistema']");

    public static Target FECHA = Target.the("")
            .locatedBy("//h4[contains(text(),'Datos básicos')]");

    public static Target FECHA2 = Target.the("")
            .located(By.id("datePicker"));

    public static Target SEMANA_COTIZADA = Target.the("")
            .located(By.id("BasicDataCard--form-container-item-summaryWeeks-proteccionWeekNumber"));

    public static Target SALDO_CAI = Target.the("")
            .located(By.id("BasicDataCard--form-container-item-contributions-required"));

    public static Target SBC = Target.the("")
            .located(By.id("BasicDataCard--form-container-item-currentSalary"));

    public static Target FECHA_PRIMERA_SOLICITUD = Target.the("")
            .located(By.xpath("(//input[@class='DateInput_input DateInput_input_1 DateInput_input__readOnly DateInput_input__readOnly_2'])[3]"));

    public static Target GENERO = Target.the("")
            .located(By.id("BasicDataCard--form-container-item-Género"));


    public static Target VALOR_PENSION = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[1]/td[5]/span")); ///Se cambioooo

    public static Target VALOR_PENSION_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[2]"));

    public static Target VALOR_MESADA_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[5]"));

    public static Target VALOR_BONO_MODALIDAD2_A_PARTIR_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("//label[contains(text(),'Valor del Bono act')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target VALOR_PENSION_META = Target.the("")
            .located(By.xpath("//label[contains(text(),'Valor de la Cuenta en el')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target VALOR_PENSION_ASESORIA_PENSIONAL = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[2]/span)[1]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL = Target.the("")
            .located(By.xpath("//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[6]/span"));

    public static Target EDAD_PENSION_ASESORIA_PENSIONAL = Target.the("")
            .located(By.xpath("//*[@id=\"ISSPensionAdvisingReport\"]/tbody/tr/td[2]/span"));

    public static Target EDAD_PENSION_ASESORIA_PENSIONAL_BENEFICIARIO = Target.the("")
            .located(By.xpath("//*[@id=\"ISSPensionAdvisingReport\"]/tbody/tr/td[2]/span"));

    public static Target EDAD_PENSION_ASESORIA_PENSIONAL_BONO = Target.the("")
            .located(By.xpath("//*[@id=\"ISSPensionAdvisingReport\"]/tbody/tr/td[2]/span"));

    public static Target EDAD_PENSION_ASESORIA_PENSIONAL_BONOS = Target.the("")
            .located(By.xpath("//*[@id=\"ISSPensionAdvisingReport\"]/tbody/tr/td[2]/span"));

    public static Target EDAD_PENSION_COLPENSIONES = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[1]/td[2]/span"));

    public static Target VALOR_PENSION_CON_BENEFICIARIO = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[10]"));

    public static Target VALOR_PENSION_BONO_MODALIDAD_DOS = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[2]"));

    public static Target VALOR_PENSION_BONO_MODALIDAD_DOS_A_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[50]"));

    public static Target MESADA_MODALIDAD_DOS_A_UNA_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[51]"));

    public static Target MESADA = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[1]/td[6]/span")); // Se cambioooo

    public static Target MESADA_MODALIDAD_DOS = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[5]"));

    public static Target BONO = Target.the("")
            .located(By.xpath("//*[@id=\"IndividualAccount--intern-card\"]/div/div[2]/section/div[5]/label[2]"));

    public static Target BONO_A_PARTIR_EDAD_DEFINIDA = Target.the("")
            .located(By.xpath("//label[contains(text(),'Valor del Bono actualizado')]//following::label[@class='body-regular-fc-medium body-regular-fc-primary d-block']"));

    public static Target MESADA_CON_BENEFICIARIO = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[11]"));

    public static Target MESADA_COLPENSIONES = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[1]/td[3]/span"));


    public static Target VALOR_PENSION_A_PARTIR = Target.the("")
            .located(By.xpath("//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[2]/span"));

    public static Target VALOR_MESADA_A_PARTIR = Target.the("")
            .located(By.xpath("//*[@id=\"ResultTableInterFromAgeDefined\"]/tbody/tr[1]/td[5]/span"));


    public static Target PESTANA = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[6]"));

    public static Target PESTANA2 = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[5]"));

    public static Target PESTANA4 = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[7]"));

    public static Target PESTANA3 = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[4]"));

    public static Target PESTANA5 = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[3]"));

    public static Target PESTANA6 = Target.the("")
            .located(By.xpath("(//div[@class='collapse-title__icon'])[4]"));






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

    public static Target IBL = Target.the("")
            .located(By.xpath("(//span[@class='h6-medium-fc-primary'])[4]"));

    public static Target IBL_COLPENSIONES = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[1]/td[4]/span"));

    public static Target VALOR_PENSION_EDAD_DEFINIDA_75 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[2]/td[5]/span"));

    public static Target VALOR_MESADA_EDAD_DEFINIDA_75 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[2]/td[6]/span"));

    public static Target VALOR_PENSION_EDAD_DEFINIDA_50 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[3]/td[5]/span"));

    public static Target VALOR_MESADA_EDAD_DEFINIDA_50 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[3]/td[6]/span"));

    public static Target VALOR_PENSION_EDAD_DEFINIDA_10 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[4]/td[5]/span"));

    public static Target VALOR_MESADA_EDAD_DEFINIDA_10 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[4]/td[6]/span"));

    public static Target VALOR_PENSION_EDAD_DEFINIDA_0 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[5]/td[5]/span"));

    public static Target VALOR_MESADA_EDAD_DEFINIDA_0 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[5]/td[6]/span"));




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





    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_75 = Target.the("") /////////////////////////
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[2]/span)[2]"));


    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_75 = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[6]/span)[2]"));

    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_50 = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[2]/span)[3]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_50 = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[6]/span)[3]"));

    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_50_79 = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[2]/span)[4]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_50_79 = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[6]/span)[4]"));

    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_0 = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[2]/span)[5]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_0 = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr[1]/td[6]/span)[5]"));

    public static Target FECHA_CUENTA_INDIVIDUAL = Target.the("")
            .located(By.xpath("//*[@id=\"IndividualAccount--intern-card\"]/div/div[2]/section/div[2]/label[2]"));






    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_100_BONOS = Target.the("")  // VALIDAR ELIMINAR
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[2]/span)[1]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_100_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[6]/span)[1]"));

    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_75_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[2]/span)[2]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_75_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[6]/span)[2]"));

    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_50_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[2]/span)[3]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_50_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[6]/span)[3]"));

    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_50_79_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[2]/span)[4]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_50_79_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[6]/span)[4]"));

    public static Target VALOR_PENSION_ASESORIA_PENSIONAL_0_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[2]/span)[5]"));

    public static Target VALOR_MESADA_ASESORIA_PENSIONAL_0_BONOS = Target.the("")
            .located(By.xpath("(//*[@id=\"PensionAdvisingReport\"]/tbody/tr/td[6]/span)[5]"));





    public static Target FIDELIDAD_PERSONALIZADA_100 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[1]/td[1]/span"));

    public static Target FIDELIDAD_PERSONALIZADA_75 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[2]/td[1]/span"));

    public static Target FIDELIDAD_PERSONALIZADA_50 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[3]/td[1]/span"));

    public static Target FIDELIDAD_PERSONALIZADA = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[4]/td[1]/span"));

    public static Target FIDELIDAD_PERSONALIZADA_0 = Target.the("")
            .located(By.xpath("//*[@id=\"ResultsTableInternCard\"]/tbody/tr[5]/td[1]/span"));



    public static Target MESADA_COLPENSIONES_75 = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[2]/td[3]/span"));

    public static Target MESADA_COLPENSIONES_50 = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[3]/td[3]/span"));

    public static Target MESADA_COLPENSIONES_10 = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[4]/td[3]/span"));

    public static Target MESADA_COLPENSIONES_0 = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[5]/td[3]/span"));



    public static Target FIDELIDAD_PERSONALIZADA_COLPENSIONES_100 = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[1]/td[1]/span"));

    public static Target FIDELIDAD_PERSONALIZADA_COLPENSIONES_75 = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[2]/td[1]/span"));

    public static Target FIDELIDAD_PERSONALIZADA_COLPENSIONES_50 = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[3]/td[1]/span"));

    public static Target FIDELIDAD_PERSONALIZADA_COLPENSIONES_VARIABLE = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[4]/td[1]/span"));

    public static Target FIDELIDAD_PERSONALIZADA_COLPENSIONES_0 = Target.the("")
            .located(By.xpath("//*[@id=\"PensionReportDefAge\"]/tbody/tr[5]/td[1]/span"));


    public static Target FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_100 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[1]"));

    public static Target FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_75 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[2]"));

    public static Target FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_50 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[3]"));

    public static Target FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_PROPIA = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[4]"));

    public static Target FIDELIDAD_PERSONALIZADA_ASESORIA_PENSIONAL_0 = Target.the("")
            .located(By.xpath("(//*[@id=\"ResultsTableFromAgeDefined--intern-card\"]/div/div[1]/div[1]/h5)[5]"));







}
