package com.tklender.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemPage extends Page {
	//private WebDriver driver;
		
	@FindBy(css = ".btn.btn-primary.ng-scope")//css = "button[ng-click=\"addUser\"]"
    public WebElement btnAddUser;
	
    @FindBy(css="button[ng-click=\"remove()\"]")
    public WebElement btnDeleteUser;

    //@FindBy(css="input[placeholder=\"Search\"]")
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement fildSearchUser;

    @FindBy(css="#usersGrid_grid")
    public WebElement listOfUser;
    
    @FindBy(id="cb_usersGrid_grid")
    public WebElement selectUser;
    
    @FindBy(css="button.btn.btn-success")
    public WebElement btnSuccessDeleteCustomer;
    
    @FindBy(css="#usersGrid_grid tr td[aria-describedby= \"usersGrid_grid_Username\"]")
    public List<WebElement> searchOfUser;
    
    @FindBy(css="div.action-btn > a")
    public WebElement btnEditUser;
    
    @FindBy(linkText = "Credit Products")
    public WebElement btnCreditProducts;
    
    @FindBy(css = ".btn.btn-primary")
    public WebElement btnAddCreditProduct;
	
	public SystemPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		//PageFactory.initElements(driver,SystemPage.class);
	}
	public boolean isAddUser(){
		if(isElementPresent(btnAddUser)) return true;
		else return false;
		}
	public AddUserPage btnAddUsers(){
			btnAddUser.click();
		return PageFactory.initElements(driver, AddUserPage.class);
	}
	public  void searchUser(String username){
		//int countstart = searchOfUser.size();
		try {
			fildSearchUser.sendKeys(username);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*int countfinish = searchOfUser.size();
		if(countfinish!=countstart){
		for(int i=0;i<searchOfUser.size();i++){
			String str = searchOfUser.get(i).getText();
			//System.out.println(str);
		}
		}*/
		
	//	return searchOfUser.get(i).getText();//table.getRows().get(1).toString();
	}
}
