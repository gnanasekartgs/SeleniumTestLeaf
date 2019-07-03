package Sekar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com/intl/en-GB/gmail/about/#");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElementByXPath("(//li[@class='h-c-header__nav-li g-mail-nav-links']//a)[2]").click();
		
//		WebDriverWait wait = new WebDriverWait(d, 10);
//		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
		
	//	until.sendKeys("gnanasekar5500@gmail.com");
		
		
		d.findElementByXPath("(//span[text()='to continue to Gmail']/following::input)[1]").sendKeys("gnanasekar5500@gmail.com");
		
		d.findElementByXPath("//span[@class='RveJvd snByac']").click();
		
		d.findElementByXPath("//input[@type='password']").sendKeys("9994551183@Psk");
		d.findElementByXPath("(//div[@class='ZFr60d CeoRYc'])[1]").click();
		d.close();
	}

}
