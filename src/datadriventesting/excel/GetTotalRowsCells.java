package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Script to get Total number of Row and Cells

public class GetTotalRowsCells {

	public static void main(String[] args) throws IOException {
		
		String filePath = "./resources/testdata.xlsx";
		
		FileInputStream fin = new FileInputStream(filePath);
		
		Workbook workbook = WorkbookFactory.create(fin);
		
		int rowCount = workbook.getSheet("Multiple").getPhysicalNumberOfRows();
		int cellCount = workbook.getSheet("Multiple").getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("rowCount="+rowCount);
		System.out.println("cellCount="+cellCount);
	}
}
//Always store the excel sheet data file inside selenium workspace
//hear folder name:- resources --> sheet file name-->testdata--> under sheet names--> (sheet3)Multiple.
// Excel data
/*
username	password
admin		manager
trainee		trainee
bhaskar		bhaskar123
bharath		bharath123
mahi		mahi007

*/