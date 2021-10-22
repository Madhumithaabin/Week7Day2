package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnBaseClassService;

public class ServiceLoginPage extends LearnBaseClassService {

	public ServiceLoginPage(ChromeDriver driver,Properties prop,String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.prop=prop;
		this.chatNo = chatNo;
	}

	public ServiceLoginPage enterUsername(String user) {
		WebElement frame = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame);

		driver.findElement(By.id("user_name")).sendKeys(user);
		return this;
	}

	public ServiceLoginPage enterPassword(String pass) {
		driver.findElement(By.id("user_password")).sendKeys(pass);
		return this;
	}

	public ServiceHomePage clickLoginbutton() {
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		return new ServiceHomePage(driver, prop, chatNo);
	}

}
