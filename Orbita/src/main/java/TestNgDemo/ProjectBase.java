package TestNgDemo;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectBase {
	
	public String excelfilename;
	ChromeDriver d;
	@Parameters({"username","password"})
	@BeforeMethod
	public void launchApp(String uname, String pword)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	d = new ChromeDriver();
	d.get("http://leaftaps.com/opentaps/control/main");
	d.manage().window().maximize();
	d.findElementById("username").sendKeys(uname);
	d.findElementById("password").sendKeys(pword);
	d.findElementByClassName("decorativeSubmit").click();
	d.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void close()
	{
		d.close();
	}

@DataProvider(name="fetchData")
public String[][] sendData() throws IOException
{
	Excel excel = new Excel();
	return excel.excelRead(excelfilename);
}

@DataProvider(name="newCompanyName") 
String[][] companyName1() throws IOException
{
	Excel excel = new Excel();
	return excel.companyName(excelfilename);
}
}

