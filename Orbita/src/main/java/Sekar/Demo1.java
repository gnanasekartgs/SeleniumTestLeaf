package Sekar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://mail.google.com");
		d.manage().window().maximize();
		
		//d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		d.findElementByXPath("//input[@type='email']").sendKeys("gnanasekar5500@gmail.com");
		d.findElementByXPath("//span[@class='RveJvd snByac']").click();
		
		WebDriverWait wait = new WebDriverWait(d, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		
		d.findElementByXPath("//input[@type='password']").sendKeys("9790375500@Tgs");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ZFr60d CeoRYc'])[1]")));
		d.findElementByXPath("//span[text()='Next']").click();
		Thread.sleep(5000);
		
		Actions actions = new Actions(d);
		WebElement elements = d.findElementByXPath("//a[text()='Inbox']");
		actions.moveToElement(elements).perform();
		String attribute = d.findElementByXPath("//a[text()='Inbox']").getText();
		
		//String attribute = d.findElementByXPath("//a[text()='Inbox']").getAttribute("title");
		System.out.println(" "+attribute);
		
		
		d.close();
	}

}
