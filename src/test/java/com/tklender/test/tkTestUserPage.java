package com.tklender.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
//import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.java.ConfigProperties;
import com.tklender.pages.AddUserPage;
import com.tklender.pages.BackFirstPage;
import com.tklender.pages.LoginPage;
import com.tklender.pages.SystemPage;

public class tkTestUserPage extends BasicTestCase {
	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	private BackFirstPage backFirstPage = PageFactory.initElements(getWebDriver(), BackFirstPage.class);
	private SystemPage systemPage = PageFactory.initElements(getWebDriver(), SystemPage.class);
	private AddUserPage addUserPage = PageFactory.initElements(getWebDriver(), AddUserPage.class);
	
@BeforeMethod
public void login(){
	loginPage.open();
  	backFirstPage = loginPage.loginAs(admin);
  	assertTrue(backFirstPage.isLoggedIn());
  	assertTrue(backFirstPage.linkSystem.isDisplayed());
  	backFirstPage.goToLynkSystem();
  	System.out.println(ConfigProperties.getProperty("login.url"));
}
@Test(priority=1)
public void testCreateUser(){
	systemPage.btnAddUsers();
  	addUserPage.addUser("FirstTest2");
  	addUserPage.isUserExist();
  	//AssertJUnit.assertTrue(systemPage.btnAddUser.isDisplayed());
  	systemPage.searchUser("FirstTest2");
  	//assertEquals("FirstTest1", systemPage.checkUser("FirstTest1"));  	
}
//@Test(priority=2)
public void testEditUser(){
	systemPage.searchUser("FirstTest2");
	if(systemPage.searchOfUser.size()>0){
	systemPage.btnEditUser.click();	
	assertTrue(addUserPage.lableEditUser.isDisplayed());
	//assertEquals(addUserPage.lableEditUser.getText(), "Edit User");
	addUserPage.fBtnCancel.click();
	} else 
		System.out.println("User is not exist");	
}
//@Test(priority=3)
public void testDeleteUser(){
	systemPage.searchUser("FirstTest2");
  	systemPage.selectUser.click();
  	systemPage.btnDeleteUser.click();
  	systemPage.btnSuccessDeleteCustomer.click();
}
@AfterMethod
public void logout(){
	backFirstPage.logout();
  	assertTrue(backFirstPage.isLoggedOut());
}
}
