package com.tklender.test;

<<<<<<< origin
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.PageFactory;
import com.tklender.pages.AddUserPage;
import com.tklender.pages.BackFirstPage;
import com.tklender.pages.LoginPage;
import com.tklender.pages.SystemPage;
=======
>>>>>>> local

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;
@Title("Check the entrance to system")
@Description("try to fill the login and password")
public class tklTestLoginPage extends BasicTestCase{
	@Title("Проверка некоректного входа в систему")
	@Description("Enter correct login and password")
	@Test(enabled = false)
public void faileLogin(){
	loginPage.open()
	               .setUserName("faile")
	               .setPassword("123456")
	               .submit();
	assertEquals("Invalid username or password.",loginPage.getFailedLoginMassege());
}
 @Title("Проверка корректного входа в систему")
 @Severity(SeverityLevel.BLOCKER)
	@Test(enabled = false)
  public void correctlogin()  {
	loginPage.open()
	                .setUserName("admin")
	                .setPassword("123456")
	                .submit();
	                 
	assertTrue(backFirstPage.isLoggedIn());
  	backFirstPage.logout();
  	assertTrue(backFirstPage.isLoggedOut());		
  	} 	    
}
