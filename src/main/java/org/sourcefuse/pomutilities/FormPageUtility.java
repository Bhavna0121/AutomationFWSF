package org.sourcefuse.pomutilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sourcefuse.pom.FormPage;

public class FormPageUtility extends FormPage {

	public WebElement inputFirstName(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelFirstName()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getFirstName());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding FirstName element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputLastName(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelLastName()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getLastName());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding LastName element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputEmail(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelEmail()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getEmail());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding Email element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputCurrentCompany(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelCurrentCompany()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getCurrentCompany());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding Current Company element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputMobileNo(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelMobileNo()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getMobileNo());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding Mobile Number element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputDateOfBirth(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelDateOfBirth()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getDateOfBirth());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding Date of Birth element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputPositionApplied(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelPositionApplied()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getPositionApplied());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding Position Applied element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputPortfolioWebSite(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelPortfolioWebsite()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getPortfolioWebsite());
			ele.clear();
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding portfolio element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputSalaryRequirements(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelSalaryRequirements()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getSalaryRequirements());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding Salary Requirements element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputWhenYouCanStart(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelWhenCanYouStart()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getWhenCanYouStart());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding When Can you Start element" + e.getMessage());
			return null;
		}
	}

	public WebElement inputAddress(WebDriver driver, String value) {
		try {
			System.out.println(driver.findElement(getLabelAddress()).getText() + " -> " + value);
			WebElement ele = driver.findElement(getAddress());
			ele.sendKeys(value);
			return ele;
		} catch (Exception e) {
			System.out.println("Error in finding Address element" + e.getMessage());
			return null;
		}
	}

	public void uploadResume(WebDriver driver, String filePath) {
		try {
			System.out.println(driver.findElement(getLabelUploadYourResume()).getText() + " -> " + filePath);
			if (!filePath.equals("")) {
				return;
			}
			String path = System.getProperty("user.dir");
			driver.findElement(getUploadYourResume()).sendKeys(path + filePath);
		} catch (Exception e) {
			System.out.println("Error in finding upload resume element" + e.getMessage());
		}

	}

	public void clickRelocateOptn(WebDriver driver, String option) {
		try {
			System.out.println(driver.findElement(getLabelRealocate()).getText() + " -> " + option);
			if (!option.equals("")) {
				List<WebElement> options = driver.findElements(getRealocate());
				for (WebElement ele : options) {
					if (ele.getText().equals(option)) {
						driver.findElements(getRealocate());
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Error in finding Relocate element" + e.getMessage());
		}
	}

	public void clickSubmitForm(WebDriver driver) {
		try {
			String label = driver.findElement(getSubmitForm()).getText();
			System.out.println(label);
			driver.findElement(getSubmitForm()).click();
		} catch (Exception e) {
			System.out.println("Error in finding Submit Form element" + e.getMessage());
		}
	}

	public void clickResetForm(WebDriver driver) {
		try {
			String label = driver.findElement(getResetForm()).getText();
			System.out.println(label);
			driver.findElement(getResetForm()).click();
		} catch (Exception e) {
			System.out.println("Error in finding Reset Form element" + e.getMessage());
		}
	}

}
