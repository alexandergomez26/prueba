package Utils;

import Utils.exceldata.CreateModels;
import Utils.exceldata.ReaderExcel;
import models.DatosAfiliado;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

import static Utils.Constants.ConstantesGenerales.DATA_TO_TEST_SHEET_2;
import static Utils.Constants.ConstantesGenerales.EXCEL_FILE_PATH_2;

public class Valores {

    private static DatosAfiliado datosAfiliado;

    public Valores (String data){
        int pos=Integer.parseInt(data);
        datosAfiliado = CreateModels.setDatosAfiliado(pos);
    }


    public static boolean conMargenError (String valorFront){



        String resultadoExcel;


        valorFront = valorFront.replace("$", "").replace(".","");
        System.out.println("Valor Front: "+ valorFront);


        //double errorDinamico;
        double resultadoSimulador;
        boolean resultado = false;

        double resultadoFront = Double.parseDouble(valorFront);
        ReaderExcel readExcel = new ReaderExcel();

        System.out.println("Ingresó a variables: ");
        //System.out.println("Valor Hoja Excel: " + datosAfiliado.getResultadoSimulador());


        resultadoExcel = datosAfiliado.getResultadoSimulador();
        resultadoSimulador = Double.parseDouble(resultadoExcel);

        double margen = resultadoFront * 0.10;

        double valorMaximoFront = resultadoFront + margen;
        double valorMinimoFront = resultadoFront - margen;
        // double saldoCai= readExcel.getDataEs(EXCEL_FILE_PATH_2, DATA_TO_TEST_SHEET_2, 15, 1);

        //System.out.println("El error es: "+ errorDinamico);
        System.out.println("Valor Simul: " + resultadoSimulador);
        System.out.println("Valor Front: " + resultadoFront);
        System.out.println();
        System.out.println("Valor Minimo: " + valorMinimoFront);
        System.out.println("Valor Simula: " + resultadoSimulador);
        System.out.println("Valor Maximo: " + valorMaximoFront);
        // System.out.println("SAldoCAi: " + saldoCai);

        if (resultadoSimulador >= valorMinimoFront && resultadoSimulador <= valorMaximoFront ) {
            resultado = true;
        }
        else{
            resultado = false;


        }
        return  resultado;
    }


}
