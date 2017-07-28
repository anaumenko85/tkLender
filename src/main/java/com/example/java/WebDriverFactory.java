package com.example.java;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
<<<<<<< origin
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
=======
import org.openqa.selenium.opera.OperaDriver;
>>>>>>> local
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

<<<<<<< origin
/*
 * Factory to instantiate a WebDriver object. It returns an instance of the driver (local invocation) or an instance of RemoteWebDriver
 * 
 * @author Sebastiano Armeli-Battana
 */
public class WebDriverFactory {

	/* Browsers constants */
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String SAFARI = "safari";
	public static final String OPERA = "opera";
	public static final String INTERNET_EXPLORER = "ie";
	public static final String HTML_UNIT = "htmlunit";
	public static final String IPHONE = "iphone";

	/* Platform constants */
	public static final String WINDOWS = "windows";
	public static final String ANDROID = "android";
	public static final String XP = "xp";
	public static final String VISTA = "vista";
	public static final String MAC = "mac";
	public static final String LINUX = "linux";

	private static WebDriver webDriver = null;

	/*
	 * Factory method to return a RemoteWebDriver instance given the url of the
	 * Grid hub and a Browser instance.
	 * 
	 * @param gridHubUrl : grid hub URI
	 * 
	 * @param browser : Browser object containing info around the browser to hit
	 * 
	 * @param username : username for BASIC authentication on the page to test
	 * 
	 * @param password : password for BASIC authentication on the page to test
	 * 
	 * @return RemoteWebDriver
	 */
	public static WebDriver getInstance(String gridHubUrl, Browser browser,
			String username, String password) {

		WebDriver webDriver = null;

		DesiredCapabilities capability = new DesiredCapabilities();
		String browserName = browser.getName();
		capability.setJavascriptEnabled(true);

		// In case there is no Hub
		if (gridHubUrl == null || gridHubUrl.length() == 0) {
			return getInstance(browserName, username, password);
		}

		if (CHROME.equals(browserName)) {
			capability = DesiredCapabilities.chrome();
		} else if (FIREFOX.equals(browserName)) {
			capability = DesiredCapabilities.firefox();
			
			FirefoxProfile ffProfile = new FirefoxProfile();

			// Authenication Hack for Firefox
			if (username != null && password != null) {
				ffProfile.setPreference("network.http.phishy-userpass-length",
						255);
				capability.setCapability(FirefoxDriver.PROFILE, ffProfile);
			}
			
			capability.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		} else if (INTERNET_EXPLORER.equals(browserName)) {

			capability = DesiredCapabilities.internetExplorer();
			capability
			.setCapability(
					InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					true);
		} else if (SAFARI.equals(browserName)) {
			capability = DesiredCapabilities.safari();
		} else if (OPERA.equals(browserName)) {
			capability = DesiredCapabilities.opera();
		} else if (ANDROID.equals(browserName)) {
			capability = DesiredCapabilities.android();
		} else if (IPHONE.equals(browserName)) {
			capability = DesiredCapabilities.iphone();
		} else {

			capability = DesiredCapabilities.htmlUnit();
			// HTMLunit Check
			if (username != null && password != null) {
				webDriver = (HtmlUnitDriver) AuthenticatedHtmlUnitDriver
						.create(username, password);
			} else {
				webDriver = new HtmlUnitDriver(true);
			}

			return webDriver;
		}

		capability = setVersionAndPlatform(capability, browser.getVersion(),
				browser.getPlatform());

		// Create Remote WebDriver
		try {
			webDriver = new RemoteWebDriver(new URL(gridHubUrl), capability);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return webDriver;
	}

	/*
	 * Factory method to return a WebDriver instance given the browser to hit
	 * 
	 * @param browser : String representing the local browser to hit
	 * 
	 * @param username : username for BASIC authentication on the page to test
	 * 
	 * @param password : password for BASIC authentication on the page to test
	 * 
	 * @return WebDriver instance
	 */
	public static WebDriver getInstance(String browser, String username,
			String password) {

		if (webDriver != null) {
			return webDriver;
		}

		if (CHROME.equals(browser)) {
			webDriver = new ChromeDriver();

		} else if (FIREFOX.equals(browser)) {

			FirefoxProfile ffProfile = new FirefoxProfile();

			// Authenication Hack for Firefox
			if (username != null && password != null) {
				ffProfile.setPreference("network.http.phishy-userpass-length",
						255);
			}

			webDriver = new FirefoxDriver(ffProfile);

		} else if (INTERNET_EXPLORER.equals(browser)) {
			webDriver = new InternetExplorerDriver();

		} else if (OPERA.equals(browser)) {
			webDriver = new OperaDriver();

		} else if (SAFARI.equals(browser)) {
			webDriver = new SafariDriver();

		} else if (IPHONE.equals(browser)) {
			try {
				webDriver = new IPhoneDriver();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (ANDROID.equals(browser)) {
			webDriver = new AndroidDriver();

		} else {

			// HTMLunit Check
			if (username != null && password != null) {
				webDriver = (HtmlUnitDriver) AuthenticatedHtmlUnitDriver
						.create(username, password);
			} else {
				webDriver = new HtmlUnitDriver(true);
			}
		}

		return webDriver;
	}

	/*
	 * Helper method to set version and platform for a specific browser
	 * 
	 * @param capability : DesiredCapabilities object coming from the selected
	 * browser
	 * 
	 * @param version : browser version
	 * 
	 * @param platform : browser platform
	 * 
	 * @return DesiredCapabilities
	 */
	private static DesiredCapabilities setVersionAndPlatform(
			DesiredCapabilities capability, String version, String platform) {
		if (MAC.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.MAC);
		} else if (LINUX.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.LINUX);
		} else if (XP.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.XP);
		} else if (VISTA.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.VISTA);
		} else if (WINDOWS.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.WINDOWS);
		} else if (ANDROID.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.ANDROID);
		} else {
			capability.setPlatform(Platform.ANY);
		}

		if (version != null) {
			capability.setVersion(version);
		}
		return capability;
	}

}
=======
//import com.opera.core.systems.OperaDriver;


