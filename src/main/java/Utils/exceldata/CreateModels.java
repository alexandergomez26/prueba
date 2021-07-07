package Utils.exceldata;

import Utils.Constants.ConstantesGenerales;
import models.DatosAfiliado;
import models.DatosInicioSesion;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CreateModels {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateModels.class);
    private static List<Map<String, String>> listData;


    private static DatosInicioSesion datosInicioSesion;
    private static DatosAfiliado datosAfiliado;

    private CreateModels() {
    }

    public static List<Map<String, String>> setDataModel(String excelFilePath, String nombreHoja) {
        List<Map<String, String>> listData = null;
        try {
            ReaderExcel readExcel = new ReaderExcel();
            listData = readExcel.getData(excelFilePath, nombreHoja);
        } catch (IOException | InvalidFormatException ex) {
            LOGGER.error(ConstantesGenerales.ERROR_LOAD_EXCEL, ex);
        }
        return listData;
    }

    public static DatosInicioSesion setDatosInicioSesion(int posicion, String nombreHoja){
        listData = setDataModel(ConstantesGenerales.EXCEL_FILE_PATH, nombreHoja);
        posicion --;
        if(listData != null){
            datosInicioSesion = new DatosInicioSesion();
            datosInicioSesion.setCorreo(listData.get(posicion).get(ConstantesGenerales.CORREO));
            datosInicioSesion.setContrasenia(listData.get(posicion).get(ConstantesGenerales.CONTRASENIA));
        }
        return datosInicioSesion;
    }

    public static DatosAfiliado setDatosAfiliado(int posicion) {
        listData = setDataModel(ConstantesGenerales.EXCEL_FILE_PATH, ConstantesGenerales.DATA_TO_TEST_SHEET);
        posicion--;
        if (listData != null) {
            datosAfiliado = new DatosAfiliado();
            datosAfiliado.setNumeroDocumento(listData.get(posicion).get(ConstantesGenerales.CEDULA));
            datosAfiliado.setEdadDefinida(listData.get(posicion).get(ConstantesGenerales.EDAD_DEFINIDA));
            datosAfiliado.setSalarioActual(listData.get(posicion).get(ConstantesGenerales.SALARIO_ACTUAL));
            datosAfiliado.setNombre(listData.get(posicion).get(ConstantesGenerales.NOMBRE));
            datosAfiliado.setValorCuentaIndividual(listData.get(posicion).get(ConstantesGenerales.VALOR_CUENTA_INDIVIDUAL));
            datosAfiliado.setSemanas(listData.get(posicion).get(ConstantesGenerales.SEMANAS));
            datosAfiliado.setSemanasBono(listData.get(posicion).get(ConstantesGenerales.SEMANAS_BONO));
            datosAfiliado.setSemanasNBono(listData.get(posicion).get(ConstantesGenerales.SEMANAS_NBONO));
            datosAfiliado.setBono(listData.get(posicion).get(ConstantesGenerales.BONO));
            datosAfiliado.setAportesObligatorios(listData.get(posicion).get(ConstantesGenerales.APORTES_OBLIGATORIOS));
            datosAfiliado.setResultadoSimulador(listData.get(posicion).get(ConstantesGenerales.VALOR_PENSION));
            datosAfiliado.setMesada(listData.get(posicion).get(ConstantesGenerales.MESADA));
        }
        return datosAfiliado;
    }

}
