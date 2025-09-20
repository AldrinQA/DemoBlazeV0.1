package pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout extends BasePage{
	
	public Logout(WebDriver driver)
	{
		super(driver);
	}

	
	// Variable locators
	
@FindBy(xpath="//a[@id='logout2']")
WebElement logoutBtn;


//Actions

public void clicklogout() {
	logoutBtn.click();
}

// Assertion helper: check if visible
public boolean isLogoutVisible() {
	return logoutBtn.isDisplayed();
}

// wait for logout button to appear

public boolean waitForLogoutVisible() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	try {
		wait.until(ExpectedConditions.visibilityOf(logoutBtn));
        return true;
    } catch (Exception e) {
        return false;
	}
  }

}
