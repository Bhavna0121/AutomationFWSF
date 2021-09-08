package org.sourcefuse.automationmain;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.sourcefuse.functionutilties.SourceFuseFunctionUtilities;
import org.sourcefuse.helper.ResourceHelper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Test Case 2: Verify all input fields using Soft assertions.
 * 
 * @author bjain
 *
 */
public class TestCase2 {
	public static HashMap<String, Object> globalMap = new HashMap<String, Object>();
	public static HashMap<String, String> testDataMap = new HashMap<String, String>();
	public static SourceFuseFunctionUtilities SourceFuseFunctionUtilities = new SourceFuseFunctionUtilities();
	WebDriver driver;

	/**
	 * loads the config.properties and testdata file.
	 */
	@BeforeTest
	public void loadData() throws IOException {
		ResourceHelper.readProperties(globalMap);
		ResourceHelper.loadtestData(testDataMap, (String) globalMap.get(("TestDataPath")));
	}

	/**
	 * Do soft assert on each field present in form and submit
	 */
	@Test
	public void testCase2() {
		driver = SourceFuseFunctionUtilities.launchSourceFuseWithURL(globalMap);
		SourceFuseFunctionUtilities.FillFormWithSoftAssert(driver, testDataMap);
	}

	/**
	 * close the instance of web driver and exit browsers
	 */
	@AfterTest
	public void closeBrowser() {
		SourceFuseFunctionUtilities.closeWebBrowser(driver);
	}
}
