package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class ProjectSpecificMethods {

	public ChromeDriver driver; // initial value will be null
	public static String leadId;

	public String excelFileName;
	
	public Properties prop;

	@DataProvider(name = "fetchData",indices=0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(excelFileName); // CreateLead
	}

	@Parameters({"language"})
	@BeforeMethod
	public void preCondition(String lang) throws IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties");
		prop = new Properties();
		prop.load(fis);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Driver is initialized
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
