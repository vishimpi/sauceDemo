package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOMClass;
import com.saucedemo.POMPack.LoginPagePOMClass;

public class TC06_VerifyFilterFunctionality extends TestBaseClass

{
@Test
public void VerifyFilterFunctionality() throws InterruptedException
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
	
	
//	home page
	
	HomePagePOMClass hp = new HomePagePOMClass(driver);
	
	hp.clickfilterdropdown();
	log.info("Clicked on filter DropDown");
	
	hp.clickfilterOption();
	log.info("Select the specific option");
	
	
	log.info("Apply verification");
	
	String expected = "Price (low to high)";
	String actual = hp.gettextfilterDropd();
	
	Assert.assertEquals(actual, expected, actual);
	
	if(expected.equals(actual))
	{
		log.info("Passed");
	}
	else
	{
		log.info("Failed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
