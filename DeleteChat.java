package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.LearnBaseClassService;
import base.LearnBaseService;

public class DeleteChat extends LearnBaseService{
	
	public DeleteChat(ChromeDriver driver,String chatNo) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	
	this.chatNo=chatNo;
	}
	public DeleteChat capturenumber() throws IOException
	{
		chatNo = driver.findElement(By.id("chat_queue_entry.number")).getText();
		/*
		 * prop.setProperty("chatNo", chatNo); prop.store(fos,"Chat Queue Number");
		 */	return this;
	}

public VerifyService click_Delete(String deletebutton)
{
	driver.findElement(By.id(deletebutton)).click();
	driver.findElement(By.id("ok_button")).click();
	driver.switchTo().defaultContent();
	return new VerifyService(driver,chatNo);
	
}
}
