package com.tklender.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.java.ConfigProperties;
import com.tklender.data.UserData;

import ru.yandex.qatools.allure.annotations.Step;

public class LoginPage extends Page{

	//private WebDriver driver;
	@FindBy(linkText = "Login")
	public WebElement linkLogIn;
	@FindBy(id = "UserName")
	private WebElement username;
	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	@FindBy(css = ".validation-summary-errors ul li") 
	private WebElement failedLogin;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public LoginPage open() {
		driver.get(ConfigProperties.getProperty("login.url"));
		//driver.get("http://vm-elender:9288/Account/Login");
		return this;
	}
	@Step("Ввод логина")
	public LoginPage setUserName(String username1){
		username.sendKeys(username1);
		return this;
	}
	@Step("Ввод пароля")
	public LoginPage setPassword(String password1){
		password.sendKeys(password1);
		return this;
	}
	public String getFailedLoginMassege(){
		return failedLogin.getText();
	}
	@Step("Нажимаем Submit")
	public LoginPage submit(){
		submit.click();
		return this;
	}
	public BackFirstPage loginAs(UserData admin){
		isElementPresent(submit);
		linkLogIn.click();
		type(username, admin.name);
		type(password, admin.password);
		submit.click();
		return PageFactory.initElements(driver, BackFirstPage.class);
	}

}
