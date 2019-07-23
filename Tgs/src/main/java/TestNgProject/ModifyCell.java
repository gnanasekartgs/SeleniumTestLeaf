package TestNgProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModifyCell {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testDate/Createlead.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(1);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		cell.setCellValue("Madras");
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("./testDate/Createlead.xlsx");
		wbook.write(fos);
		fos.close();
		System.out.println("modified");	
	}
}
