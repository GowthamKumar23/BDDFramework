package stepFiles;

import io.cucumber.java.Before;
import managers.ConfigurationManager;

public class Hooks 
{
	ConfigurationManager config;
	@Before()
	private void beforeScenario() 
	{
		System.out.println("Before scenario");
	}
}
