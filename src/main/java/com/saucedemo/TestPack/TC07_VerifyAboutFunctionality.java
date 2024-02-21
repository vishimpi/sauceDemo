package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOMClass;
import com.saucedemo.POMPack.LoginPagePOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC07_VerifyAboutFunctionality extends TestBaseClass
{
@Test
public void verifyAboutFunctionality() throws InterruptedException, IOException
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
	
//	Home Page
	
	HomePagePOMClass hp = new HomePagePOMClass(driver);
	
	hp.clickMenuBtn();
	log.info("Clicked on Menu Button");
	Thread.sleep(2000);

	hp.clickaboutBtn();
	log.info("Clicked on About Button");
	Thread.sleep(2000);
	
	UtilityClass.screenshotMethod(driver, "aboutpage");
	log.info("Snap of aboutpage is taken");

	log.info("Apply verification");
	
	String expectedUrl = "https://saucelabs.com/";
	String actualurl = driver.getCurrentUrl();
	
	Assert.assertEquals(actualurl, expectedUrl, actualurl);
	
	
	
	
	
	
	
	
}
}
