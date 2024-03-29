package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath ="//b[contains(text(), 'tester sadcv')]")
	WebElement userLabel;
	
	@FindBy(xpath = "//i[@class ='users icon']")
	WebElement contactsLink;
	
	@FindBy(css = "#main-nav")
	WebElement navBar;
	//initializing page factory elements
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickonContactList() throws InterruptedException {
		
		Thread.sleep(3000);
		Actions acts = new Actions(driver);
		acts.moveToElement(navBar).perform();
		Thread.sleep(3000);
		contactsLink.click();
		Thread.sleep(3000);
		return new ContactsPage();
	}

}
