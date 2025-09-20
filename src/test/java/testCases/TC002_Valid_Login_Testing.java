package testCases;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjects.DemoBlazeHomepage;
import pageObjects.LoginPage;

public class TC002_Valid_Login_Testing extends BaseClass{


		
		@Test
		public void valid_login_verification() 
		{
			DemoBlazeHomepage Dhp=new DemoBlazeHomepage(driver);
			Dhp.clickLogin();
			
			LoginPage login=new LoginPage(driver);
			login.inputUsername("qaapplicant");
			login.inputPass("godwillprovide");
			login.clickLogin();
			
			//WebElement welcomeMsg = driver.findElement(By.xpath("//a[text()='Welcome qaapplicant']"));
			
			//Get the text
			String actualText = Dhp.getWelcomeMessageText();
			
			//Assert
			Assert.assertEquals(actualText, "Welcome qaapplicant", "Login welcome message mismatch!" );
				
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.close();
		} 
}
