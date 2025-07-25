package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import Reuse.BaseClass;

public class LoginTNG extends BaseClass {
	@Test
	
	public void Successful_Login_TNG() {
		MainPage mp = new MainPage(Driver);
		LoginPage lp = new LoginPage(Driver);
		
		mp.Click_LoginPageButton();
		
		lp.Txt_Username("practice");
		lp.Txt_Password("SuperSecretPassword!");
		lp.Btn_Click_Login();
	}

}
