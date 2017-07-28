package com.tklender.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class NewLoanParamPage extends BackFirstPage{
	//private WebDriver driver;
    @FindBy(xpath="//select")
	private WebElement creditProduct;
    @FindBy(id="_int")
    private WebElement loanAmount;
    @FindBy(name="Term")
    private WebElement term;
    @FindBy(css="button.btn.btn-primary")
    private WebElement proceed;
    
    
	public NewLoanParamPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public NewLoanParamPage getCreditProduct(String acreditproduct){
		//new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Tet2");
		new Select(creditProduct).selectByVisibleText(acreditproduct);
		return this;
	}
	public NewLoanParamPage getTerm(String aterm){
		term.clear();
		term.sendKeys(aterm);
		return this;
	}
	public NewLoanParamPage getLoanAmount(String aamount){
		loanAmount.clear();
		loanAmount.sendKeys(aamount);
		return this;	
	}
	public NewLoanParamPage procced(){
		
		proceed.click();
		return this;
	}

}
