package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.LearnBaseClassService;
import base.LearnBaseService;
import pages.SelectChat;
import pages.SelectChatQueue;
import pages.ServiceLogin;
import pages.ServiceLoginPage;

public class UpdateChatQ extends LearnBaseService{
	@BeforeTest
	public void setFileName() {
		excelFileName="UpdateQueue";
	}
	
	@Test(dataProvider = "fetchData")
  public void runUpdate(String username,String password,String searchtype,String status,String priority,String updatebutton) throws IOException {
		new ServiceLogin(driver,chatNo)
		.enterUsername(username)
				.enterPassword(password).clickLoginbutton().
				search_Mywork(searchtype).
				click_Mywork();
new SelectChat(driver,chatNo).selectChatQueue().SelectPrioriy(priority).selectStatus(status).capturenumber().click_Update(updatebutton).verifyupdate(chatNo);

  }
}
