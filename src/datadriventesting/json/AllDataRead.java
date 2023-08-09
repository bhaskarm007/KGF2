package datadriventesting.json;

import java.io.FileReader;
import java.util.Set;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// Script to read data all from .json file 
public class AllDataRead {

	public static void main(String[] args) throws Exception {
	 String filePath = "./resources/testaccounts.json";
	 
	 FileReader fr = new FileReader(filePath);
	 
	 JSONParser jsonParser = new JSONParser();
	 
	 Object javaObject = jsonParser.parse(fr);
	 JSONObject jsonObject = (JSONObject) javaObject;
	 
	 Set allKeys = jsonObject.keySet();
	 for (Object key : allKeys) {
		JSONObject testAccount = (JSONObject) jsonObject.get(key);
		System.out.print(testAccount.get("username")+" = ");
		System.out.println(testAccount.get("password"));
	}
  }
}
