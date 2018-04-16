package com.Chiselon.ColourClassifieds.OR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects
{
	WebDriver driver;

	By username=By.id("username");
	By password=By.name("password");
	By submit=By.xpath("//input[@name='submit']");
	//By username=By.id("username");
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
	
	
	
}


