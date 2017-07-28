package com.tklender.test;

import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

public class tklTestCreateCreditProduct extends BasicTestCase{
	
	@Title("Создание нового кредитного продукта")
	@Description("Create new credit product")
	@Test(groups = {"NewCreditProduct"} )
	public void tklTestCreateCreditProduct() {
		// TODO Auto-generated constructor stub
		
				backFirstPage.linkSystem.click();
			systemPage.btnCreditProducts.click();
			systemPage.btnAddCreditProduct.click();
			creditProductPage.setCreditProductName("Test")
			                 .setLoanType("Regular Payments")
			                 .setTypeOfCalculation("Annuity")
			                 .setPeriodicity("Monthly")
			                 .setMinAmount("100")
			                 .setMaxAmount("10000")
			                 .setMinTerm("1")
			                 .setMaxTerm("12")
			                 .setInterestRate("1")
			                 .setToleranceWriteOff("0")
			                 .setOverdueInterestType("Current Debt")
			                 .setOverdueInterestRate("0")
			                 .setLateGraceDays("0")
			                 .setBtnOk();
			creditProductPage.isCreditProductExist();
			
			
		}
	}
