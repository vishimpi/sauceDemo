package com.saucedemo.UtilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
public static void screenshotMethod(WebDriver driver, String name) throws IOException
{
	
         TakesScreenshot ts = (TakesScreenshot)driver;
         File source = ts.getScreenshotAs(OutputType.FILE);
         File dest = new File("V:\\Pro Snap\\"+ name +".jpg");
         FileHandler.copy(source, dest);
}
}
