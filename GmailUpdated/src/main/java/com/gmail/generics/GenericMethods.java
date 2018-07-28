package com.gmail.generics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods {
	
	private static final WebElement target = null;
	public static void getScreenShot(WebDriver driver, String name)
	{
		
		 try 
		 {
			 TakesScreenshot t = (TakesScreenshot) driver;
			 File src = t.getScreenshotAs(OutputType.FILE);
			 File dest= new File("C:\\Users\\manoh\\git\\Gmail\\Gmail\\screenshot\\"+name+".png");
			FileUtils.copyFile(src, dest);
		}
		catch (IOException e)
		{
		
		}	 
	}
	//Click on Mails
	public static void cilckOnMails(WebDriver driver, String mail)
	{
		//click based on email address
		List<WebElement> mails= driver.findElements(By.xpath("//*[@class='yW']/span"));
        
        for (int i = 0; i < mails.size(); i++) {
           // System.out.println(a.get(i).getText());
            if (mails.get(i).getText().equals(mail)) //to click on a specific mail.
                {                                           
                mails.get(i).click();
            }
        }
        //click based on subject
        /*List<WebElement> gmails = driver.findElements(By.xpath("//*[@class='yW']/span"));
        for(WebElement gmail : gmails){
           if(gmail.getText().indexOf("Top 34 Agile Testing Interview Questions & Answers") != -1){
                        gmail.click();
                        //Thread.sleep(5000);
                       
           }
        }*/
	}
	//Switch to window
	public static void switchtoWindowTitle(WebDriver driver,String etitle)
	{
		Set<String> handles = driver.getWindowHandles();
		String atitle = null;
		first:
		for(String handle:handles)
		{
			
			driver.switchTo().window(handle);
			atitle= driver.getTitle();
			if(atitle.contains(etitle))
			{
				break first;
			}
			
		}
	}
	//Mouse Hover actions
	public static void mouseMoveToElement(WebDriver driver, WebElement element)
	{
		Actions actions= new Actions(driver);
		
		actions.moveToElement(element).perform();
	}
	//Multiple mouse Hover actions
	public static void HoverAndClick(WebDriver driver,WebElement elementToHover,WebElement subelementToHover,WebElement elementToClick) {
		Actions action = new Actions(driver);
		//action.moveToElement(elementToHover).click(elementToClick).build().perform();
		action.moveToElement(elementToHover).moveToElement(subelementToHover).click(elementToClick).perform();
		
	}
	//dropDown Actions
	public static void dropDownByIndexValue(WebElement element, int indexValue) {
		Select select= new Select(element);
		select.selectByIndex(indexValue);	
	}	
	public static void dropDownByVisibleText(WebElement element, String visibleText) {
		Select select= new Select(element);
		select.selectByVisibleText(visibleText);
	}
	public static void dropDownByValue(WebElement element, String value) {
		Select select= new Select(element);
		select.selectByValue(value);
	}
	public static void dropDownDeselectByIndex(WebElement element, int indexValue)
	{
		Select select= new Select(element);
		select.deselectByIndex(indexValue);
	}
	public static void dropDownDeselectByVisibleText(WebElement element, String visibleText)
	{
		Select select= new Select(element);
		select.deselectByVisibleText(visibleText);
	}
	public static void dropDownDeselectByValuele(WebElement element, String value)
	{
		Select select= new Select(element);
		select.deselectByValue(value);
	}
	public static void dropDownDeselectAll(WebElement element)
	{
		Select select = new Select(element);
		select.deselectAll();
	}
	public static WebElement getFirstSelectedOption(WebElement element)
	{
		Select sel= new Select(element);
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		return firstSelectedOption;
	}
	public static List<WebElement> getAlltSelectedOption(WebElement element)
	{
		Select sel= new Select(element);
		List<WebElement> allSelectedOption = sel.getAllSelectedOptions();
		return allSelectedOption;
	}
	public static List<WebElement> getOptions(WebElement element)
	{
		Select sel= new Select(element);
		List<WebElement> options = sel.getOptions();
		return options;
	}
	
}
