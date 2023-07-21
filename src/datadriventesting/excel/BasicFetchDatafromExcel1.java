package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
// Data read from Excel Sheet 
public class BasicFetchDatafromExcel1 {
public static void main(String[] args) throws FileNotFoundException, EncryptedDocumentException, IOException {
	
	String filePath = "./resources/testdata.xlsx";
	
	FileInputStream fin = new FileInputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(fin);
	
	String url = workbook.getSheet("TC001").getRow(1).getCell(0).getStringCellValue();
	String username = workbook.getSheet("TC001").getRow(1).getCell(1).getStringCellValue();
	String password = workbook.getSheet("TC001").getRow(1).getCell(2).getStringCellValue();
	
	
	System.out.println("URL="+url);
	System.out.println("username="+username);
	System.out.println("password="+password);
}
}
// Excel sheet data
/*
        url	                       ||username ||password
https://demo.actitime.com/login.do || admin   ||manager

 * */
