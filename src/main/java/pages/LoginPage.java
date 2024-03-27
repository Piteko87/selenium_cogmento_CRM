package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory Elements
	@FindBy(name ="email")
	WebElement email;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	//initializing page factory elements
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Page Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String email , String password) {
		
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		loginButton.click();
		
		return new HomePage();
	}
}
