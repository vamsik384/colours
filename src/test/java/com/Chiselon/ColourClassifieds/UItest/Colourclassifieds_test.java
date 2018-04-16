package com.Chiselon.ColourClassifieds.UItest;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.OR.pages.FrontpageObjects;
import com.Chiselon.ColourClassifieds.OR.pages.LatestadpageObjects;
import com.Chiselon.ColourClassifieds.OR.pages.LoginPageObjects;
import com.Chiselon.ColourClassifieds.OR.pages.PostAdpageObjects;
import com.Chiselon.ColourClassifieds.Utilities.Baseutils;
import com.Chiselon.ColourClassifieds.Utilities.Browsepic_code;
import com.Chiselon.ColourClassifieds.Utilities.Postad_code;
import com.Chiselon.ColourClassifieds.Utilities.latestad_code;
import com.sun.org.apache.bcel.internal.generic.DDIV;

public class Colourclassifieds_test extends Baseutils

{
	
	
	@Test
	public void TC_001() throws Exception 
	{
		
		/*System.out.println(System.getProperty("user.dir"));
		System.out.println("excel method");*/
		sheet=Baseutils.excel();
		System.out.println("excel mothod activated");
		driver=Baseutils.openbrowser(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println("--browser opened");
		driver.manage().window().maximize();
		Baseutils.geturl(driver,sheet.getRow(4).getCell(1).getStringCellValue());
		FrontpageObjects hp=new FrontpageObjects(driver);
		hp.logonclick().click();
		System.out.println("---navigated to login page");
		LoginPageObjects lp1=new LoginPageObjects(driver);
		lp1.username().sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
		lp1.password().sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		lp1.submit().click();
		System.out.println("---clicked on login button");
		hp.latest_ad().click();
		System.out.println("clicked on latest ad");
		latestad_code latest=new latestad_code(driver);
		latest.code();
		hp.browse_picture().click();
		Browsepic_code bc =  new Browsepic_code(driver);
		bc.browsepic(driver);
		hp.add_ad().click();
		Postad_code pc = new Postad_code(driver);
		pc.postad(driver);
		//Po/stAdpageObjects post= new PostAdpageObjects(driver);
		
		
		
		//hp.logoutclick().click();
		//System.out.println("clicked on logout");
		///driver=Baseutils.closebrowser(driver);
	
	}
	

}
