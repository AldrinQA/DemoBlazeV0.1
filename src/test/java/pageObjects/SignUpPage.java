package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

	public SignUpPage(WebDriver driver)
	{
			super(driver);
	}
	
@FindBy(xpath="//input[@id='sign-username']")
WebElement txtUsername;
	
@FindBy(xpath="//input[@id='sign-password']")
WebElement txtPassword;

@FindBy(xpath="//button[normalize-space()='Sign up']")
WebElement txtLoginBtn;

@FindBy(xpath="//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']")
WebElement txtCloseBtn;

public void setUsername(String fname){
	txtUsername.sendKeys(fname);
}

public void setPassword(String pwd){
	txtPassword.sendKeys(pwd);
}

public void setLoginBtn(){
	txtLoginBtn.click();
}
/*
public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	}catch (Exception e)
		return (e.getMessage());
}*/


}
