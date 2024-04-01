package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//b[contains(text(), 'tester sadcv')]")
	WebElement userLabel;

	@FindBy(linkText = "Home")
	WebElement homeLink;

	@FindBy(linkText = "Calendar")
	WebElement calendarLink;

	@FindBy(linkText = "Contacts")
	WebElement contactsLink;

	@FindBy(linkText = "Companies")
	WebElement companiesLink;

	@FindBy(linkText = "Deals")
	WebElement dealsLink;

	@FindBy(linkText = "Tasks")
	WebElement taskLink;

	@FindBy(linkText = "Cases")
	WebElement casesLink;

	@FindBy(linkText = "Calls")
	WebElement callsLink;

	@FindBy(linkText = "Documents")
	WebElement documentsLink;

	@FindBy(linkText = "Email")
	WebElement emailsLink;

	@FindBy(linkText = "Campaigns")
	WebElement campaignsLink;

	@FindBy(linkText = "Forms")
	WebElement formsLink;

	@FindBy(linkText = "Reports")
	WebElement reportsLink;

	@FindBy(css = "#main-nav")
	WebElement navBar;

	// initializing page factory elements
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyTitle() {
		return driver.getTitle();
	}

	public String verifyUserName() {
		return userLabel.getText();
	}

	/** 
	    * Metodo para dar click a cualquier boton en el menu principal
	    * de la pagina Home
	    * @param menu = botón a dar click
	    * <li>home</li>
	    * <li>calendar</li>
	    * <li>contacts</li>
	    * <li>companies</li>
	    * <li>deals</li>
	    * <li>task</li>
	    * <li>cases</li>
	    * <li>calls</li>
	    * <li>documents</li>
	    * <li>email</li>
	    * <li>campaigns</li>
	    * <li>forms</li>
	    * <li>reports</li>
	    */
	public TestBase clickOnMenuButton(String menu) throws InterruptedException {

		Thread.sleep(3000);
		Actions acts = new Actions(driver);
		acts.moveToElement(navBar).perform();

		if (menu.equals("home")) {
			homeLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("calendar")) {
			calendarLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("contacts")) {
			contactsLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("companies")) {
			companiesLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("deals")) {
			dealsLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("task")) {
			taskLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("cases")) {
			casesLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("calls")) {
			callsLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("documents")) {
			documentsLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("email")) {
			emailsLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("campaigns")) {
			campaignsLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("forms")) {
			formsLink.click();
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		if (menu.equals("reports")) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", reportsLink);
			acts.moveToElement(userLabel).perform();
			Thread.sleep(3000);
			return new ContactsPage();
		}
		
		
		return null;
	}

	// Verificar que todos los elementos del menu esten visibles
	public void verifyMenuLinksDisplayed() {
		Actions acts = new Actions(driver);
		acts.moveToElement(navBar).perform();
		if (contactsLink.isDisplayed()) {
			System.out.println("Boton contactos esta desplegado");
		}
	}

}
