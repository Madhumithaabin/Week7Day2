package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import base.LearnBaseService;
import pages.ServiceLogin;
import pages.ServiceLoginPage;


public class CreateChatQ extends LearnBaseService {
	@BeforeTest
	public void setFileName() {
		excelFileName="CreateQueue";
	}
	
	@Test(dataProvider = "fetchData")
		public void runCreateQueue(String username,String password,String typework,String status) throws IOException {
		new ServiceLogin(driver,chatNo)
		.enterUsername(username)
				.enterPassword(password).clickLoginbutton().search_Mywork(typework).click_Mywork()
				.clickNew().clickchatqueue().selectStatus(status).capturenumber().click_submit();

	}
}
