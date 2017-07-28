package com.tklender.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerVerificationPage extends BackFirstPage{

	
	//private WebElement searchByName;
	//private WebElement searchByPhone;
	//private WebElement searchBySsn;
	@FindBy(css="button.btn.btn-primary")
	private WebElement newCustomerButton;
	//private WebElement useSelectedCustomerButton;
	
	public CustomerVerificationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public CustomerVerificationPage clickNewCustomerButton(){
		newCustomerButton.click();
		return this;
	}

}
