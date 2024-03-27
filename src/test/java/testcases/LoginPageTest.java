package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage login;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new LoginPage();
	}
	
	//TC1: testing the Page title
	@Test
	public void loginPageTitleTest() {
		String title = login.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	//TC2: As User we need to login with valid credentials
	@Test
	public void loginTestPositive() {
		login.login(prop.getProperty("email"),prop.getProperty("pass"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
