package Utils.exceldata;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) throws InvalidFormatException {
    	ServiceExcelDrive.enterToAllExcel("https://docs.google.com/spreadsheets/d/1f3o9fxzaLm3jIqvoY06i0ABM5l9FTZ2vdXlMHPFrsZ0/edit#gid=1998306065", "Calculo");
    	
    	JSONObject json = new JSONObject();
    	json.put("B4", "9/2/1978");
    	json.put("D4", "F");
		json.put("B14", "80");
		json.put("B18", "15/01/1987");
		json.put("D14", "6,22");
		json.put("B16", "2500500");
		json.put("E2", "369000000");

    	ServiceExcelDrive.setDataCell(json);
    	
    	System.out.println("RESULTADO FINAL: " + ServiceExcelDrive.getDataAllCell("D36")); //ELIMINAR EL ALL PARA QUE EJECUTE MAS RAPIDO.


    }
}
