package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class generic_screenshot 
{

	public static void getPhoto(WebDriver d1) throws IOException
	{
		
		String photo="./Photos";
		Date d= new Date();
	    TakesScreenshot ts = (TakesScreenshot) d1;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dst = new File(photo+d+".jpeg");
	    FileHandler.copy(src, dst);
	   
	}
}
