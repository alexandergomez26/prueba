package Utils.exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.util.NumberToTextConverter;

import static Utils.Constants.ConstantesGenerales.*;

public class ReaderExcel {

    public List<Map<String, String>> getData(String excelFilePath, String sheetName)
            throws IOException, InvalidFormatException {
        Sheet sheet = getSheetByName(excelFilePath, sheetName);
        return readSheet(sheet);
    }

    public String getDataEs(String excelFilePath, String sheetName, int rowNumber, int column)
            throws IOException, InvalidFormatException {
        Sheet sheet = getSheetByName(excelFilePath, sheetName);
        getWorkBook(EXCEL_FILE_PATH_2).setForceFormulaRecalculation(true);

        return leerColumna(sheet, rowNumber, column);
    }

    private Sheet getSheetByName(String excelFilePath, String sheetName)
            throws IOException, InvalidFormatException {
        return getWorkBook(excelFilePath).getSheet(sheetName);
    }

    private Workbook getWorkBook(String excelFilePath) throws IOException, InvalidFormatException {
        return WorkbookFactory.create(new File(excelFilePath));
    } //////////////////////////////////////////////////////////

    private String leerColumna(Sheet sheet, int rowNumber, int column) {
        Row row;
        Cell cell;
        row = getRow(sheet, rowNumber);
        String prueba= "";
        cell = row.getCell(column);
        //System.out.println("Comparando");
        System.out.println("Tipo: "+ cell.getCellType());
        switch (cell.getCellType()) {
            case NUMERIC:
                // prueba = cell.getNumericCellValue() + "";

                // System.out.print(cell.getNumericCellValue() + "tt");
                break;
            case STRING:
                prueba = cell.getStringCellValue();
                System.out.print(cell.getStringCellValue() + "tt");
                break;

            case BOOLEAN:
                prueba = cell.getBooleanCellValue()+"";


            case FORMULA:
                System.out.println("Formula is " + cell.getCellFormula());
                System.out.println("cell.getCachedFormulaResultType() " + cell.getCachedFormulaResultType());

//evaluator.evaluateAll();
                switch (cell.getCachedFormulaResultType()) {
                    case NUMERIC:
                        prueba = cell.getNumericCellValue() + "";
                        break;
                    case STRING:
                        prueba = cell.getStringCellValue();
                        break;

                    case BOOLEAN:
                        prueba = cell.getBooleanCellValue()+"";
                        break;

                    default:

                        break;
                }
                break;

        }

        return prueba;


        // System.out.println("Validacion2");
        // System.out.println(cell.getCellType());
        //CellType prueba2 = cell.getCachedFormulaResultType();
        //  System.out.println("Prueba2: " + prueba2);

        //System.out.println("Cache: " + cell.getCachedFormulaResultType());
        //System.out.println("Prueba Resultado:" + prueba2);

        // RichTextString prueba2 = cell.getRichStringCellValue();
        // System.out.println("Validacion prueba2: " + prueba2);
        // System.out.println("Last evaluated as \"" + cell.getRichStringCellValue() + "\"");



    }

    //----------------------------------------------------------------------
   /* FileInputStream fis = new FileInputStream("/somepath/test.xls");
    Workbook wb = new HSSFWorkbook(fis); //or new XSSFWorkbook("/somepath/test.xls")
    Sheet sheet = wb.getSheetAt(0);
    FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();

    // suppose your formula is in B3
    CellReference cellReference = new CellReference("B3");
    Row row = sheet.getRow(cellReference.getRow());
    Cell cell = row.getCell(cellReference.getCol());

      if (cell!=null) {
        switch (evaluator.evaluateFormulaCell(cell)) {
            case Cell.CELL_TYPE_BOOLEAN:
                System.out.println(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_NUMERIC:
                System.out.println(cell.getNumericCellValue());
                break;
            case Cell.CELL_TYPE_STRING:
                System.out.println(cell.getStringCellValue());
                break;
            case Cell.CELL_TYPE_BLANK:
                break;
            case Cell.CELL_TYPE_ERROR:
                System.out.println(cell.getErrorCellValue());
                break;
            // CELL_TYPE_FORMULA will never occur
            case Cell.CELL_TYPE_FORMULA:
                break;
        }
    }

    */

