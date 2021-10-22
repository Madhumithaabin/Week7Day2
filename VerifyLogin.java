package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	
	@Test
	public void runLogin() throws InterruptedException {
		System.out.println(driver);
		//first method / action is available in the LoginPage
		LoginPage lp = new LoginPage(driver,prop);
		lp.enterUsername(prop.getProperty("username"))
		.enterPassword(prop.getProperty("password"))
		.clickLoginButton()
		.verifyHomePage();

	}

}
