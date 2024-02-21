
package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOMClass;
import com.saucedemo.POMPack.LoginPagePOMClass;

public class TC03_VerifyProductAddTOCart extends TestBaseClass
{
@Test
public void VerifyProductAddTOCart() throws InterruptedException
{
LoginPagePOMClass lp = new LoginPagePOMClass(driver);
	
	lp.sendUserName();
	log.info("Usernme Entered");
	Thread.sleep(1000);

	
	lp.sendPassword();
	log.info("Password Entered");
	Thread.sleep(1000);

	
	lp.clickLoginButton();
	log.info("Clicked on login button");
	Thread.sleep(1000);

	log.info("Went on homepage");	
	
   HomePagePOMClass hp = new HomePagePOMClass(driver);

    hp.clickOnBagProduct();
    log.info("Bag product is selected");

    hp.clickAddToCartBtn();
    log.info("Product added to cart");

    log.info("Apply validation");
    
   String expected="1";
   String actual = hp.getTextFromCart();
   
   Assert.assertEquals(actual, expected, actual);



















}
}
