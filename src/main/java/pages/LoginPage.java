package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory Elements
	@FindBy(name ="email")
	WebElement emailinput;
	
	@FindBy(name ="password")
	WebElement passwordInput;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	@FindBy(xpath = "//p[contains(text(), 'Invalid request')]")
	WebElement invalidLabel;
	
	//initializing page factory elements
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void enterEmail(String email) {
		emailinput.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public HomePage clickLoginButton() {
		loginButton.click();
		return new HomePage();
	}
	
	public String invalidLabelText() {
		return invalidLabel.getText();
	}
}
