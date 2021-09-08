package org.sourcefuse.pom;

import org.openqa.selenium.By;
import org.sourcefuse.searchproperties.FormPageSearchProperties;

public class FormPage extends FormPageSearchProperties {

	public By getLabelFirstName() {
		return By.xpath(FormPageSearchProperties.labelFirstname);
	}

	public By getLabelLastName() {
		return By.xpath(FormPageSearchProperties.labelLastname);
	}

	public By getLabelEmail() {
		return By.xpath(FormPageSearchProperties.labelEmail);
	}

	public By getLabelCurrentCompany() {
		return By.xpath(FormPageSearchProperties.labelCurrentCompany);
	}

	public By getLabelMobileNo() {
		return By.xpath(FormPageSearchProperties.labelMobileNo);
	}

	public By getLabelDateOfBirth() {
		return By.xpath(FormPageSearchProperties.labelDob);
	}

	public By getLabelPositionApplied() {
		return By.xpath(FormPageSearchProperties.labelPosition);
	}

	public By getLabelPortfolioWebsite() {
		return By.xpath(FormPageSearchProperties.labelPortfoliowebsite);
	}

	public By getLabelSalaryRequirements() {
		return By.xpath(FormPageSearchProperties.labelSalary);
	}

	public By getLabelWhenCanYouStart() {
		return By.xpath(FormPageSearchProperties.labelWhenCanYouStart);
	}

	public By getLabelAddress() {
		return By.xpath(FormPageSearchProperties.labelAddress);
	}

	public By getLabelUploadYourResume() {
		return By.xpath(FormPageSearchProperties.labelUploadFile);
	}

	public By getLabelRealocate() {
		return By.xpath(FormPageSearchProperties.labelRelocate);
	}

	public By getFirstName() {
		return By.xpath(FormPageSearchProperties.firstname);
	}

	public By getLastName() {
		return By.xpath(FormPageSearchProperties.lastname);
	}

	public By getEmail() {
		return By.xpath(FormPageSearchProperties.email);
	}

	public By getCurrentCompany() {
		return By.xpath(FormPageSearchProperties.currentCompany);
	}

	public By getMobileNo() {
		return By.xpath(FormPageSearchProperties.mobileNo);
	}

	public By getDateOfBirth() {
		return By.xpath(FormPageSearchProperties.dob);
	}

	public By getPositionApplied() {
		return By.xpath(FormPageSearchProperties.position);
	}

	public By getPortfolioWebsite() {
		return By.xpath(FormPageSearchProperties.portfoliowebsite);
	}

	public By getSalaryRequirements() {
		return By.xpath(FormPageSearchProperties.salary);
	}

	public By getWhenCanYouStart() {
		return By.xpath(FormPageSearchProperties.whenCanYouStart);
	}

	public By getAddress() {
		return By.xpath(FormPageSearchProperties.address);
	}

	public By getUploadYourResume() {
		return By.xpath(FormPageSearchProperties.uploadFile);
	}

	public By getRealocate() {
		return By.xpath(FormPageSearchProperties.relocate);
	}
	public By getRealocate(String option) {
		return By.xpath("");
	}

	public By getSubmitForm() {
		return By.xpath(FormPageSearchProperties.submitBtn);
	}

	public By getResetForm() {
		return By.xpath(FormPageSearchProperties.resetForm);
	}
}
