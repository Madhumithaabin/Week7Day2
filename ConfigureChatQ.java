package testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.LearnBaseClassService;
import base.LearnBaseService;
import pages.ConfigureChat;
import pages.SelectChat;
import pages.SelectChatQueue;
import pages.ServiceLogin;
import pages.ServiceLoginPage;

public class ConfigureChatQ extends LearnBaseService {
	@BeforeTest
	public void setFileName() {
		excelFileName="ConfigChat";
	}
	
	@Test(dataProvider = "fetchData")
  public void runConfigure(String username,String password,String searchtype,String status,String priority,String searchbutton,String config,String updatebutton) throws IOException, InterruptedException {
	
		new ServiceLogin(driver,chatNo)
		.enterUsername(username)
				.enterPassword(password).clickLoginbutton().
				search_Mywork(searchtype).
				click_Mywork();
new SelectChat(driver,chatNo).selectChatQueue();
new ConfigureChat(driver,chatNo).SelectPrioriy(priority).selectStatus(status).selectConfigureItem(searchbutton, config).capturenumber().click_Update(updatebutton).verifyupdate(chatNo);

  }
}
