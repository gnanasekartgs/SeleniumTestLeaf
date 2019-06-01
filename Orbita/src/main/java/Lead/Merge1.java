package Lead;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Merge1 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver d = new ChromeDriver();
d.get("http://leaftaps.com/opentaps/control/main");
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

d.findElementById("username").sendKeys("demosalesmanager");
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

d.findElementByXPath("//input[@name='firstName']").sendKeys("gnana");
//d.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10107");
d.findElementByXPath("//button[text()='Find Leads']").click();

Thread.sleep(5000);
//d.findElementByXPath("(//a[@class='linktext'])[1]").click();

d.switchTo().window(whs.get(0));
Thread.sleep(5000);
d.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();

Set<String> windowHandles1 = d.getWindowHandles();
List<String> whs1 = new ArrayList<>();
whs.addAll(windowHandles);
d.switchTo().window(whs.get(1));

d.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10041");
d.findElementByXPath("//button[text()='Find Leads']").click();

Thread.sleep(5000);
d.findElementByXPath("(//a[@class='linktext'])[1]").click();


d.findElementByClassName("buttonDangerous").click();
d.switchTo().alert().accept();
d.findElementByXPath("//a[text()='Find Leads']").click();

}

}