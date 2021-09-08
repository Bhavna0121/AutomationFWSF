package org.sourcefuse.automationmain;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.sourcefuse.functionutilties.SourceFuseFunctionUtilities;
import org.sourcefuse.helper.ResourceHelper;

/**
 * Test Case 4: Submit the form after filling all details properly by using
 * XPath only.
 * 
 * @author bjain
 *
 */
public class TestCase4 {
	public static HashMap<String, Object> globalMap = new HashMap<String, Object>();
	public static HashMap<String, String> testDataMap = new HashMap<String, String>();
	public static SourceFuseFunctionUtilities SourceFuseFunctionUtilities = new SourceFuseFunctionUtilities();

	public static void main(String[] args) throws IOException {
		ResourceHelper.readProperties(globalMap);
		ResourceHelper.loadtestData(testDataMap, (String) globalMap.get(("TestDataPath")));
		WebDriver driver = SourceFuseFunctionUtilities.launchSourceFuseWithURL(globalMap);
		SourceFuseFunctionUtilities.fillForm(driver, testDataMap);
		SourceFuseFunctionUtilities.closeWebBrowser(driver);
	}
}
