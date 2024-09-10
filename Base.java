package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	protected WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		// Set the path to your WebDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\testing\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://app.germanyiscalling.com/common/login/");
	}

	@AfterMethod
	public void closeBrowser() {        
		driver.quit();
	}
}
