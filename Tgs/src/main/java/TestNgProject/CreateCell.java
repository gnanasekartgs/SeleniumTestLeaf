package TestNgProject;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class CreateCell {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./testDate/Createlead.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheet("Sheet2");
		//row1
		XSSFRow row1 = sheet.createRow(0);
		XSSFCell r1cell1 = row1.createCell(0);
		r1cell1.setCellValue("NAME");
		
		XSSFCell r1cell2 = row1.createCell(1);
		r1cell2.setCellValue("Address");
	
		XSSFCell r1cell3 = row1.createCell(1);
		r1cell3.setCellValue("ID NO");
	
		XSSFRow row2 = sheet.createRow(1);
		XSSFCell r2cell1 = row2.createCell(0);
		r2cell1.setCellValue("gnana");

		XSSFCell r2cell2 = row2.createCell(1);
		r2cell2.setCellValue("chennai");

		XSSFCell r2cell3 = row2.createCell(2);
		r2cell3.setCellValue("001");
		
		XSSFRow row3 = sheet.createRow(2);
		XSSFCell r3cell1 = row3.createCell(0);
		r3cell1.setCellValue("sekar");

		XSSFCell r3cell2 = row3.createCell(1);
		r3cell2.setCellValue("bangalore");

		
		XSSFCell r3cell3 = row3.createCell(2);
		r3cell3.setCellValue("002");
		fis.close();
		
		FileOutputStream fos =new FileOutputStream(new File("./testDate/Createlead.xlsx"));
        wbook.write(fos);
		fos.close();
		
		System.out.println("data write completed");
	}

}
