package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DemoBlazeHomepage extends BasePage {
	
	public DemoBlazeHomepage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//a[@id='signin2']")
WebElement LinkSignUp;

@FindBy(xpath="//a[@id='login2']")
WebElement LoginNavBar;

@FindBy(xpath = "//a[starts-with(text(),'Welcome')]")
WebElement welcomeMessage;

public void clickSignUp()
{
	LinkSignUp.click();
}

public void clickLogin()
{
	LoginNavBar.click();
}

public String getWelcomeMessageText() {
	return welcomeMessage.getText();
}

}
