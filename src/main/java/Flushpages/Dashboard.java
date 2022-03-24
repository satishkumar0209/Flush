package Flushpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends TestBase{

	
	
	// page factory

		@FindBy(xpath = "//*[text()='LOG IN']")
		WebElement Loginbutton;

		@FindBy(xpath = "//*[@placeholder='Email Or Username']")
		WebElement Email;

		@FindBy(xpath = "//*[@placeholder='Password']")
		WebElement Password;

		@FindBy(xpath = "//*[text()='Play Now']")
		WebElement playnow;

		// Initializing the page objects
		

		public Dashboard() throws IOException {
			super();

			PageFactory.initElements(driver, this);
		}
}
