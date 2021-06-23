package Utils.exceldata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.json.JSONArray;
import org.json.JSONObject;

public class ServiceExcelDrive {
	private static JSONArray dataExcelDrive;
	private static String params;
	private static String keyG;
	private static JSONObject json;

	public static String getDataCell(String key) {
		keyG = key;
		getServiceAllDataExcel();
		return new String(dataExcelDrive.get(0).toString().getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
	}
	
	public static void setDataCell(JSONObject jsonObject) {
		json.put("data", jsonObject);
		dataExcelDrive = null;
		setServiceAllDataExcel();
	}

	public static String getDataAllCell(String key) {
		keyG = "";
		getServiceAllDataExcel();
		int position = getNumeros(key);
		if (dataExcelDrive.length() > position) {
			JSONObject resJson = (JSONObject) dataExcelDrive.get(position);

			String dato = resJson.get(key).toString();
			dato = new String(dato.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
			return dato;
		} else {
			// fail("NO EXISTE LA FILA " + row + " O LA COLUMNA " + column + " DEL ARCHIVO
			// DE DRIVE");
			return "NADAAAAAAAA";
		}
	}

	private static int getNumeros(String cadena) {
		char[] cadenaDiv = cadena.toCharArray( ) ;
		String n = "";
		for (int i = 0;i<cadenaDiv.length;i++) {
			if(Character.isDigit(cadenaDiv[ i ] ) ) {
				n += cadenaDiv[i];
			}
		}
		return Integer.parseInt(n);
	}

	public static void enterToAllExcel(String url, String sheet) {
		params = "callback=ctrlq";
		dataExcelDrive = null;
		setParams("sheet", sheet);
		setParams("url", url);
		
		json = new JSONObject();

		json.put("sheet", sheet);
		json.put("url", url);
	}

	private static void getServiceAllDataExcel() {
		if (dataExcelDrive == null || !keyG.equals("")) {

			try {
				String url = "https://script.google.com/macros/s/AKfycbyY_yUHWA36F5rgmHWWlSX3U2w9bcxM3yzkpHoaYWfLFEu15Ev2CeNSx8ENMt-iAOA1aw/exec?"
						+ "key" + "=" + keyG + "&" + params ;
				URL obj = new URL(url);
				// System.out.println("URL: " + url); ///////////////////////////////////////////////////////////////
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();
				con.setRequestMethod("GET");
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String response = in.readLine();
				dataExcelDrive = new JSONObject(response).getJSONArray("data");
				//System.out.println("Respuesta Get: " + response); ////////////////////////////////////////////////

			} catch (Exception e) {
				e.printStackTrace();
				 //fail("NO ENCONTRO EL SERVICIO: " + e.getMessage());
			}
		}
	}

	private static void setServiceAllDataExcel() {
		try {
			String url = "https://script.google.com/macros/s/AKfycbyY_yUHWA36F5rgmHWWlSX3U2w9bcxM3yzkpHoaYWfLFEu15Ev2CeNSx8ENMt-iAOA1aw/exec";
			URL obj = new URL(url);

			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setDoOutput(true);
			con.setRequestProperty("Content-Type", "application/json");
			OutputStream os = con.getOutputStream();
			os.write(json.toString().getBytes());
			os.flush();
			os.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String response = in.readLine();
			//System.out.println("Response Set: " + response);  ////////////////////////////////////////////////////
		} catch (Exception e) {
			e.printStackTrace();
			// fail("NO ENCONTRO EL SERVICIO: " + e.getMessage());
		}
	}

	// Metodo para crear los parametros para mandar al servicio
	private static void setParams(String name, String value) {
		params = params + "&" + name + "=" + value;
	}
}
