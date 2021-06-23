package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioDatosBasicoPage extends PageObject {

    public static Target TXT_NOMBRE = Target.the("Caja de texto para ingresar nombre")
            .located(By.id("BasicDataCard--form-container-item-Nombre"));

    public static Target BTN_ACEPTAR_INFO_BONO= Target.the("Botón para aceptar la info del bono")
            .located(By.id("BtnModalPrimary"));

    public static Target BTN_CONTINUAR_FORM_DATOS_BASICOS= Target.the("Botón para continuar a seleccioanr la opción de pensión")
            .located(By.id("BtnaBasicDataForm"));

    public static Target TXT_FECHA_NACIMIENTO = Target.the("Campo fecha de nacimiento")
            .located(By.id("datePicker"));

    public static Target TXT_AÑO = Target.the("Caja de texto de año")
            .locatedBy("(//select[@id='selectYear'])[2]");

    public static Target OPCT_AÑO_NACIMIENTO = Target.the("Opción año nacimiento")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='1960']");

    public static Target TXT_MES = Target.the("Caja de texto de mes")
            .locatedBy("(//select[@id='selectMonth'])[2]");

    public static Target OPCT_MES_NACIMIENTO = Target.the("Opción mes nacimiento")
            .locatedBy("(//select[@id='selectMonth'])[2]//option[text()='Julio']");

    public static Target OPCT_DIA = Target.the("Opción dia")
            .located(By.cssSelector(".CalendarMonthGrid_month__horizontal:nth-child(2) tr:nth-child(3) > .CalendarDay:nth-child(4)"));

    public static Target BTN_INGRESO_VIDA_LABORAL= Target.the("Botón desplegable ingreso a la vida laboral")
            .located(By.cssSelector("#EntryIntoWorkingLife--card #card-title-icon-chevron"));

    public static Target RBN_INGRESO_VIDA_LABORAL_DESPUES_JUNIO= Target.the("Radiobutton Ingreso a la Vida Laboral despues de Junio 3092")
            .locatedBy("(//label[@id='radioButtonProduct']/div)[3]");

    public static Target RBN_INGRESO_VIDA_LABORAL_ANTES_JUNIO= Target.the("Radiobutton Ingreso a la Vida Laboral antes de Junio 3092")
            .locatedBy("(//label[@id='radioButtonProduct']/div)[2]");

    public static Target RBN_INGRESO_VIDA_LABORAL_CON_BONO_EMITIDO= Target.the("Radiobutton Ingreso a la Vida Laboral con bono emitido")
            .locatedBy("(//label[@id='radioButtonProduct']/div)[1]");

    public static Target BTN_DATOS_HISTORIA_LABORAL= Target.the("Botón desplegable Datos Historia Laboral")
            .located(By.cssSelector("#WorkingHistoryCard--card #card-title-icon-chevron"));

    public static Target TXT_FECHA_TRASLADO = Target.the("Campo fecha de traslado")
            .locatedBy("(//input[@id='datePicker'])[4]");

    public static Target OPCT_AÑO_FECHA_TRASLADO = Target.the("Opción año fecha de traslado")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='1994']");

    public static Target OPCT_MES_FECHA_TRASLADO = Target.the("Opción mes fecha de traslado")
            .locatedBy("(//select[@id='selectMonth'])[2]//option[text()='Abril']");

    public static Target TXT_FECHA_PRIMERA_COTIZACION= Target.the("Campo fecha de la primera cotización")
            .locatedBy("(//input[@id='datePicker'])[5]");

    public static Target OPCT_AÑO_FECHA_PRIMERA_COTIZACION = Target.the("Opción año fecha de la primera cotización")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='1995']");

    public static Target OPCT_AÑO_FECHA_PRIMERA_COTIZACION_SISTEMA = Target.the("Opción año fecha de la primera cotización")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='1991']");

    public static Target OPCT_MES_FECHA_PRIMERA_COTIZACION = Target.the("Opción mes fecha de la primera cotización")
            .locatedBy("(//select[@id='selectMonth'])[2]//option[text()='Septiembre']");

    public static Target TXT_SALARIO_ACTUAL= Target.the("Caja de texto para ingresar el salario actual")
            .located(By.id("BasicDataCard--form-container-item-currentSalary"));

    public static Target TXT_FECHA_VALOR_CUENTA_INDIVIDUAL = Target.the("Campo fecha del valor de la cuenta individual")
            .locatedBy("(//input[@id='datePicker'])[7]");

    public static Target OPCT_DIA_FECHA_VALOR_CUENTA_INDIVIDUAL = Target.the("Opción dia fecha del valor de la cuenta individual")
            .located(By.xpath("//*[@id=\"WorkingHistoryCard--card\"]/div/div[2]/div/section[4]/article[2]/article/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[4]"));

    public static Target TXT_VALOR_CUENTA_INDIVIDUAL= Target.the("Caja de texto para ingersar el valor de la cuenta individual")
            .located(By.id("BasicDataCard--form-container-item-individualAccountValue"));

    public static Target RBN_SELECCIONAR_TODOS_LOS_PERIODOS= Target.the("Radiobutton seleccionar todos los periodos")
            .located(By.xpath("//label[contains(text(),'Seleccionar todos los periodos')]"));

    public static Target BTN_CALCULAR_IBL= Target.the("Botón calcular IBL")
            .located(By.id("BtnCalculateIBLSubmit"));

    public static Target BTN_REALIZAR_SIMULACION2= Target.the("Botón realizar simulación")
            .located(By.id("BtnGenerateReport"));

    public static Target RBN_PLAN_AHORRO= Target.the("Radiobutton para seelccionar plan ahorro")
            .located(By.xpath("//label[contains(text(),'Plan de Ahorro:')]"));

    public static Target RBN_PENSION_META= Target.the("Radiobutton spara seleccionar pension meta")
            .located(By.xpath("//label[contains(text(),'Pensión Meta:')]"));

    public static Target TXT_FECHA_EMISION_BONO = Target.the("Campo fecha de emision bono")
            .located(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/section[1]/form[1]/div[3]/div[1]/div[2]/div[1]/section[3]/article[2]/article[1]/div[1]/div[1]/div[1]/button[1]"));


    public static Target OPCT_AÑO_FECHA_EMISION_BONO = Target.the("Opción año fecha de emision del bono")
            .locatedBy("(//select[@id='selectYear'])[2]//option[@value='2000']");

    public static Target OPCT_MES_EMISION_BONO = Target.the("Opción año fecha de emision del bono")
            .locatedBy("(//select[@id='selectMonth'])[2]//option[text()='Mayo']");



    public static Target OPCT_DIA_EMISION_BONO= Target.the("Opción dia de emision del bono")
            .located(By.xpath("//td[contains(text(),'31')]"));

    public static Target TXT_VALOR_BONO= Target.the("Opción dia de emision del bono")
            .located(By.xpath("//input[@id='BasicDataCard--form-container-item-bonusValueToday ']"));


  }
