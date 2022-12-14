package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;



public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{

	//test steps
	@Test
	public void verifyLOgOutFunctionality() throws IOException
	{
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickMenuButton();
		System.out.println("clicked on menu button");
		
		hp.clickLogOutButton();
		System.out.println("clicked on logoUt button");
		
		ScreenshotClass.takeScreenshot(driver);
		
		System.out.println("apply the validation");
		
		   String expectedTitle = "Swag Labs";    //dev/BA
			
		   String actualTitle = driver.getTitle();
		
		   Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	

}
