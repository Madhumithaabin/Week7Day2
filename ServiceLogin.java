package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnBaseClassService;
import base.LearnBaseService;

public class ServiceLogin extends LearnBaseService {

	public ServiceLogin(ChromeDriver driver,String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
				this.chatNo=chatNo;
	}

	public ServiceLogin enterUsername(String user) {
		WebElement frame = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame);

		driver.findElement(By.id("user_name")).sendKeys(user);
		return this;
	}

	public ServiceLogin enterPassword(String pass) {
		driver.findElement(By.id("user_password")).sendKeys(pass);
		return this;
	}

	public ServiceHome clickLoginbutton() {
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		return new ServiceHome(driver,chatNo);
	}

}
