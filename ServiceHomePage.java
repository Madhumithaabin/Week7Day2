package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnBaseClassService;

public class ServiceHomePage extends LearnBaseClassService {

	public ServiceHomePage(ChromeDriver driver, Properties prop, String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.prop=prop;
		this.chatNo=chatNo;
	}
	

	public ServiceHomePage search_Mywork() {
		driver.findElement(By.id("filter")).sendKeys(prop.getProperty("searchtype"), Keys.ENTER);
		return this;
	}

	public ServiceHomePage click_Mywork() {

		driver.findElement(By.xpath("//div[text()='My Work']")).click();
		return this;
	}

	
	public ServiceHomePage clickNew() {
		WebElement frame2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame2);
			driver.findElement(By.xpath("//button[text()='New']")).click();
		return this;
	}

	public CreateChatQueue clickchatqueue() {
		driver.findElement(By.linkText(prop.getProperty("ServiceHomePage.chatqueue.linktext"))).click();
		return new CreateChatQueue(driver,prop,chatNo);
	}

}
