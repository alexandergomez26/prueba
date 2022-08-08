package utils.exceldata;

import utils.constantes.ConstantesGenerales;
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



    }
