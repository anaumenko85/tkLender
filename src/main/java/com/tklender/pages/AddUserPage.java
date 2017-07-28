package com.tklender.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ru.yandex.qatools.allure.annotations.Step;

public class AddUserPage extends Page{

	
	
@FindBy(how=How.ID, using="user.UserName")
private WebElement login;
@FindBy(how=How.ID, using="user.Password")
private WebElement password;
@FindBy(how=How.ID, using="user.FirstName")
private WebElement firstName;
@FindBy(how=How.ID, using="user.LastName")
private WebElement lastName;
@FindBy(how=How.ID, using="user.Email")
private WebElement email;
@FindBy(how=How.ID, using="user.PhoneNumber_int")
private WebElement phone;
@FindBy(how=How.XPATH, using="//form[@name=\"editUser\"]/div[2]/roles-editor[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/input[1]")
private WebElement roleAdmin;
@FindBy(how=How.XPATH, using="//form[@name=\"editUser\"]/div[2]/roles-editor[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")
private WebElement roleCollateralManager;
@FindBy(how=How.XPATH, using="//form[@name=\"editUser\"]/div[2]/roles-editor[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/input[1]")
private WebElement roleCollector;
@FindBy(how=How.XPATH, using="//form[@name=\"editUser\"]/div[2]/roles-editor[1]/div[1]/div[2]/div[1]/div[4]/div[1]/label[1]/input[1]")
private WebElement roleLoanManager;
@FindBy(how=How.XPATH, using="//form[@name=\"editUser\"]/div[2]/roles-editor[1]/div[1]/div[2]/div[1]/div[5]/div[1]/label[1]")
private WebElement roleOriginator;
@FindBy(how=How.XPATH, using="//form[@name=\"editUser\"]/div[2]/roles-editor[1]/div[1]/div[2]/div[1]/div[6]/div[1]/label[1]/input[1]")
private WebElement roleSupervisor;
@FindBy(how=How.XPATH, using="//form[@name=\"editUser\"]/div[2]/roles-editor[1]/div[1]/div[2]/div[1]/div[7]/div[1]/label[1]")
private WebElement roleUnderwriter;
@FindBy(how=How.XPATH, using="//form[@name=\"editUser\"]/div[3]/div[2]/div[1]/div[1]/branch-office-select[1]/div[1]/div[1]/div[1]/span[1]")
private WebElement branch;
@FindBy(how=How.XPATH, using="/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
private WebElement btnOk;
@FindBy(how=How.XPATH, using="/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/button[2]")
private WebElement btnCancel;
@FindBy(how=How.XPATH, using="/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")
public WebElement LabelAddUser;
@FindBy(css= "button.btn.btn-default")
private WebElement btnCloseIfUserExist;
@FindBy(css="strong.ng-binding")
public WebElement lableIfUserExist;
@FindBy(css="div.modal-header h2")
public WebElement lableEditUser;

public AddUserPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	super(driver);
}
public void isUserExist(){
	try{
		isElementPresent(lableIfUserExist);
			btnCloseIfUserExist.click();
			btnCancel.click();	
	}catch(Exception e){
		System.out.println("User is not exist");
	}
}
@Step("Вводим логин юзера")
public AddUserPage setlogin(String flogin) {
	login.sendKeys(flogin);
	return this;
}
@Step("Вводим пароль юзера")
public AddUserPage setfPassword(String fPassword) {
	password.sendKeys(fPassword);
	return this;
}
@Step("Вводим имя юзера")
public AddUserPage setfFirstName(String fFirstName) {
	firstName.sendKeys(fFirstName);
	return this;
}
@Step("Вводим фамилию юзера")
public AddUserPage setLastName(String fLastName) {
	lastName.sendKeys(fLastName);
	return this;
}
@Step("Вводим емаил юзера")
public AddUserPage setfEmail(String fEmail) {
	email.sendKeys(fEmail);
	return this;
}
@Step("Вводим телефон юзера")
public AddUserPage setPhone(String fPhone) {
	phone.sendKeys(fPhone);
	return this;
}
@Step("Устанавливаем роль админ")
public AddUserPage setRoleAdmin() {
	roleAdmin.click();
	return this;
}
@Step("Устанавливаем роль колатерал")
public AddUserPage setRoleCollateralManager() {
	roleCollateralManager.click();
	return this;
}
@Step("Устанавливаем роль колектор")
public AddUserPage setRoleCollector() {
	roleCollector.click();
	return this;
}
@Step("Устанавливаем роль лоан менеджер")
public AddUserPage setRoleLoanManager() {
	roleLoanManager.click();
	return this;
}
@Step("Устанавливаем роль ориджинатор")
public AddUserPage setRoleOriginator() {
	roleOriginator.click();
	return this;
}
@Step("Устанавливаем роль супервизор")
public AddUserPage setRoleSupervisor() {
	roleSupervisor.click();
	return this;
}
@Step("Устанавливаем роль андерайтер")
public AddUserPage setRoleUnderwriter() {
	roleUnderwriter.click();
	return this;
}
@Step("Устанавливаем отделение")
public AddUserPage setBranch(String fBranch) {
	branch.sendKeys(fBranch);;
	return this;
}
@Step("Подтверждаем сохранение")
public AddUserPage setBtnOk() {
	btnOk.click();
	return this;
}
@Step("Отклоняем сохранение")
public AddUserPage setBtnCancel() {
	btnCancel.click();;
	return this;
}
public AddUserPage setfLabelAddUser(WebElement fLabelAddUser) {
	
	return this;
}
@Step("Если юзер существует, клацаем конфирмейшн")
public AddUserPage setBtnCloseIfUserExist(WebElement btnCloseIfUserExist) {
	this.btnCloseIfUserExist = btnCloseIfUserExist;
	return this;
}
public AddUserPage setLableIfUserExist(WebElement lableIfUserExist) {
	this.lableIfUserExist = lableIfUserExist;
	return this;
}
@Step("Нажимаем редактировать пользователя")
public AddUserPage setLableEditUser(WebElement lableEditUser) {
	this.lableEditUser = lableEditUser;
	return this;
}


}