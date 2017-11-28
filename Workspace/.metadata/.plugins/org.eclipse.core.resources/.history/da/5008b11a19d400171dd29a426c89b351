package OwenC.AutomatedTestingWeek;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class webDriver {

	private String url = "http://www.google.com";
	private WebDriver webDriver;

	@Before
	public void setUp() {
		webDriver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		webDriver.quit();
	}

	/*@Test
	public void gitHubLoginTest() {
		String username = "";
		String password = "";
		webDriver.navigate().to(url);
		webDriver.manage().window().fullscreen();

		WebElement searchBar = webDriver.findElement(By.cssSelector("#lst-ib"));
		searchBar.sendKeys("github \n");
		WebElement link = webDriver
				.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > h3 > a"));
		link.click();

		WebElement signInButton = webDriver.findElement(By.cssSelector(
				"body > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu.HeaderMenu--bright.d-lg-flex.flex-justify-between.flex-auto > div > span > div > a:nth-child(1)"));
		signInButton.click();

		WebElement usernameBox = webDriver.findElement(By.cssSelector("#login_field"));
		WebElement passwordBox = webDriver.findElement(By.cssSelector("#password"));

		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password + "\n");

		WebElement profile = webDriver.findElement(By.cssSelector("#user-links > li:nth-child(3) > details > summary"));
		profile.click();
		WebElement usernameLabel = webDriver.findElement(By.cssSelector(
				"#user-links > li:nth-child(3) > details > ul > li.dropdown-header.header-nav-current-user.css-truncate > strong"));

		String result = usernameLabel.getText().toString();

		System.out.println('b' + 2);
		assertEquals("Result wasn't expected", "EXPECTED", result);
	}*/
	
	@Test
	public void demositeLoginTest()
	{
		webDriver.navigate().to("http://thedemosite.co.uk");
		String username = "1234";
		String password = "1234";
		
		WebElement action = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)"));
		action.click();
		
		action = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		action.sendKeys(username);
		
		action = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		action.sendKeys(password);
		
		action = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
		action.click();
		
		action = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(2) > small > a"));
		action.click();
		
		action = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		action.sendKeys(username);
		
		action = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		action.sendKeys(password);
		
		action = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
		action.click();
		
		action = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));
		assertEquals("Result wasn't expected", "**Successful Login**", action.getText().toString());
		
		
		
		
	}
}
