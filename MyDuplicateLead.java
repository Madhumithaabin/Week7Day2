package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyDuplicateLead extends ProjectSpecificMethods {

	public MyDuplicateLead(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public ConfirmDuplicateLead duplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new ConfirmDuplicateLead(driver);
	}

}
