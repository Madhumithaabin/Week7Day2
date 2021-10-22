package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MergeLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setFileName() {
		excelFileName = "MergeLead";
	}


	@Test(dataProvider = "fetchData")
  public void runMergeLead(String user,String pass,String fromName,String toName) throws InterruptedException {
  new LoginPage(driver)
  .enterUsername(user)
  .enterPassword(pass)
  .clickLoginButton()
  .clickCrmSfaLink()
  .clickLeadsLink()
  .mergeLead()
  .clickFrom()
  .swicthWindow()
  .enterFName(fromName)
  .clickfindlead()
  .clickLead()
  .swicthcloseWindow()
  .clickTo()
  .swicthWindow()
  .enterFName(toName)
  .clickfindlead()
  .clickLead()
  .swicthcloseWindow()
  .clickMergeButton()
  .alertHandle()
  .clickfindleaId()
  .verify_Mergeddata();
  }
}
