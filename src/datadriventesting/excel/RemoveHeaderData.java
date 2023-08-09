package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Script to Exclude the header data

public class RemoveHeaderData {
	
public static void main(String[] args) throws IOException {
	
	String filePath = "./resources/testdata.xlsx";
	
	FileInputStream fin = new FileInputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(fin);
	
	Sheet sheet = workbook.getSheet("Multiple");
	
	int rowCount = sheet.getPhysicalNumberOfRows();
	int cellCount =sheet.getRow(0).getPhysicalNumberOfCells();
	
	System.out.println("rowCount="+rowCount);
	System.out.println("cellCount="+cellCount);
	
	System.out.println("===================");
	
	String[][] sarr = new String[rowCount-1][cellCount];
	
	// Iterate the rows
	for(int i=1, k=0; i<=rowCount-1;i++,k++) {
		// Iterate the cells
		for(int j=0; j<=cellCount-1;j++) {
			sarr[k][j] = sheet.getRow(i).getCell(j).toString();
		}
	}
	
	System.out.println("----------------");
	for(int i=0; i<=sarr.length-1;i++) {
		for(int j=0;j<=sarr[i].length-1;j++) {
			System.out.print(sarr[i][j]+"  ");
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