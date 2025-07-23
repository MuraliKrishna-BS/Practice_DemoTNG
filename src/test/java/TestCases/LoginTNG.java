package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Reuse.BaseClass;

public class LoginTNG extends BaseClass {
	@Test
	public void Successful_Login_TNG() {
		LoginPage lp = new LoginPage(Driver);
		lp.Txt_Username("practice");
		lp.Txt_Password("SuperSecretPassword!");
		lp.Btn_Click_Login();
	}

}
