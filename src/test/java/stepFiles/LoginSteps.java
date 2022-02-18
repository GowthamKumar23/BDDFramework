package stepFiles;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import managers.ConfigurationManager;

public class LoginSteps {

	ConfigurationManager configs = new ConfigurationManager();	
	WebDriver driver;
	@Given("The url is loaded")
	public void loadUrl()
	{
		WebDriverManager.chromedriver().arch64().driverVersion("97.0.4692.71").setup();
		driver = new ChromeDriver();
		driver.get(configs.getUrl());
	}
	
	@Given("The title is {string}")
	public void title(String title)
	{
		assertTrue(driver.getTitle().equals(title));
	}
	
	@When("Close the browser")
	public void closeUrl()
	{
		driver.close();
	}
}
