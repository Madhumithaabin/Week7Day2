package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage(ChromeDriver driver,Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}
	
	public ViewLeadPage verifyFirstName(String expData) {
		System.out.println(driver);
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		leadId = text.replaceAll("\\D", "");
		Assert.assertEquals(expData, text);
		return this;
	}
	
	
}
