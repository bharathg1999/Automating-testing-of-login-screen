package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;

public class Test3 extends Base {
	 @Test
	    public void testLoginWithEmptyFields() {
	        // Locate the login button
	        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));

	        // Attempt to login without entering any credentials
	        loginButton.click();

	        // Verify error message for empty fields
	        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
	        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed for empty fields.");
	    }
}
