package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
{

	//Declaration
	@FindBy(id="firstName") //address of first name
	private WebElement FN; // address of first name is stored in FN
	
	@FindBy(id="lastName")
	private WebElement LN;
	
	@FindBy(id="userEmail")
	private WebElement EID;
	
	@FindBy(xpath = "//input[.='Male']")
	private WebElement gender;
	
	@FindBy(id="userNumber")
	private WebElement Mobile;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath = "(//div[.='7'])[1]")
	private WebElement date;
	
	@FindBy(xpath = "//input[@id='subjectsInput']")
	private WebElement subject;
	
	@FindBy(xpath = "//label[.='Music']")
	private WebElement Hobbies;
	
	@FindBy(id="uploadPicture")
	private WebElement browse;
	
	@FindBy(id="currentAddress")
	private WebElement caddress;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="city")
	private WebElement city;
	
	//Initialization
	public PomClass (WebDriver d1)
	{
		PageFactory.initElements(d1, this);
	}
	
	
	//Utilization
	public void firstname(String firstname)
	{
		FN.sendKeys(firstname); // for FN performing the action
	}
	
	public void lastname (String lastname)
	{
		LN.sendKeys(lastname);
	}
	
	public void emailid (String emailid)
	{
		EID.sendKeys(emailid);
	}
	
	public void Gender()
	{
		gender.click();
	}
	
	public void mobilenumber (String mobileno)
	{
		Mobile.sendKeys(mobileno);
	
	}
	
	public void DOB ()
	{
		dob.click();
	}
	
	public void Date ()
	{
		date.click();
	}
	
	
	public void Subject()
	{
		subject.sendKeys("c");
	}
	
	public void Myhobbies()
	{
		Hobbies.click();
	}
	
	public void picture()
	{
		browse.sendKeys("C:\\Users\\bharath.g\\Desktop\\Screenshot (1).png");
	}
	
	public void Currentadress() 
	{
		caddress.sendKeys("hello");
	}
	
	public void State()
	
	{
		state.click();
	}
	
	public void City() 
	{
		city.click();
	}
	
}
