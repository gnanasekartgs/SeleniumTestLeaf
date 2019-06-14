package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
public ChromeDriver d;
	
	@Given("Open the Chrome Browser1")
	public void openTheChromeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		d = new ChromeDriver();	
		}

	@And("Maximize the Browser1")
	public void maximizeTheBrowser() 
	{
			d.manage().window().maximize();

	}

	@And("Set the Timeouts1")
	public void setTheTimeouts() 
	{
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	@And("Load the URL1")
	public void loadTheURL() {
		d.get("http://leaftaps.com/opentaps/control/main");
		}

	@And("Enter the Username as (.*)")
	public void enterTheUsernameAsDemosalesmanager(String data) {
		d.findElementById("username").sendKeys(data);
	}

	@And("Enter the Password as (.*)")
	public void enterThePasswordAsCrmsfa(String pwd)
	{
		d.findElementById("password").sendKeys(pwd);
	}

	@When("click on the login button")
	public void clickOnTheLoginButton() {
		d.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify Login Successful")
	public void verifyLoginSuccessful() {
		String title = d.getTitle();
		if(title.equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("correct");
		}
	}

	@And("Click the CRMSFA button")
	public void clickTheCRMSFAButton() {
		d.findElementByLinkText("CRM/SFA").click();
		}

	@And("Click Create Lead Button")
	public void clickCreateLeadButton() {
		d.findElementByLinkText("Create Lead").click();		
			}

	@And("Enter company name as (.*)")
	public void enterCompanyNameAsAmeex(String companyname) {
		d.findElementById("createLeadForm_companyName").sendKeys(companyname);
		}

	@And("Enter first name as (.*)")
	public void enterFirstNameAsGnana(String fname) {
		d.findElementById("createLeadForm_firstName").sendKeys(fname);
		
			}

	@Given("Enter last name as (.*)")
	public void enterLastNameAsTgs(String lname) {
		d.findElementById("createLeadForm_lastName").sendKeys(lname);
		}

	@When("Click on submit button")
	public void clickOnSubmitButton() {
		d.findElementByXPath("//input[@class='smallSubmit']").click();
		}

	@Then("Verify Submit details")
	public void verifySubmitDetails() {
		String fname1 = d.findElementByXPath("//span[text()='First name']//following::span[1]").getText();
		if(fname1.equals("gnana"))
		{		
		System.out.println(fname1);
		}
		else
		{
			System.out.println("sekar");
		}
		}

	@And("Lead not created successfully")
	public void notCreated()
	{
		System.out.println("not created");
	}
	
	@But("If not Submit")
	public void ifNotSubmit() {
System.out.println("dev work");
	d.close();
	}
}

