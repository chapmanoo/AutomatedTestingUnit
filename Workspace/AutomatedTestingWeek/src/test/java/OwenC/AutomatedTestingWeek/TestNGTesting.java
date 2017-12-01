package OwenC.AutomatedTestingWeek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNGTesting {

	private WebDriver webDriver;

	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) throws Exception {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"geckodriver.exe");
			webDriver = new FirefoxDriver();
		}
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"chromedriver.exe");
			webDriver = new ChromeDriver();
		}
	}

	@Test
	public void test() {

		webDriver.navigate().to("http://www.google.co.uk/");

	}

	@AfterTest
	public void tearDown() {
		webDriver.quit();
	}

}
