package Week4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zoomcarsai {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.findElementByLinkText("Start your wonderful journey").click();

		//Select the city and popular location
		driver.findElementByClassName("selectedCity").click();
		driver.findElementByXPath("//ul/li[3]").click();
		driver.findElementByXPath("//div[@class='component-popular-locations']/div[2]").click();
		driver.findElementByClassName("proceed").click();

		//store the booking date and day in variables
		driver.findElementByXPath("//div[@class='days']/div[2]").click();		
		String bookingDate = driver.findElementByXPath("//div[@class='days']/div[2]").getText();
		String trimBookingDate = bookingDate.trim();
		String bookingDay = driver.findElementByXPath("(//div[@class='text'])[2]").getText();
		String bookingDt = bookingDay.concat(trimBookingDate);
		driver.findElementByXPath("//button[text()='Next']"	).click();

		//wait added for avoid stale element exception
		Thread.sleep(2000);	

		//store booking date and day displayed on this screen in variables and compare with values displayed on previous screen
		String bookingDatePicked = driver.findElementByXPath("//div[@class='days']/div[1]").getText();
		String bookingDayPicked = driver.findElementByXPath("(//div[@class='text'])[1]").getText();
		String trimBookingDatePicked = bookingDatePicked.trim();
		String bookingDtPicked = bookingDayPicked.concat(trimBookingDatePicked);	
		if (bookingDt.equals(bookingDtPicked)) {
			System.out.println("Date Confirmed");
		}

		driver.findElementByXPath("//button[@class='proceed']").click();

		//print the number of cars displayed on the screen
		int size = driver.findElementsByXPath("//div[@class='component-car-item']").size();
		System.out.println(size);


		List<Integer> listPrice = new ArrayList<>();
		String price;
		int intPrice;
		int priceCount = 0;	

		//Add all the price items for each car in List<WebElement>
		List<WebElement> prices = driver.findElementsByXPath("//div[@class='price']");

		
		
		//Trim the spaces, replace "," from the price text and convert items to integer to find the highest price in list
		for(WebElement element:prices) {
			price = element.getText().substring(1).trim().replace(",", "");
			intPrice = Integer.parseInt(price);
			listPrice.add(intPrice);
		}

		
		
		
		//use max to find the highest value in the List<int> listPrice
		int highestPrice = Collections.max(listPrice);

		//find the index of the highest list price using priceCount variable. This will help us locate the associated car Name
		for ( int list: listPrice) {
			priceCount = priceCount+1;
			if (list==highestPrice) {
				System.out.println(priceCount);		
				break;
			}
		}

		//convert priceCount to String so that we can use it in XPath
		String priceCount1 = String.valueOf(priceCount) ;
		//Use the below XPath to locate the Car Name
		String carName =driver.findElementByXPath("(//div[@class='features'])["+priceCount1+"]//parent::div/h3").getText();

		System.out.println("The highest price car is : "+carName+". The price is : Rupees "+highestPrice+".");
		driver.findElementByXPath("(//button[text()='BOOK NOW'])["+priceCount1+"]").click();
		
		//close the webpage
		driver.close();
		

	}

}


