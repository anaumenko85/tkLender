package com.tklender.test;

<<<<<<< origin
import static org.testng.Assert.assertTrue;
=======
//import static org.testng.AssertJUnit.assertTrue;
import static org.testng.Assert.assertEquals;
>>>>>>> local

import java.io.IOException;

import org.testng.annotations.Test;

import com.tklender.data.UserData;

public class tkTestUserPage extends BasicTestCase {
	
	
	protected UserData username;
	private String login = "TestLogin"; 

	
	
@Test(priority = 1)
public void testCreateUser() throws IOException{
	backFirstPage.goToLynkSystem();
	systemPage.btnAddUsers();
  	addUserPage.setlogin(login)
  	           .setfPassword("123456")
  	           .setfFirstName("Test")
  	           .setLastName("Test")
  	           .setfEmail("test@test.ua")
  	           .setPhone("1234567890")
  	           .setRoleAdmin()
  	           .setRoleCollateralManager()
  	           .setRoleCollector()
  	           .setRoleLoanManager()
  	           .setRoleOriginator()
  	           .setRoleSupervisor()
  	           .setRoleUnderwriter()
  	           .setBranch("")
  	           .setBtnOk();
  	addUserPage.isUserExist();
  	systemPage.searchUser(login);
  	//assertEquals("FirstTest1", systemPage.checkUser("FirstTest1"));  	
}
<<<<<<< origin
//@Test(priority=2)
=======
@Test(enabled = false)
>>>>>>> local
public void testEditUser(){
	backFirstPage.goToLynkSystem();
	systemPage.searchUser(login);
	if(systemPage.searchOfUser.size()>0){
	systemPage.btnEditUser.click();	
<<<<<<< origin
	assertTrue(addUserPage.lableEditUser.isDisplayed());
	//assertEquals(addUserPage.lableEditUser.getText(), "Edit User");
	addUserPage.fBtnCancel.click();
	} else 
		System.out.println("User is not exist");	
}
//@Test(priority=3)
=======
	assertEquals(addUserPage.lableEditUser.getText(), "Edit User");
	addUserPage.setBtnCancel();
	} else 
		System.out.println("User is not exist");	
}
@Test(priority = 3)
>>>>>>> local
public void testDeleteUser(){
	backFirstPage.goToLynkSystem();
	systemPage.searchUser(login);
  	systemPage.selectUser.click();
  	systemPage.btnDeleteUser.click();
  	systemPage.btnSuccessDeleteCustomer.click();
}
<<<<<<< origin
@AfterMethod
public void logout(){
	backFirstPage.logout();
  	assertTrue(backFirstPage.isLoggedOut());
}
=======
>>>>>>> local
}
