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
import io.cucumber.java.en.Given;

public class CreateIncident extends LearnBaseClassService {
	public List<String> searc;

	public CreateIncident(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public CreateIncident clickCaller() {
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		return this;
	}

	public CreateIncident frameOpens() {
		WebElement frame2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame2);
		return this;
	}

	public CreateIncident frameCloses() {
		driver.switchTo().defaultContent();
		Set<String> windowHandles = driver.getWindowHandles();
		searc = new ArrayList<String>(windowHandles);
		return this;
	}

	public CreateIncident windowOpen() {
		driver.switchTo().window(searc.get(1));
		return this;
	}

	public CreateIncident clickName() {
		driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
		return this;
	}

	@Given("switch back to normal window")
	public CreateIncident windowClose() {
		driver.switchTo().window(searc.get(0));
		return this;
	}

	public CreateIncident description(String desc) {
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys(desc);
		return this;
	}

	public CreateIncident capture_Inc() {
		incidentNum = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println(incidentNum);
		return this;
	}

	public VerifyCreateIncident click_submit() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		return new VerifyCreateIncident(driver);

	}

}
