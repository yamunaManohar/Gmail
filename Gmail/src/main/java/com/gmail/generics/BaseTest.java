package com.gmail.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	@BeforeClass
	public void LaunchBrowser()
	{
		ChromeDriverManager.getInstance().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com/");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
