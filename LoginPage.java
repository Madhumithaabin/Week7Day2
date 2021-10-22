package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver,Properties prop) {
		this.driver = driver;
		this.prop = prop;
		
	}
	
	
	
				// action+ElementName
	public LoginPage enterUsername(String uName) throws InterruptedException {
		
		driver.findElement(By.name("USERNAME")).sendKeys(uName);
		//Thread.sleep(10000);
		return this;
		
	}

	public LoginPage enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
			
		return new HomePage(driver,prop);
	}

}
