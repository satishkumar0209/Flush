package FlushTestcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	static WebDriverWait wait;

	public void LoginWelcomeLogin(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Loginbutton"))));
	}

	public void LoginWelcomeForgot(WebDriver driver) throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 25);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("WelcomeForgotPassword"))));

		driver.findElement(By.xpath(p.getProperty("WelcomeForgotPassword"))).click();

		driver.findElement(By.name(p.getProperty("PasswordRecoveryEmailInputbox")))
				.sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath(p.getProperty("PasswordRecoverySendButton"))).click();

		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(p.getProperty("PasswordRequestSentToEmailText"))));

			WebElement forgtorpasswordmessage = driver
					.findElement(By.xpath(p.getProperty("PasswordRequestSentToEmailText")));

			String Expected = forgtorpasswordmessage.getAttribute("innerText");

			System.out.println(Expected);

		} catch (Exception e) {

			WebElement forgtorpasswordmessage = driver
					.findElement(By.xpath(p.getProperty("PasswordRequestSentToEmailText")));

			String Expected = forgtorpasswordmessage.getAttribute("innerText");

			System.out.println(Expected);

		}

	}

	public void RecoveryPasswordBackToLogin(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 25);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("WelcomeForgotPassword"))));

		driver.findElement(By.xpath(p.getProperty("WelcomeForgotPassword"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("PasswordRecoveryBackToLogin"))));

		driver.findElement(By.xpath(p.getProperty("PasswordRecoveryBackToLogin"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("WelcomeForgotPassword"))));

	}

	public void LoginWelcomeregistration(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		String name = "satish";

		wait = new WebDriverWait(driver, 25);

		Random rand = new Random();

		int rand_int1 = rand.nextInt(1000);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		driver.findElement(By.xpath(p.getProperty("Registration"))).click();

		driver.findElement(By.xpath(p.getProperty("RegisterUserName"))).sendKeys(name + rand_int1);

		driver.findElement(By.xpath(p.getProperty("RegisterEmailid"))).sendKeys(name + rand_int1 + "@gmail.com");

		driver.findElement(By.xpath(p.getProperty("RegisterPassword"))).sendKeys("satish@123");

		driver.findElement(By.xpath(p.getProperty("TermsAndConditionsCheckbox"))).click();

		WebElement Playnowbutton = driver.findElement(By.xpath(p.getProperty("PlayNowbutton")));

		Actions builder = new Actions(driver);

		builder.moveToElement(Playnowbutton).click(Playnowbutton);

		builder.perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("DropDown"))));

	}

	public void LoginWelcomeGoogle(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		driver.findElement(By.xpath(p.getProperty("Loginbutton"))).click();

		driver.findElement(By.xpath(p.getProperty("Registration"))).click();

		wait = new WebDriverWait(driver, 25);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("WelcomeGoogle"))));

		driver.findElement(By.xpath(p.getProperty("WelcomeGoogle"))).click();

		Set<String> Set = driver.getWindowHandles();

		Iterator<String> It = Set.iterator();

		String Parentwindow = It.next();

		String childwindow = It.next();

		driver.switchTo().window(childwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailEmail"))));

		driver.findElement(By.xpath(p.getProperty("GmailEmail"))).sendKeys("psathish@rapidinnovation.dev");

		driver.findElement(By.xpath(p.getProperty("EmailNext"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailPassword"))));

		driver.findElement(By.xpath(p.getProperty("GmailPassword"))).sendKeys("Satvik@786");

		driver.findElement(By.xpath(p.getProperty("PasswordNext"))).click();

		driver.switchTo().window(Parentwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Userdropdown"))));

		System.out.println("Login through gmail successfully");

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

		System.out.println("Logout user successfully");

	}

	public void SignupLogin(WebDriver driver) throws IOException, InterruptedException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Signup"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Login"))));

		driver.findElement(By.xpath(p.getProperty("Login"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

	}

	public void signup(WebDriver driver) throws IOException, InterruptedException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		String name = "satish";

		wait = new WebDriverWait(driver, 50);

		Random rand = new Random();

		int rand_int1 = rand.nextInt(1000);

		driver.findElement(By.xpath(p.getProperty("Signup"))).click();

		driver.findElement(By.xpath(p.getProperty("RegisterUserName"))).sendKeys(name + rand_int1);

		driver.findElement(By.xpath(p.getProperty("RegisterEmailid"))).sendKeys(name + rand_int1 + "@gmail.com");

		driver.findElement(By.xpath(p.getProperty("RegisterPassword"))).sendKeys("satish@123");

		driver.findElement(By.xpath(p.getProperty("TermsAndConditionsCheckbox"))).click();

		WebElement Playnow = driver.findElement(By.xpath(p.getProperty("PlayNowbutton")));

		Thread.sleep(3000);

		Playnow.click();

//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Userdropdown"))));

	}

	public void Google(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Google"))));

		driver.findElement(By.xpath(p.getProperty("Google"))).click();

		Set<String> Set = driver.getWindowHandles();

		Iterator<String> It = Set.iterator();

		String Parentwindow = It.next();

		String childwindow = It.next();

		driver.switchTo().window(childwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailEmail"))));

		driver.findElement(By.xpath(p.getProperty("GmailEmail"))).sendKeys("psathish@rapidinnovation.dev");

		driver.findElement(By.xpath(p.getProperty("EmailNext"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailPassword"))));

		driver.findElement(By.xpath(p.getProperty("GmailPassword"))).sendKeys("Satvik@786");

		driver.findElement(By.xpath(p.getProperty("PasswordNext"))).click();

		driver.switchTo().window(Parentwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Userdropdown"))));

		System.out.println("Login through gmail successfully");

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

		System.out.println("Logout user successfully");

	}

	public void JoinWithYourEmail(WebDriver driver) throws IOException, InterruptedException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		Random rand = new Random();

		String name = "satish";

		int rand_int1 = rand.nextInt(1000);

		wait = new WebDriverWait(driver, 20);

		WebElement email = driver.findElement(By.xpath(p.getProperty("Joinemail")));

		Actions action = new Actions(driver);

		action.moveToElement(email).perform();

		email.click();

		driver.findElement(By.xpath(p.getProperty("RegisterUserName"))).sendKeys(name + rand_int1);

		driver.findElement(By.xpath(p.getProperty("RegisterEmailid"))).sendKeys(name + rand_int1 + "@gmail.com");

		driver.findElement(By.xpath(p.getProperty("RegisterPassword"))).sendKeys("satish@123");

		driver.findElement(By.xpath(p.getProperty("TermsAndConditionsCheckbox"))).click();

		driver.findElement(By.xpath(p.getProperty("PlayNowbutton"))).click();

	}

	public void JoinEmailLogin(WebDriver driver) throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 20);

		WebElement email = driver.findElement(By.xpath(p.getProperty("Joinemail")));

		Actions action = new Actions(driver);

		action.moveToElement(email).perform();

		email.click();

		driver.findElement(By.xpath(p.getProperty("Login"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Welcomeemail"))));

		driver.findElement(By.xpath(p.getProperty("Welcomeemail"))).sendKeys("satishkumar@rapidinnovation.dev");

		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Welcomeplaynow"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dashboardwallet"))));

	}

	public void JoinEmailGoogleLogin(WebDriver driver) throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Joinemail"))));

		WebElement email = driver.findElement(By.xpath(p.getProperty("Joinemail")));

		Actions action = new Actions(driver);

		action.moveToElement(email).perform();

		email.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("JoinEmailGoogle"))));

		driver.findElement(By.xpath(p.getProperty("JoinEmailGoogle"))).click();

		Set<String> Set = driver.getWindowHandles();

		Iterator<String> It = Set.iterator();

		String Parentwindow = It.next();

		String childwindow = It.next();

		driver.switchTo().window(childwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailEmail"))));

		driver.findElement(By.xpath(p.getProperty("GmailEmail"))).sendKeys("psathish@rapidinnovation.dev");

		driver.findElement(By.xpath(p.getProperty("EmailNext"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailPassword"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("GmailPassword"))));

		driver.findElement(By.xpath(p.getProperty("GmailPassword"))).sendKeys("Satvik@786");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("PasswordNext"))));

		driver.findElement(By.xpath(p.getProperty("PasswordNext"))).click();

		driver.switchTo().window(Parentwindow);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Userdropdown"))));

		System.out.println("Login through gmail successfully");

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

	}

	public void adminpanel(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Login.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.get("http://3.236.10.147/login");

		driver.findElement(By.name(p.getProperty("AdminUsername"))).sendKeys("admin@flush.com");

		driver.findElement(By.name(p.getProperty("AdminPassword"))).sendKeys("Admin@4321");

		driver.findElement(By.xpath(p.getProperty("AdminPanelLogin"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("AdminDashboardLogout"))));

	}

}
