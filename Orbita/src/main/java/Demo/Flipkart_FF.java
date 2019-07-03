package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Flipkart_FF {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@class='_2zrpKA _1dBPDZ']").sendKeys("gnanasekar69@gmail.com");
		driver.findElementByXPath("//input[@type='password']").sendKeys("9994551183@Psk");
		driver.findElementByXPath("//button[@class='_2AkmmA _1LctnI _7UHT_c']").click();
		WebElement search = driver.findElementByXPath("//input[@title='Search for products, brands and more']");		
		search.sendKeys("selenium book", Keys.ENTER);
		driver.findElementByXPath("(//div[@class='_3O0U0u'])[1]//a[1]").click();
		
	}

}
