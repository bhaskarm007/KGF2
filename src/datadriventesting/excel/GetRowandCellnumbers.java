package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
// Script to get row and cell series numbers

public class GetRowandCellnumbers {

	public static void main(String[] args) throws IOException {
		
		String filePath = "./resources/testdata.xlsx";
		
		FileInputStream fin = new FileInputStream(filePath);

		Workbook workbook = WorkbookFactory.create(fin);
		
		Sheet sheet = workbook.getSheet("Multiple");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("rowCount="+rowCount);
		System.out.println("cellCount="+cellCount);
		
	// Iterate the rows
		for(int i=0;i<=rowCount-1;i++) {
			//Iterate the Cells 
			for(int j=0;j<=cellCount-1;j++) {
				System.out.print(""+i+j+"::");
			}
			System.out.println();
		}
	}
}
//Always store the excel sheet data file inside selenium workspace
//hear folder name:- resources --> sheet file name-->testdata--> under sheet names--> (sheet3)Multiple.
//Excel data
/*
username	password
admin		manager
trainee		trainee
bhaskar		bhaskar123
bharath		bharath123
mahi		mahi007

*/
