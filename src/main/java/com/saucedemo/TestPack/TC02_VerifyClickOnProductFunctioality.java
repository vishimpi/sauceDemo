package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOMClass;
import com.saucedemo.POMPack.LoginPagePOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC02_VerifyClickOnProductFunctioality extends TestBaseClass
{
@Test
public void verifyClickOnProductFunctioality() throws InterruptedException, IOException
{
	
//	Login page Element
	
LoginPagePOMClass lp = new LoginPagePOMClass(driver);
	
	lp.sendUserName();
	log.info("Usernme Entered");
	Thread.sleep(2000);

	
	lp.sendPassword();
	log.info("Password Entered");
	Thread.sleep(2000);

	
	lp.clickLoginButton();
	log.info("Clicked on login button");
	Thread.sleep(2000);

	log.info("Went on homepage");	
	
	UtilityClass.screenshotMethod(driver, "HomePage");
	log.info("Homepage ScreenShot Taken");
	
//	Home page Element
	
	HomePagePOMClass hp = new HomePagePOMClass(driver);
	
	hp.clickOnBagProduct();
	log.info("bag product clicked");
	Thread.sleep(2000);

	UtilityClass.screenshotMethod(driver, "ProductPage");
	log.info("Product Page Snap Taken");
	
	log.info("Apply Verfication");
	

//	boolean result = hp.isSelectMethod();
//	log.info(result);
	String expected = "Sauce Labs Backpack"; 
	String actual = hp.getTextfrombagpack();
	
	Assert.assertEquals(actual, expected, actual);
	
	if(expected.equals(actual))
	{
		log.info("TC02 is passed");
	}
	else
	{
		log.info("TC02 is failed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
