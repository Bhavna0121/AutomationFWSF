package org.sourcefuse.automationmain;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.sourcefuse.functionutilties.SourceFuseFunctionUtilities;
import org.sourcefuse.helper.ResourceHelper;

/**
 * 
 * @author bjain Test Case 1: Try to submit without filling required fields and
 *         "Labels" of all the required fields printed on Console.
 */
public class TestCase1 {
	public static HashMap<String, Object> globalMap = new HashMap<String, Object>();
	public static HashMap<String, String> testDataMap = new HashMap<String, String>();
	public static SourceFuseFunctionUtilities SourceFuseFunctionUtilities = new SourceFuseFunctionUtilities();

	/**
	 * main method - start of the TC1 This reads the properties file loads the
	 * testdata file and execute the case by launching Chrome Browser and prints the
	 * label on Console
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ResourceHelper.readProperties(globalMap);
		ResourceHelper.loadtestData(testDataMap, (String) globalMap.get(("TestDataPath")));
		WebDriver driver = SourceFuseFunctionUtilities.launchSourceFuseWithURL(globalMap);
		SourceFuseFunctionUtilities.fillForm(driver, testDataMap);
		SourceFuseFunctionUtilities.closeWebBrowser(driver);
	}
}
