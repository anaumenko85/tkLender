package com.tklender.test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.example.java.Browser;
import com.example.java.ConfigProperties;
import com.example.java.WebDriverFactory1;
import com.tklender.data.UserData;
import com.tklender.pages.AddUserPage;
import com.tklender.pages.BackFirstPage;
import com.tklender.pages.CreditProductPage;
import com.tklender.pages.CustomerVerificationPage;
import com.tklender.pages.LoginPage;
import com.tklender.pages.NewApplicationPage;
import com.tklender.pages.NewLoanParamPage;
import com.tklender.pages.OriginationPage;
import com.tklender.pages.SystemPage;



public class BasicTestCase {
	protected static WebDriver driver;
	private String baseUrl;
	public Logger logger;
	protected LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	protected BackFirstPage backFirstPage = PageFactory.initElements(getWebDriver(), BackFirstPage.class);
	protected SystemPage systemPage = PageFactory.initElements(getWebDriver(), SystemPage.class);
	protected AddUserPage addUserPage = PageFactory.initElements(getWebDriver(), AddUserPage.class);
	protected NewLoanParamPage loanParamPage = PageFactory.initElements(getWebDriver(), NewLoanParamPage.class);
	protected NewApplicationPage applicationPage = PageFactory.initElements(getWebDriver(), NewApplicationPage.class);
	protected CustomerVerificationPage customerVerificationPage = PageFactory.initElements(getWebDriver(), CustomerVerificationPage.class);
	protected OriginationPage originationPage = PageFactory.initElements(getWebDriver(), OriginationPage.class);
	protected CreditProductPage creditProductPage = PageFactory.initElements(getWebDriver(), CreditProductPage.class);
	//SystemPage system = new SystemPage(driver);
	//AddUserPage userpage = new AddUserPage(driver);
	
	public UserData admin = new UserData("admin","123456");

	protected WebDriver getWebDriver(){
		if(driver==null){
			baseUrl = ConfigProperties.getProperty("site.url");
		    String gridHubUrl = ConfigProperties.getProperty("grid2.hub");

		    Browser browser = new Browser();
		    browser.setName(ConfigProperties.getProperty("browser.name"));
		    browser.setVersion(ConfigProperties.getProperty("browser.version"));
		    browser.setPlatform(ConfigProperties.getProperty("browser.platform"));

		    String username = ConfigProperties.getProperty("user.username");
		    String password = ConfigProperties.getProperty("user.password");
		    
		    driver = WebDriverFactory1.getInstance(gridHubUrl, browser, username, password);
			//System.setProperty("webdriver.chrome.driver", "D:\\AutomationTesting\\drivers\\chromedriver.exe");
			//System.setProperty("webdriver.firefox.driver", "D:\\AutomationTesting\\drivers\\geckodriver.exe");
			//System.setProperty("webdriver.opera.driver", "D:\\AutomationTesting\\drivers\\operadriver.exe");
		    //driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome());
		    
		    driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		}
		return driver;
	}
	@BeforeMethod
	public void login(){
		loginPage.open()
		         .setUserName("admin")
		         .setPassword("123456")
		         .submit();
	  	//backFirstPage = loginPage.loginAs(admin);
	  	//assertTrue(backFirstPage.isLoggedIn());
	  	//assertTrue(backFirstPage.linkSystem.isDisplayed());
	  	
	  	//System.out.println(ConfigProperties.getProperty("login.url"));
	}
	@AfterMethod
	public void logout(){
		backFirstPage.logout();
	  	assertTrue(backFirstPage.isLoggedOut());
	}
	@BeforeSuite(alwaysRun = true)
	public void setUpBeforeSuite() throws Exception {
		//logger = Logger.getLogger("new logger");
		//System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	}

	@BeforeClass(alwaysRun = true)
	public void setUpBeforeClass() throws Exception {
	}

	@AfterSuite(alwaysRun = true)
	public void tearDownAfterSuite() {
		shutDownDriver(driver);
	}

	private void shutDownDriver(WebDriver driver) {
		if (driver != null) {
			driver.quit();
		}
	}
	
}
