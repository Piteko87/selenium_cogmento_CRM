package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath = "//span[@class ='selectable '][contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement createButton;
		
	public ContactsPage() {
		PageFactory.initElements(driver,this);
	}
	
}
