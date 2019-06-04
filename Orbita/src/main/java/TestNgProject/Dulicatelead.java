package TestNgProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dulicatelead extends ProjectBase {

@Test(dependsOnMethods= {"TestNgProject.EditLead.editLead"}, alwaysRun=true)

	public void duplicateLead() throws InterruptedException {
	
		System.out.println("3");
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
	}
}
