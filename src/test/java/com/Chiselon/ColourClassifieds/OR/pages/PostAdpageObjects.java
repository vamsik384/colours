package com.Chiselon.ColourClassifieds.OR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostAdpageObjects 
{
	WebDriver driver;
	
	By category_dropdown= By.name("catid");
	By title= By.name("ad_title");
	By description = By.id("ad_description");
	By register_button= By.xpath("//input[@value='Register']");
	By upload_picture_button= By.xpath("(//a[contains(text(),'Picture')])[2]");
	By chosefile_button= By.name("photo");
	By upload_button= By.xpath("//input[@value='Upload']");
	By finishad_button= By.xpath("//input[@value='Finish ad']");
	
	public PostAdpageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement category_dropdown()
	{
		return driver.findElement(category_dropdown);
	}
	public WebElement title()
	{
		return driver.findElement(title);
	}
	public WebElement description()
	{
		return driver.findElement(description);
	}
	public WebElement register_button()
	{
		return driver.findElement(register_button);
	}
	public WebElement upload_picture_button()
	{
		return driver.findElement(upload_picture_button);
	}
	public WebElement chosefile_button()
	{
		return driver.findElement(chosefile_button);
	}
	public WebElement upload_button()
	{
		return driver.findElement(upload_button);
	}
	public WebElement finishad_button()
	{
		return driver.findElement(finishad_button);
	}


}
