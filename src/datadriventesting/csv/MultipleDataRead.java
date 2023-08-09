package datadriventesting.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

// Script to read Multiple data from CSV file

public class MultipleDataRead {
	
public static void main(String[] args) throws IOException, CsvValidationException {
	
	String filePath = "./resources/credentials.csv";
	
	FileReader fr = new FileReader(filePath);
	
	CSVReader csvReader = new CSVReader(fr);
	
	String[] line = csvReader.readNext();
	
	while(line!= null) {
		System.out.print(line[0]+" ");
		System.out.println(line[1]);
		line = csvReader.readNext();
	}
	
	csvReader.close();
   }
}

// csv data
/*  admin,manager
	trainee,trainee
	hemanth,hemanth123
	karna,karna123
	mahibh,mahi007
*/