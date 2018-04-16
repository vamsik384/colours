package com.Chiselon.ColourClassifieds.OR.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LatestadpageObjects 
{
	public WebDriver driver;
	
	By titlerow_data= By.xpath("//table[3]//tr/td[2]");
	By upload_date= By.xpath("//table[3]//tr/td[3]");

	
	public List<WebElement> titlerow_data()
	{
		return driver.findElements(titlerow_data);
	}
	
	public List<WebElement> upload_date()
	{
		return driver.findElements(upload_date);
	}
	
	
}
