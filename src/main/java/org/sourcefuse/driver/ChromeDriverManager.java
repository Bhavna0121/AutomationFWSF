package org.sourcefuse.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager {

	/**
	 * used web driver manager so that chromedriver.exe needs no manual intervention
	 * and loaded with every chrome version update , code needs no change
	 * 
	 * @return the driver for launching the browser
	 */
	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "/absolute/path/to/binary/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
