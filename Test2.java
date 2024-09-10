package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;

public class Test2 extends Base {
	 @Test
	    public void testUnsuccessfulLogin() {
	    	// Locate the username and password fields, and login button
	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));

	        // Input invalid credentials
	        usernameField.sendKeys("bharathsg0@gmail.com");
	        passwordField.sendKeys("bharath");

	        // Click the login button
	        loginButton.click();

	        // Verify unsuccessful login by checking the presence of an error message
	        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
	        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed for invalid credentials.");
	     }
}
