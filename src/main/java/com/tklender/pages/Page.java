package com.tklender.pages;

import static org.testng.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {
	protected WebDriver driver;
	//private final PageTitle title;
	//private final PageUrl pageUrl;
	
	public Page(WebDriver driver){
		this.driver = driver;
		//this.pageUrl = pageUrl;
	}
	public void type(WebElement webElement, String text){
		webElement.clear();
		webElement.sendKeys(text);
	}
	
	public boolean isElementPresent(WebElement element) {
	    try {
	      element.isDisplayed();
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
	public boolean verifyEquals(String message, Object o1){
		try{
			assertEquals(message,o1);
			return true;
		}
		catch(AssertionError e){
			return false;
		}
	}
}
