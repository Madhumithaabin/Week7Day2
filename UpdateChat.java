package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.LearnBaseClassService;
import base.LearnBaseService;

public class UpdateChat extends LearnBaseService{
	
public static String chatNum;
	public UpdateChat(ChromeDriver driver,String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		this.chatNo=chatNo;
	}

	public UpdateChat selectStatus(String status2)
	{
		WebElement statusElement = driver.findElement(By.id(status2));
		Select status=new Select(statusElement);
		status.selectByValue("2");
	return this;
	}
	public UpdateChat SelectPrioriy(String priority)
	{
		WebElement statusElement = driver.findElement(By.id(priority));
		Select status=new Select(statusElement);
		status.selectByValue("3");
	return this;
		
	}
	public UpdateChat capturenumber() throws IOException
	{
		chatNo = driver.findElement(By.id("chat_queue_entry.number")).getText();
		return this;
	}

	public VerifyService click_Update(String update)
	{
		driver.findElement(By.id(update)).click();
		driver.switchTo().defaultContent();
		return new VerifyService(driver,chatNo);
	}
	

}
