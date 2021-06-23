package Utils;

import Utils.exceldata.ReaderExcel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

import static Utils.Constants.ConstantesGenerales.DATA_TO_TEST_SHEET_2;
import static Utils.Constants.ConstantesGenerales.EXCEL_FILE_PATH_2;

public class ValoresDobleAsesoria {

    public static boolean conMargenError (String valorFront){
        valorFront = valorFront.replace(".", "");
        double resultadoSimulador;
        boolean resultado = false;
       //double resultadoFront = Double.parseDouble(valorFront);
        ReaderExcel readExcel = new ReaderExcel();

        //resultadoSimulador = readExcel.getDataEs(EXCEL_FILE_PATH_2, DATA_TO_TEST_SHEET_2, 32, 3);


        System.out.println();
        // System.out.println("Valor Simul: " + resultadoSimulador);
        System.out.println("Valor Front: " + valorFront);
        System.out.println();
        // System.out.println("Valor Simula: " + resultadoSimulador);
        System.out.println();

           /* if (resultadoSimulador == valorFront ) {
                resultado = true;
            }
            else{
                resultado = false;


            }*/
        return  resultado;
    }


}
