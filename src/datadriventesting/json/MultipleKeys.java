package datadriventesting.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


// Script to read data from .JSON file
public class MultipleKeys {

	public static void main(String[] args) throws Exception{
		String filePath = "./resources/testaccounts.json";
		
		FileReader fr = new FileReader(filePath);
		
		JSONParser jsonParser = new JSONParser();
		
		Object javaObject = jsonParser.parse(fr);
		JSONObject jsonObject = (JSONObject) javaObject;
		
		JSONObject testAccount1 = (JSONObject) jsonObject.get("testAccount1");
		System.out.print(testAccount1.get("username")+" = ");
		System.out.println(testAccount1.get("password"));
		
		JSONObject testAccount2 = (JSONObject) jsonObject.get("testAccount2");
		System.out.print(testAccount2.get("username")+" = ");
		System.out.println(testAccount2.get("password"));
				
		JSONObject testAccount3 = (JSONObject) jsonObject.get("testAccount3");
		System.out.print(testAccount3.get("username")+" = ");
		System.out.println(testAccount3.get("password"));
	}
}
// testaccounts.json
/*
 {
	"testAccount1": {
		"username":"admin",
		"password":"manager"
	},
	"testAccount2": {
		"username":"karna",
		"password" :"karna123"
	},
	"testAccount3": {
		"username":"mahi",
		"password":"mahi007"
	}
}
*/
