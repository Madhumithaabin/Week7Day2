package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage(ChromeDriver driver,Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}
	
	public LoginPage clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver,prop);
	}
	
	public MyHomePage clickCrmSfaLink() {
		System.out.println(driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver,prop);
	}
	
	public HomePage verifyHomePage() {
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		
		return this;
	}

}
