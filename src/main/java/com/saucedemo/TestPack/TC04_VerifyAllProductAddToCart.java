package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOMClass;
import com.saucedemo.POMPack.LoginPagePOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC04_VerifyAllProductAddToCart extends TestBaseClass
{
@Test
public void VerifyAllProductAddToCart() throws InterruptedException, IOException
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
	
	HomePagePOMClass hp = new HomePagePOMClass(driver);
	hp.clickMultiProduct();
	log.info("Multi product added to cart");
    Thread.sleep(2000);
    
	hp.clickCartBtn();
    Thread.sleep(2000);
    log.info("Clicked on cart button");
	
    UtilityClass.screenshotMethod(driver, "CartWith6item");
    log.info("ScreenShot of Cart taken");
	log.info("Apply Verification");
	
	String expeted = "6";
	String actual = hp.getTextFromCart();
	
	Assert.assertEquals(actual, expeted, actual);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
