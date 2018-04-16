package com.Chiselon.ColourClassifieds.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Chiselon.ColourClassifieds.OR.pages.LatestadpageObjects;

public class latestad_code extends Baseutils
{
	
	String l1;
	String l2;
	public latestad_code(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebDriver code()
	{
		
		List<WebElement> late=driver.findElements(By.xpath("((//table)[5]//tr/td/a)"));
		System.out.println(late.size());
		for(int i=1;i<=late.size();i++)
		{
			l2=driver.findElement(By.xpath("((//table)[5]//tr/td[3])["+ i + "]")).getText();
			l1=driver.findElement(By.xpath("((//table)[5]//tr/td/a)["+ i + "]")).getText();
			System.out.println(l1+"------------"+l2);
			
		}
		return driver;
	}
	 

}
