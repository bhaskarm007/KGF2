package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Script to iterates Multiple data

public class IteratesMultipleData {
	
public static void main(String[] args) throws IOException {
	
	String filePath = "./resources/testdata.xlsx";
	
	FileInputStream fin = new FileInputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(fin);
			
	Sheet sheet = workbook.getSheet("Multiple");
	
	int rowCount = sheet.getPhysicalNumberOfRows();
	int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
	
	System.out.println("rowCount="+rowCount);
	System.out.println("cellCount="+cellCount);
	
	System.out.println("=====================");
	String[][] sarr = new String[rowCount][cellCount];
	
	
	// Iterate the row
	for(int i=0;i<=rowCount-1;i++) {
		// Iterate the cell
		for(int j=0;j<=cellCount-1;j++) {
			sarr[i][j] = sheet.getRow(i).getCell(j).toString();
		}
	}
	System.out.println("=====================");
	
	for(int i=0;i<=sarr.length-1;i++) {
		for(int j=0;j<=sarr[i].length-1;j++) {
			System.out.print(sarr[i][j]+" ");
		}
		System.out.println();
	}
	
    System.out.println("=====================");
    
    for(int i=0;i<=sarr.length-1;i++) {
    	System.out.print(sarr[i][0]+"  ");
    	System.out.println(sarr[i][1]);
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

