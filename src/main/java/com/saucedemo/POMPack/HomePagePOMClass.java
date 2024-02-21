package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{
WebDriver driver;
Select s;

@FindBy(xpath="//button[@id='react-burger-menu-btn']")WebElement menubtn ;
public void clickMenuBtn()
{
	menubtn.click();
}

@FindBy(xpath="//a[@id='logout_sidebar_link']")WebElement logoutbtn ;
public void clicklogoutBtn()
{
	logoutbtn.click();
}

@FindBy(xpath="//a[@id='about_sidebar_link']")WebElement aboutbtn ;
public void clickaboutBtn()
{
	aboutbtn.click();
}

@FindBy(xpath="//a[@class='shopping_cart_link']")WebElement cartBtn;
public void clickCartBtn()
{
	cartBtn.click();
}

public String getTextFromCart()
{
	 String actualProdSelected = cartBtn.getText();
	 return actualProdSelected;
}

@FindBy(xpath="//button[text()='Add to cart']")
public List<WebElement>multiProduct;  
 
 public List<WebElement> clickMultiProduct()
 {
	 for(WebElement i : multiProduct)
	 {
		 i.click(); 
	 }
	 return multiProduct;
 }


@FindBy(xpath="//select[@class='product_sort_container']")WebElement filterDropdown;
public void clickfilterdropdown()
{
	filterDropdown.click();
	s.selectByIndex(2);
}

@FindBy(xpath="//option[text()='Price (low to high)']")WebElement filterOption;
public void clickfilterOption()
{
	filterOption.click();
}

public String gettextfilterDropd()
{
	 String actualdroptext = filterOption.getText();
	 return actualdroptext;
}



@FindBy(xpath="//div[text()='Sauce Labs Backpack']")WebElement bagProduct;
public void clickOnBagProduct()
{
	bagProduct.click();
}
//public boolean isSelectMethod()
//{
//	boolean prod =bagProduct.isSelected();
//    return prod;
//}

public String getTextfrombagpack()
{
	 String actualprodSelect = bagProduct.getText();
	 return actualprodSelect;
}



@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")WebElement addToCartBtn;
public void clickAddToCartBtn()
{
	addToCartBtn.click();
}


public HomePagePOMClass(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
    s = new Select(filterDropdown);
}













}
