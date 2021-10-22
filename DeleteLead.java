package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
		excelFileName = "ChangeLeadDetails";
	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String username, String password, String phone)
			throws InterruptedException {
  new LoginPage(driver)
  .enterUsername(username)
  .enterPassword(password)
  .clickLoginButton()
  .clickCrmSfaLink()
  .clickLeadsLink()
  .findLead()
  .clickPhone()
  .enterPhone(phone)
  .clickfindlead()
  .clickLeadid().deleteLeadid().verifyLeadDelete();
  
  
  }
}
