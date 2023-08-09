package datadriventesting.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

// Script to understand how to read from CSV file

public class readCsvFile {

	public static void main(String[] args) throws IOException, CsvValidationException {
	
	String filePath = "./resources/csvtestdata.csv";
	
	FileReader fr = new FileReader(filePath);
	
	CSVReader csvReader = new CSVReader(fr);
	
	String[] firstLine = csvReader.readNext();
	
	String firstName = firstLine[0];
	String lastName = firstLine[1];
	String place = firstLine[2];
	
	System.out.println(firstName);
	System.out.println(lastName);
	System.out.println(place);
	
	csvReader.close();
   }
}
// We have to download Dependencies files from mvnrepositery.com
//Dependencies are:-(Download latest versions of jar files and

/* 1. Commons - beanutils
   2. commons - collections 
   3. commons - lang3
   4. commons - text
   5. OpenCsv

// Steps to configure opencsv in Eclipse
 * 1. Go to mvnrempositry.com
 * 2. search for opencsv
 * 3. click on opencsv
 * 4. click on latest stable version link
 * 5. click on jar in files section
 * 6. copy paste the jar file in Eclipse> jars> opencsv folder
 * 7. Right click on jar file > build path > add to build path
 
   */

// csv data
// bhaskar,karna,mahi