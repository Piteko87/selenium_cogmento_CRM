package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	HomePage home;
	
	public LoginPageTest() {
		super();
	}
	
	@Given("A valid user")
	public void a_valid_user() {
		initialization();
		login = new LoginPage();
		home = login.login(prop.getProperty("email"),prop.getProperty("pass"));
	}
	
	@Then("the Home page should be returned")
	public void the_home_page_should_be_returned() {
		home = new HomePage();	
		assertEquals(home.verifyUserName(), "tester sadcv");
		driver.quit();
	}
}
