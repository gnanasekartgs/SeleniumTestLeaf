package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByXPath("//div[@for ='crmsfa']//a").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[1]").sendKeys("91");
		driver.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[2]").sendKeys("044");
		driver.findElementByXPath("(//label[text()='Phone Number:'])[4]/following::input[3]").sendKeys("421301");
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();
		String text = driver.findElementByXPath("(//table[@class='x-grid3-row-table'])//tr/td[1]//a").getText();
		System.out.println(text);
		driver.findElementByXPath("(//table[@class='x-grid3-row-table'])//tr/td[1]//a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		
		
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(" ");
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();
		String error = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(error);
		
		
		
//		driver.findElementByLinkText("CRM/SFA").click();
//		driver.findElementByLinkText("Leads").click();
//		driver.findElementByLinkText("Find Leads").click();
//		driver.findElementByXPath("//label[text()='Lead ID:']/following::input").sendKeys("1001");
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(5000);
//		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]").click();
		
	}

}
