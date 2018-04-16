package com.Chiselon.ColourClassifieds.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.Page;

public class Baseutils 
{
	
	public static WebDriver driver;
	public static FileInputStream file;
	//public static FileInputStream file1;
	public static Properties prop;
	//public static Properties configprop;
	public static XSSFSheet sheet;
	public static XSSFWorkbook wb;
	
	public static Properties testdata(String propertiesfile)
	{
		try
		{
	    file =new FileInputStream(propertiesfile);
		prop=new Properties();
		prop.load(file);
		return prop;
		
		
		}
		catch (Exception e)
		{

			System.out.println("Test data method failed------>"+e.getMessage());
			return null;
		}
		
	}
	
	public static XSSFSheet excel() throws Exception
	{
		file=new FileInputStream(System.getProperty("user.dir")+"\\"+"src\\test\\excelsheet.xlsx");
	    wb= new XSSFWorkbook(file);
		sheet= wb.getSheet("Sheet1");
		//sheet.getRow(0).getCell(0).getStringCellValue();
		
		return sheet;
	}
	
	public static  WebDriver openbrowser(String Browservalue)
	{
		try
		{
		if(Browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			Baseutils.driver= new ChromeDriver();
		}
		else if(Browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if(Browservalue.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "Drivers//IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else
		{
			System.out.println(Browservalue+" "+"browser is in valid");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("openbrowser failed---->"+e.getMessage());
		}
		return driver;
	}
	public static WebDriver closebrowser(WebDriver driver)
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			System.out.println("closebrowsert failed"+ e.getMessage());
		}
		return null;
	}
	public static WebDriver geturl(WebDriver driver,String urlvalue)
	{
		try
		{
			driver.get(urlvalue);
		}
		catch(Exception e)
		{
			System.out.println("url not found----->"+e.getMessage());
		}
		return driver;
	}
	
	
	public static WebDriver click(WebDriver driver,String xpathvalue)
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).click();
			
		}
		catch(Exception e)
		{
			System.out.println("xpath failed");
			System.out.println(e.getMessage());
		}
		return driver;
		
	}
	
	public static WebDriver sendkeys(WebDriver driver,String xpathvalue,String keyvalue)
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).clear();
			driver.findElement(By.xpath(xpathvalue)).sendKeys(keyvalue);
		}
		catch(Exception e)
		{
			System.out.println("sendkeys method failed");
			System.out.println(e.getMessage());
		}
		return driver;
		
	}
	
	public static Select dropdown(WebDriver driver,String value)
	{
		WebElement ddxp = driver.findElement(By.name(value));
		Select dd = new Select(ddxp);
		return dd;
	   		
	}
	
	
	/*public static void dropdownbyindex(WebDriver driver,WebElement value, int num)
	{
		Select ddi = new Select(value);
		ddi.selectByIndex(num);
	   		
	}
	
	public static Select dropdownbyvisibletext(WebDriver driver,WebElement value,String attribute)
	{
		Select ddt = new Select(value);
		ddt.selectByVisibleText(attribute);
		return ddt;
	}
	
	public static Select dropdownbyvalue(WebDriver driver,WebElement value,String number)
	{
		Select ddv = new Select(value);
		ddv.selectByValue(number);
		return ddv;
		
	}*/
	/*public static Properties testdataconfig(String congpropertiespath) 
	{
		try{
			
		
		file1 =new FileInputStream(congpropertiespath);
		configprop=new Properties(); 
		configprop.load(file1);
		}catch (Exception e) 
		{
			System.out.println("testdataconfig----->"+e.getMessage());
		}
		return configprop;
		
	}
*/

}
