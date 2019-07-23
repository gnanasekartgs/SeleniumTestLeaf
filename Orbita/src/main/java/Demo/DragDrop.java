package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	//d.get("https://jqueryui.com/droppable/");
	d.get("https://www.testandquiz.com/selenium/testing.html");
	Actions builder = new Actions(d);
	WebElement target = d.findElementById("dblClkBtn");
	builder.doubleClick(target).perform();
	d.switchTo().alert().accept();
	
	d.findElementByXPath("//button[text()='Generate Alert Box']").click();
	String text = d.switchTo().alert().getText();
	System.out.println(text);
	d.switchTo().alert().accept();
	
	
	
	
	
	
	
//	d.switchTo().frame(0);
//	
//	WebElement source = d.findElementById("draggable");
//	WebElement dest = d.findElementById("droppable");
//		builder.dragAndDrop(source, dest).perform();
//		builder.dragAndDropBy(source, 10, 2).perform();
	
	}

}
