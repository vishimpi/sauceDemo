package com.saucedemo.TestPack;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.LoginPagePOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC01_VerifyLoginFunctioality extends TestBaseClass
{
@Test
public void VerifyLoginFunctioality() throws InterruptedException, IOException
{
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
	
	log.info("Apply Validation");
	String expected = "Swag Labs";
	
	String actual = driver.getTitle();
	
	Assert.assertEquals(actual, expected, actual);
	
	if(expected.equals(actual))
	{
		log.info("Case Passed");
	}
	else
	{
		log.info("Cased is failed");
	}
}
}
