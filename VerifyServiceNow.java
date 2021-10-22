package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import base.LearnBaseClassService;

public class VerifyServiceNow extends LearnBaseClassService{

	public VerifyServiceNow(ChromeDriver driver, Properties prop,String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.prop=prop;
	}
	public void verifyChat(String chatNumber) {
driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(chatNumber,Keys.ENTER);
String expResult = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();		
SoftAssert softAssert = new SoftAssert();
softAssert.assertEquals(expResult,chatNumber);
System.out.println("Chat Queue is created successfully" +chatNumber);
softAssert.assertAll();
	}
public VerifyServiceNow verifyupdate(String updatechatNumber)
{
		WebElement frame2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(updatechatNumber,Keys.ENTER);
		String urgencyname = driver.findElement(By.xpath("(//td[@class='vt'])[5]")).getText();
		String statename = driver.findElement(By.xpath("(//td[@class='vt'])[6]")).getText();
		System.out.println(urgencyname);

		System.out.println(statename);
		if (urgencyname.contains("Moderate") && statename.contains("In Progress"))
			System.out.println("Urgency and State of the incident is Updated");
		else
			System.out.println("Urgency and State of the incident not Updated");
		driver.switchTo().defaultContent();
return this;

}
public VerifyServiceNow  verifyDelete(String deleteChatNUm)
{
	WebElement frame2 = driver.findElement(By.id("gsft_main"));
	driver.switchTo().frame(frame2);

driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(deleteChatNUm,Keys.ENTER);
String deleteConfirm = driver.findElement(By.xpath("//tr[@class='list2_no_records']/td")).getText();
	if (deleteConfirm.equals("No records to display"))
		System.out.println("incident is Deleted successful");
	else
		System.out.println("incident is not deleted");
return this;
}


public VerifyServiceNow verifyConfigure(String updatechatNumber)
{
		WebElement frame2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(updatechatNumber,Keys.ENTER);
		String urgencyname = driver.findElement(By.xpath("(//td[@class='vt'])[5]")).getText();
		String statename = driver.findElement(By.xpath("(//td[@class='vt'])[6]")).getText();
		System.out.println(urgencyname);

		System.out.println(statename);
		if (urgencyname.contains("Critical") && statename.contains("Closed"))
			System.out.println("Urgency and State of the incident is Updated");
		else
			System.out.println("Urgency and State of the incident not Updated");
		driver.switchTo().defaultContent();
return this;

}

}
