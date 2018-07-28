package com.gmail.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gmail.generics.Auto_Constants;
import com.gmail.generics.BaseTest;
import com.gmail.generics.GenericMethods;
import com.gmail.generics.ReadExcelData;
import com.gmail.generics.ReadPropertyFileData;
import com.gmail.pageobjects.InBoxPage;
import com.gmail.pageobjects.LogInPage;

public class TC_1 extends BaseTest{
	@Test
	public void logInGmail() throws InterruptedException
	{
		LogInPage inPage = new LogInPage(driver);
		InBoxPage boxPage = new InBoxPage(driver);
		WebDriverWait driverWait = new WebDriverWait(driver, 20);
		//String Email = ReadExcelData.readExcelFile(Auto_Constants.INPUTEXCEL_PATH,1, 0);
		//String password = ReadExcelData.readExcelFile(Auto_Constants.INPUTEXCEL_PATH,1, 1);

		String Eml = ReadPropertyFileData.getPropertyValue(Auto_Constants.INPUTPROPERTY_PATH,"EMAIL");
		String pwsd = ReadPropertyFileData.getPropertyValue(Auto_Constants.INPUTPROPERTY_PATH,"PASSWORD");

		inPage.getEleInputTxt().sendKeys(Eml);
		Thread.sleep(1000);
		inPage.getEleNextBTN().click();
		Thread.sleep(1000);
		inPage.getEleGooglePasswordBTN().sendKeys(pwsd);
		Thread.sleep(2000);
		inPage.getEleNextBTN().click();
		driverWait.until(ExpectedConditions.titleContains("Inbox"));
		Thread.sleep(1000);

		GenericMethods.cilckOnMails(driver, "suman Csr");
		Thread.sleep(10000);
	}
}