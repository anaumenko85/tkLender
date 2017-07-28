package com.tklender.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OriginationPage extends BackFirstPage	 {

	
	@FindBy(xpath="//a[contains(text(),'New Application')]")
	public WebElement newAppButton;
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchField;
	@FindBy(id="applicationsGrid_grid")
	public WebElement loanGrid;
	@FindBy(id="load_applicationsGrid_grid")
	public WebElement loadLoans;
	
	
	public OriginationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public OriginationPage getNewApp(WebDriver driver){
		newAppButton.click();
		return this;
	}
	public OriginationPage setSearchValue(String email){
		searchField.sendKeys(email);
		return this;
	}
	public Integer searchLoan() throws InterruptedException{
		isElementPresent(loadLoans);
		//while(loadLoans.isDisplayed())
		Thread.sleep(3000);
		return loanGrid.findElements(By.tagName("tr")).size();
	}

}
