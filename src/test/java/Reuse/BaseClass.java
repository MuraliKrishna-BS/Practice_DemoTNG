package Reuse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver Driver;
	
	@BeforeClass
	public void setup() {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--Start-Maximized");
		op.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		Driver= new ChromeDriver(op);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Driver.get("https://practice.expandtesting.com/login");
	}
	
	@AfterClass
	public void teardown() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Driver.quit();;
	}

}
