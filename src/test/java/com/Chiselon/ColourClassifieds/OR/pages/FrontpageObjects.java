package com.Chiselon.ColourClassifieds.OR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrontpageObjects
{
	public WebDriver driver;

	By logon=By.xpath("//a[text()='Log in']");
	By logout= By.xpath("//td//a[text()='Log out']");
	By search_button= By.name("searchword");
	By s_button= By.name("do_search");
	By member_area= By.xpath("//td//a[contains(text(),'Area')]");
	By add_ad= By.xpath("//a[text()='Add Ad']");
	By front_page= By.xpath("//td//a[contains(text(),'Front')]");
	By browse_picture= By.xpath("//td//a[contains(text(),'Picture')]");
	By latest_ad= By.xpath("//td//a[contains(text(),'Latest')]");
	By top_ad= By.xpath("//td//a[text()='Top ads']");
	By my_favourite= By.xpath("//td//a[contains(text(),'My')]");
	By top_rated= By.xpath("//td//a[contains(text(),'Rated')]");
	By search= By.xpath("//td//a[contains(text(),'Latest')]");
	By link= By.xpath("//u[text()='ColourClassifieds.com']");
	By wap= By.xpath("//a[text()='WAP']");
	
	
	public FrontpageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement search_button()
	{
		return driver.findElement(search_button);
		
	}
	
	public WebElement s_button()
	{
		return driver.findElement(s_button);
		
	}
	
	public WebElement add_ad()
	{
		return driver.findElement(add_ad);
		
	}
	public WebElement logonclick()
	{
		return driver.findElement(logon);
		
	}
	
	public WebElement logoutclick()
	{
		return driver.findElement(logout);
	}
	
	public WebElement search()
	{
		return driver.findElement(search);
				
	}
	public WebElement link()
	{
		return driver.findElement(link);
				
	}
	
	public WebElement wap()
	{
		return driver.findElement(wap);
				
	}
	public WebElement top_rated()
	{
		return driver.findElement(top_rated);
				
	}
	public WebElement my_favourite()
	{
		return driver.findElement(my_favourite);
				
	}
	public WebElement latest_ad()
	{
		return driver.findElement(latest_ad);
				
	}
	public WebElement top_ad()
	{
		return driver.findElement(top_ad);
				
	}
	public WebElement front_page()
	{
		return driver.findElement(front_page);
				
	}
	
	public WebElement browse_picture()
	{
		return driver.findElement(browse_picture);
	}			

}
