package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ConfirmDuplicateLead extends ProjectSpecificMethods {

	
	

	public ConfirmDuplicateLead(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
this.driver=driver;
	}

	public ViewLeadPage clickSubmit() {

		driver.findElement(By.name("submitButton")).click();
return new ViewLeadPage(driver);
	}

}
