package TestNgProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectBase {
	
@Test(dependsOnMethods= {"TestNgProject.Merge1.mergeLead"}, alwaysRun=true)

public void deleteLead() throws InterruptedException {
System.out.println("5");
d.findElementByLinkText("Leads").click();
d.findElementByXPath("//a[text()='Find Leads']").click();
d.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
d.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[1]").sendKeys("91");
d.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[2]").sendKeys("044");
d.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[3]").sendKeys("4334143");
d.findElementByXPath("//button[text()= 'Find Leads']").click();


WebElement value = d.findElementByXPath("(//div[@class='x-grid3-row   '])[1]//tr[1]/td[1]//a");
System.out.println(value.getAttribute("value"));
 
Thread.sleep(5000);

d.findElementByXPath("(//a[@class='linktext'])[4]").click();

WebElement delete = d.findElementByLinkText("Delete");
if(delete.isDisplayed() || delete.isEnabled() || delete.isSelected())
{
	delete.click();
}
else
{
	System.out.println(d.findElementByXPath("//div[@class='allSubSectionBlocks']").getText());
}

d.findElementByLinkText("Find Leads").click();

d.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("gnana");
d.findElementByXPath("//button[text()= 'Find Leads']").click();
String error = d.findElementByXPath("//div[@class='x-paging-info']").getText();
System.out.println(error);
	}
}
