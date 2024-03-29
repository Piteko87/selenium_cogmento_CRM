package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage login;
	HomePage home;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new LoginPage();
		home = login.login(prop.getProperty("email"),prop.getProperty("pass"));
	}
	
	@Test(enabled = false)
	public void homePageTitleTest() {
		String title = home.verifyTitle();
		Assert.assertEquals(title, "Cogmento CRM","Home page title not match");
	}
	
	@Test
	public void clickContactsTest() throws InterruptedException {
		home.clickonContactList();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
