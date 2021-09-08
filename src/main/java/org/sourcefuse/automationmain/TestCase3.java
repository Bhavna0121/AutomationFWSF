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
 * Test Case 3: Verify all input fields using Hard assertions.
 * 
 * @author bjain
 *
 */
public class TestCase3 {
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
	 * This TC is doing hard assert on all the fields present in form and submiting
	 * it.
	 */
	@Test
	public void testCase2() {
		driver = SourceFuseFunctionUtilities.launchSourceFuseWithURL(globalMap);
		SourceFuseFunctionUtilities.FillFormWithHardAssert(driver, testDataMap);
	}

	/**
	 * close the instance of web driver and exit browsers
	 */
	@AfterTest
	public void closeBrowser() {
		SourceFuseFunctionUtilities.closeWebBrowser(driver);
	}

}
