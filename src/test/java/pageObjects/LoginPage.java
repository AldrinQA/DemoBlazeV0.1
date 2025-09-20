package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

//Variable locators
@FindBy(xpath="//input[@id='loginusername']")
WebElement Usernamefield;

@FindBy(xpath="//input[@id='loginpassword']")
WebElement Password;

@FindBy(css = "button[onclick='logIn()']")
WebElement loginButton;

@FindBy(xpath="//a[text()='Welcome qaapplicant']")
WebElement welcomeName;

@FindBy(xpath = "//a[starts-with(text(),'Welcome ')]")
WebElement welcomeMessage;

@FindBy(xpath="//a[text()='Samsung galaxy s6']")
WebElement SamsungLink;


//Actions
public void SamsungGalaxy() {
	SamsungLink.click();
}

public void inputUsername(String username ){
	Usernamefield.sendKeys(username);
}

public void inputPass(String password ){
	Password.sendKeys(password);
}

public void clickLogin(){
	loginButton.click();
}


}

