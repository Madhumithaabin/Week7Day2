package pages;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.LearnBaseClassService;
import base.LearnBaseService;

public class ConfigureChat extends LearnBaseService{
	public ConfigureChat(ChromeDriver driver,String chatNo) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		this.chatNo=chatNo;
	}

	public ConfigureChat selectStatus(String statuscon)
	{
		WebElement statusElement = driver.findElement(By.id(statuscon));
		Select status=new Select(statusElement);
		status.selectByValue("8");
	return this;
	}
	public ConfigureChat SelectPrioriy(String priority)
	{
		WebElement statusElement = driver.findElement(By.id(priority));
		Select status=new Select(statusElement);
		status.selectByValue("1");
	return this;
		
	}
	public ConfigureChat selectConfigureItem(String search,String config) throws InterruptedException
	{
		
		driver.findElement(By.id(search)).click();
		driver.switchTo().defaultContent();
		Set<String> windowHandles = driver.getWindowHandles();
List<String> searc = new ArrayList<String>(windowHandles);
		driver.switchTo().window(searc.get(1));
Thread.sleep(2000);
WebElement SEARCHBOX = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
WebDriverWait t = new WebDriverWait(driver, 20); 
t.until(ExpectedConditions.visibilityOf(SEARCHBOX));  
t.until(ExpectedConditions.elementToBeClickable(SEARCHBOX));
		SEARCHBOX.sendKeys(config,Keys.ENTER);
//driver.findElement(By.xpath(prop.getProperty("searchbox"))).sendKeys(prop.getProperty("Configureitem"),Keys.ENTER);
driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
driver.switchTo().window(searc.get(0));
WebElement frame2 = driver.findElement(By.id("gsft_main"));
driver.switchTo().frame(frame2);

return this;
		
	}
	public ConfigureChat capturenumber() throws IOException
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
