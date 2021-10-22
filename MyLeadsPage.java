package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver,Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}
	public CreateLeadPage clickCreateLeadLink() {
		System.out.println(driver);
		driver.findElement(By.xpath(prop.getProperty("MyLeadsPage.CreateLead.Xpath"))).click();
		return new CreateLeadPage(driver,prop);
	}

}
