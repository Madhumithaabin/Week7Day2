package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnBaseClassService;

public class DeleteChatQueue extends LearnBaseClassService{
	
	public DeleteChatQueue(ChromeDriver driver,Properties prop,String chatNo) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	this.prop=prop;
	this.chatNo=chatNo;
	}
	public DeleteChatQueue capturenumber() throws IOException
	{
		chatNo = driver.findElement(By.id("chat_queue_entry.number")).getText();
		/*
		 * prop.setProperty("chatNo", chatNo); prop.store(fos,"Chat Queue Number");
		 */	return this;
	}

public VerifyServiceNow click_Delete()
{
	driver.findElement(By.id(prop.getProperty("deletebutton"))).click();
	driver.findElement(By.id("ok_button")).click();
	driver.switchTo().defaultContent();
	return new VerifyServiceNow(driver,prop,chatNo);
	
}
}
