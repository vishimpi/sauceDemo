package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.CartPagePOMClass;
import com.saucedemo.POMPack.CheckOutPagePOMClass;
import com.saucedemo.POMPack.HomePagePOMClass;
import com.saucedemo.POMPack.LoginPagePOMClass;
import com.saucedemo.POMPack.OverViewPOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC05_VerifyEndToEndFuntionality extends TestBaseClass
{

@Test
public void VerifyEndToEndFuntionality() throws InterruptedException, IOException
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
	
	hp.clickOnBagProduct();
	log.info("Clicked on Bag Product");
	Thread.sleep(2000);

	
	hp.clickAddToCartBtn();
	log.info("Clicked on Add to cart button");
	Thread.sleep(2000);

	
	hp.clickCartBtn();
	log.info("Clicked on cart");
	Thread.sleep(2000);

//cart page
	
	CartPagePOMClass cp = new CartPagePOMClass(driver);
	cp.clickOnCheckoutBtn();
	log.info("Clicked on checkout button");
	Thread.sleep(2000);

//	checkout page
	
	CheckOutPagePOMClass chP = new CheckOutPagePOMClass(driver);
	chP.sendFirstName();
	log.info("FName Entered");
	Thread.sleep(2000);

	chP.sendLastName();
	log.info("LastName Entered");
	Thread.sleep(2000);

	chP.sendPostalCode();
	log.info("Postal code entered");
	Thread.sleep(2000);

	chP.clickContinueBtn();
	log.info("Clicked on continue button");
	Thread.sleep(2000);

//	Overview Page
	
	OverViewPOMClass op = new OverViewPOMClass(driver);
	
	op.clickOnfinishBtn();
	log.info("Clicked on Finish Button");
	Thread.sleep(2000);

	
	UtilityClass.screenshotMethod(driver, "thankmsgPage");
	log.info("Snap of thank you page taken");
	
	log.info("Apply Verification");
	
	String expected = "Thank you for your order!";
	String actual = chP.gettextthankumsg();
	
	Assert.assertEquals(actual, expected, actual);
	
	if(expected.equals(actual))
	{
		log.info("passed thank msg");
	}
	else
	{
		log.info("failed thank msg");
	}
	
	chP.clickBackHomeBtn();
	log.info("Back to Home page");
	
	log.info("verify that we are back to home");
	
	String expected1 = "https://www.saucedemo.com/inventory.html";
	
	String actual1 = driver.getCurrentUrl();
	
	Assert.assertEquals(actual1, expected1, actual1);
	
	if(expected1.equals(actual1))
	{
		log.info("passed back home page");
	}
	else
	{
		log.info("Failed back to home Page");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
