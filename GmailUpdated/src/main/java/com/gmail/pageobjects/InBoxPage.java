package com.gmail.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gmail.generics.BasePage;

public class InBoxPage extends BasePage{

	public InBoxPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\":2e\"]/td[5]")
	private WebElement eleFirstMailClick;
	
	public WebElement getEleFirstMailClick(){
		return eleFirstMailClick;
	}
	

}
