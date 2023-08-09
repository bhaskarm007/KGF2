package datadriventesting.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

// Program to read all the configurations from the .properties file
public class AllRead {

	public static void main(String[] args) throws IOException {

    String filePath = "./resources/config.properties";
    FileInputStream fin = new FileInputStream(filePath);
	Properties properties = new Properties();
	properties.load(fin);
	
	Set<Object> allKeys = properties.keySet();
	for (Object key : allKeys) {
		System.out.print(key+"  ");
        System.out.println(properties.get(key));
	}
	
	}

}
