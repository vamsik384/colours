package com.Chiselon.ColourClassifieds.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.Chiselon.ColourClassifieds.OR.pages.PostAdpageObjects;


public class Postad_code extends Baseutils
{
	public Postad_code(WebDriver driver)
	{
		this.driver = driver;
	}
	public void postad(WebDriver driver) throws Exception
	{
	Select dd = Baseutils.dropdown(driver, sheet.getRow(13).getCell(1).getStringCellValue());
	dd.selectByIndex(4);
	PostAdpageObjects pa = new PostAdpageObjects(driver);
	pa.title().sendKeys(sheet.getRow(14).getCell(1).getStringCellValue());
	pa.description().sendKeys(sheet.getRow(15).getCell(1).getStringCellValue());
	pa.register_button().click();
	pa.upload_picture_button().click();
	pa.chosefile_button().click();
	Robot robo=new Robot();
	String filepath = "C:\\Users\\INDIA\\Desktop\\s8_black_retail.jpg";
	StringSelection sel = new StringSelection(filepath);
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard.setContents(sel,sel);
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	pa.upload_button().click();
	pa.finishad_button().click();
		
	
	}
}
