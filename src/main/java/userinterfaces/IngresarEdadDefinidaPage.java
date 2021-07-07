package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarEdadDefinidaPage extends PageObject {

    public static Target RBTN_PENSION_VEJEZ= Target.the("RadioButton para seleccionar la opción pensión vejez")
            .locatedBy("//label[@id='radioButtonProduct']/span/p");

    public static Target BTN_CALCULAR= Target.the("Botón que dirige a ingresar la edad de pensión")
            .located(By.id("BtnTypePensionCard"));

    public static Target TXT_A_PARTIR_EDAD_DEFINIDA= Target.the("Caja de texto para ingresar la edad definida")
            .located(By.id("input-radio-from-defined-age"));

    public static Target BTN_REALIZAR_SIMULACION= Target.the("Botón para realizar la simulación")
            .located(By.id("BtnEnterAgeSubmit"));

    public static Target CHECK_SELECCIONADO= Target.the("Check seleccionado")
            .locatedBy("(//label[@id='radioButtonProduct'])[1]//span[@class='control--icon']");

    public static Target CHECK_APARTIR_EDAD_DEFINIDA= Target.the("seleccionar a partir de una edad definida")
            .locatedBy("div.App section.Home--content section.Home--transaction section.CalculationTypes.mt-4 div.expandable.EnterPensionAge__card.expandable--external.prot-border-top.card div.expandable__card-body.card-body div.collapse-body.EnterPensionAge__card-body.collapse.show div.row.align-items-center.border-box:nth-child(2) div.col-4 label.control.control--radio.control__radio--with_label > div.control__indicator:nth-child(3)");

    public static Target TXT_DATOS_HISTORIA_LABORAL= Target.the("seleccionar a partir de una edad definida")
            .locatedBy("(//*[@id=\"card-title-icon-chevron\"])[2]");

    public static Target TXT_A_FECHA_DE_TRASLADO= Target.the("Caja de texto para ingresar la edad definida")
            .located(By.id("BasicDataCard--form-container-item-summaryWeeks-transferWeekNumber"));

    public static Target INGRESO_A_LA_VIDA_LABORAL= Target.the("Seleccionar ingreso a la vida laboral")
            .located(By.id("BasicDataCard--form-container-item-entryWorkingLife"));

    public static Target ANTES_DE_JUNIO= Target.the("Seleccionar antes de junio 30/92")
            .located(By.id("antes3092"));

    public static Target DESPUES_DE_JUNIO= Target.the("Seleccionar despues de junio 30/92")
            .located(By.id("despues3092"));

    public static Target TXT_FECHA_PRIMERA_COTIZACION= Target.the("campo fecha de la primera cotizacion")
            .locatedBy(".col-md-6 > .item:nth-child(3) svg");

    public static Target TXT_ANO_PRIMERA_COTIZACION= Target.the("caja de texto del año de la primera cotizacion")
            .locatedBy("(//select[@id='selectYear'])[2]");

    public static Target OPCT_ANO_PRIMERA_COTIZACION= Target.the("caja de texto del año de la primera cotizacion")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='1991']");

    public static Target OPCT_MES_PRIMERA_COTIZACION= Target.the("caja de texto del año de traslado")
            .locatedBy("(//select[@id='selectMonth'])[2]//option[contains(text(),'Mayo')]");

    public static Target OPCT_DIA_PRIMERA_COTIZACION= Target.the("caja de texto del dia de la primera cotizacion")
            .locatedBy("//td[contains(text(),'31')]");

    public static Target OPCT_APORTES_OBLIGATORIOS= Target.the("caja de texto para el valor de los aportes obligatorios")
            .located(By.id("BasicDataCard--form-container-item-contributions-required"));

    public static Target BTN_CONTINUAR_DATOS_BASICOS= Target.the("Botón continuar con los datos basicos")
            .located(By.id("BtnaBasicDataForm"));

       public static Target TXT_SALARIO_A_JUNIO_30= Target.the("Caja de texto para ingresar el salario a junio 30/92")
            .located(By.id("inforBasicCard--item-salaryJune3092"));

    public static Target BTN_CALCULAR_VALOR_BASICO_BONO= Target.the("Botón para calcular el valor basico del Bono.")
            .located(By.id("BtnCalculateBond"));

    public static Target BTN_CONTINUAR_REGISTRO_INFORMACION= Target.the("Botón para continuar con el registro de la información")
            .located(By.id("BtnBondModeTwoSubmit"));

    public static Target TXT_FECHA_TRASLADO= Target.the("campo fecha de la fecha de traslado")
            .locatedBy("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[1]/section[1]/form[1]/div[2]/div[1]/div[2]/div[1]/section[1]/div[1]/article[1]/article[1]/div[1]/div[1]/div[1]/button[1]/*[1]");

    public static Target TXT_ANO_TRASLADO= Target.the("caja de texto del año de traslado")
            .locatedBy("(//select[@id='selectYear'])[2]");

    public static Target OPCT_ANO_TRASLADO= Target.the("caja de texto del año de traslado")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='2000']");

    public static Target TXT_MES_TRASLADO= Target.the("caja de texto del año de traslado")
            .locatedBy("(//select[@id='selectMonth'])[2]//option[contains(text(),'Mayo')]");

    public static Target OPCT_DIA_TRASLADO= Target.the("caja de texto del dia de traslado")
            .locatedBy("//td[contains(text(),'31')]");

    public static Target TXT_FECHA_INICIAL= Target.the("campo fecha inicial")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/button[1]/*[1]"));

    public static Target TXT_ANO_INICIAL= Target.the("caja de texto del año inicial")
            .locatedBy("(//select[@id='selectYear'])[2]");

    public static Target OPCT_ANO_INICIAL= Target.the("caja de texto del año inicial")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='2018']");

    public static Target TXT_MES_INICIAL= Target.the("caja de texto del mes inicial")
            .locatedBy("(//select[@id='selectMonth'])[2]");

    public static Target OPCT_MES_INICIAL= Target.the("caja de texto del mes inicial")
            .locatedBy("(//select[@id='selectMonth'])[2]//option[contains(text(),'Junio')]");

    public static Target OPCT_DIA_INICIAL= Target.the("caja de texto del dia inicial")
            .locatedBy("//td[@class=\"CalendarDay CalendarDay_1 CalendarDay__default CalendarDay__default_2\"][1][contains(text(),'12')]");

    public static Target TXT_FECHA_FINAL= Target.the("campo fecha final")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/article[1]/div[1]/div[1]/div[1]/button[1]/*[1]"));

    public static Target OPCT_MES_FINAL_BONO= Target.the("campo fecha final")
            .located(By.xpath("(//select[@id='selectMonth'])[2]//option[contains(text(),'Mayo')]"));

    public static Target OPCT_DIA_FINAL= Target.the("caja de texto del dia final")
            .locatedBy("(//td[text()='5'])[2]");

    public static Target TXT_SALARIO= Target.the("caja de texto del salario")
            .located(By.id("RPMNoBono--form-container-item-contributionPeriods-quotationSalary"));

    public static Target BTN_CONTINUAR_REGISTRO_BONO_MODALIDA_UNO= Target.the("Botón para continuar con el registro de la información del bono modalidad uno")
            .located(By.id("BtnBondModeOneFormSubmit"));

    public static Target TXT_A_RPM_NO_BONO= Target.the("caja de texto de RPM no bono")
            .located(By.id("BasicDataCard--form-container-item-summaryWeeks-rpmNoBonusWeekNumber"));

    public static Target TXT_FECHA_INICIAL_RPM= Target.the("campo fecha inicial")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/button[1]/*[1]"));

    public static Target TXT_FECHA_FINAL_RPM= Target.the("campo fecha final")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/article[1]/div[1]/div[1]/div[1]/button[1]/*[1]"));

    public static Target TXT_MES_FECHA_FINAL_RPM= Target.the("campo fecha final")
            .located(By.xpath("(//select[@id='selectMonth'])[2]//option[contains(text(),'Mayo')]"));

    public static Target OPCT_DIA_FINAL_RPM= Target.the("caja de texto del dia inicial")
            .locatedBy("(//td[text()='12'])[2]"); //ojooooooo...................................................................

    public static Target TXT_SALARIO_RPM= Target.the("caja de texto del salario")
            .located(By.id("RPMNoBono--form-container-item-contributionPeriods-quotationSalary"));

    public static Target BTN_CONTINUAR_APORTES_NO_BONO= Target.the("Botón para continuar con los aportes a semanas de RPM no bono")
            .located(By.id("BtnRPMNoBonoFormSubmit"));

    public static Target TXT_PARENTESCO_BENEFICIARIO= Target.the("caja de texto para seleccionar el parentesco")
            .located(By.id("BasicDataCard--form-container-item-Parentesco Beneficiario 1"));

    public static Target OPCT_PARENTESCO_BENEFICIARIO= Target.the("caja de texto para seleccionar el parentesco")
            .located(By.id("HIJ"));

    public static Target OPCT_GENERO_BENEFICIARIO= Target.the("caja de texto para seleccionar el genero del beneficiario")
            .locatedBy("(//option[@id='M'])");

    public static Target TXT_FECHA_NACIMIENTO_BENEFICIARIO= Target.the("campo fecha de nacimiento del beneficiario")
            .located(By.xpath("(//*[@id=\"datePicker\"])[2]"));

    public static Target TXT_ANO_NACIMIENTO_BENEFICIARIO= Target.the("caja de texto del año de nacimiento del beneficiario")
            .locatedBy("(//select[@id='selectYear'])[2]");

    public static Target OPCT_ANO_NACIMIENTO_BENEFICIARIO= Target.the("caja de texto del año final")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='1990']");

    public static Target OPCT_MES_NACIMIENTO_BENEFICIARIO= Target.the("caja de texto del año final")
            .locatedBy("(//select[@id='selectMonth'])[2]//option[contains(text(),'Mayo')]");

    public static Target OPCT_DIA_NACIMIENTO_BENEFICIARIO= Target.the("caja de texto del dia de nacimiento del beneficiario")
            .locatedBy("//td[@class=\"CalendarDay CalendarDay_1 CalendarDay__default CalendarDay__default_2\"][1][contains(text(),'29')]");


}


