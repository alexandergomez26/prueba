package tasks.ingresarapartiredaddefinida;

import utils.constantes.ConstantesGenerales;
import utils.exceldata.CreateModels;
import utils.exceldata.ServiceExcelDrive;
import interactions.Espera;
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
import java.util.logging.Level;
import java.util.logging.Logger;

import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.*;
import static userinterfaces.IngresarAPartirEdadDefinidaPage.BTN_REALIZAR_SIMULACION;

public class IngresarAPartirEdadDefinidaRPMNoBono implements Task {

    private static final Logger logger = Logger.getLogger("co.com.viliv.interactions.Wait");

    String valorNoBono;

    private final DatosAfiliado datosAfiliado;

    public IngresarAPartirEdadDefinidaRPMNoBono(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.cantidadDeMiliSegundos(3000),
                WaitUntil.the(RBTN_PENSION_VEJEZ, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(60).seconds(),
                Click.on(RBTN_PENSION_VEJEZ),
                WaitUntil.the(CHECK_SELECCIONADO, WebElementStateMatchers.isVisible()).
                forNoMoreThan(20).seconds(),
                Click.on(BTN_CALCULAR),
                Click.on(CHECK_APARTIR_EDAD_DEFINIDA),
                Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_A_PARTIR_EDAD_DEFINIDA),
                Click.on(BTN_REALIZAR_SIMULACION),
                Espera.cantidadDeMiliSegundos(10000)
        );
                actor.attemptsTo(
                WaitUntil.the(TARJETA_CUENTA_INDIVIDUAL, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(120).seconds(),
                Click.on(TARJETA_CUENTA_INDIVIDUAL)
        );
/*
        System.out.println("La fecha de nacimiento es: " + FECHA_NACIMIENTO.resolveFor(actor).getTextValue());
        System.out.println("Genero: " + GENERO.resolveFor(actor).getTextValue());
        System.out.println("Semanas cotizadas: " + SEMANAS_TOTALES_COTIZADAS.resolveFor(actor).getTextValue());
        System.out.println("Fecha primera solicitud: " + FECHA_PRIMERA_SOLICITUD.resolveFor(actor).getTextValue());
        System.out.println("SBC: " + SBC.resolveFor(actor).getTextValue());
        System.out.println("Saldo CAI: " + SALDO_CAI.resolveFor(actor).getTextValue());
        System.out.println("Edad: " + datosAfiliado.getEdadDefinida());
        System.out.println("Valor Pension: " + VALOR_PENSION_A_PARTIR.resolveFor(actor).getText());
        System.out.println("Valor de la Mesada: " + VALOR_MESADA_A_PARTIR.resolveFor(actor).getText());
        System.out.println("Valor del bono: " + BONO_A_PARTIR_EDAD_DEFINIDA.resolveFor(actor).getText());
        System.out.println("La fecha de la cuenta individual: " + FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getText());
        System.out.println("Valor aportes RPM No bono: " + VALOR_APORTES_RPM_NO_BONO.resolveFor(actor).getTextValue());
        System.out.println("");

 */

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
        logger.log(Level.INFO, "Valor aportes RPM No bono:"+VALOR_APORTES_RPM_NO_BONO.resolveFor(actor).getText());

/*
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
                BONO_A_PARTIR_EDAD_DEFINIDA.resolveFor(actor).getTextValue(),
                FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getTextValue(),
                VALOR_APORTES_RPM_NO_BONO.resolveFor(actor).getTextValue()
        );

 */
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
                .conValorAportesRPMNoBono( VALOR_APORTES_RPM_NO_BONO.resolveFor(actor).getTextValue())
                .build();

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);

        JSONObject json = new JSONObject();
        json.put("B4", datosPension.getFechaNacimiento());
        json.put("D15", datosPension.getSalarioBasicoNumero());
        json.put("B18", datosPension.getFechaPrimeraSolicitud());
        json.put("D4", datosPension.getGenero());
        json.put("B14", datosPension.getEdadNumero());
        json.put("D14", datosPension.getSemanasCotizadasNumero());
        json.put("E2", datosPension.getValorPensionNumero());
        json.put("B39", datosPension.getMesadaModalidadDosNumero());
        json.put("D16", datosPension.getBonoNumero());
        json.put("D25", datosPension.getFechaCuentaIndividual());

        json.put("E5", datosPension.getSaldoCaiNumero());
        json.put("E6", datosPension.getValorAportesRPMNoBonoNumero());

        json.put("B19", datosAfiliado.getSemanasNBono());
        json.put("B8", "");
        json.put("D8", "");
        json.put("D9", "");
        ServiceExcelDrive.setDataCell(json);

        valorNoBono = ServiceExcelDrive.getDataCell("E7");
        json.put("B16", valorNoBono);
        ServiceExcelDrive.setDataCell(json);

    }
    public static IngresarAPartirEdadDefinidaRPMNoBono paraRealizarLaProyeccion(List<String> datos){
        return Tasks.instrumented(IngresarAPartirEdadDefinidaRPMNoBono.class, datos.get(0));
    }
}
