package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();

		d.findElementById("username").sendKeys("demosalesmanager");
		d.findElementById("password").sendKeys("crmsfa");
		d.findElementByClassName("decorativeSubmit").click();

		d.findElementByLinkText("CRM/SFA").click();
		d.findElementByLinkText("Leads").click();
		d.findElementByLinkText("Find Leads").click();
		d.findElementByXPath("//span[text()='Email']").click();
		d.findElementByXPath("//input[@name='emailAddress']").sendKeys("xxx@gmail.com");
		d.findElementByXPath("//button[text()='Find Leads']").click();
		//d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		d.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10206'])[5]").click();
		Thread.sleep(5000);
		d.findElementByXPath("(//div[@class='frameSectionExtra']//a)[1]").click();
		String title = d.getTitle();
		boolean c = title.contains("Duplicate Lead");
		String plinktext = d.findElementByPartialLinkText("Duplicate Lead").getText();
		if(title.contains("Duplicate Lead"))
		{
			System.out.println("conains");
		}
		else
		{
			System.out.println("not contains");
		}
		d.findElementByXPath("//input[@value='Create Lead']").click();
		
		
		
	}

}
