package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
	WebDriver driver;
	long start;
	long end;
	@BeforeSuite
	public void launchbrowser() {
		start = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mike\\eclipse-workspace\\Javatest\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test(priority=0)
	public void opengoogle() {
		
		
		driver.navigate().to("https://www.google.com/");
		
		
	}
	@Test(priority=1)
	public void openbing() {
		
		driver.navigate().to("https://www.bing.com/");
		
	
		
		
	}
	@Test(priority=2)
	public void yahoo() {
		
		driver.navigate().to("https://in.yahoo.com/");
		
		
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		
		long end = System.currentTimeMillis();
		long time = end-start;
		System.out.println(time);
		
	}

}
