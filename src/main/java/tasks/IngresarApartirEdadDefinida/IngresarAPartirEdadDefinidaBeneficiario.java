package tasks.IngresarApartirEdadDefinida;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import Utils.exceldata.ServiceExcelDrive;
import interactions.Espera;
import models.DatosAfiliado;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.json.JSONObject;
import org.openqa.selenium.By;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.AutorizacionPage.VALOR_MESADA_A_PARTIR;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.*;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.BTN_REALIZAR_SIMULACION;

public class IngresarAPartirEdadDefinidaBeneficiario implements Task {

    private final DatosAfiliado datosAfiliado;

    public IngresarAPartirEdadDefinidaBeneficiario(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(3000));
        actor.attemptsTo(
                Click.on(RBTN_PENSION_VEJEZ),
        WaitUntil.the(CHECK_SELECCIONADO, WebElementStateMatchers.isVisible()).
                forNoMoreThan(20).seconds(),
                Click.on(BTN_CALCULAR),
                Click.on(CHECK_APARTIR_EDAD_DEFINIDA),
                Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_A_PARTIR_EDAD_DEFINIDA),
                Click.on(BTN_REALIZAR_SIMULACION),
                Espera.cantidadDeMiliSegundos(10000)
        );
/*
                BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        String html2 = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElement(By.cssSelector("html")).getAttribute("innerHTML");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(html2);
        System.out.println("----------------------------------------------------------------------------------------------------------");

 */

        actor.attemptsTo(
                WaitUntil.the(TARJETA_CUENTA_INDIVIDUAL, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(120).seconds(),
                Click.on(TARJETA_CUENTA_INDIVIDUAL),
                Click.on(TARJETA_BENEFICIARIO)
        );

        System.out.println("La fecha de nacimiento es: " + FECHA_NACIMIENTO.resolveFor(actor).getTextValue());
        System.out.println("Genero: " + GENERO.resolveFor(actor).getTextValue());
        System.out.println("Semanas cotizadas: " + SEMANAS_TOTALES_COTIZADAS.resolveFor(actor).getTextValue());
        System.out.println("Fecha primera solicitud: " + FECHA_PRIMERA_SOLICITUD.resolveFor(actor).getTextValue());
        System.out.println("SBC: " + SBC.resolveFor(actor).getTextValue());
        System.out.println("Saldo CAI: " + SALDO_CAI.resolveFor(actor).getTextValue());
        System.out.println("Edad: " + datosAfiliado.getEdadDefinida());
        System.out.println("Valor Pension: " + VALOR_PENSION_A_PARTIR.resolveFor(actor).getText());
        System.out.println("Valor de la Mesada: " + MESADA_CON_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("Parentesco Beneficiario: " + PARENTESCO_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("Fecha Nacimiento Beneficiario: " + FECHA_NACIMIENTO_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("Genero Beneficiario.: " + GENERO_BENEFICIARIO.resolveFor(actor).getText());

        DatosPension datosPension = new DatosPension(
                FECHA_NACIMIENTO.resolveFor(actor).getTextValue(),
                SEMANAS_TOTALES_COTIZADAS.resolveFor(actor).getTextValue(),
                SALDO_CAI.resolveFor(actor).getTextValue(),
                SBC.resolveFor(actor).getTextValue(),
                FECHA_PRIMERA_SOLICITUD.resolveFor(actor).getTextValue(),
                GENERO.resolveFor(actor).getTextValue(),
                datosAfiliado.getEdadDefinida(),
                VALOR_PENSION_A_PARTIR.resolveFor(actor).getTextValue(),
                VALOR_MESADA_A_PARTIR.resolveFor(actor).getTextValue(),
                PARENTESCO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                FECHA_NACIMIENTO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                GENERO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getTextValue()
                );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);

        JSONObject json = new JSONObject();
        json.put("B4", datosPension.getFechaNacimiento());
        json.put("B16", datosPension.getSaldoCaiNumero());
        json.put("D15", datosPension.getSalarioBasicoNumero());
        json.put("B18", datosPension.getFechaPrimeraSolicitud());
        json.put("D4", datosPension.getGenero());
        json.put("B14", datosPension.getEdadNumero());
        json.put("D14", datosPension.getSemanasCotizadasNumero());
        json.put("E2", datosPension.getValorPensionNumero());
        json.put("B39", datosPension.getMesada());
        json.put("B8", datosPension.getFechaNacimientoBeneficiario());
        json.put("D8", datosPension.getGeneroBeneficiario());
        json.put("D9", datosPension.getParentescoBeneficiario());
        json.put("D25", datosPension.getFechaCuentaIndividual());
        json.put("D16", datosAfiliado.getSemanasNBono());
        json.put("B19", datosAfiliado.getSemanasNBono());

        ServiceExcelDrive.setDataCell(json);

    }
    public static IngresarAPartirEdadDefinidaBeneficiario paraRealizarLaProyeccion(List<String> datos){
        return Tasks.instrumented(IngresarAPartirEdadDefinidaBeneficiario.class, datos.get(0));
    }
}
