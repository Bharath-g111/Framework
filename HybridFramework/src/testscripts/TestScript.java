package testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.Excel;
import pomscripts.PomClass;

public class TestScript extends BaseClass
{

	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		String first = Excel.getData("Sheet1", 0, 0);
		String last = Excel.getData("Sheet1", 1, 0);
		String email = Excel.getData("Sheet1", 2, 0);
		String phonenumber = Excel.getData("Sheet1", 3, 0);
		
		PomClass PC=new PomClass(d1);
		PC.firstname(first); //methodname(first)
		PC.lastname(last);
		PC.emailid(email);
		PC.Gender();
		PC.mobilenumber(phonenumber);
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) d1; //to scroll the page using java script executor on d1 bcoz firefox is stored in d1
		js1.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		PC.Date();
		Thread.sleep(2000);
		
		 WebElement month = d1.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		 Select s1= new Select(month);
		 s1.selectByVisibleText("November");
		 
		 Thread.sleep(2000);
		 
		 WebElement year = d1.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		 Select s2= new Select(year);
		 s2.selectByVisibleText("1997");
		 
		 Thread.sleep(2000);
		 
		 PC.Date();
		 
		 PC.Subject();
		 Robot r1= new Robot();
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_ENTER);
		 r1.keyRelease(KeyEvent.VK_DOWN);
		 r1.keyRelease(KeyEvent.VK_DOWN);
		 r1.keyRelease(KeyEvent.VK_DOWN);
		 r1.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 PC.Myhobbies();
		 PC.picture();
		 PC.Currentadress();
		 
		 PC.State();
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyRelease(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_ENTER);
		 r1.keyRelease(KeyEvent.VK_ENTER);
		 
		 PC.City();
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyRelease(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_ENTER);
		 r1.keyRelease(KeyEvent.VK_ENTER);
		 
		 WebElement ele = d1.findElement(By.id("submit"));
		 Actions act=new Actions(d1);
		 act.moveToElement(ele).perform();
	
	}
	
}
