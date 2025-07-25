package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Reuse.BaseClass;

public class Login extends BaseClass{
	//ChromeDriver Driver;
	@Test
	public void Successful_Login() {
		
		Actions act = new Actions(Driver);
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
		
		
		WebElement ClickLogin=Driver.findElement(By.xpath("(//a[@href='/login'])[2]"));	
		act.scrollToElement(ClickLogin).build().perform();
		act.scrollByAmount(0, 200).build().perform();
		ClickLogin.click();
		
		wait.until(ExpectedConditions.titleIs("Test Login Page for Automation Testing Practice"));
		
		
		String Actual = Driver.getTitle() ;
		String Expected ="Test Login Page for Automation Testing Practice";
		
		Assert.assertNotNull(Actual);
		Assert.assertEquals(Actual, Expected);
		Assert.assertTrue(Actual.equals(Expected));
		
		
		Driver.findElement(By.id("username")).sendKeys("practice");
		Driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement text= Driver.findElement(By.id("flash"));
		
		Assert.assertTrue(text.isDisplayed());
		
		String Expectedtext = "You logged into a secure area!";
		String Actualtext = Driver.findElement(By.id("flash")).getText();
		
		Assert.assertNotNull(Actualtext);
		Assert.assertEquals(Actualtext, Expectedtext);
		Assert.assertTrue(Expectedtext.equals(Actualtext));
		
		
		try {
			Driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to get Alert window");
		}
		
		
		WebElement Logout=Driver.findElement(By.xpath("//a[@href='/logout']"));
		
		Assert.assertTrue(Logout.isDisplayed());
		
		
	}
	
	

}
