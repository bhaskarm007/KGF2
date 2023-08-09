package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Script to create Excel Library framework

public class ExcelLibrary {

	private static final String FILEPATH = 	"./resources/testdata.xlsx";
	
	private static Workbook workbook;
	
	static {
		System.out.println("Creating the Workbook Type object");
		try {
			workbook = WorkbookFactory.create(new FileInputStream(FILEPATH));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getStringData(String sheetName, int rowNumber, int cellNumber) {
		return workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).toString();
	}
	
	public static double getNumericData(String sheetName, int rowNumber, int cellNumber) {
		return workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getNumericCellValue();		
	}
	
	public static boolean getBooleanData(String sheetName, int rowNumber, int cellNumber) {
	return workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getBooleanCellValue();
    }
	public static Date getDate(String sheetName, int rowNumber, int cellNumber) {
		return workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getDateCellValue();
	}
	public static String[][] getMulitpleData(String sheetName){
		
		Sheet sheet = workbook.getSheet(sheetName);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] sarr = new String[rowCount-1][cellCount];
		 
		// Iterate the rows
		for(int i=1, k=0;i<=rowCount-1;i++,k++) {
			// Iterate the Cells
			for(int j=0; j<=cellCount-1; j++) {
				sarr[k][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return sarr;
	}
}