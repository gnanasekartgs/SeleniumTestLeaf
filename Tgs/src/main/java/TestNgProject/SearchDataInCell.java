package TestNgProject;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SearchDataInCell {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		findAddressByName("sekar");
	}
		
		public static String findAddressByName(String uname) throws InvalidFormatException, IOException {
	        String fileLocation = "./testDate/Createlead.xlsx";
	        XSSFWorkbook wb = new XSSFWorkbook(new File(fileLocation));
	        XSSFSheet sheetAt = wb.getSheetAt(1);
	        for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
	            XSSFSheet sheet = wb.getSheetAt(sheetIndex);
	            System.out.println(sheet);
	            for (int rowIndex = 0; rowIndex < sheet.getLastRowNum(); rowIndex++) {
	                XSSFRow row = sheet.getRow(rowIndex);
	                System.out.println(row);
	                if (row != null && row.getCell(0).getStringCellValue().equals(uname)) {
	          
	                	 String rawValue = row.getCell(1).getRawValue();
	              
	                	 System.out.println(rawValue.length());
	                	 return rawValue;
	                }
	            }
	        }
	        return "";
	    }

}


