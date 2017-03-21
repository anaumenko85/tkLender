package com.tklender.test;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.PageFactory;
import com.tklender.pages.AddUserPage;
import com.tklender.pages.BackFirstPage;
import com.tklender.pages.LoginPage;
import com.tklender.pages.SystemPage;

public class tklTestLoginPage extends BasicTestCase{
	
	private LoginPage loginPage = PageFactory.initElements(getWebDriver(),LoginPage.class);
	private BackFirstPage backFirsPage;
	private AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);;
	private SystemPage systemPage = PageFactory.initElements(driver, SystemPage.class);
	
	
  
  //private StringBuffer verificationErrors = new StringBuffer();

  
//-----------------------------------------------------
/*  @Test
public void faileLogin(){
	LoginPage login = new LoginPage(driver);
	login.enterUserName("admin");
	login.enterPassword("123123");
	login.submit();
	assertEquals("Invalid username or password.",login.loginError());
	/*username.sendKeys(username);
    userPassword.sendKeys(password);
    submit.click();
}
  @Test
public void lockUser(){
	LoginPage login = new LoginPage(driver);
	login.enterUserName("admin");
	login.enterPassword("123123");
	login.submit();
	try{
	assertEquals("Your account has been locked out until 2/23/2017 11:04:14 AM because of several consecutive failed login attempts.",login.loginError());
	} 
	catch(AssertionError e){
		System.out.println(e.getMessage());
	}
	/*username.sendKeys(username);
    userPassword.sendKeys(password);
    submit.click();
}*/
  public void correctlogin()  {
	// LoginPage login = new LoginPage(driver);
	//StringBuilder result = new StringBuilder();
  	//LoginPage login = new LoginPage(driver);
  	loginPage.open();
  	backFirsPage = loginPage.loginAs(admin);
  	AssertJUnit.assertTrue(backFirsPage.isLoggedIn());
  	AssertJUnit.assertTrue(backFirsPage.linkSystem.isDisplayed());
  	//systemPage.open();
  	backFirsPage.goToLynkSystem();
  	//SystemPage sypage = PageFactory.initElements(driver, SystemPage.class);
  	
  	//assertTrue(systemPage.isAddUser());
  	//systemPage.serchUser.sendKeys("FirstTest2");
  	//Thread.sleep(3000);
  	
  	systemPage.searchUser("FirstTest");
  	systemPage.btnAddUsers();
  	addUserPage.addUser("FirstTest2");
  	AssertJUnit.assertTrue(systemPage.btnAddUser.isDisplayed());
  	systemPage.searchUser("FirstTest2");
  	//assertEquals("FirstTest1", systemPage.checkUser("FirstTest1"));
  	
  	//System.out.println(systemPage.checkUser());
  	backFirsPage.logout();
  	AssertJUnit.assertTrue(backFirsPage.isLoggedOut());
  	
  	}
  	
  /*	BackFirsPage originator = new BackFirsPage(driver);
  	//driver.findElement(By.linkText("Underwriting")).click();
  	try {
  	assertEquals("rgba(189, 30, 30, 1)", originator.getColorOriginator());
  	}
  	catch (NoSuchElementException e) {
  		fail("Element not found!!");
  		e.printStackTrace();
  		}*/
  		
   
  /*public SystemPage systemPageInitialization() throws Exception{
	  SystemPage system = new SystemPage(driver);
	  //PageFactory.initElements(driver, system);
	  PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), system);
	  return system;
  } */
 /* @Test 
  public void testAddCustomer() {
	  loginPage.open();
	  backFirsPage = loginPage.loginAs(admin);
	  assertTrue(backFirsPage.isLoggedIn());
	  backFirsPage.goToLynkSystem();
	  //systemPage.btnAddUser();
	  //if()	
	    
  }*/
//------------------------------------------------------
    
}
