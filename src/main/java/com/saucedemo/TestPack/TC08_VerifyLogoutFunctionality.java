package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOMClass;
import com.saucedemo.POMPack.LoginPagePOMClass;

public class TC08_VerifyLogoutFunctionality extends TestBaseClass
{
@Test
public void verifyLogoutFunctionality() throws InterruptedException
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
	
	hp.clicklogoutBtn();
	log.info("clicked on logout Button");
	
	log.info("Apply verification");
	
	String expectedTitle = "Swag Labs";
	String actualTitle   = driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle, actualTitle);
	
	if(expectedTitle.equals(actualTitle))
	{
		log.info("passed logout functionality");
	}
	else
	{
		log.info("Failed logout Functionality");
	}
	
	
	
	
	
	
	
}
}
