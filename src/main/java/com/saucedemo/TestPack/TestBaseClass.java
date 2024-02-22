package com.saucedemo.TestPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.UtilityPack.UtilityClass;



public class TestBaseClass 
{
WebDriver driver;
Logger log = Logger.getLogger("SauceDemo1");
@Parameters("browserName")

@SuppressWarnings("deprecation")
@BeforeMethod
public void preMethod(String browserName) throws InterruptedException, IOException
{
	
	if(browserName.equals("chrome"))
	{
    driver = new ChromeDriver();
	log.info("Browser is opened");
	Thread.sleep(2000);
	}
	else if(browserName.equals("firefox"))
	{
	driver = new FirefoxDriver();
	log.info("Browser is opened");
	Thread.sleep(2000);
	}
	
	PropertyConfigurator.configure("Log4j.properties");

	
	
	driver.manage().window().maximize();
	log.info("Browser is maximized");
	Thread.sleep(2000);

	
	driver.get("https://www.saucedemo.com/");
	log.info("Url is opened");
	Thread.sleep(2000);
    UtilityClass.screenshotMethod(driver, "Loginpage");
    log.info("Loginpage snap taken");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("browser is closed");
		log.info("End of Script");
	}
}
