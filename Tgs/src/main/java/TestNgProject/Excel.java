package TestNgProject;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public String[][] excelRead(String excelfilename) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./testDate/"+excelfilename+".xlsx");
		
		
		// to get the sheet by using index value or the sheet name wbook.getSheetAt(0);
		
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row count" +rowcount);
		
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("coulmn count: "+colcount);
		
		String[][] data = new String[rowcount][colcount];
		
		for (int i = 1; i <= rowcount; i++) 
		{
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < colcount; j++)
			{
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				//System.out.println(data);
				data[i-1][j] = value;
			}
	}
		return data;
	}
		String[][] companyRead(String excelfilename) throws IOException
		{
		XSSFWorkbook xwbook = new XSSFWorkbook("./testDate/"+excelfilename+".xlsx");
		
		XSSFSheet cname = xwbook.getSheet("Sheet1");
		int cnamerow = cname.getLastRowNum();
		short cnamecell = cname.getRow(0).getLastCellNum();
		
		String [][] name = new String[cnamerow][cnamecell];
		return name;	
	}
		public String[][] companyName(String excelfilename) throws IOException
		{
			XSSFWorkbook xwbook = new XSSFWorkbook("./testDate/"+excelfilename+".xlsx");
			XSSFSheet sheetAt = xwbook.getSheetAt(2);
			XSSFRow row = sheetAt.getRow(1);
			int rownum = row.getRowNum();
			System.out.println(rownum);
			XSSFCell cell = row.getCell(3);
			
			double cellnum = (int) cell.getNumericCellValue();
			System.out.println(cellnum);
			
			String newvalue = cell.getStringCellValue();
			System.out.println("New Company name" +newvalue);
			cell.setCellValue(newvalue);
			
			String[][] data = new String[rownum][(int) cellnum];
			data[rownum][(int) cellnum] = newvalue;
			return data;
			
			
			
		}
}
