package com.Chiselon.ColourClassifieds.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Browsepic_code extends Baseutils
{
	WebDriver driver;
	public Browsepic_code(WebDriver driver)
	{
		this.driver=driver;
	}

public static void browsepic(WebDriver driver)
{
	Select browsepic_dd = dropdown(driver,sheet.getRow(13).getCell(1).getStringCellValue());
	browsepic_dd.selectByIndex(2);
	
	
	
	}
}
