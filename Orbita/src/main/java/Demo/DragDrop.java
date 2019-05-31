package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	d.get("https://jqueryui.com/droppable/");
	d.switchTo().frame(0);
	Actions builder = new Actions(d);
	
	WebElement source = d.findElementById("draggable");
	WebElement dest = d.findElementById("droppable");
		builder.dragAndDrop(source, dest).perform();
	
	}

}
