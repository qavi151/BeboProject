package DataDrivenPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFile {
	public static void main(String Args[]) throws IOException {
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//TestData//SelTestFile.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int totalrows = sheet.getLastRowNum();
	int totalcells = sheet.getRow(1).getLastCellNum();
	System.out.println("Total rows " + totalrows);
	System.out.println("Total cells "+totalcells);
	
	for(int r=0; r<totalrows; r++) {
		XSSFRow currentRow = sheet.getRow(r);
		for(int c=0; c<totalcells; c++) {
			String value = currentRow.getCell(c).toString();
			System.out.print(value+"    ");
		}
		System.out.println();
	}
	workbook.close();
	file.close();
 }
}
