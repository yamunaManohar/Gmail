package com.gmail.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser()
	{
		ChromeDriverManager.getInstance().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com/");
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult res)
	{
		int status = res.getStatus();
		String name = res.getMethod().getMethodName();
		
		if(status==2)
		{
			GenericMethods.getScreenShot(driver, name);
		}
		driver.quit();
	}

}
