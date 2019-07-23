package Lead;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mergesai {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		d.findElementById("username").sendKeys("demosalesmanager");
		d.findElementById("password").sendKeys("crmsfa");
		d.findElementByClassName("decorativeSubmit").click();
		d.findElementByXPath("//div[@class='crmsfa']").click();	

		d.findElementByLinkText("Leads").click();
		d.findElementByLinkText("Merge Leads").click();
		//click the from lead icon
		WebElement fromLead = d.findElementByXPath("//input[@id = 'partyIdFrom']/following::img");
	
		Actions builder = new Actions(d);
		builder.click(fromLead).perform();
		//add the window handles to list and switch to next screen
		
		Set<String> allWindowHandles = d.getWindowHandles();
		List<String> getWindow = new ArrayList<>();
		getWindow.addAll(allWindowHandles);
		d.switchTo().window(getWindow.get(1));
		System.out.println(d.getTitle());
		
		//select the first visible lead
		d.findElementByXPath("//label[text()='Lead ID:']/following::input").sendKeys("100");
		d.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String mergeFrom =	d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
		String mergeTo = d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").getText();
		d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();

		//switch back to previous screen	
		d.switchTo().window(getWindow.get(0));


		d.findElementByXPath("(//input[@class='XdijitInputField dijitInputFieldValidationNormal'])[2]").sendKeys(mergeTo);
		d.findElementByLinkText("Merge").click();

		d.switchTo().alert().accept();
		d.switchTo().defaultContent();		
		d.findElementByLinkText("Find Leads").click();
		d.findElementByXPath("//label[text()='Lead ID:']/following::input").sendKeys(mergeFrom);
		d.findElementByXPath("//button[text()='Find Leads']").click();


		if (d.findElementByXPath("//div[text()='No records to display']").isDisplayed())
		{

			System.out.println("validation successful");
		}
	}

}