package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LeadDetailsChange extends ProjectSpecificMethods {

	public LeadDetailsChange(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public LeadDetailsChange clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public LeadDetailsChange enterPhone(String pNumber) {
		//String phoneno=String.valueOf(pNumber);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNumber);
		return this;
	}

	public LeadDetailsChange clickfindlead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	public MyDuplicateLead clickLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		return new MyDuplicateLead(driver);

	}

	public DeleteLead clickLeadid() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		return new DeleteLead(driver);

	}
	public MyEditLead clickLeads() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		return new MyEditLead(driver);

	}

}
