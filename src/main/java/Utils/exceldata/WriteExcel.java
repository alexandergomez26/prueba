package Utils.exceldata;

import Utils.Constants.ConstantesGenerales;
import models.DatosBeneficiario;
import models.DatosPension;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import sun.security.krb5.internal.crypto.Des;

import static Utils.Constants.ConstantesGenerales.*;

public class WriteExcel {

    private static final Logger LOGGER = LoggerFactory.getLogger(WriteExcel.class);

    private WriteExcel() {
        super();
    }

    public static void saveCaseIdExcel(DatosPension datosPension) throws InvalidFormatException {
        try (
                FileInputStream inputStream = new FileInputStream(new
                        File(ConstantesGenerales.EXCEL_FILE_PATH_2));
                Workbook workbook = WorkbookFactory.create(inputStream);
                FileOutputStream outputStream = new FileOutputStream(
                        ConstantesGenerales.EXCEL_FILE_PATH_2);
        ) {
            Sheet sheet = workbook.getSheet(ConstantesGenerales.DATA_TO_TEST_SHEET_2);

            Row row = sheet.getRow(3);
            Cell cell = row.getCell(1);

            cell.setCellValue(datosPension.getFechaNacimiento());
            sheet.getRow(13).getCell(3).setCellValue(datosPension.getSemanasCotizadasNumero());

            CellStyle cellStyle = workbook.createCellStyle();
            CreationHelper createHelper = workbook.getCreationHelper();
            cellStyle.setDataFormat(
                    createHelper.createDataFormat().getFormat("_-$* #.##0_-;-$* #.##0_-;_-$* \"-\"_-;_-@_-"));
            sheet.getRow(14).getCell(3).setCellValue(datosPension.getSalarioBasicoNumero());
            // sheet.getRow(14).getCell(3).setCellStyle(cellStyle);
            sheet.getRow(15).getCell(1).setCellValue(datosPension.getSaldoCaiNumero());
            //sheet.getRow(15).getCell(1).setCellStyle(cellStyle);
            sheet.getRow(17).getCell(1).setCellValue(datosPension.getFechaPrimeraSolicitud());
            sheet.getRow(3).getCell(3).setCellValue(datosPension.getGenero());
            sheet.getRow(13).getCell(1).setCellValue(datosPension.getEdadNumero());
            sheet.getRow(1).getCell(4).setCellValue(datosPension.getValorPension()); // Valor final de la pension


            sheet.getRow(1).getCell(1);

            //HSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);
            // workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
            workbook.setForceFormulaRecalculation(true);
            // FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            //  evaluator.evaluateFormulaCell(sheet.getRow(22).getCell(1));

            workbook.write(outputStream);
            workbook.setForceFormulaRecalculation(true);

            // evaluator.evaluateFormulaCell(sheet.getRow(22).getCell(1));


            ReaderExcel readExcel = new ReaderExcel();
            String resultadoSimulador;
            resultadoSimulador = readExcel.getDataEs(EXCEL_FILE_PATH_2, DATA_TO_TEST_SHEET_2, 22, 1);
            // evaluator.evaluateFormulaCell(sheet.getRow(22).getCell(1));
            System.out.println("Celda: " + resultadoSimulador);

            // workbook.close();
            // inputStream.close();

        } catch (IOException b) {
            LOGGER.error(ConstantesGenerales.ERROR_LOAD_EXCEL, b);
        }


    }


