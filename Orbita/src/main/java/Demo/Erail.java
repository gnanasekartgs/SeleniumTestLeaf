package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\TestLeaf\\eclipse-workspace\\Orbita\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		//driver.manage().window().maximize();

		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();

		WebElement table = driver.findElementByXPath("//table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());

		
	}

}
