package Lead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
driver.findElementById("username").sendKeys("demosalesmanager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
		
driver.findElementByXPath("//div[@for ='crmsfa']//a").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByXPath("//a[text()='Find Leads']").click();
driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
driver.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[1]").sendKeys("91");
driver.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[2]").sendKeys("044");
driver.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[3]").sendKeys("4334143");
driver.findElementByXPath("//button[text()= 'Find Leads']").click();


String value = driver.findElementByXPath("(//div[@class='x-grid3-row   '])[1]//tr[1]/td[1]//a").getText();
System.out.println(value);
 
//String text = driver.findElementByXPath("(//div[@class='x-grid3-row   '])[1]//tr[1]/td[1]//a").getAttribute("value");
//int id = Integer.parseInt(text);
//System.out.println(id);

Thread.sleep(5000);
//driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10040'])[1]").click();
driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

//

WebElement delete = driver.findElementByLinkText("Delete");
if(delete.isDisplayed() || delete.isEnabled() || delete.isSelected())
{
	delete.click();
}
else
{
	System.out.println(driver.findElementByXPath("//div[@class='allSubSectionBlocks']").getText());
}

driver.findElementByLinkText("Find Leads").click();
		
//driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10040");
driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("gnana");
driver.findElementByXPath("//button[text()= 'Find Leads']").click();
String error = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
System.out.println(error);
	}
}
