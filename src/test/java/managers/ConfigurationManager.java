package managers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.InvalidArgumentException;

public class ConfigurationManager 
{
	Properties properties = new Properties();
	public ConfigurationManager() 
	{
		try {
			File file = new File("./src/main/resources/config/configuration.properties");
			properties.load(new FileInputStream(file)); 
		} catch (FileNotFoundException e) {
			throw new InvalidArgumentException("The file is not there in the path :");
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public String getUrl()
	{
		return properties.getProperty("url");
	}
	
}
