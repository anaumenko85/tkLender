package com.tklender.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreditProductPage extends Page{

	public CreditProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    @FindBy(id = "cp.Name")
	private WebElement creditProductName;
    @FindBy(name = "cp.LoanType")
	private WebElement loanType;
    @FindBy(id = "cp.CalculationType")
	private WebElement typeOfCalculation;
    @FindBy(id = "cp.Periodicity")
	private WebElement periodicity;
    @FindBy(id = "cp.MinAmount_int")
	private WebElement minAmount;
    @FindBy(id = "cp.MaxAmount_int")
	private WebElement maxAmount;
	@FindBy(xpath = "id(\"cp.MinTerm\")//input")
	private WebElement minTerm;
    @FindBy(xpath = "id(\"cp.MaxTerm\")//input")
	private WebElement maxTerm;
    @FindBy(css = ".form-control.ng-pristine.ng-untouched.ng-empty.ng-valid-min.ng-valid-max.ng-invalid.ng-invalid-required")
	private WebElement interestRate;
    @FindBy(id = "cp.ToleranceWriteOff_int")
	private WebElement toleranceWriteOff;
    @FindBy(css = ".form-control.ng-pristine.ng-untouched.ng-scope.ng-empty.ng-invalid.ng-invalid-required")
	private WebElement overdueInterestType;
    @FindBy(css = ".form-control.ng-pristine.ng-untouched.ng-empty.ng-valid-min.ng-valid-max.ng-invalid.ng-invalid-required")
	private WebElement overdueInterestRate;
    @FindBy(id = "cp.LateGraceDays")
	private WebElement lateGraceDays;
    @FindBy(css = ".btn.btn-primary")
	private WebElement btnOk;
    @FindBy(css = ".btn.btn-default")
	private WebElement btnCancel;
    @FindBy(css=".modal-dialog")
    private WebElement cpexist;
    @FindBy(css=".btn.btn-default")
    private WebElement btnClose;
	
    public CreditProductPage setCreditProductName(String acreditProductName) {
		creditProductName.sendKeys(acreditProductName);
		return this;
	}

	public CreditProductPage setLoanType(String aloanType) {
		new Select(loanType).selectByVisibleText(aloanType);
		return this;
	}

	public CreditProductPage setTypeOfCalculation(String atypeOfCalculation) {
		new Select(typeOfCalculation).selectByVisibleText(atypeOfCalculation);
		return this;
	}

	public CreditProductPage setPeriodicity(String aperiodicity) {
		new Select(periodicity).selectByVisibleText(aperiodicity);
		return this;
	}

	public CreditProductPage setMinAmount(String aminAmount) {
		minAmount.sendKeys(aminAmount);
		return this;
	}

	public CreditProductPage setMaxAmount(String amaxAmount) {
		maxAmount.sendKeys(amaxAmount);
		return this;
	}

	public CreditProductPage setMinTerm(String aminTerm) {
		minTerm.sendKeys(aminTerm);
		return this;
	}

	public CreditProductPage setMaxTerm(String amaxTerm) {
		maxTerm.sendKeys(amaxTerm);
		return this;
	}

	public CreditProductPage setInterestRate(String ainterestRate) {
		interestRate.sendKeys(ainterestRate);
		return this;
	}

	public CreditProductPage setToleranceWriteOff(String atoleranceWriteOff) {
		toleranceWriteOff.sendKeys(atoleranceWriteOff);
		return this;
	}

	public CreditProductPage setOverdueInterestType(String aoverdueInterestType) {
		new Select(overdueInterestType).selectByVisibleText(aoverdueInterestType);
		return this;
	}

	public CreditProductPage setOverdueInterestRate(String aoverdueInterestRate) {
		overdueInterestRate.sendKeys(aoverdueInterestRate);
		return this;
	}

	public CreditProductPage setLateGraceDays(String alateGraceDays) {
		lateGraceDays.sendKeys(alateGraceDays);
		return this;
	}

	public CreditProductPage setBtnOk() {
		btnOk.click();
		return this;
	}

	public CreditProductPage setBtnCancel() {
		btnCancel.click();
		return this;
	}
	
	public void isCreditProductExist(){
		try{
			isElementPresent(cpexist);
				btnClose.click();
				btnCancel.click();	
		}catch(Exception e){
			System.out.println("User is not exist");
		}
	}
	
}
