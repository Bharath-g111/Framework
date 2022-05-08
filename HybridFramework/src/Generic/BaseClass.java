package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements Framework_Constants 

{
	public WebDriver d1;
	public WebDriverWait wait;
	
	@BeforeMethod
	
	public void openapp()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		d1=new FirefoxDriver();
		wait=new WebDriverWait(d1, 10);
		d1.get(URL);
	}
	
	@AfterMethod
	
	public void closeapp()
	{
		d1.close();
	
	}
}
