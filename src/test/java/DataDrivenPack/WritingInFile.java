package DataDrivenPack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingInFile {
	public static void main(String Args[]) throws IOException{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"//TestData//WritSelTest.xlsx");
		XSSFWorkbook work = new XSSFWorkbook();
		XSSFSheet sheet = work.createSheet();
		Scanner sc = new Scanner(System.in);
		for(int r=0; r<=3; r++) {
			XSSFRow currentRow = sheet.createRow(r);
			for(int c=0; c<2; c++){
				System.out.println("Enter A value");
				String value = sc.next();
				currentRow.createCell(c).setCellValue(value);
			}
		}
		work.write(file);
		work.close();
		System.out.println("Data Inserted");
	}
}
