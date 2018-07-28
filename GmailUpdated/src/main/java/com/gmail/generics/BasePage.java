package com.gmail.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitle(String eTitle)
	{
		WebDriverWait driverWait = new WebDriverWait(driver, 10);
		if(true)
			driverWait.until(ExpectedConditions.titleIs(eTitle));
		else
			Assert.fail();
			
	}
	public void verifyElement(WebElement element)
	{
		WebDriverWait driverWait = new WebDriverWait(driver, 10);
		if(true)
			driverWait.until(ExpectedConditions.visibilityOf(element));
		else
			Assert.fail();
	}
} 
