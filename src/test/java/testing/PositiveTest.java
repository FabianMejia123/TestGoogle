package testing;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import behavior.functions;
import utils.General;
import utils.TestProperties;

@Test

public class PositiveTest {
	public void logintest() {
		
		System.out.println("Starting Test");
			
		WebDriver driver = General.setup();
		General.sleep(2000);
		functions.windowSize(driver);
		functions.acceptCookies(driver);	
		functions.search(driver);
		
		driver.quit();
	}
}
