package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewContact extends TestBase {

	@FindBy(xpath ="//span[@class='selectable ']")
	WebElement newConatactLabel;
	
	
	public NewContact() {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyPageTitle() {
		return newConatactLabel.getText();
	}
}
