package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPagePOMClass 
{
WebDriver driver;
Select s;
Actions act;


@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")WebElement bikeLightProduct;
public void clickOnProduct()
{
	act.click(bikeLightProduct).perform();
}

@FindBy(xpath="//button[text()='Remove']")WebElement removeBtn;
public void clickOnRemoveBtn()
{
	removeBtn.click();
}

@FindBy(xpath="//button[@id='continue-shopping']")WebElement continueShopping;
public void clickContiShoppingBtn()
{
	continueShopping.click();
}


@FindBy(xpath="//button[text()='Checkout']")WebElement checkoutBtn ;
public void clickOnCheckoutBtn()
{
	checkoutBtn.click();
}

public CartPagePOMClass(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
    act = new Actions(driver);
}














}
