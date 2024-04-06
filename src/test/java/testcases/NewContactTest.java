package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewContact;

public class NewContactTest extends TestBase {

	LoginPage login;
	HomePage home;
	ContactsPage contacts;
	NewContact newContact;

	public NewContactTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		login = new LoginPage();
		home = login.login(prop.getProperty("email"), prop.getProperty("pass"));
		contacts = (ContactsPage) home.clickOnMenuButton("contacts");
		newContact = contacts.createContact();
	}
	
	@Test
	public void verifyNewContactTitle() {
		String title = newContact.verifyPageTitle();
		Assert.assertEquals(title, "Create New Contact","Create New contact label not match");
	}

	@AfterMethod
	public void tearDown() {
		
		driver.close();

	}

}
