package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeStart {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "F:\\TestLeaf\\eclipse-workspace\\Orbita\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	
	driver.findElementById("username").sendKeys("demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("ameex");
	driver.findElementById("createLeadForm_firstName").sendKeys("gnana");
	driver.findElementById("createLeadForm_lastName").sendKeys("sekar");
	
		String title = driver.getTitle();
			System.out.println(title);
					
			WebElement dd = driver.findElementById("createLeadForm_dataSourceId");
			Select dropdown = new Select(dd);
		
			int size = dropdown.getOptions().size();
			dropdown.selectByIndex(size-1);
		
			WebElement dd1 = driver.findElementById("createLeadForm_marketingCampaignId");
			Select dropdown1 = new Select(dd1);
			dropdown1.selectByVisibleText("Car and Driver");
		
			String source = driver.findElementById("createLeadForm_dataSourceId").getText();
			System.out.println(source);
			String market = driver.findElementById("createLeadForm_marketingCampaignId").getText();
			System.out.println(market);
	
			driver.findElementByClassName("smallSubmit").click();
			String companyname = driver.findElementById("viewLead_companyName_sp").getText();
			System.out.println(companyname);
		
			driver.close();
}
}
