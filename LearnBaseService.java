package base;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LearnBaseService {
	public ChromeDriver driver;
	public static String incidentNum;
public static FileOutputStream fos;
public String chatNo;

public String excelFileName;

	@DataProvider(name = "fetchData",indices=0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(excelFileName); // CreateLead
	}
	@BeforeMethod
	  public void preCondition() throws IOException {
WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://dev96375.service-now.com/navpage.do");
					
	  }

	  @AfterMethod()
	  public void postCondition() {
	  //driver.close();
	  }

}
