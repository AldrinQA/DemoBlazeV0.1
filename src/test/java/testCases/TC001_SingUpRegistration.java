package testCases;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.DemoBlazeHomepage;
import pageObjects.SignUpPage;

public class TC001_SingUpRegistration extends BaseClass {
	
	@Test
	public void verify_account_registration()
	{
		DemoBlazeHomepage Dhp=new DemoBlazeHomepage(driver);
		Dhp.clickSignUp();
		
		SignUpPage signUp=new SignUpPage(driver);
		signUp.setUsername(randomeString()+"QAtest");
		signUp.setPassword("bosss");
		signUp.setLoginBtn();
		
		//Wait until alert is present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
		
		//Switch to alert
		Alert alert = driver.switchTo().alert();
		
		//Capture the text
		String alertText = alert.getText();
		
		// Assert the alert message
		Assert.assertEquals(alertText, "Sign up successful.");
		
		// Accept the alert (click ok button)
	    alert.accept();
		
	}
	
}
