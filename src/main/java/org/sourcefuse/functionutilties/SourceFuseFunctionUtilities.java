package org.sourcefuse.functionutilties;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sourcefuse.driver.ChromeDriverManager;
import org.sourcefuse.pomutilities.FormPageUtility;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SourceFuseFunctionUtilities {

	public FormPageUtility formPageUtility = new FormPageUtility();
	public SoftAssert softAssert = new SoftAssert();

	/**
	 * This method is to launch the browser and opening the URL
	 * 
	 * @param globalMap
	 * @return
	 */
	public WebDriver launchSourceFuseWithURL(HashMap<String, Object> globalMap) {

		WebDriver driver = ChromeDriverManager.getChromeDriver();
		String URL = (String) globalMap.get("Protocol") + (String) globalMap.get("Username") + ":"
				+ (String) globalMap.get("Password") + "@" + (String) globalMap.get("URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}

	/**
	 * close web driver
	 * @param driver
	 */
	public void closeWebBrowser(WebDriver driver) {
		driver.quit();
	}

	/**
	 * This method is to fill the form with values passed into testdata.properties
	 * file and submit the form.
	 * 
	 * @param driver
	 * @param testdata
	 */
	public void fillForm(WebDriver driver, Map<String, String> testdata) {
		try {
			formPageUtility.inputFirstName(driver, testdata.get(("FirstName")));
			formPageUtility.inputLastName(driver, testdata.get(("LastName")));
			formPageUtility.inputEmail(driver, testdata.get(("Email")));
			formPageUtility.inputCurrentCompany(driver, testdata.get(("CurrentCompany")));
			formPageUtility.inputMobileNo(driver, testdata.get(("MobileNo")));
			formPageUtility.inputDateOfBirth(driver, testdata.get(("DOB")));
			formPageUtility.inputPositionApplied(driver, testdata.get(("PositionApplied")));
			formPageUtility.inputPortfolioWebSite(driver, testdata.get(("PortfolioWebsite")));
			formPageUtility.inputSalaryRequirements(driver, testdata.get(("SalaryRequirements")));
			formPageUtility.inputWhenYouCanStart(driver, testdata.get(("WhenYouCanStart")));
			formPageUtility.inputAddress(driver, testdata.get(("Address")));
			formPageUtility.uploadResume(driver, testdata.get(("Resume")));
			formPageUtility.clickRelocateOptn(driver, testdata.get(("Relocate")));

			formPageUtility.clickSubmitForm(driver);
		} finally {
			formPageUtility.clickResetForm(driver);
		}
	}

	/**
	 * This method is to do soft assert on each field present in the form while
	 * entering the values passed in testdata.properties and submit the form
	 * 
	 * @param driver
	 * @param testdata
	 */
	public void FillFormWithSoftAssert(WebDriver driver, Map<String, String> testdata) {
		try {
			SoftAssert softAssert = new SoftAssert();
			WebElement firstNameEle = formPageUtility.inputFirstName(driver, testdata.get(("FirstName")));
			softAssert.assertTrue(firstNameEle.isEnabled(), "First Name Enabled");
			softAssert.assertEquals(testdata.get(("FirstName")), firstNameEle.getAttribute("value"),
					"Expected -" + testdata.get(("FirstName")) + " | Actual - " + firstNameEle.getAttribute("value"));

			WebElement lastNameEle = formPageUtility.inputLastName(driver, testdata.get(("LastName")));
			softAssert.assertTrue(lastNameEle.isEnabled(), "First Name Enabled");
			softAssert.assertEquals(testdata.get(("LastName")), lastNameEle.getAttribute("value"),
					"Expected -" + testdata.get(("LastName")) + " | Actual - " + lastNameEle.getAttribute("value"));

			WebElement emailEle = formPageUtility.inputEmail(driver, testdata.get(("Email")));
			softAssert.assertTrue(emailEle.isEnabled(), "Email Enabled");
			softAssert.assertTrue(emailEle.getAttribute("value").matches("^(.+)@(.+)$"));
			softAssert.assertEquals(testdata.get(("Email")), emailEle.getAttribute("value"),
					"Expected -" + testdata.get(("Email")) + "| Actual - " + emailEle.getAttribute("value"));

			WebElement currentCompEle = formPageUtility.inputCurrentCompany(driver, testdata.get(("CurrentCompany")));
			softAssert.assertTrue(currentCompEle.isEnabled(), "Current Company Enabled");
			softAssert.assertEquals(testdata.get(("CurrentCompany")), currentCompEle.getAttribute("value"), "Expected -"
					+ testdata.get(("CurrentCompany")) + "| Actual - " + currentCompEle.getAttribute("value"));

			WebElement mobileNoEle = formPageUtility.inputMobileNo(driver, testdata.get(("MobileNo")));
			softAssert.assertTrue(mobileNoEle.isEnabled(), "MobileNo Enabled");
			softAssert.assertTrue(mobileNoEle.getAttribute("value").matches("[789][0-9]{9}"));
			softAssert.assertEquals(testdata.get(("MobileNo")), mobileNoEle.getAttribute("value"),
					"Expected -" + testdata.get(("MobileNo")) + "| Actual - " + mobileNoEle.getAttribute("value"));

			WebElement dobEle = formPageUtility.inputDateOfBirth(driver, testdata.get(("DOB")));
			softAssert.assertTrue(dobEle.isEnabled(), "DOB Enabled");
			softAssert.assertEquals(testdata.get(("DOB")), dobEle.getAttribute("value"),
					"Expected -" + testdata.get(("DOB")) + "| Actual - " + dobEle.getAttribute("value"));

			WebElement positionAppliedEle = formPageUtility.inputPositionApplied(driver,
					testdata.get(("PositionApplied")));
			softAssert.assertTrue(positionAppliedEle.isEnabled(), "PositionApplied Enabled");
			softAssert.assertEquals(testdata.get(("PositionApplied")), positionAppliedEle.getAttribute("value"),
					"Expected -" + testdata.get(("PositionApplied")) + "| Actual - "
							+ positionAppliedEle.getAttribute("value"));

			WebElement portfolioWebsiteEle = formPageUtility.inputPortfolioWebSite(driver,
					testdata.get(("PortfolioWebsite")));
			softAssert.assertTrue(portfolioWebsiteEle.isEnabled(), "PortfolioWebsite Enabled");
			softAssert.assertEquals(testdata.get(("PortfolioWebsite")), portfolioWebsiteEle.getAttribute("value"),
					"Expected -" + testdata.get(("PortfolioWebsite")) + "| Actual - "
							+ portfolioWebsiteEle.getAttribute("value"));

			WebElement salaryRequirementEle = formPageUtility.inputSalaryRequirements(driver,
					testdata.get(("SalaryRequirements")));
			softAssert.assertTrue(salaryRequirementEle.isEnabled(), "SalaryRequirements Enabled");
			softAssert.assertEquals(testdata.get(("SalaryRequirements")), salaryRequirementEle.getAttribute("value"),
					"Expected -" + testdata.get(("SalaryRequirements")) + "| Actual - "
							+ salaryRequirementEle.getAttribute("value"));

			WebElement whenYouCanStartEle = formPageUtility.inputWhenYouCanStart(driver,
					testdata.get(("WhenYouCanStart")));
			softAssert.assertTrue(whenYouCanStartEle.isEnabled(), "WhenYouCanStart Enabled");
			softAssert.assertEquals(testdata.get(("WhenYouCanStart")), whenYouCanStartEle.getAttribute("value"),
					"Expected -" + testdata.get(("WhenYouCanStart")) + "| Actual - "
							+ whenYouCanStartEle.getAttribute("value"));

			WebElement addressEle = formPageUtility.inputAddress(driver, testdata.get(("Address")));
			softAssert.assertTrue(addressEle.isEnabled(), "Address Enabled");
			softAssert.assertEquals(testdata.get(("Address")), addressEle.getAttribute("value"),
					"Expected -" + testdata.get(("Address")) + "| Actual - " + addressEle.getAttribute("value"));

			formPageUtility.uploadResume(driver, testdata.get(("Resume")));

			formPageUtility.clickRelocateOptn(driver, testdata.get(("Relocate")));

			formPageUtility.clickSubmitForm(driver);
			softAssert.assertAll();
		} finally {
			formPageUtility.clickResetForm(driver);
		}
	}

	/**
	 * This method is to do hard assert on every field present in form and enter the
	 * values present in testdata.properties file and submit the form
	 * 
	 * @param driver
	 * @param testdata
	 */
	public void FillFormWithHardAssert(WebDriver driver, Map<String, String> testdata) {
		try {
			WebElement firstNameEle = formPageUtility.inputFirstName(driver, testdata.get(("FirstName")));
			Assert.assertTrue(firstNameEle.isEnabled(), "First Name Enabled");
			Assert.assertEquals(testdata.get(("FirstName")), firstNameEle.getAttribute("value"),
					"Expected -" + testdata.get(("FirstName")) + "| Actual - " + firstNameEle.getAttribute("value"));

			WebElement lastNameEle = formPageUtility.inputLastName(driver, testdata.get(("LastName")));
			Assert.assertTrue(lastNameEle.isEnabled(), "First Name Enabled");
			Assert.assertEquals(testdata.get(("LastName")), lastNameEle.getAttribute("value"),
					"Expected -" + testdata.get(("LastName")) + "| Actual - " + lastNameEle.getAttribute("value"));

			WebElement emailEle = formPageUtility.inputEmail(driver, testdata.get(("Email")));
			Assert.assertTrue(emailEle.isEnabled(), "Email Enabled");
			Assert.assertTrue(emailEle.getAttribute("value").matches("^(.+)@(.+)$"));
			Assert.assertEquals(testdata.get(("Email")), emailEle.getAttribute("value"),
					"Expected -" + testdata.get(("Email")) + "| Actual - " + emailEle.getAttribute("value"));

			WebElement currentCompEle = formPageUtility.inputCurrentCompany(driver, testdata.get(("CurrentCompany")));
			Assert.assertTrue(currentCompEle.isEnabled(), "Current Company Enabled");
			Assert.assertEquals(testdata.get(("CurrentCompany")), currentCompEle.getAttribute("value"), "Expected -"
					+ testdata.get(("CurrentCompany")) + "| Actual - " + currentCompEle.getAttribute("value"));

			WebElement mobileNoEle = formPageUtility.inputMobileNo(driver, testdata.get(("MobileNo")));
			Assert.assertTrue(mobileNoEle.isEnabled(), "MobileNo Enabled");
			Assert.assertTrue(mobileNoEle.getAttribute("value").matches("[789][0-9]{9}"));
			Assert.assertEquals(testdata.get(("MobileNo")), mobileNoEle.getAttribute("value"),
					"Expected -" + testdata.get(("MobileNo")) + "| Actual - " + mobileNoEle.getAttribute("value"));

			WebElement dobEle = formPageUtility.inputDateOfBirth(driver, testdata.get(("DOB")));
			Assert.assertTrue(dobEle.isEnabled(), "DOB Enabled");
			Assert.assertEquals(testdata.get(("DOB")), dobEle.getAttribute("value"),
					"Expected -" + testdata.get(("DOB")) + "| Actual - " + dobEle.getAttribute("value"));

			WebElement positionAppliedEle = formPageUtility.inputPositionApplied(driver,
					testdata.get(("PositionApplied")));
			Assert.assertTrue(positionAppliedEle.isEnabled(), "PositionApplied Enabled");
			Assert.assertEquals(testdata.get(("PositionApplied")), positionAppliedEle.getAttribute("value"),
					"Expected -" + testdata.get(("PositionApplied")) + "| Actual - "
							+ positionAppliedEle.getAttribute("value"));

			WebElement portfolioWebsiteEle = formPageUtility.inputPortfolioWebSite(driver,
					testdata.get(("PortfolioWebsite")));
			Assert.assertTrue(portfolioWebsiteEle.isEnabled(), "PortfolioWebsite Enabled");
			Assert.assertEquals(testdata.get(("PortfolioWebsite")), portfolioWebsiteEle.getAttribute("value"),
					"Expected -" + testdata.get(("PortfolioWebsite")) + "| Actual - "
							+ portfolioWebsiteEle.getAttribute("value"));

			WebElement salaryRequirementEle = formPageUtility.inputSalaryRequirements(driver,
					testdata.get(("SalaryRequirements")));
			Assert.assertTrue(salaryRequirementEle.isEnabled(), "SalaryRequirements Enabled");
			Assert.assertEquals(testdata.get(("SalaryRequirements")), salaryRequirementEle.getAttribute("value"),
					"Expected -" + testdata.get(("SalaryRequirements")) + "| Actual - "
							+ salaryRequirementEle.getAttribute("value"));

			WebElement whenYouCanStartEle = formPageUtility.inputWhenYouCanStart(driver,
					testdata.get(("WhenYouCanStart")));
			Assert.assertTrue(whenYouCanStartEle.isEnabled(), "WhenYouCanStart Enabled");
			Assert.assertEquals(testdata.get(("WhenYouCanStart")), whenYouCanStartEle.getAttribute("value"),
					"Expected -" + testdata.get(("WhenYouCanStart")) + "| Actual - "
							+ whenYouCanStartEle.getAttribute("value"));

			WebElement addressEle = formPageUtility.inputAddress(driver, testdata.get(("Address")));
			Assert.assertTrue(addressEle.isEnabled(), "Address Enabled");
			Assert.assertEquals(testdata.get(("Address")), addressEle.getAttribute("value"),
					"Expected -" + testdata.get(("Address")) + "| Actual - " + addressEle.getAttribute("value"));

			formPageUtility.uploadResume(driver, testdata.get(("Resume")));

			formPageUtility.clickRelocateOptn(driver, testdata.get(("Relocate")));

			formPageUtility.clickSubmitForm(driver);
		} finally {
			formPageUtility.clickResetForm(driver);
		}
	}

}
