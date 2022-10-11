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



public class TC04_VerifyAllProductFunctionality extends TestBaseClass
{
   
	
	@Test
	public void verifyAllProductFunctionality() throws IOException
	{
		
		//--homePage--//
		
		//bag product
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickAllProducts();
		System.out.println("All products will get selected");
		
		ScreenshotClass.takeScreenshot(driver);
		
		//--validation--//
		String expectedProduct = "6";
		
		String actualProduct = hp.getTextFromAddToCart();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		Assert.assertEquals(actualProduct, expectedProduct);

		
		
		}
	
	
	

}
