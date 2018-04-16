package com.Chiselon.ColourClassifieds.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;

public class brwsepictures extends Baseutils
{
	@Test
public static void browse()
{
	openbrowser("chrome");
	geturl(driver,"http://localhost/colour/");
driver.findElement(By.xpath("//a[@title='Browse Pictures']")).click();
Select sel = new Select(driver.findElement(By.xpath("//select[@name='catid']")));
sel.selectByIndex(2);
	
	
	
	
	
	}
}
