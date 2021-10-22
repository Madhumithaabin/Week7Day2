package testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.LearnBaseClassService;
import pages.SelectChatQueue;
import pages.ServiceLoginPage;

public class ConfigureChatQueue extends LearnBaseClassService {
  
@Test
  public void runConfigure() throws IOException, InterruptedException {
  
		new ServiceLoginPage(driver, prop,chatNo)
		.enterUsername(prop.getProperty("username"))
				.enterPassword(prop.getProperty("password")).clickLoginbutton().
				search_Mywork().
				click_Mywork();
		
new SelectChatQueue(driver,prop,chatNo).selectChatQueue();

new pages.ConfigureChatQueue(driver,prop,chatNo).SelectPrioriy().selectStatus().capturenumber().selectConfigureItem().click_Update().verifyConfigure(chatNo);

  }
}
