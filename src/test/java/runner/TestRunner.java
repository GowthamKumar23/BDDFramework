package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/Features",
		glue = "stepFiles"
		)
public class TestRunner {
	@BeforeClass()
	public static void beforeAll()
	{
		System.out.println("Before class");
	}
}
