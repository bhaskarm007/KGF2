package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
// Script to get Multiple rows and cells count, number and values
public class GetMultipleRowsCells {

	public static void main(String[] args) throws IOException {
		String filePath = "./resources/testdata.xlsx";
		
		FileInputStream fin = new FileInputStream(filePath);
		
		Workbook workbook = WorkbookFactory.create(fin);
      
		Sheet sheet = workbook.getSheet("Multiple");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("rowCount="+rowCount);
		System.out.println("cellCount="+cellCount);

		System.out.println("=======================");
// Getting rows and cells numbers
		
		// Iterate the rows
		for(int i=0;i<=rowCount-1;i++) {
			//Iterate the Cells 
			for(int j=0;j<=cellCount-1;j++) {
				System.out.print(""+i+j+"::");
				
				}
		System.out.println();
	}
	
System.out.println("-----rows and cells values---------------");

		// Iterate the rows
		for(int i=0;i<=rowCount-1;i++) {
			// Iterate the cells
			for(int j=0;j<=cellCount-1;j++) {
				System.out.print(sheet.getRow(i).getCell(j).toString()+" ");
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