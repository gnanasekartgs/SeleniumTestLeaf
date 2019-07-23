package Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainBooking {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver d = new ChromeDriver();
d.get("https://erail.in/");
d.findElementById("txtStationFrom").clear();
d.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
d.findElementById("txtStationTo").clear();
d.findElementById("txtStationTo").sendKeys("TPJ");
boolean trainselect = d.findElementById("chkSelectDateOnly").isSelected();
if(trainselect == true)
{
d.findElementById("chkSelectDateOnly").click();
}
//d.findElementByXPath("//a[@title='Click here to sort on Train Number']");
WebElement train = d.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
List<WebElement> no = train.findElements(By.tagName("tr"));
System.out.println(no.size());


//table[@class='DataTable TrainList TrainListHeader']//tr/td[1]

//driver.get("https://erail.in/trains-between-stations/chennai-central-MAS/ksr-bengaluru-SBC");
//WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
//List<WebElement> allRows = table.findElements(By.tagName("tr"));
//System.out.println(allRows.size());
//WebElement firstRow = allRows.get(allRows.size() -1);
//List<WebElement> tds = firstRow.findElements(By.tagName("td"));
//System.out.println(tds.size());
//String text = tds.get(0).getText();
//System.out.println(text);
}

}