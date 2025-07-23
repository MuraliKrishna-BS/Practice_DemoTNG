package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	 WebDriver Driver;
	
	public BasePage(WebDriver Driver){
		
		this.Driver=Driver;
		PageFactory.initElements(Driver, this);
		
	}

}
