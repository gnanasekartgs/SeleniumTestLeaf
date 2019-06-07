package TestNgProject;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Merge1 extends ProjectBase{

@Test(dependsOnMethods= {"TestNgProject.Dulicatelead.duplicateLead"}, alwaysRun=true)

public void mergeLead() throws InterruptedException {
	
System.out.println("4");	
d.findElementByLinkText("Leads").click();
d.findElementByLinkText("Merge Leads").click();

d.findElementByXPath("(//form[@action='mergeLeads']//img)[2]").click();

Set<String> windowHandles = d.getWindowHandles();
List<String> whs = new ArrayList<>();
whs.addAll(windowHandles);
d.switchTo().window(whs.get(1));

d.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("100");
d.findElementByXPath("//button[text()='Find Leads']").click();

Thread.sleep(2000);
d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]//a").click();

d.switchTo().window(whs.get(0));

d.findElementByXPath("//span[text()= 'From Lead']/following::a[1]").click();

Set<String> windowHandles1 = d.getWindowHandles();
List<String> whs1 = new ArrayList<>();
whs1.addAll(windowHandles1);
d.switchTo().window(whs1.get(1));

d.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("102");
d.findElementByXPath("//button[text()='Find Leads']").click();

Thread.sleep(5000);
d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]//a").click();

d.switchTo().window(whs.get(0));

String mergeFrom =	d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
String mergeTo = d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").getText();

//String attribute = d.findElementByXPath("//span[text()= 'From Lead']/following::a[1]").getText();

System.out.println(mergeFrom);
d.findElementByClassName("buttonDangerous").click();
d.switchTo().alert().accept();
d.findElementByXPath("//a[text()='Find Leads']").click();

d.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(mergeFrom);
d.findElementByXPath("//button[text()='Find Leads']").click();
String errormsg = d.findElementByClassName("x-paging-info").getText();
System.out.println(errormsg);
}
}