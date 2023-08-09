package datadriventesting.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// Program to read all the configuration from the .properties file and store it in Map

public class StoreInMap {

	public static void main(String[] args) throws IOException {
		String filePath = "./resources/config.properties";
		FileInputStream fin = new FileInputStream(filePath);
		Properties properties = new Properties();
		properties.load(fin);
		
		Set<Object> allKeys = properties.keySet();
	    Map map = new LinkedHashMap();
		for (Object key : allKeys) {
			map.put(key, properties.get(key));
		}
		
		Set allMapKeys = map.keySet();
		for (Object key : allMapKeys) {
			System.out.println(map.get(key));
		}
	}
}
