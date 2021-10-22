package testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.LearnBaseClassService;
import base.LearnBaseService;
import pages.SelectChat;
import pages.SelectChatQueue;
import pages.ServiceLogin;
import pages.ServiceLoginPage;

public class DeleteChatQ extends LearnBaseService{
	@BeforeTest
	public void setFileName() {
		excelFileName="DeleteQueue";
	}
	
	@Test(dataProvider = "fetchData")
  public void runConfigure(String username,String password,String searchtype,String deletebutton) throws IOException, InterruptedException {
	
		new ServiceLogin(driver,chatNo)
		.enterUsername(username)
				.enterPassword(password).clickLoginbutton().
				search_Mywork(searchtype).
				click_Mywork();
		new SelectChat(driver,chatNo).selectChatQueue();
new pages.DeleteChat(driver,chatNo).capturenumber().click_Delete(deletebutton).verifyDelete(chatNo);

	  
  }
}
