package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnBaseClassService;

public class SelectChatQueue extends LearnBaseClassService {
	public SelectChatQueue(ChromeDriver driver, Properties prop,String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.prop=prop;
		this.chatNo=chatNo;
	}

	public UpdateChatQueue selectChatQueue()
	{
		WebElement frame2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	return new UpdateChatQueue(driver,prop,chatNo);
	}

}
