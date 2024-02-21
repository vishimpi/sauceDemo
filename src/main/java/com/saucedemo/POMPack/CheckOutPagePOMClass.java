package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPagePOMClass 
{
WebDriver driver;

@FindBy(xpath="//input[@id='first-name']")WebElement firstName;
public void sendFirstName()
{
	firstName.sendKeys("vivek");
}

@FindBy(xpath="//input[@id='last-name']")WebElement lastName;
public void sendLastName()
{
	lastName.sendKeys("shimpi");
}

@FindBy(xpath="//input[@id='postal-code']")WebElement postalCode ;
public void sendPostalCode()
{
	postalCode.sendKeys("424105");
}


@FindBy(xpath="//button[@id='cancel']")WebElement cancelBtn ;
public void clickCancelBtn()
{
	cancelBtn.click();
}

@FindBy(xpath="//input[@id='continue']")WebElement continueBtn ;
public void clickContinueBtn()
{
	continueBtn.click();
}


@FindBy(xpath="//h2[text()='Thank you for your order!']")WebElement thankumsg;
public String gettextthankumsg()
{
String actualmassage = thankumsg.getText();
return actualmassage;
}

@FindBy(xpath="//button[text()='Back Home']")WebElement backHomeBtn;
public void clickBackHomeBtn()
{
	backHomeBtn.click();
}


public CheckOutPagePOMClass(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

}
