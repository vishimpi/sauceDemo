package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPOMClass 
{
WebDriver driver;

@FindBy(xpath="//button[text()='Cancel']")WebElement cancelBtn;
public void clickOnCancelBtn()
{
cancelBtn.click();
}

@FindBy(xpath="//button[text()='Finish']")WebElement finishBtn;
public void clickOnfinishBtn()
{
finishBtn.click();
}


public OverViewPOMClass(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
}
