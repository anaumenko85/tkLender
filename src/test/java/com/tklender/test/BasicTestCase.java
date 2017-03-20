package com.tklender.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.example.java.ConfigProperties;
import com.example.java.WebDriverFactory;
import com.tklender.data.UserData;



public class BasicTestCase {
	protected static WebDriver driver;
	//SystemPage system = new SystemPage(driver);
	//AddUserPage userpage = new AddUserPage(driver);
	
	public UserData admin = new UserData("admin","123456");

	protected WebDriver getWebDriver(){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "D:\\AutomationTesting\\chromedriver_win32\\chromedriver.exe");
		    driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome());
		    driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		}
		return driver;
	}
	
	@BeforeSuite(alwaysRun = true)
	public void setUpBeforeSuite() throws Exception {
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
