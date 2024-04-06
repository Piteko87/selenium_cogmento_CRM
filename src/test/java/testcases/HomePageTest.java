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
	
	@Test(priority = 1)
	public void homePageLabelsTest() {
		String title = home.verifyTitle();
		Assert.assertEquals(title, "Cogmento CRM","Home page title not match");
		String user = home.verifyUserName();
		Assert.assertEquals(user, "tester sadcv","Home page user not match");
	}
	
	@Test(priority = 2)
	public void clickContactsTest() throws InterruptedException {
		home.clickOnMenuButton("calendar");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
