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
		d.findElementById("username").sendKeys("Demosalesmanager");
		d.findElementById("password").sendKeys("crmsfa");
		d.findElementByClassName("decorativeSubmit").click();

		d.findElementByLinkText("CRM/SFA").click();
		d.findElementByLinkText("Leads").click();
		d.findElementByLinkText("Find Leads").click();
		d.findElementByXPath("//span[text()='Email']").click();
		d.findElementByXPath("//input[@name='emailAddress']").sendKeys("xxx@gmail.com");
		d.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(5000);
		String id = d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").getText();
				System.out.println(id);

		d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		
		d.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		String title = d.getTitle();
		boolean c = title.contains("Duplicate Lead");
		//String plinktext = d.findElementByPartialLinkText("Duplicate Lead").getText();
		if(title.contains("Duplicate Lead"))
		{
			System.out.println("contains");
		}
		else
		{
			System.out.println("not contains");
		}
		d.findElementByXPath("//input[@value='Create Lead']").click();
		
		String duplicatetext = d.findElementById("viewLead_firstName_sp").getText();
		
		if(id.equals(duplicatetext))
		{
			System.out.println("first name is duplicate");
		}
			
		d.close();
	}
}
