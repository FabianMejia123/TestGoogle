package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class PositiveTest {
	public void logintest() {
		System.out.println("Starting loginTest");

//	Create Drive
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

// sleep for 3 seconds
		sleep(3000);
//	maximize browser window
		driver.manage().window().maximize();

//	Open test page
		String url = "https://www.google.com";
		driver.get(url);

// sleep for 3 seconds
		sleep(3000);

// Accept all cookies
		WebElement acceptAllBtn = driver.findElement(By.id("L2AGLb"));
		acceptAllBtn.click();
		sleep(3000);
		
// Search
		WebElement searchToolBar = driver.findElement(By.className("gLFyf"));
		searchToolBar.sendKeys("Solera" + "\n");
		sleep(3000);
		
		
// Close
		driver.quit();

	}

	private void sleep(long m) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
