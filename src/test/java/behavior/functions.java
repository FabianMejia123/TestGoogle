package behavior;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.TestProperties;

public class functions {
	
	public static Properties properties = TestProperties.getProperties();
	
	public static void windowSize(WebDriver driver) {
		
		driver.manage().window().maximize();
		String url = "https://www.google.com";
		driver.get(url);		
	}
	
	public static void acceptCookies(WebDriver driver) {
		String id = properties.getProperty("idButton");
		WebElement acceptAllBtn = driver.findElement(By.id(id));
		acceptAllBtn.click();		
	}
	
	public static void search(WebDriver driver) {
		String search = properties.getProperty("classSearchBar");
		WebElement searchToolBar = driver.findElement(By.className(search));	
		searchToolBar.sendKeys("Solera" + "\n");
	}
	
	
}
