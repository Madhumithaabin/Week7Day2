package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import base.LearnBaseClassService;

public class VerifyCreateIncident extends LearnBaseClassService {

	public List<String> searc;
	public String incNum;

	public VerifyCreateIncident frameOpens() {
		WebElement frame2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame2);
		return this;
	}

	public VerifyCreateIncident frameCloses() {
		driver.switchTo().defaultContent();
		Set<String> windowHandles = driver.getWindowHandles();
		searc = new ArrayList<String>(windowHandles);
		return this;
	}

	public VerifyCreateIncident(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;

	}

	public VerifyCreateIncident incident_Search(String incidentNo) {
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(incidentNo, Keys.ENTER);
		return this;
	}

	public VerifyCreateIncident captureIncident_Search() {
		incNum = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		return this;
	}

	public VerifyCreateIncident verify_Incident(String incidentNo) {

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(incidentNo, incNum);
		System.out.println("incident is created successful ");

		softAssert.assertAll();
		return this;
	}

}
