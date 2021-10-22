package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import base.LearnBaseClassService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiceNowHomePage extends LearnBaseClassService{
	public List<String> searc;
	
public ServiceNowHomePage(ChromeDriver driver) {
	// TODO Auto-generated constructor stub
this.driver=driver;
}
public ServiceNowHomePage click_Incident()
{
	driver.findElement(By.id("filter")).sendKeys("incident");
return this;
}


public ServiceNowHomePage clickAll() {

	driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
return this;
}


public ServiceNowHomePage frameOpens() {
	WebElement frame2 = driver.findElement(By.id("gsft_main"));
	driver.switchTo().frame(frame2);
return this;
}


public CreateIncident clickNew() {

	driver.findElement(By.xpath("//button[text()='New']")).click();
return new CreateIncident(driver);
}



}
