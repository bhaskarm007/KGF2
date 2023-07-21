package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Dat Read From Excel sheet (.xls) .xlt(97-2003) format

public class DiffernetTypesData {
	
public static void main(String[] args) throws IOException {
	String filePath = "./resources/testdata.xlt";
	
	FileInputStream fin = new FileInputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(fin);
	
	String name = workbook.getSheet("TC002").getRow(1).getCell(0).getStringCellValue();
	double age = workbook.getSheet("TC002").getRow(1).getCell(1).getNumericCellValue();
	boolean passed = workbook.getSheet("TC002").getRow(1).getCell(2).getBooleanCellValue();
	Date date = workbook.getSheet("TC002").getRow(1).getCell(3).getDateCellValue();

	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("passed="+passed);
	System.out.println("date="+date);
}
}
//Excel sheet data
// Saved this into (97-2003) extension .xlt
/*
String Data||Number||Boolean||Date
 Mahi      || 7    ||TRUE   ||17-06-1998

 */

