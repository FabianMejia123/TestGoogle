package utils;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General {

	public static void wait(Integer miliseconds, WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(miliseconds));
	}

	public static WebDriver setup(){

		Properties properties = TestProperties.getProperties();
		System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDrive"));
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void sleep(long m) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