    public static void colpensiones(DatosPension datosPension) throws InvalidFormatException {
        try (
                FileInputStream inputStream = new FileInputStream(new
                        File(ConstantesGenerales.EXCEL_FILE_PATH_2));
                Workbook workbook = WorkbookFactory.create(inputStream);
                FileOutputStream outputStream = new FileOutputStream(
                        ConstantesGenerales.EXCEL_FILE_PATH_2);
        ) {
            Sheet sheet = workbook.getSheet(ConstantesGenerales.DATA_TO_TEST_SHEET_2);

            Row row = sheet.getRow(3);
            Cell cell = row.getCell(1);
            cell.setCellValue(datosPension.getFechaNacimiento());
            sheet.getRow(13).getCell(3).setCellValue(datosPension.getSemanasCotizadasNumero());


            sheet.getRow(14).getCell(3).setCellValue(datosPension.getSalarioBasicoNumero());
            //sheet.getRow(15).getCell(1).setCellValue(datosPension.getSaldoCaiNumero());
          //  sheet.getRow(17).getCell(1).setCellValue(datosPension.getFechaPrimeraSolicitud());
            sheet.getRow(3).getCell(3).setCellValue(datosPension.getGenero());
            sheet.getRow(13).getCell(1).setCellValue(datosPension.getEdadNumero());
            sheet.getRow(4).getCell(4).setCellValue(datosPension.getMesadaColpensiones());
            sheet.getRow(18).getCell(1).setCellValue(datosPension.getIblNumero());



            sheet.getRow(1).getCell(1);

            //HSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);
            // workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
            workbook.setForceFormulaRecalculation(true);
            // FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            //  evaluator.evaluateFormulaCell(sheet.getRow(22).getCell(1));

            workbook.write(outputStream);
           // workbook.setForceFormulaRecalculation(true);

            // evaluator.evaluateFormulaCell(sheet.getRow(22).getCell(1));


            ReaderExcel readExcel = new ReaderExcel();
            String resultadoSimulador;
            resultadoSimulador = readExcel.getDataEs(EXCEL_FILE_PATH_2, DATA_TO_TEST_SHEET_2, 22, 1);
            // evaluator.evaluateFormulaCell(sheet.getRow(22).getCell(1));
            System.out.println("Celda: " + resultadoSimulador);

            // workbook.close();
            // inputStream.close();

        } catch (IOException b) {
            LOGGER.error(ConstantesGenerales.ERROR_LOAD_EXCEL, b);
        }


    }



    public static void saveBeneficiario(DatosPension datosPension) throws InvalidFormatException {
        try (
                FileInputStream inputStream = new FileInputStream(new
                        File(ConstantesGenerales.EXCEL_FILE_PATH_2));
                Workbook workbook = WorkbookFactory.create(inputStream);
                FileOutputStream outputStream = new FileOutputStream(
                        ConstantesGenerales.EXCEL_FILE_PATH_2);
        ) {
            Sheet sheet = workbook.getSheet(ConstantesGenerales.DATA_TO_TEST_SHEET_3);

            Row row = sheet.getRow(3);
            Cell cell = row.getCell(1);

            cell.setCellValue(datosPension.getFechaNacimiento());
            sheet.getRow(13).getCell(3).setCellValue(datosPension.getSemanasCotizadasNumero());

            CellStyle cellStyle = workbook.createCellStyle();
            CreationHelper createHelper = workbook.getCreationHelper();
            cellStyle.setDataFormat(
                    createHelper.createDataFormat().getFormat("_-$* #.##0_-;-$* #.##0_-;_-$* \"-\"_-;_-@_-"));
            sheet.getRow(14).getCell(3).setCellValue(datosPension.getSalarioBasicoNumero());
            // sheet.getRow(14).getCell(3).setCellStyle(cellStyle);
            sheet.getRow(15).getCell(1).setCellValue(datosPension.getSaldoCaiNumero());
            //sheet.getRow(15).getCell(1).setCellStyle(cellStyle);
            sheet.getRow(17).getCell(1).setCellValue(datosPension.getFechaPrimeraSolicitud());
            sheet.getRow(3).getCell(3).setCellValue(datosPension.getGenero());
            sheet.getRow(13).getCell(1).setCellValue(datosPension.getEdadNumero());
            sheet.getRow(1).getCell(5).setCellValue(datosPension.getValorPension()); // Valor final de la pension


            sheet.getRow(8).getCell(3).setCellValue(datosPension.getParentescoBeneficiario());
            sheet.getRow(7).getCell(1).setCellValue(datosPension.getFechaNacimientoBeneficiario());
            sheet.getRow(7).getCell(3).setCellValue(datosPension.getGeneroBeneficiario());



            workbook.write(outputStream);
            workbook.close();
            inputStream.close();

        } catch (IOException b) {
            LOGGER.error(ConstantesGenerales.ERROR_LOAD_EXCEL, b);
        }


    }


    public static void main(String[] args) {
        String resultadoExcel;
        String resultadoSimulador;
        ReaderExcel readExcel = new ReaderExcel();
        DatosPension datosPension = new DatosPension("1/1/1961", "120.58", "52000000",
                "2500000", "12/1/1966", "F", "100", "10000001");


        try {
            saveCaseIdExcel(datosPension);
            resultadoSimulador = readExcel.getDataEs(EXCEL_FILE_PATH_2, DATA_TO_TEST_SHEET_2, 35, 3);
            resultadoExcel = readExcel.getDataEs(EXCEL_FILE_PATH_2, DATA_TO_TEST_SHEET_2, 35, 3);

            System.out.println();
            System.out.println("Valor Simulador: " + resultadoSimulador);
            System.out.println("Valor Excel: " + resultadoExcel);



        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
        }



    }


}

