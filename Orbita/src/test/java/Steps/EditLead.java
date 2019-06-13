package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead {
public ChromeDriver d;

@Given("Open the Chrome Browser")
public void openTheChromeBrowser() 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	d = new ChromeDriver();	
	}

@And("Maximize the Browser")
public void maximizeTheBrowser() 
{
		d.manage().window().maximize();

}

@And("Set the Timeouts")
public void setTheTimeouts() 
{
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

@And("Load the URL")
public void loadTheURL() {
	d.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter the username as (.*)")
	public void enterTheUsername(String uname) {
	
			d.findElementById("username").sendKeys(uname);
	}

	@And("Enter the password as (.*)")
	public void enterThePassword(String pwd) {
		d.findElementById("password").sendKeys(pwd);}

	@When("click the login button")
	public void clickTheLoginButton() {
		d.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verifiy login sucessfully")
	public void verifiyLoginSucessfully() {
		String title = d.getTitle();
		if(title.equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("correct");
		}

	}

	@And("Click CRMSFA Button")
	public void clickCRMSFAButton() {
		d.findElementByLinkText("CRM/SFA").click();
	}

	@And("Click Leads Button")
	public void clickLeadsButton() {
		d.findElementByLinkText("Leads").click();
		}

	@When("Click FindLeads Button")
	public void clickFindLeadsButton() {
		d.findElementByLinkText("Find Leads").click();
		}

	@And("Enter the First name")
	public void enterTheFirstName() {
		d.findElementByXPath("//div[@class='x-tab-panel-bwrap']//div[2]//input").sendKeys("gnana");
		}

	@Then("Click the Find Lead Button")
	public void clickTheFindLeadButton() {
		d.findElementByXPath("//button[text()='Find Leads']").click();
		}

	@When("Select the First Lead name")
	public void selectTheFirstLeadName() {
		d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		}

	@Then("Verifiy the PageTitle")
	public void verifiyThePageTitle(String pagetitle) {
		String title = d.getTitle();
		if(title.equals(pagetitle))
		{
			System.out.println("title correct");
		}
		else
		{
			System.out.println("not equal");
		}

	}

	@And("Select the CompanyName Field")
	public void selectTheCompanyNameField() {
		d.findElementByXPath("//div[@class='frameSectionExtra']//a[3]").click();
		d.findElementById("updateLeadForm_companyName").clear();
	}

	@And("Enter the CompanyName as (.*)")
	public void enterTheCompanyNameAsAmeexusa(String cname) {
		d.findElementById("updateLeadForm_companyName").sendKeys(cname);
	}

	@When("Select the Update")
	public void selectTheUpdate() {
		d.findElementByXPath("//input[@value='Update']").click();
		}

	@Then("Verifiy the changes as (.*)")
	public void verifiyTheChanges() {
		WebElement cn = d.findElementById("viewLead_companyName_sp");
		String attr = cn.getText();
		String newcn = attr.substring(0, 8);
		System.out.println(newcn);
		if(newcn.equals("Ameexusa"))
		{
			System.out.println("company name changed");
		}
		else
		{
			System.out.println("not changed");
		}

	}

	@And("Enter the wusername as (.*)")
	public void enterTheUsernameAsDemosalesmanager(String uname) {
		d.findElementById("username").sendKeys(uname);
	}

	@And("Enter the wpassword as (.*)")
	public void enterThePasswordAsPasswrod(String pwd) {
		d.findElementById("password").sendKeys(pwd);}

	@When("click the wlogin button")
	public void clickThewLoginButton() {
		d.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Verifiy login Failures")
	public void verifiyLoginFailures() {
		String title = d.getTitle();
		if(title.equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("Incorrect");
	}
	}

	@Then("User entered Wrong Crediential")
	public void userEnteredWrongCrediential() {
	    System.out.println("Please enter correct credential");
	}

	@Then("Credentials are wrong")
	public void credentialsAreWrong() {
System.out.println("wrong password");
	}
	
}
