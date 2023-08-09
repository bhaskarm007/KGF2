package datadriventesting.json;


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Script to understand JSON file read data

public class ReadData {

	public static void main(String[] args) throws IOException, ParseException {

String filePath = "./resources/testdata.json";

FileReader fr = new FileReader(filePath);

JSONParser jsonParser = new JSONParser();

Object javaObj = jsonParser.parse(fr);
JSONObject jsonObject = (JSONObject) javaObj;

String username1 = (String) jsonObject.get("username1");
String password1 = (String) jsonObject.get("password1");
String username2 = (String) jsonObject.get("username2");
String password2 = (String) jsonObject.get("password2");

System.out.println("username1="+username1);
System.out.println("password1="+password1);

System.out.println("username2="+username2);
System.out.println("password2="+password2);
	
	}
}

// testdata.json
/*
  {
	"username1": "admin",
	"password1": "manager",
	"username2": "mahibh",
	"password2": "mahi007"
  }
*/