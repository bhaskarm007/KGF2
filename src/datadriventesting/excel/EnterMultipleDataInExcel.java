package datadriventesting.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Script to Write Multiple data into the Excel Sheet

public class EnterMultipleDataInExcel {
	
public static void main(String[] args) throws IOException {
	
	String filePath = "./resources/testoutput.xlsx";
	
	FileOutputStream fout = new FileOutputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(true);
	
	String [][]sarr= {
			 			{"admin", "manager"},
			 			{"trainee", "trainee"},
			 			{"hemanth", "hemanth123"},
			 			{"bharath", "bharath123"},
			 			{"Mahibh", "mahi1998"}
	               };
	
	Sheet sheet = workbook.createSheet("Multiple");
	
	for(int i=0;i<=sarr.length-1;i++) {
	Row row = sheet.createRow(i);
	for(int j=0;j<=sarr[i].length-1;j++) {
		row.createCell(j).setCellValue(sarr[i][j]);
       }
    }
	
	workbook.write(fout);
	
	System.out.println("Writing Done...!!!");
  }
}
// We will get FileNotFoundWxception if the File is open while Writing