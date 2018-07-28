package com.gmail.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gmail.generics.BasePage;

public class LogInPage extends BasePage {

	public LogInPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
	private WebElement eleInputTxt;
	
	public WebElement getEleInputTxt()
	{
		return eleInputTxt;
	}
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement eleNextBTN;
	
	public WebElement getEleNextBTN()
	{
		return eleNextBTN;
	}
	@FindBy(name="password")
	 private WebElement eleGooglePasswordBTN;
	 public WebElement getEleGooglePasswordBTN()
	 {
		 return eleGooglePasswordBTN;
	 }

}
