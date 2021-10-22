package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setFileName() {
		excelFileName = "ChangeLeadDetails";
	}


	@Test(dataProvider = "fetchData")
  public void runDuplicateLead(String user,String pass,String phoneno) throws InterruptedException {
		new LoginPage(driver)
		.enterUsername(user)
		.enterPassword(pass)
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink()
		.findLead()
		.clickPhone()
		.enterPhone(phoneno).
		clickfindlead().clickLead().
		duplicateLead().
		clickSubmit().
		duplicateleadsucess();
	  
  
  }
}
