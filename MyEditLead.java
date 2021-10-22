package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyEditLead extends ProjectSpecificMethods{

	public MyEditLead(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public UpdateLead editLead() {
		driver.findElement(By.linkText("Edit")).click();
return new UpdateLead(driver);
	}


}
