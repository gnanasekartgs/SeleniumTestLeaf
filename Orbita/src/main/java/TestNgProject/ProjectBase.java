package TestNgProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectBase {
	ChromeDriver d;
	@BeforeMethod
	public void launchApp()
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 d = new ChromeDriver();
	d.get("http://leaftaps.com/opentaps/control/main");
	d.manage().window().maximize();
	d.findElementById("username").sendKeys("Demosalesmanager");
	d.findElementById("password").sendKeys("crmsfa");
	d.findElementByClassName("decorativeSubmit").click();
	d.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void close()
	{
		d.close();
	}
}
