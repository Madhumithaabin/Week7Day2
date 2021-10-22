package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;
import pages.ViewLeadPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		excelFileName="CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String username, String password,String company, String firstName, String lastName ) throws InterruptedException {
		
		new LoginPage(driver,prop)
		.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(company)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.createLeadButton()
		.verifyFirstName(firstName);
	
	}

}
