package Week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver d = new ChromeDriver(option);
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
	//	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		d.findElementByXPath("(//input[@class='inputtext'])[1]").sendKeys("gnanasekar69");
		d.findElementByXPath("(//input[@type='password'])[1]").sendKeys("");
		d.findElementByXPath("(//input[@value='Log In'])").click();

		
		d.findElementByXPath("(//input[@placeholder='Search'])[1]").sendKeys("testleaf", Keys.ENTER);
//		WebDriverWait wait = new WebDriverWait(d, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']//i")));
		
		

		
		//d.findElementByXPath("//*[@id="js_r"]/form/button/i").click();
		
		String text = d.findElementByXPath("//a[text()='TestLeaf']").getText();
		if(text.contains("TestLeaf"))
		{
			System.out.println("test leaf present");
		}
		String like = d.findElementByXPath("//button[text()='Like']").getText();
		d.findElementByXPath("//button[text()='Like']").click();
		if(like.equals("Like"))
		{
			System.out.println("like it");
		}
		else
		{
			System.out.println("liked");
		}
	d.findElementByXPath("//a[text()='TestLeaf']").click();
	String title = d.getTitle();
	if(title.contains("TestLeaf - Home"))
	{
		System.out.println("contains");
	}
	else {
		System.out.println("not contains");
	}
	String likeno = d.findElementByXPath("(//img[@alt='Highlights info row image'])[1]/following::div[2]").getText();
	System.out.println(likeno.replaceAll("\\D", " "));
	d.close();
	}
	

}
