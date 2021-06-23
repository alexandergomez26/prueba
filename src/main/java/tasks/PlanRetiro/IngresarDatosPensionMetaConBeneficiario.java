package tasks.PlanRetiro;

import Utils.Constants.ConstantesGenerales;
import Utils.exceldata.CreateModels;
import Utils.exceldata.ServiceExcelDrive;
import interactions.IngresarLosDatosPlanRetiro;
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
import userinterfaces.IngresarDatosPlanRetiroPage;

import java.util.Collections;
import java.util.List;

import static userinterfaces.AutorizacionPage.*;
import static userinterfaces.IngresarDatosPlanRetiroPage.TXT_VALOR_ESPERADO_PENSION;

public class IngresarDatosPensionMetaConBeneficiario implements Task {
    private String datos;
    private final DatosAfiliado datosAfiliado;


    public IngresarDatosPensionMetaConBeneficiario(String datos) {
        this.datos = datos;
        int pos=Integer.parseInt(datos);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarLosDatosPlanRetiro.enElAplicativo(Collections.singletonList(datos)),
                Enter.theValue(datosAfiliado.getValorCuentaIndividual()).into(TXT_VALOR_ESPERADO_PENSION),
                Click.on(IngresarDatosPlanRetiroPage.BTN_CALCULAR_),
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
        System.out.println("Valor Pension Meta: " + VALOR_PENSION_META.resolveFor(actor).getText());
        System.out.println("Parentesco Beneficiario: " + PARENTESCO_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("Fecha Nacimiento Beneficiario: " + FECHA_NACIMIENTO_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("Genero Beneficiario: " + GENERO_BENEFICIARIO.resolveFor(actor).getText());
        System.out.println("Fecha Cuenta Individual: " + FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getText());

        DatosPension datosPension = new DatosPension(
                FECHA_NACIMIENTO_2.resolveFor(actor).getTextValue(),
                SEMANAS_TOTALES_COTIZADAS_2.resolveFor(actor).getTextValue(),
                SALDO_CAI_2.resolveFor(actor).getTextValue(),
                SBC_2.resolveFor(actor).getTextValue(),
                FECHA_PRIMERA_SOLICITUD_2.resolveFor(actor).getTextValue(),
                GENERO_2.resolveFor(actor).getTextValue(),
                datosAfiliado.getEdadDefinida(),
                VALOR_PENSION_META.resolveFor(actor).getTextValue(),
                VALOR_PENSION_META.resolveFor(actor).getTextValue(),
                PARENTESCO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                FECHA_NACIMIENTO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                GENERO_BENEFICIARIO.resolveFor(actor).getTextValue(),
                FECHA_CUENTA_INDIVIDUAL.resolveFor(actor).getTextValue()

        );

        ServiceExcelDrive.enterToAllExcel(ConstantesGenerales.EXCEL_JSON,ConstantesGenerales.DATA_TO_TEST_SHEET_JASON);

        JSONObject json = new JSONObject();
        json.put("B4", datosPension.getFechaNacimiento());
        json.put("D14", datosPension.getSemanasCotizadasNumero());
        json.put("D15", datosPension.getSalarioBasicoNumero());
        json.put("B18", datosPension.getFechaPrimeraSolicitud());
        json.put("D4", datosPension.getGenero());
        json.put("B14", datosPension.getEdadNumero());
        json.put("B16", datosPension.getSaldoCaiNumero());
        json.put("E2", datosPension.getValorPensionNumero());
        json.put("B8", datosPension.getFechaNacimientoBeneficiario());
        json.put("D8", datosPension.getGeneroBeneficiario());
        json.put("D9", datosPension.getParentescoBeneficiario());
        json.put("D25", datosPension.getFechaCuentaIndividual());
        json.put("D16", "0");
        json.put("B19", "0");

        ServiceExcelDrive.setDataCell(json);

        System.out.println("Valor Pension Json: " + ServiceExcelDrive.getDataCell("D36"));

    }
    public static IngresarDatosPensionMetaConBeneficiario enElAplicativo(List<String> datos){
        return Tasks.instrumented(IngresarDatosPensionMetaConBeneficiario.class, datos.get(0));
    }
}
