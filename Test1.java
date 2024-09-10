package tasks;

import org.testng.annotations.Test;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class Test1 extends Base {

	@Test
	public void testSuccessfulLogin() {
		// Locate the user name and password fields, and login button
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));

		// Input valid credentials
		usernameField.sendKeys("bharathsg0@gmail.com");
		passwordField.sendKeys("Bharath123");

		// Click the login button
		loginButton.click();

		// Verify successful login by checking the URL or some element on the landing page
		String expectedUrl = "https://app.germanyiscalling.com/cv/upload/";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "User is not redirected to the dashboard after login.");
	}
}