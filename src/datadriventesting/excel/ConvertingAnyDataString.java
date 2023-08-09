package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Data Read from Excel Sheet, and Converting any Data into String

public class ConvertingAnyDataString {

	public static void main(String[] args) throws IOException {
	
		String filePath = "./resources/testdata.xlt";
		
		FileInputStream fin = new FileInputStream(filePath);
		
		Workbook workbook = WorkbookFactory.create(fin);
		
		String name = workbook.getSheet("TC002").getRow(1).getCell(0).toString();
		String age = workbook.getSheet("TC002").getRow(1).getCell(1).toString();
		String passed = workbook.getSheet("TC002").getRow(1).getCell(2).toString();
		String date = workbook.getSheet("TC002").getRow(1).getCell(3).toString();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("passed="+passed);
		System.out.println("date="+date);
		
		System.out.println("---------Afteer Parsing---------");
		
		int myAge= (int) Double.parseDouble(age);
		boolean pass = Boolean.parseBoolean(passed);
		System.out.println("myAge="+myAge);
		System.out.println("pass="+pass);
		
		System.out.println("-----After Converting to String----------");
		
		String myRealAge = Integer.toString(myAge);
		String p= Boolean.toString(pass);
		
		System.out.println("myRealAge="+myRealAge);
		System.out.println("p="+p);
}
}
//Always store the excel sheet data file inside selenium workspace
//hear folder name:- resources --> sheet file name-->testdata--> under sheet names--> (sheet2)TC002.
//Excel sheet data
//Saved this into (97-2003) extension .xlt
/*
String Data||Number||Boolean||Date
  Mahi     || 7    ||TRUE   ||17-06-1998

*/
