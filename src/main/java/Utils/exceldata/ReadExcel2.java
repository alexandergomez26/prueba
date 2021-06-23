package Utils.exceldata;

import Utils.Constants.ConstantesGenerales;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ReadExcel2 {
    public static void readSheetWithFormula(int rowNumber, int column)
    {
        try
        {
            FileInputStream file = new FileInputStream(new File(ConstantesGenerales.EXCEL_FILE_PATH_2));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheet(ConstantesGenerales.DATA_TO_TEST_SHEET_2);

            Row row = sheet.getRow(rowNumber);
            Cell cell = row.getCell(column);
            System.out.println("TYpe: " + cell.getCellType());
                    switch (cell.getCellType())
                    {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "tt");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "tt");
                            break;
                        case FORMULA:
                            System.out.println("Formula is " + cell.getCellFormula());
                            System.out.println("cell.getCachedFormulaResultType() " + cell.getCachedFormulaResultType());
                            //evaluator.evaluateAll();
                            switch(cell.getCachedFormulaResultType()) {
                                case NUMERIC:
                                    System.out.print("Dato: " + cell.getNumericCellValue());
                                    break;
                                case STRING:
                                    System.out.print("Dato: " + cell.getRichStringCellValue() + "\"");
                                    break;
                            }
                            break;
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
