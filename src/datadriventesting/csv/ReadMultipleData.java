package datadriventesting.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

// Script to read Multiple data from CSV file

public class ReadMultipleData {

	public static void main(String[] args) throws Exception {
		
		String filePath = "./resources/credentials.csv";

		FileReader fr = new FileReader(filePath);
		
		CSVReader csvReader = new CSVReader(fr);
		
		List<String[]> allLinesList = csvReader.readAll();
		for(String[] sarr:allLinesList) {
			System.out.print(sarr[0]+" ");
			System.out.println(sarr[1]);
		}
		
		System.out.println("================");
		
		for (String[] sarr : allLinesList) {
			for(String s:sarr) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
		
		csvReader.close();
	}
}

//csv data(save it any file notepad,MS Excel,Jedit(mac))

/*  admin,manager
	trainee,trainee
	hemanth,hemanth123
	karna,karna123
	mahibh,mahi007
*/