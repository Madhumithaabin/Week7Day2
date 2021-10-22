package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnBaseClassService;
import base.LearnBaseService;

public class ServiceHome extends LearnBaseService {

	public ServiceHome(ChromeDriver driver,String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
		this.chatNo=chatNo;
	}
	

	public ServiceHome search_Mywork(String workType) {
		driver.findElement(By.id("filter")).sendKeys(workType, Keys.ENTER);
		return this;
	}

	public ServiceHome click_Mywork() {

		driver.findElement(By.xpath("//div[text()='My Work']")).click();
		return this;
	}

	
	public ServiceHome clickNew() {
		WebElement frame2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame2);
			driver.findElement(By.xpath("//button[text()='New']")).click();
		return this;
	}

	public CreateChatQ clickchatqueue() {
		driver.findElement(By.linkText("Chat_queue_entry")).click();
		return new CreateChatQ(driver, chatNo);
	}

}
