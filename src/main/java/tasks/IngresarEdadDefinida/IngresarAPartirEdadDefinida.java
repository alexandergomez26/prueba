package tasks.IngresarEdadDefinida;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import Utils.exceldata.ServiceExcelDrive;
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
import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.AutorizacionPage.SALDO_CAI_2;
import static userinterfaces.IngresarEdadDefinidaPage.*;

public class IngresarAPartirEdadDefinida implements Task {

    //private ConsumoDatos consumoDatosP;
    private final DatosAfiliado datosAfiliado;

    public IngresarAPartirEdadDefinida(String datos) {
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RBTN_PENSION_VEJEZ),
                Espera.cantidadDeMiliSegundos(2000));
        actor.attemptsTo(WaitUntil.the(CHECK_SELECCIONADO, WebElementStateMatchers.isVisible()).
                forNoMoreThan(20).seconds());
        actor.attemptsTo(
                Click.on(BTN_CALCULAR),
                Click.on(CHECK_APARTIR_EDAD_DEFINIDA),
                Enter.theValue(datosAfiliado.getEdadDefinida()).into(TXT_A_PARTIR_EDAD_DEFINIDA),
                Click.on(BTN_REALIZAR_SIMULACION),
                WaitUntil.the(PESTANA2, WebElementStateMatchers.isVisible()).
                        forNoMoreThan(300).seconds(),
                Click.on(PESTANA2),
                Click.on(PESTANA5)
        );

        System.out.println("La fecha de nacimiento es: " + FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue());
        System.out.println("Genero: " + GENERO_2.resolveFor(actor).getTextValue());
        System.out.println("Semanas cotizadas: " + SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue());
        System.out.println("Fecha primera solicitud: " + FECHA_PRIMERA_SOLICITUD_2.resolveFor(actor).getTextValue());
        System.out.println("SBC: " + SBC_2.resolveFor(actor).getTextValue());
        System.out.println("Saldo CAI: " + SALDO_CAI_2.resolveFor(actor).getTextValue());
        System.out.println("Edad: " + datosAfiliado.getEdadDefinida());
        System.out.println("Valor Pension: " + VALOR_PENSION_A_PARTIR.resolveFor(actor).getText());
        System.out.println("Valor de la Mesada: " + VALOR_MESADA_A_PARTIR.resolveFor(actor).getText());
        System.out.println("Valor del bono: " + BONO_A_PARTIR_EDAD_DEFINIDA.resolveFor(actor).getText());
        System.out.println("La fecha de la cuenta individual: " + FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getText());
        System.out.println("");

        DatosPension datosPension = new DatosPension(
                FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue(),
                SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue(),
                SALDO_CAI_2.resolveFor(actor).getTextValue(),
                SBC_2.resolveFor(actor).getTextValue(),
                FECHA_PRIMERA_SOLICITUD_2.resolveFor(actor).getTextValue(),
                GENERO_2.resolveFor(actor).getTextValue(),
                datosAfiliado.getEdadDefinida(),
                VALOR_PENSION_A_PARTIR.resolveFor(actor).getTextValue(),
                VALOR_MESADA_A_PARTIR.resolveFor(actor).getTextValue(),
                BONO_A_PARTIR_EDAD_DEFINIDA.resolveFor(actor).getTextValue(),
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
        json.put("B39", datosPension.getMesadaModalidadDosNumero());
        json.put("D16", datosPension.getBonoNumero());
        json.put("D25", datosPension.getFechaCuentaIndividual());
        json.put("B19", "0");
        json.put("B8", "");
        json.put("D8", "");
        json.put("D9", "");

        ServiceExcelDrive.setDataCell(json);

       /*
         consumoDatosP = actor.recall("consumoDatos");

        System.out.println("Inflacion: " + consumoDatosP.getInflacion());

        json.put("F1", consumoDatosP.getDeslizamiento());
        json.put("F2", consumoDatosP.getFactorComision());
        json.put("F3", consumoDatosP.getFactorGasto());
        json.put("F4", consumoDatosP.getInflacion());
        json.put("F5", consumoDatosP.getFactorSeguridad());
        json.put("F6", consumoDatosP.getTasaInteresTecnico());

        ServiceExcelDrive.setDataCell(json); */
    }
    public static IngresarAPartirEdadDefinida paraRealizarLaProyeccion(List<String>datos){
        return Tasks.instrumented(IngresarAPartirEdadDefinida.class, datos.get(0));
    }
}
