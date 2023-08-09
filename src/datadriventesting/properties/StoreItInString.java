package datadriventesting.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

//Program to read all the configuration from the .properties file and store it in String

public class StoreItInString {

	public static void main(String[] args) throws IOException {
	   String filePath = "./resources/config.properties";
       FileInputStream fin = new FileInputStream(filePath);
       Properties properties = new Properties();
       properties.load(fin);
       
       Set<Object> allKeys = properties.keySet();
       List<Object> allKeysList = new ArrayList<Object>(allKeys);
       String[][] sarr = new String[allKeys.size()][2];
       
       for (int i = 0; i <= sarr.length-1; i++) {
		String key = (String) allKeysList.get(i);
		sarr[i][0] = key;
		sarr[i][1] = properties.getProperty(key);
       }
       
       for (int i = 0; i <= sarr.length-1; i++) {
		System.out.print(sarr[i][0]+" = ");
		System.out.println(sarr[i][1]);
	   }
	 }
   }
