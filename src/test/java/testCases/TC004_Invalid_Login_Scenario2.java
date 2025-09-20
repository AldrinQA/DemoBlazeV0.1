package testCases;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjects.DemoBlazeHomepage;
import pageObjects.LoginPage;

public class TC004_Invalid_Login_Scenario2 extends BaseClass{

	@Test
	public void invalid_login_scenario2() 
	{
		DemoBlazeHomepage Dhp=new DemoBlazeHomepage(driver);
		Dhp.clickLogin();
		
		LoginPage login=new LoginPage(driver);
		login.inputUsername("asaadafd");
		login.inputPass("godwillprovide");
		login.clickLogin();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
		
		//Switch to alert
		Alert alert = driver.switchTo().alert();
		
		//Capture the text
		String alertText = alert.getText();
		
		// Assert the alert message
		Assert.assertEquals(alertText, "User does not exist.");
		
		// Accept the alert (click ok button)
	    alert.accept();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	} 

}
