package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class UpdateLead extends ProjectSpecificMethods{

	public UpdateLead(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
	public UpdateLead update_Cmpname() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
return this;
	}
	public ViewLeadPage EditLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}



}
