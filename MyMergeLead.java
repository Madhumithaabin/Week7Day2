package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyMergeLead extends ProjectSpecificMethods{

	Set<String> allWindows;
	List<String> allhandles;
	
	public MyMergeLead(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}

	public MyMergeLead clickFrom() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
return this;
	}
	public MyMergeLead swicthWindow() {
		
		  allWindows = driver.getWindowHandles(); 
		  allhandles = new
		  ArrayList<String>(allWindows); driver.switchTo().window(allhandles.get(1));
return this;
	}
		public MyMergeLead enterFName(String fName) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fName);
		return this;
		}


		
		public MyMergeLead clickfindlead() {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
return this;
		}
		

		public MyMergeLead clickLead() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
return this;
		}
		
		public MyMergeLead swicthcloseWindow() {
			driver.switchTo().window(allhandles.get(0));
			  	return this;
		}

		
		
		
		
		
		public MyMergeLead clickTo() {
			  driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return this;
		}

		
		public MyMergeLead clickMergeButton() {
			  driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
		}

		
		public MyMergeLead alertHandle() {
			 driver.switchTo().alert().accept();
			 		return this;
		}
		public ViewLeadPage clickfindleaId() {
			driver.findElement(By.linkText("Find Leads")).click();
return new ViewLeadPage(driver);
		}


}
