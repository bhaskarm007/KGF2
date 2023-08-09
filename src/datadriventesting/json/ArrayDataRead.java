package datadriventesting.json;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// Script to store data in .jsonArray file
public class ArrayDataRead {
 
	public static void main(String[] args) throws Exception {
	String filePath = "./resources/testdataarray.json";
	
	FileReader fr = new FileReader(filePath);
	
	JSONParser jsonParser = new JSONParser();
	
	Object javaObject = jsonParser.parse(fr);
	JSONObject jsonObject = (JSONObject) javaObject;
	
 JSONArray jsonArray = (JSONArray) jsonObject.get("person");
  
   for (int i = 0; i <=jsonArray.size()-1; i++) {
	System.out.print(jsonArray.get(i)+" , ");
   }
  }
}
