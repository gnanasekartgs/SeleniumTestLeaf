package Demo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		d.manage().window().maximize();
		
		d.findElementById("userRegistrationForm:userName").sendKeys("gnana695500");
		d.findElementById("userRegistrationForm:password").sendKeys("641601@Tup");
		d.findElementById("userRegistrationForm:confpasword").sendKeys("641601@Tup");
		
		WebElement dropdown = d.findElementById("userRegistrationForm:securityQ");
		Select dd1 = new Select(dropdown);
		dd1.selectByVisibleText("What is your pet name?");
		
		d.findElementById("userRegistrationForm:securityAnswer").sendKeys("tommy");
		d.findElementById("userRegistrationForm:firstName").sendKeys("gnanasekar");
		
		d.findElementById("userRegistrationForm:gender:0").click();		
		d.findElementById("userRegistrationForm:maritalStatus:0").click();
		//d.findElementByXPath("//*[@id=\"userRegistrationForm:gender:0\"]").isSelected();		
		//d.findElementByXPath("//*[@id=\"userRegistrationForm:maritalStatus:0\"]").isSelected();
		
		
				WebElement date = d.findElementById("userRegistrationForm:dobDay");
				Select date1 = new Select(date);
				date1.selectByValue("10");
				
				WebElement month = d.findElementById("userRegistrationForm:dobMonth");
				Select month1 = new Select(month);
				month1.selectByVisibleText("MAY");
				
				WebElement year = d.findElementById("userRegistrationForm:dateOfBirth");
				Select year1 = new Select(year);
				year1.selectByValue("2000");
				
				WebElement job = d.findElementById("userRegistrationForm:occupation");
				Select job1 = new Select(job);
				job1.selectByVisibleText("Public");
				
				WebElement country = d.findElementById("userRegistrationForm:countries");
				Select country1 = new Select(country);
				country1.selectByVisibleText("India");
				
				d.findElementById("userRegistrationForm:email").sendKeys("gnanatesting.ameex@gmail.com");
				//d.findElementById("userRegistrationForm:isdCode").sendKeys("+91");
				d.findElementById("userRegistrationForm:mobile").sendKeys("9994551183");
				
				WebElement nationality = d.findElementById("userRegistrationForm:nationalityId");
				Select nation = new Select(nationality);
				nation.selectByValue("94");
				
				d.findElementById("userRegistrationForm:address").sendKeys("5, thuraipakkam");
				d.findElementById("userRegistrationForm:pincode").sendKeys("600097",Keys.TAB);
				Thread.sleep(1000);
				
				WebElement cityname = d.findElementById("userRegistrationForm:cityName");
				Select cname = new Select(cityname);
				cname.selectByValue("Kanchipuram");
				cname.selectByVisibleText("Kanchipuram");
				
			
				
				d.findElementById("userRegistrationForm:landline").sendKeys("04445464748");
				
				WebElement post = d.findElementByXPath("//*[@id=\"userRegistrationForm:postofficeName\"]");
				Select postoff = new Select(post);
				postoff.selectByValue("1");
				
				
	}

}
