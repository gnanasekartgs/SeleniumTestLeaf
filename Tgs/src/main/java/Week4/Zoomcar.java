package Week4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomcar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.zoomcar.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		d.findElementByXPath("//div[text()='Bangalore']").click();
		d.findElementByLinkText("Start your wonderful journey").click();
		d.findElementByXPath("//div[@class='selectedCity']").click();
		d.findElementByXPath("//li[text()='Bangalore']").click();
		d.findElementByXPath("//div[@class='component-popular-locations']//div[2]").click();
		d.findElementByXPath("//button[text()='Next']").click();
		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("dd");
		String today = df.format(date);
		int tomorrow = Integer.parseInt(today)+1;
		System.out.println(tomorrow);
		
		d.findElementByXPath("//div[@class='day picked ']/following::div[1]").click();
		d.findElementByXPath("//button[text()='Next']").click();
		
		Date date1 = new Date();
		DateFormat df1 = new SimpleDateFormat("dd");
		String today1 = df.format(date);
		int tomorrow1 = Integer.parseInt(today);
	
		if(today1.equals(today))
		{
			System.out.println("confirm date");
		}
		else
		{
			System.out.println("not confirm");
		}
		d.findElementByXPath("//button[@class='proceed']").click();
		
		d.findElementByXPath("//div[@class='price']/text()").getSize();
				
		
		List<Integer> price = new ArrayList<>();
		String prices;
		
		List<WebElement> pricelist = d.findElementsByXPath("//div[@class='price']/text()");		
	for (WebElement element : pricelist) {
		prices = element.getText().trim();
		int iprice = Integer.parseInt(prices);
		price.add(iprice);
	
	}
	
	
		
		
		
		d.close();
	}

}
