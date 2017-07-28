package com.tklender.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewApplicationPage extends BackFirstPage{
	
	@FindBy(id="cd.FirstName")
	private WebElement firstName;
	@FindBy(id="cd.MiddleName")
	private WebElement middleName;
	@FindBy(id="cd.LastName")
	private WebElement lastName;
	@FindBy(id="cd.Suffix")
	private WebElement suffix;
	@FindBy(id="cd.Gender")
	private WebElement gender;
	@FindBy(id="cd.BirthDate_int")
	private WebElement dateOfBirth;
	@FindBy(id="cd.Education")
	private WebElement education;
	@FindBy(id="cd.MaritalStatus")
	private WebElement maritalStatus;
	@FindBy(id="cd.NumberOfDependents")
	private WebElement numberOfDependents;
	@FindBy(id="cd.Email")
	private WebElement email;
	@FindBy(id="cd.Citizenship")
	private WebElement citizenship;
	@FindBy(id="cd.SocialSecurityNumber")
	private WebElement socialSecurityNumber;
	@FindBy(id="cd.GrossMonthlyIncome_int")
	private WebElement monthlyIncome;
	@FindBy(id="cd.GrossMonthlyExpenses_int")
	private WebElement monthlyExpenses;
	@FindBy(id="cd.DriverLicenseID")
	private WebElement driverLicense;
	@FindBy(id="cd.StateOfIssue")
	private WebElement stateOfIssue;
	@FindBy(id="cd.CarOwner")
	private WebElement carOwner;
	@FindBy(id="cd.Phone_int")
	private WebElement mainPhone;
	@FindBy(id="cd.AlternativePhone_int")
	private WebElement alternativePhone;
	@FindBy(id="cd.IncomeType")
	private WebElement incomeType;
	
	@FindBy(id="cd.HowOftenPaidEmployed")
	private WebElement howOftenAreYouPaid;
	@FindBy(id="cd.Employer")
	private WebElement employer;
	@FindBy(id="cd.SizeCompany")
	private WebElement sizeOfTheCompany;
	@FindBy(id="cd.JobTitle")
	private WebElement jobTitle;
	@FindBy(id="cd.HireDate_int")
	private WebElement hireDate;
	@FindBy(id="cd.EmployeeVerificationPhone_int")
	private WebElement employeeVerificationPhone;
	@FindBy(id="cd.WorkPhone_int")
	private WebElement workPhone;
	
	@FindBy(id="cd.ResidedAtAddress_years")
	private WebElement residesAtAddressYears;
	@FindBy(id="cd.ResidedAtAddress_months")
	private WebElement residesAtAddressMonth;
	@FindBy(id="model.Street")
	private WebElement street;
	@FindBy(id="model.Apartment")
	private WebElement apartment;
	@FindBy(id="model.City")
	private WebElement city;
	@FindBy(id="model.State")
	private WebElement state;
	@FindBy(id="model.ZipCode")
	private WebElement zipCode;
	@FindBy(id="model.ResidentialStatus")
	private WebElement residentialStatus;
	@FindBy(id="model.TypeOfAccount")
	private WebElement typeOfAccount;
	@FindBy(id="model.RoutingNumber")
	private WebElement routingNumber;
	@FindBy(id="model.AccountNumber_int")
	private WebElement accountNumber;
	@FindBy(id="model.TimeWithBankAccount")
	private WebElement timeWithBankAccount;
	@FindBy(id="model.BankName")
	private WebElement bankName;
	@FindBy(id="model.BankPhone_int")
	private WebElement bankPhone;
	@FindBy(className="btn")
	private WebElement chooseFileButton;
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;
	


	public NewApplicationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public NewApplicationPage setFirstName(String afirstname){
		firstName.sendKeys(afirstname);
		return this;
	}
	public NewApplicationPage setMiddleName(String aMiddleName){
		middleName.sendKeys(aMiddleName);
		return this;
	}
	public NewApplicationPage setLastName(String aLastName){
		lastName.sendKeys(aLastName);
		return this;
	}
	public NewApplicationPage setSuffix(String asuffix){
		new Select(suffix).selectByVisibleText(asuffix);
		return this;
	}
	public NewApplicationPage setGender(String agender){
		new Select(gender).selectByVisibleText(agender);
		return this;
	}
	public NewApplicationPage setDateOfBirth(String aDateOfBirth){
		dateOfBirth.click();
		dateOfBirth.sendKeys(Keys.HOME);
		dateOfBirth.sendKeys(aDateOfBirth);
		return this;
	}
	public NewApplicationPage setEducation(String aeducation){
		new Select(education).selectByVisibleText(aeducation);;
		return this;
	}
	public NewApplicationPage setMaritalStatus(String aMaritalStatus){
		new Select(maritalStatus).selectByVisibleText(aMaritalStatus);
		return this;
	}
	public NewApplicationPage setNumberOfDependents(String aNumberOfDependents){
		numberOfDependents.sendKeys(aNumberOfDependents);
		return this;
	}
	public NewApplicationPage setEmail(String aEmail){
		email.sendKeys(aEmail);
		return this;
	}
	public NewApplicationPage setCitizenship(String aCitizenship){
		new Select(citizenship).selectByVisibleText(aCitizenship);
		return this;
	}
	public NewApplicationPage setSSN(String assn){
		socialSecurityNumber.sendKeys(assn);
		return this;
	}
	
	public NewApplicationPage setMonthlyIncome(String aMonthlyIncome){
		monthlyIncome.sendKeys(aMonthlyIncome);
		return this;
	}
	public NewApplicationPage setMonthlyExpenses(String afirstname){
		monthlyExpenses.sendKeys(afirstname);
		return this;
	}
	public NewApplicationPage setDriverLisense(String aDriverLicense){
		driverLicense.sendKeys(aDriverLicense);
		return this;
	}
	public NewApplicationPage setStateofIssue(String astateOfIssue){
		new Select(stateOfIssue).selectByVisibleText(astateOfIssue);
		return this;
	}
	public NewApplicationPage setCarOwner(String acarowner){
		new Select(carOwner).selectByVisibleText(acarowner);
		return this;
	}
	public NewApplicationPage setMainPhone(String amainphone){
		mainPhone.sendKeys(amainphone);
		return this;
	}
	public NewApplicationPage setAlternativePhone(String alternativephone){
		alternativePhone.sendKeys(alternativephone);
		return this;
	}
	public NewApplicationPage setIncomeType(String aincometype){
		new Select(incomeType).selectByVisibleText(aincometype);
		return this;
	}
	public NewApplicationPage setHowOftenAreYouPaid(String aHowOftenAreYouPaid){
		new Select(howOftenAreYouPaid).selectByVisibleText(aHowOftenAreYouPaid);
		return this;
	}
	public NewApplicationPage setEmployer(String aEmployer){
		employer.sendKeys(aEmployer);
		return this;
	}
	public NewApplicationPage setSizeofTheCompany(String aSizeofTheCompany){
		sizeOfTheCompany.sendKeys(aSizeofTheCompany);
		return this;
	}
	public NewApplicationPage setJobTitle(String aJobTitle){
		new Select(jobTitle).selectByVisibleText(aJobTitle);
		return this;
	}
	public NewApplicationPage setHireDate(String aHireDate){
		hireDate.click();
		hireDate.sendKeys(Keys.HOME);
		hireDate.sendKeys(aHireDate);
		return this;
	}
	public NewApplicationPage setEmployeeVerificationPhone(String EmployeeVerificationPhone){
		employeeVerificationPhone.sendKeys(EmployeeVerificationPhone);
		return this;
	}
	public NewApplicationPage setWorkPhone(String aWorkPhone){
		workPhone.sendKeys(aWorkPhone);
		return this;
	}
	public NewApplicationPage setResidesAtAddressYears(String aResidesAtAddressYears){
		new Select(residesAtAddressYears).selectByVisibleText(aResidesAtAddressYears);
		return this;
	}
	public NewApplicationPage setResidesAtAddressMonth(String aResidesAtAddressMonth){
		new Select(residesAtAddressMonth).selectByVisibleText(aResidesAtAddressMonth);
		return this;
	}
	public NewApplicationPage setStreet(String aStreet){
		street.sendKeys(aStreet);
		return this;
	}
	public NewApplicationPage setApartment(String aApartment){
		apartment.sendKeys(aApartment);
		return this;
	}
	public NewApplicationPage setCity(String aCity){
		city.sendKeys(aCity);
		return this;
	}
	public NewApplicationPage setState(String aState){
		new Select(state).selectByVisibleText(aState);
		return this;
	}
	public NewApplicationPage setZipCode(String aZipCode){
		zipCode.sendKeys(aZipCode);
		return this;
	}
	public NewApplicationPage setResidentialStatus(String aResidentialStatus){
		new Select(residentialStatus).selectByVisibleText(aResidentialStatus);
		return this;
	}
	public NewApplicationPage setTypeOfAccount(String aTypeOfAccount){
		new Select(typeOfAccount).selectByVisibleText(aTypeOfAccount);
		return this;
	}
	public NewApplicationPage setRoutingNumber(String aRoutingNumber){
		routingNumber.sendKeys(aRoutingNumber);
		return this;
	}
	public NewApplicationPage setAccountNumber(String aAccountNumber){
		accountNumber.sendKeys(aAccountNumber);
		return this;
	}
	public NewApplicationPage setTimeWithBankAccount(String aTimeWithBankAccount){
		new Select(timeWithBankAccount).selectByVisibleText(aTimeWithBankAccount);
		return this;
	}
	public NewApplicationPage setBankName(String aBankName){
		bankName.sendKeys(aBankName);
		return this;
	}
	public NewApplicationPage setBankPhone(String aBankPhone){
		bankPhone.sendKeys(aBankPhone);
		return this;
	}
	public NewApplicationPage clickChooseFile(String aChooseFile){
		chooseFileButton.click();
		return this;
	}
	public NewApplicationPage clickSave(){
		saveButton.click();
		return this;
	}

}
