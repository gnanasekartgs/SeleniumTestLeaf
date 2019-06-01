package TestNgProject;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead extends ProjectBase {
@Test
public void editLead() throws InterruptedException {

d.findElementByLinkText("Leads").click();
d.findElementByLinkText("Find Leads").click();
d.findElementByXPath("//div[@class='x-tab-panel-bwrap']//div[2]//input").sendKeys("gnana");
d.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(5000);
d.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();

//d.findElementByXPath("//div[@class='x-panel-body xedit-grid']//tbody[1]/tr[1]/td[3]//a[1]").click();

String title = d.getTitle();
if(title.equals("View Lead | opentaps CRM"))
{
	System.out.println("title correct");
}
else
{
	System.out.println("not equal");
}
d.findElementByXPath("//div[@class='frameSectionExtra']//a[3]").click();
d.findElementById("updateLeadForm_companyName").clear();
d.findElementById("updateLeadForm_companyName").sendKeys("Ameexusa");
d.findElementByXPath("//input[@value='Update']").click();
WebElement cn = d.findElementById("viewLead_companyName_sp");
String attr = cn.getText();
String newcn = attr.substring(0, 8);
System.out.println(newcn);
if(newcn.equals("Ameexusa"))
{
	System.out.println("company name changed");
}
else
{
	System.out.println("not changed");
}
		
	}

}
