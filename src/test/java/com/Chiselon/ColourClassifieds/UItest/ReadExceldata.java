package com.Chiselon.ColourClassifieds.UItest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExceldata 
{

	XSSFWorkbook wb;
	XSSFSheet sht;
	XSSFRow rw;
	FileInputStream fis;
	String[][] data;	
	int i, j;
	
	@Test
	public void exldata() throws Exception
	{
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\excelsheet.xlsx");
		wb=new XSSFWorkbook(fis);
		sht=wb.getSheet("test");
		rw=sht.getRow(0);
		System.out.println(sht.getLastRowNum());
		System.out.println(rw.getLastCellNum());
		data=new String[sht.getLastRowNum()][rw.getLastCellNum()];
		System.out.println(data);
		/*for(i=1;i<sht.getLastRowNum();i++)
		{
			for(j=1;j<rw.getLastCellNum();j++)
			{
				data[i-1][j]=sht.getRow(i).getCell(j).getStringCellValue();
				
			}
			System.out.println(data);
		}*/
		//System.out.println(data[i][j]);
	
	}
	
	
	
}
