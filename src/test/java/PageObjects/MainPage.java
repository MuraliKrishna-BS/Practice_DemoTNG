package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

	public MainPage(WebDriver Driver) {
		super(Driver);
	}
	Actions act = new Actions(Driver);
	WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
	
	//WebElements
	@FindBy(xpath="(//a[@href='/login'])[2]") WebElement LoginPageButton;
	
	
	//WebElements Actions
	
	public void Click_LoginPageButton() {
		
		act.scrollToElement(LoginPageButton).build().perform();
		act.scrollByAmount(0, 200).build().perform();
		LoginPageButton.click();
		
	}

}
