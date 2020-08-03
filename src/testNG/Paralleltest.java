package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleltest {
	
	@Test
	public void opengoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mike\\eclipse-workspace\\Javatest\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	@Test
	public void openbing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mike\\eclipse-workspace\\Javatest\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		
	}

}
