package tasks.ingresarapartiredaddefinida;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import utils.constantes.ConstantesGenerales;
import utils.exceldata.CreateModels;
import utils.exceldata.ServiceExcelDrive;
import interactions.Espera;
import models.ConsumoDatos;
import models.DatosAfiliado;
import models.DatosPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.json.JSONObject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.*;

public class IngresarAPartirEdadDefinida implements Task {

    private static final Logger logger = Logger.getLogger("co.com.viliv.interactions.Wait");

    private final DatosAfiliado datosAfiliado;

    public IngresarAPartirEdadDefinida(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(15000),
                WaitUntil.the(RBTN_PENSION_VEJEZ, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(RBTN_PENSION_VEJEZ),
                Click.on(BTN_CALCULAR),
                Click.on(CHECK_APARTIR_EDAD_DEFINIDA),
                Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_A_PARTIR_EDAD_DEFINIDA),
                Click.on(BTN_REALIZAR_SIMULACION),
                Espera.cantidadDeMiliSegundos(20000)
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
                Click.on(TARJETA_CUENTA_INDIVIDUAL)
        );

        logger.log(Level.INFO, "La fecha de nacimiento es:"+FECHA_NACIMIENTO.resolveFor(actor).getText());
        logger.log(Level.INFO, "Genero:"+GENERO.resolveFor(actor).getText());
        logger.log(Level.INFO, "Semanas cotizadas:"+SEMANAS_TOTALES_COTIZADAS.resolveFor(actor).getText());
        logger.log(Level.INFO, "Fecha primera solicitud:"+FECHA_PRIMERA_SOLICITUD.resolveFor(actor).getText());
        logger.log(Level.INFO, "SBC:"+SBC.resolveFor(actor).getText());
        logger.log(Level.INFO, "Saldo CAI:"+SALDO_CAI.resolveFor(actor).getText());
        logger.log(Level.INFO, "Edad pension:"+datosAfiliado.getEdadDefinida());
        logger.log(Level.INFO, "Valor Pension:"+VALOR_PENSION_A_PARTIR.resolveFor(actor).getText());
        logger.log(Level.INFO, "Valor de la Mesada:"+VALOR_MESADA_A_PARTIR.resolveFor(actor).getText());
        logger.log(Level.INFO, "Valor del bono:"+BONO_A_PARTIR_EDAD_DEFINIDA.resolveFor(actor).getText());
        logger.log(Level.INFO, "Fecha de Cuenta Individual:"+FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getText());

        DatosPension datosPension = new DatosPension.Builder(
                FECHA_NACIMIENTO.resolveFor(actor).getTextValue())
                .conSemanasCotizadas(SEMANAS_TOTALES_COTIZADAS.resolveFor(actor).getTextValue())
                .conSaldoCai(SALDO_CAI.resolveFor(actor).getTextValue())
                .conSalarioBasico(SBC.resolveFor(actor).getTextValue())
                .conFechaPrimeraSolicitud(FECHA_PRIMERA_SOLICITUD.resolveFor(actor).getTextValue())
                .conGenero(GENERO.resolveFor(actor).getTextValue())
                .conEdad(datosAfiliado.getEdadDefinida())
                .conValorPension(VALOR_PENSION_A_PARTIR.resolveFor(actor).getTextValue())
                .conMesadaModalidadDos(VALOR_MESADA_A_PARTIR.resolveFor(actor).getTextValue())
                .conBono(BONO_A_PARTIR_EDAD_DEFINIDA.resolveFor(actor).getTextValue())
                .conFechaCuentaIndividual(FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getTextValue())
                .build();

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
        json.put("B39", datosPension.getMesadaModalidadDosNumero());
        json.put("D16", datosPension.getBonoNumero());
        json.put("D25", datosPension.getFechaCuentaIndividual());
        json.put("B19", datosAfiliado.getSemanasNBono());
        json.put("B8", "");
        json.put("D8", "");
        json.put("D9", "");

        ServiceExcelDrive.setDataCell(json);
/*
        ConsumoDatos consumoDatosP = actor.recall("consumoDatos");
        json.put("G7", consumoDatosP.getDeslizamiento());
        json.put("G8", consumoDatosP.getFactorComision());
        json.put("G3", consumoDatosP.getFactorGasto());
        json.put("G4", consumoDatosP.getInflacion());//
        float inflacion = consumoDatosP.getInflacion() - 1;
        json.put("G5", consumoDatosP.getFactorSeguridad());
        json.put("G6", consumoDatosP.getTasaInteresTecnico());
        json.put("B27", inflacion);

        ServiceExcelDrive.setDataCell(json);

 */
    }
    public static IngresarAPartirEdadDefinida paraRealizarLaProyeccion(List<String>datos){
        return Tasks.instrumented(IngresarAPartirEdadDefinida.class, datos.get(0));
    }
}
