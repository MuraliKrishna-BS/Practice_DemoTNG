package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	 public LoginPage(WebDriver Driver) {
		super(Driver);
	}

	//Elements
	@FindBy(id ="username" ) WebElement TxtUserName;
	@FindBy(id ="password") WebElement TxtPassword;
	@FindBy(xpath = "//button[@type='submit']") WebElement btnLogin;

	//Actions
	public void Txt_Username(String username) {
		TxtUserName.sendKeys(username);
	}
	
	public void Txt_Password(String password) {
		TxtPassword.sendKeys(password);
	}
	
	public void Btn_Click_Login() {
		btnLogin.click();
	}
}
