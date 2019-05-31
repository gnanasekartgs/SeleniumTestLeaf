package Lead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dulicatelead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.findElementById("username").sendKeys("Democsr");
		d.findElementById("password").sendKeys("crmsfa");
		d.findElementByClassName("decorativeSubmit").click();

		d.findElementByLinkText("CRM/SFA").click();
		d.findElementByLinkText("Leads").click();
		d.findElementByLinkText("Find Leads").click();
		d.findElementByXPath("//span[text()='Email']").click();
		d.findElementByXPath("//input[@name='emailAddress']").sendKeys("xxx@gmail.com");
		d.findElementByXPath("//button[text()='Find Leads']").click();
		
		String text = d.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10321'])[5]").getAttribute("value");
		//String text = d.findElementByXPath("//a[@id='ext-gen848']").getAttribute("value");
		System.out.println(text);

		d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		
		d.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		String title = d.getTitle();
		boolean c = title.contains("Duplicate Lead");
		//String plinktext = d.findElementByPartialLinkText("Duplicate Lead").getText();
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
