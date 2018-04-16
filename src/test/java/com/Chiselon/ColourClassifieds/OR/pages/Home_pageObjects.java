package com.Chiselon.ColourClassifieds.OR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_pageObjects
{
	WebDriver driver;
	
	By post_ad= By.xpath("//td//a[contains(text(),'New')]");
	By edit_ad= By.xpath("//td//a[contains(text(),'Edit')]");
	By favorite= By.xpath("//td//a[contains(text(),' Favorite')]");
	By notify_ad= By.xpath("//td//a[contains(text(),'Notify')]");
	By payment= By.xpath("//td//a[contains(text(),'Payment')]");
	By order_history= By.xpath("//td//a[contains(text(),'Order')]");
	By change_info= By.xpath("//td//a[contains(text(),'info')]");
	By change_password= By.xpath("//td//a[contains(text(),'password')]");
	
	
	
	public Home_pageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement post_ad()
	{
		return driver.findElement(post_ad);
	}
	
	public WebElement edit_ad()
	{
		return driver.findElement(edit_ad);
	}
	
	public WebElement favorite()
	{
		return driver.findElement(favorite);
	}
	
	public WebElement notify_ad()
	{
		return driver.findElement(notify_ad);
	}
	
	public WebElement payment()
	{
		return driver.findElement(payment);
	}
	
	public WebElement order_history()
	{
		return driver.findElement(order_history);
	}
	
	public WebElement change_info()
	{
		return driver.findElement(change_info);
	}
	
	public WebElement change_password()
	{
		return driver.findElement(change_password);
	}
	
}


