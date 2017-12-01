package OwenC.AutomatedTestingWeek;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class SignInPage {

	@FindBy(id = "email_create")
	private WebElement txtCreateEmail;

	@FindBy(id = "SubmitCreate")
	private WebElement cmdCreateAccount;

	@FindBy(id = "id_gender1")
	private WebElement rdbGender1;

	@FindBy(id = "id_gender2")
	private WebElement rdbGender2;
	
	@FindBy(id = "days")
	private WebElement ddbDayOfBirth;
	
	@FindBy(id = "months")
	private WebElement ddbMonthOfBirth;
	
	@FindBy(id = "years")
	private WebElement ddbYearOfBirth;

	@FindBy(id = "customer_firstname")
	private WebElement txtFirstName;

	@FindBy(id = "customer_lastname")
	private WebElement txtLastName;

	@FindBy(id = "passwd")
	private WebElement txtPassword;

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "firstname")
	private WebElement txtAddressFirstName;

	@FindBy(id = "lastname")
	private WebElement txtAddressLastName;

	@FindBy(id = "company")
	private WebElement txtCompany;

	@FindBy(id = "address1")
	private WebElement txtAddressLine1;

	@FindBy(id = "address2")
	private WebElement txtAddressLine2;

	@FindBy(id = "city")
	private WebElement txtCity;

	@FindBy(id = "postcode")
	private WebElement txtPostCode;

	@FindBy(id = "other")
	private WebElement txtOther;

	@FindBy(id = "phone")
	private WebElement txtPhone;

	@FindBy(id = "phone_mobile")
	private WebElement txtPhoneMobile;

	@FindBy(id = "alias")
	private WebElement txtAlias;

	@FindBy(id = "id_country")
	private WebElement ddbCountry;

	@FindBy(id = "id_state")
	private WebElement ddbState;
	
	@FindBy(id = "submitAccount")
	private WebElement cmdSubmit;

	public WebElement getTxtCreateEmail() {
		return txtCreateEmail;
	}

	public WebElement getCmdCreateAccount() {
		return cmdCreateAccount;
	}

	public WebElement getRdbGender1() {
		return rdbGender1;
	}

	public WebElement getRdbGender2() {
		return rdbGender2;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtAddressFirstName() {
		return txtAddressFirstName;
	}

	public WebElement getTxtAddressLastName() {
		return txtAddressLastName;
	}

	public WebElement getTxtCompany() {
		return txtCompany;
	}

	public WebElement getTxtAddressLine1() {
		return txtAddressLine1;
	}

	public WebElement getTxtAddressLine2() {
		return txtAddressLine2;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtPostCode() {
		return txtPostCode;
	}

	public WebElement getTxtOther() {
		return txtOther;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getTxtPhoneMobile() {
		return txtPhoneMobile;
	}

	public WebElement getTxtAlias() {
		return txtAlias;
	}

	public WebElement getDdbCountry() {
		return ddbCountry;
	}

	public WebElement getDdbState() {
		return ddbState;
	}

	public WebElement getDdbDayOfBirth() {
		return ddbDayOfBirth;
	}

	public WebElement getDdbMonthOfBirth() {
		return ddbMonthOfBirth;
	}

	public WebElement getDdbYearOfBirth() {
		return ddbYearOfBirth;
	}
}
