package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pageObjects.DemoBlazeHomepage;
import pageObjects.LoginPage;
import pageObjects.Logout;

public class TC006_Logout_Testing extends BaseClass{

	@Test
	public void logout_test()
	{
		DemoBlazeHomepage Dhp=new DemoBlazeHomepage(driver);
		Dhp.clickLogin();
		
		LoginPage login=new LoginPage(driver);
		login.inputUsername("qaapplicant");
		login.inputPass("godwillprovide");
		login.clickLogin();
		
		 Logout logoutPage = new Logout(driver);
	        Assert.assertTrue(logoutPage.waitForLogoutVisible(), 
	                "Logout button not visible after login!");
	        
	        logoutPage.clicklogout();
	        
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
