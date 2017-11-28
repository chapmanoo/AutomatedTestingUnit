package OwenC.AutomatedTestingWeek;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	private WebElement usernameBox;

	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
	private WebElement passwordBox;

	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")
	private WebElement loginButton;

	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b")
	private WebElement validLoginText;

	public void attemptLogin(String username, String password) {
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public String getLoginText() {
		String toReturn = validLoginText.getText().toString();

		return toReturn;
	}

}
