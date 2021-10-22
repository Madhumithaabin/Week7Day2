package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.LearnBaseClassService;
import pages.ServiceLoginPage;

public class CreateChatQueue extends LearnBaseClassService {

	@Test
	public void runCreateQueue() throws IOException {
		new ServiceLoginPage(driver, prop,chatNo)
		.enterUsername(prop.getProperty("username"))
				.enterPassword(prop.getProperty("password")).clickLoginbutton().search_Mywork().click_Mywork()
				.clickNew().clickchatqueue().selectStatus().capturenumber().click_submit();

	}
}
