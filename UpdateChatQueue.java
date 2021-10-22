package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.LearnBaseClassService;
import pages.SelectChatQueue;
import pages.ServiceLoginPage;

public class UpdateChatQueue extends LearnBaseClassService{
  @Test
  public void runUpdate() throws IOException {

	  
		new ServiceLoginPage(driver, prop,chatNo)
		.enterUsername(prop.getProperty("username"))
				.enterPassword(prop.getProperty("password")).clickLoginbutton().
				search_Mywork().
				click_Mywork();
new SelectChatQueue(driver,prop,chatNo).selectChatQueue().SelectPrioriy().selectStatus().capturenumber().click_Update().verifyupdate(chatNo);

  }
}