public class WebDriverFactory {

  // Factory settings

  private static String defaultHub = null; // change to
                                           // "http://myserver:4444/wd/hub" to
                                           // use remote webdriver by default
  private static int restartFrequency = Integer.MAX_VALUE;

  public static void setDefaultHub(String newDefaultHub) {
    defaultHub = newDefaultHub;
  }

  public static void setRestartFrequency(int newRestartFrequency) {
    restartFrequency = newRestartFrequency;
  }

  // Factory

  private static String key = null;
  private static int count = 0;
  private static WebDriver driver;

  public static WebDriver getDriver(String hub, Capabilities capabilities) {
    count++;
    // 1. WebDriver instance is not created yet
    if (driver == null) {
      return newWebDriver(hub, capabilities);
    }
    // 2. Different flavour of WebDriver is required
    String newKey = capabilities.toString() + ":" + hub;
    if (!newKey.equals(key)) {
      dismissDriver();
      key = newKey;
      return newWebDriver(hub, capabilities);
    }
    // 3. Browser is dead
    try {
      driver.getCurrentUrl();
    } catch (Throwable t) {
      t.printStackTrace();
      return newWebDriver(hub, capabilities);
    }
    // 4. It's time to restart
    if (count >= restartFrequency) {
      dismissDriver();
      return newWebDriver(hub, capabilities);
    }
    // 5. Just use existing WebDriver instance
    return driver;
  }

  public static WebDriver getDriver(Capabilities capabilities) {
    return getDriver(defaultHub, capabilities);
  }

  public static void dismissDriver() {
    if (driver != null) {
      driver.quit();
      driver = null;
      key = null;
    }
  }

  // Factory internals

  private static WebDriver newWebDriver(String hub, Capabilities capabilities) {
    driver = (hub == null)
        ? createLocalDriver(capabilities)
        : createRemoteDriver(hub, capabilities);
    key = capabilities.toString() + ":" + hub;
    count = 0;
    return driver;
  }

  private static WebDriver createRemoteDriver(String hub,
      Capabilities capabilities) {
    try {
      return new RemoteWebDriver(new URL(hub), capabilities);
    } catch (MalformedURLException e) {
      e.printStackTrace();
      throw new Error("Could not connect to WebDriver hub", e);
    }
  }

  private static WebDriver createLocalDriver(Capabilities capabilities) {
    String browserType = capabilities.getBrowserName();
    if (browserType.equals("firefox"))
      return new FirefoxDriver(capabilities);
    if (browserType.startsWith("internet explorer"))
      return new InternetExplorerDriver(capabilities);
    if (browserType.equals("chrome"))
      return new ChromeDriver(capabilities);
    if (browserType.equals("opera"))
      return new OperaDriver(capabilities);
    throw new Error("Unrecognized browser type: " + browserType);
  }

  static {
    Runtime.getRuntime().addShutdownHook(new Thread() {
      public void run() {
        dismissDriver();
      }
    });
  }
}
>>>>>>> local
