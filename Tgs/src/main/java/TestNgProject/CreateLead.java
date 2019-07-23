package TestNgProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectBase {
	@BeforeTest
	public void setData()
	{
		excelfilename="Createlead";
	}
@Test(dataProvider="fetchData")
	public void createLead(String cname, String fname, String lastname)
	{
		System.out.println("1");
		d.findElementByLinkText("Create Lead").click();		
		d.findElementById("createLeadForm_companyName").sendKeys(cname);
		d.findElementById("createLeadForm_firstName").sendKeys(fname);
		d.findElementById("createLeadForm_lastName").sendKeys(lastname);
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
		d.findElementById("createLeadForm_primaryEmail").sendKeys("xxx1@gmail.com");
		d.findElementByXPath("//input[@class='smallSubmit']").click();
		
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

//
//@DataProvider(name="fetchdata")
//public String[][] sendData()
//{
//	String[][] data = new String[3][3];
//	
//	data[0][0] = "testleaf";
//	data[0][1] = "gnana";
//	data[0][2] = "t";
//	
//	data[1][0] = "testleaf";
//	data[1][1] = "sekar";
//	data[1][2] = "t";
//	
//	data[2][0] = "testleaf";
//	data[2][1] = "tgs";
//	data[2][2] = "t";
//	
//	return data;

}