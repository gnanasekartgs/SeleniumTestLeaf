package Week4;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xddf.usermodel.text.UnderlineType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//d.findElementByXPath("//button[text() = 'Try it']").click();
		//d.switchTo().frame("//iframe[@id='iframeResult']");
		d.switchTo().frame("iframeResult");
		d.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = d.switchTo().alert();
		alert.sendKeys("sekar");
		alert.accept();
		WebElement xp = d.findElementByXPath("//p[@id='demo']");
		String text = xp.getText();
		if(text.contains("sekar"))
		{
			System.out.println("contains");
		}
		else
			System.out.println("not contains");
		
	}

}
