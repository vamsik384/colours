package Chiselon.ColourClassifieds;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class demo
{   
	
	@Test
	public static void excel() throws Exception
	{
		FileInputStream file2=new FileInputStream(System.getProperty("user.dir")+"\\"+"src\\test\\excelsheet.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file2);
		XSSFSheet sheet= wb.getSheet("Sheet1");
				
		System.out.println(sheet.getRow(3).getCell(1).getStringCellValue());
	
	}
	

}
