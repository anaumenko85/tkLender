package com.tklender.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;


//import ru.yandex.qatools.allure.annotations.Step;

public class tkTestCreateNewApp extends BasicTestCase {
	private String email = String.valueOf(System.currentTimeMillis());
	
	@Title("Создание новой заявки с бека")
	@Description("Create new application from back office")
	@Test(groups = {"NewApp"})
	public void testCreateNewApp(){

		backFirstPage.linkOrigination.click();
		originationPage.newAppButton.click();
		loanParamPage
		             .getCreditProduct("PayDay")
		             .getTerm("6")
		             .getLoanAmount("1000")
		             .procced();
		
		customerVerificationPage.clickNewCustomerButton();
		applicationPage
		               .setFirstName("FirstName")
		               .setLastName("LastName")
		               .setGender("Male")
		               .setDateOfBirth("01.01.1985")
		               .setEducation("Graduate")
		               .setMaritalStatus("Single")
		               .setNumberOfDependents("2")
		               .setEmail(email+"@test.ua")
		               .setCitizenship("US Citizen")
		               .setSSN("123456789")
		               .setMonthlyIncome("1000")
		               .setMonthlyExpenses("1000")
		               .setMainPhone("1234567890")
		               .setIncomeType("Employed")
		               .setHowOftenAreYouPaid("Weekly")
		               .setEmployer("Test")
		               .setSizeofTheCompany("7")
		               .setJobTitle("Employee")
		               .setHireDate("01/01/2000")
		               .setEmployeeVerificationPhone("1234567890")
		               .setWorkPhone("1234567890")
		               .setResidesAtAddressYears("4")
		               .setResidesAtAddressMonth("2")
		               .setStreet("Test")
		               .setCity("Test")
		               .setState("Alabama")
		               .setZipCode("12345")
		               .setResidentialStatus("Rent")
		               .setTypeOfAccount("Checking")
		               .setRoutingNumber("1234567890")
		               .setAccountNumber("123456789123456789")
		               .setTimeWithBankAccount("Month")
		               .setBankName("Test")
		               .clickSave();
		   	
	}
	@Title("Поиск лоана в гриде")
	@Description("Searching the loan in grid")
	@Test(groups = {"NewApp"})
	//@Step("Hi, I'm step in your testng listener")
	public void testSearchLoan() throws InterruptedException{
		backFirstPage.linkOrigination.click();
		
		originationPage.setSearchValue("First");
		//assertTrue(driver.findElement(By.id("")));
		if (originationPage.searchLoan()>1) {
			int colList = originationPage.searchLoan();
			for(int i=0;i<colList;i++){
				if(originationPage.loanGrid.findElements(By.cssSelector("tr")).get(i).getAttribute("id").toString()!=""){
					
					System.out.println(originationPage.loanGrid.findElements(By.cssSelector("tr")).get(i).getAttribute("id").toString());
				}	
			}	
			System.out.println(originationPage.searchLoan());
		}
	}
	

}
