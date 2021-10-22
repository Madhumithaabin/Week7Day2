package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnBaseClassService;
import base.LearnBaseService;

public class SelectChat extends LearnBaseService {
	public SelectChat(ChromeDriver driver, String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		this.chatNo=chatNo;
	}

	public UpdateChat selectChatQueue()
	{
		WebElement frame2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	return new UpdateChat(driver,chatNo);
	}

}
