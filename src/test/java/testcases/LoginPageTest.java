package testcases;

import static org.testng.Assert.assertEquals;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage login;
	HomePage home;

	public LoginPageTest() {
		super();
	}

	@Before
	public void setUp() {
		initialization();
		login = new LoginPage();
	}
	
    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

	@Given("I enter a valid username and password")
	public void i_enter_a_valid_username_and_password() {
		login.enterEmail(prop.getProperty("email"));
		login.enterPassword(prop.getProperty("pass"));
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
	
		home = new HomePage();
		home = login.clickLoginButton();
	}

	@Then("I should be logged in succesfully")
	public void i_should_be_logged_in_succesfully() {
		
		assertEquals(home.verifyUserName(), "tester sadcv");
	}
}
