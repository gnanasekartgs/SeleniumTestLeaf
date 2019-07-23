package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Etrain {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://etrain.info/in");

		d.findElementByXPath("(//label[@for='tbsfi1']/following::input)[1]").sendKeys("mas");

		d.findElementByXPath("//input[@placeholder='Destination Station']").sendKeys("tup");

		d.findElementByXPath("//i[@id='dateicon']").click();

		//		WebElement calbox = d.findElementByXPath("ui-datepicker-div");
		//		List<WebElement> caltr = calbox.findElements(By.tagName("tr"));
		d.findElementByXPath("//a[text()='16']").click();

		WebElement quota = d.findElementByXPath("(//select[@id='tbsfi5'])");
		Select s = new Select(quota);
		s.selectByValue("TQ");

		//d.findElementByTagName("//button[@id='tbssbmtbtn']").click();
			d.findElementById("tbssbmtbtn").click();
			
			String trainname = d.findElementByXPath("//table[@class='myTable data nocps nolrborder']//tr[5]/td[2]/a").getText();
			System.out.println(trainname);
			
			
	
	}

}
