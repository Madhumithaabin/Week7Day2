package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
public class EditLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setFileName() {
		excelFileName = "ChangeLeadDetails";
	}


	@Test(dataProvider = "fetchData")
	  public void runEditlead(String user,String pass,String phone) throws InterruptedException {
	  new LoginPage(driver)
	  .enterUsername(user)
	  .enterPassword(pass)
	  .clickLoginButton()
	  .clickCrmSfaLink()
	  .clickLeadsLink()
	  .findLead()
	  .clickPhone()
	  .enterPhone(phone)
	  .clickfindlead()
	  .clickLeads()
	  .editLead()
	  .update_Cmpname()
	  .EditLeadButton()
	  .editleadsucess();
	  }
}
