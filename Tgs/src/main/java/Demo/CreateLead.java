package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/");
		d.manage().window().maximize();

		d.findElementById("username").sendKeys("demosalesmanager");
		d.findElementById("password").sendKeys("crmsfa");
		d.findElementByClassName("decorativeSubmit").click();
		
		d.findElementByLinkText("CRM/SFA").click();
		
		d.findElementByLinkText("Create Lead").click();
		
		d.findElementById("createLeadForm_companyName").sendKeys("ameex");
		d.findElementById("createLeadForm_firstName").sendKeys("gnana");
		d.findElementById("createLeadForm_lastName").sendKeys("sekar");
		d.findElementByName("firstNameLocal").sendKeys("gnanasekar");
		d.findElementByName("lastNameLocal").sendKeys("T");
		d.findElementByName("personalTitle").sendKeys("MR");
		
		WebElement source = d.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByValue("LEAD_PARTNER");
		
		d.findElementById("createLeadForm_generalProfTitle").sendKeys("Ameex");
		d.findElementById("createLeadForm_annualRevenue").sendKeys("100000");
		
		WebElement ind = d.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(ind);
		dd1.selectByValue("IND_SOFTWARE");
		
		WebElement owner = d.findElementById("createLeadForm_ownershipEnumId");
		Select dd2 = new Select(owner);
		dd2.selectByValue("OWN_PARTNERSHIP");
		
		d.findElementById("createLeadForm_sicCode").sendKeys("123");
		d.findElementById("createLeadForm_description").sendKeys("I am creating a lead account");
		d.findElementById("createLeadForm_importantNote").sendKeys("a new lead");
		d.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		d.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		d.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		d.findElementById("createLeadForm_departmentName").sendKeys("IT");
		
		WebElement currency = d.findElementById("createLeadForm_currencyUomId");
		Select dd3 = new Select(currency);
		dd3.selectByVisibleText("INR - Indian Rupee");
		
		d.findElementById("createLeadForm_numberEmployees").sendKeys("400");
		d.findElementById("createLeadForm_tickerSymbol").sendKeys("yes");
		d.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("assistance");
		d.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.co.in");
		d.findElementById("createLeadForm_generalToName").sendKeys("sekar");
		d.findElementById("createLeadForm_generalAddress1").sendKeys("turaipakkam");
		d.findElementById("createLeadForm_generalAddress2").sendKeys("chennai");
		d.findElementById("createLeadForm_generalCity").sendKeys("chennai");
		
		WebElement state = d.findElementById("createLeadForm_generalStateProvinceGeoId");	
		Select dd4 = new Select(state);
		dd4.selectByVisibleText("Texas");
		
		WebElement country = d.findElementById("createLeadForm_generalCountryGeoId");
		Select dd5 = new Select(country);
		dd5.selectByVisibleText("United States");
		
		d.findElementById("createLeadForm_generalPostalCode").sendKeys("20001");
		d.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("123");
		
		WebElement mc = d.findElementById("createLeadForm_marketingCampaignId");
		Select dd6 = new Select(mc);
		dd6.selectByValue("CATRQ_AUTOMOBILE");
		
		d.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("4334143");
		d.findElementById("createLeadForm_primaryEmail").sendKeys("xxx@gmail.com");
		d.findElementByXPath("//input[@class='smallSubmit']").click();
		
		String fname = d.findElementByXPath("//span[text()='First name']//following::span[1]").getText();
		if(fname.equals("gnana"))
		{		
		System.out.println(fname);
		}
		else
		{
			System.out.println("sekar");
		}
	d.close();
	
	
	}

}
