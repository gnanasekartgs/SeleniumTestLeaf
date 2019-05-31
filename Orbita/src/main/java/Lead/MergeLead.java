package Lead;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver d = new ChromeDriver();
d.get("http://leaftaps.com/opentaps/control/main");
d.manage().window().maximize();

d.findElementById("username").sendKeys("Democsr");
d.findElementById("password").sendKeys("crmsfa");
d.findElementByClassName("decorativeSubmit").click();
d.findElementByXPath("//div[@class='crmsfa']").click();	
d.findElementByLinkText("Leads").click();
d.findElementByLinkText("Merge Leads").click();
d.findElementByXPath("//span[text()= 'From Lead']/following::a[1]").click();

Set<String> windowHandles = d.getWindowHandles();
List<String> whs = new ArrayList<>();
whs.addAll(windowHandles);
d.switchTo().window(whs.get(1));
}
}
