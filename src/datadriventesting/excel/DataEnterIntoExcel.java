package datadriventesting.excel;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Script to Store value in single cell

public class DataEnterIntoExcel {
	
public static void main(String[] args) throws IOException {
	
	String filePath = "./resources/testoutput.xlsx";
	
	FileOutputStream fout = new FileOutputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(true);
	
	workbook.createSheet("TC001").createRow(0).createCell(0).setCellValue("Testing");
	
	workbook.write(fout);
	
	System.out.println("Writing Done...!!!");
}
}