    //----------------------------------------------------------------------

    private List<Map<String, String>> readSheet(Sheet sheet) {
        Row row;
        int totalRow = sheet.getLastRowNum();
        List<Map<String, String>> excelRows = new ArrayList<>();
        int headerRowNumber = getHeaderRowNumber(sheet);
        if (headerRowNumber != -1) {
            int totalColumn = sheet.getRow(headerRowNumber).getLastCellNum();
            int setCurrentRow = 1;
            for (int currentRow = setCurrentRow; currentRow <= totalRow; currentRow++) {
                row = getRow(sheet, sheet.getFirstRowNum() + currentRow);
                LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<>();
                for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
                    columnMapdata.putAll(getCellValue(sheet, row, currentColumn));
                }
                excelRows.add(columnMapdata);
            }
        }
        return excelRows;
    }

    private int getHeaderRowNumber(Sheet sheet) {
        Row row;
        int totalRow = sheet.getLastRowNum();
        for (int currentRow = 0; currentRow <= totalRow + 1; currentRow++) {
            row = getRow(sheet, currentRow);
            if (row != null) {
                int totalColumn = row.getLastCellNum();
                for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
                    Cell cell;
                    cell = row.getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    if (cell.getCellType() == CellType.STRING ||
                            cell.getCellType() == CellType.NUMERIC ||
                            cell.getCellType() == CellType.BOOLEAN) {
                        return row.getRowNum();
                    }
                }
            }
        }
        return (-1);
    }

    private Row getRow(Sheet sheet, int rowNumber) {
        return sheet.getRow(rowNumber);
    }

    private LinkedHashMap<String, String> getCellValue(Sheet sheet, Row row, int currentColumn) {
        LinkedHashMap<String, String> columnMapData = new LinkedHashMap<>();
        CellType typeCurrentCell = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn,
                Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
                .getCellType();
        Cell cell;

        if (row == null) {
            if (typeCurrentCell != CellType.BLANK) {
                String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).
                        getCell(currentColumn)
                        .getStringCellValue();
                columnMapData.put(columnHeaderName, "");
            }
        } else {
            cell = row.getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

            if (typeCurrentCell != CellType.BLANK) {
                if (cell.getCellType() == CellType.STRING) {
                    String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).
                            getCell(cell.getColumnIndex())
                            .getStringCellValue();
                    columnMapData.put(columnHeaderName, cell.getStringCellValue());
                } else if (cell.getCellType() == CellType.NUMERIC) {
                    String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).
                            getCell(cell.getColumnIndex())
                            .getStringCellValue();
                    columnMapData.put(columnHeaderName, NumberToTextConverter.toText(
                            cell.getNumericCellValue()));
                } else if (cell.getCellType() == CellType.BOOLEAN) {
                    String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).
                            getCell(cell.getColumnIndex())
                            .getStringCellValue();
                    columnMapData.put(columnHeaderName, Boolean.toString(
                            cell.getBooleanCellValue()));

                } else if (cell.getCellType() == CellType.FORMULA) {
                    String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).
                            getCell(cell.getColumnIndex())
                            .getStringCellValue();
                    columnMapData.put(columnHeaderName, NumberToTextConverter.toText(
                            cell.getNumericCellValue()));


                } else if (cell.getCellType() == CellType.ERROR) {
                    String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).
                            getCell(cell.getColumnIndex())
                            .getStringCellValue();
                    columnMapData.put(columnHeaderName, Byte.toString(cell.getErrorCellValue()));
                }
            }
        }
        return columnMapData;
    }






    // ---------------------------------------------------------------------

    public static void main(String[] args){

        List<Map<String, String>> listData = null;
        try {
            ReaderExcel readerExcel = new ReaderExcel();
            listData = readerExcel.getData(EXCEL_FILE_PATH_2, DATA_TO_TEST_SHEET_2);
            for (int i=0; i<listData.size(); i++){
                System.out.println("Resultado" + listData.get(i));
            }
        }catch (IOException | InvalidFormatException ex){
            System.out.println("Falló");

        }

    }


}

