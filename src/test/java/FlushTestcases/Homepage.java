package FlushTestcases;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Flushpages.Dashboard;
import Flushpages.TestBase;
import junit.framework.Assert;

public class Homepage {

	static WebDriverWait wait;

	public void Login(WebDriver driver) throws IOException {

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

	}

	public void Logout(WebDriver driver) throws IOException {

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

	public void Cashier(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Cashier"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Cashierpopupdropdown"))));

		driver.findElement(By.xpath(p.getProperty("Crossicon"))).click();

	}

	public void VIP(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("VIP"))).click();

	}

	public void Transaction(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Transaction"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Transactionpageheader"))));
	}

	public void TransactionPageTabsChecking(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Transaction"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Transactionpageheader"))));

		driver.findElement(By.xpath(p.getProperty("TransactionDepositTab"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("TransactionDepositTab"))));

		driver.findElement(By.xpath(p.getProperty("TransactionWithdrawTab"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("TWnowithdrawls"))));

		driver.findElement(By.xpath(p.getProperty("TransactionRewardsTab"))).click();

//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("TRnoRewards"))));

		driver.findElement(By.xpath(p.getProperty("TransactionBetsTab"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("TransactionBetsGameText"))));

	}

	public void Statisticspagechecking(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Statistics"))).click();

		driver.findElement(By.xpath(p.getProperty("StatisticsBreakDownTab"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("StatissticsBetsText"))));

		driver.findElement(By.xpath(p.getProperty("Statisticsoveralltab"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("StatisticsOverAllWinsSection"))));

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(p.getProperty("StatisticsOverAllLossesSection"))));

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("StatisticsOverAllBetsSection"))));

	}

	public void statistics(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Statistics"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Statisticsoveralltab"))));
	}

	public void Logot(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Logout"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Loginbutton"))));
	}

	public void Settings(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

	}

	public void Changepassword(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//settings.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

		driver.findElement(By.xpath(p.getProperty("Settingschangepasswordtext"))).click();

		driver.findElement(By.xpath(p.getProperty("Oldpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("ConfirmNewpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Savechanges"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Successfulmessage"))));

		WebElement Successmessage = driver.findElement(By.xpath(p.getProperty("Successfulmessage")));

		String Message = Successmessage.getAttribute("innerText");

		System.out.println(Message);

		String str = Message;

		str = str.replaceAll("\\s", "");

		String ActualTitle = str;

		String ExpectedTitle = "SuccessYourpasswordwasupdatedsuccessfully!";

		Assert.assertEquals(ExpectedTitle, ActualTitle);

	}

	public void Passwordcancel(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//settings.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

		driver.findElement(By.xpath(p.getProperty("Settingschangepasswordtext"))).click();

		driver.findElement(By.xpath(p.getProperty("Oldpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("ConfirmNewpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Cancel"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

	}

	public void Oldpasswordinvalid(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//settings.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

		driver.findElement(By.xpath(p.getProperty("Settingschangepasswordtext"))).click();

		driver.findElement(By.xpath(p.getProperty("Oldpassword"))).sendKeys("Satvik@12");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("ConfirmNewpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Savechanges"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Successfulmessage"))));

		WebElement Successmessage = driver.findElement(By.xpath(p.getProperty("Successfulmessage")));

		String Message = Successmessage.getAttribute("innerText");

		System.out.println(Message);

		String str = Message;

		str = str.replaceAll("\\s", "");

		String ActualTitle = str;

		String ExpectedTitle = "ErrorOldpasswordisincorrect.";

		Assert.assertEquals(ExpectedTitle, ActualTitle);

	}

	public void Passwordnotmatch(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//settings.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 50);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Settingschangepasswordtext"))));

		driver.findElement(By.xpath(p.getProperty("Settingschangepasswordtext"))).click();

		driver.findElement(By.xpath(p.getProperty("Oldpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("ConfirmNewpassword"))).sendKeys("Satvik@123");

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).clear();

		driver.findElement(By.xpath(p.getProperty("Newpassword"))).sendKeys("Satvik@12");

		driver.findElement(By.xpath(p.getProperty("Savechanges"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Successfulmessage"))));

		WebElement Successmessage = driver.findElement(By.xpath(p.getProperty("Successfulmessage")));

		String Message = Successmessage.getAttribute("innerText");

		System.out.println(Message);

		String str = Message;

		str = str.replaceAll("\\s", "");

		String ActualTitle = str;

		String ExpectedTitle = "ErrorPasswordsdonotmatch.";

		Assert.assertEquals(ExpectedTitle, ActualTitle);

	}

	public void walletbalacelist(WebDriver driver) throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("ETH"))).click();

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("LTC"))).click();

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("DOGE"))).click();

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("MATIC"))).click();

		driver.findElement(By.xpath(p.getProperty("Walletbalance"))).click();

		driver.findElement(By.xpath(p.getProperty("BNB"))).click();

	}

	public void changingusername(WebDriver driver) throws IOException {
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		driver.findElement(By.xpath(p.getProperty("Userdropdown"))).click();

		driver.findElement(By.xpath(p.getProperty("Settings"))).click();

		driver.findElement(By.xpath(p.getProperty("UserNameEditicon"))).click();

		WebElement inputbox = driver.findElement(By.xpath(p.getProperty("UserNameInputBox")));

		inputbox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

		driver.findElement(By.xpath(p.getProperty("UserNameInputBox"))).clear();

		driver.findElement(By.xpath(p.getProperty("UserNameInputBox"))).clear();

		Random rand = new Random();

		int rand_int1 = rand.nextInt(1000);

		driver.findElement(By.xpath(p.getProperty("UserNameInputBox"))).sendKeys("Msdhoni" + rand_int1);

		driver.findElement(By.xpath(p.getProperty("UserNameUpdateButton"))).click();

	}

	public void takescreenshot(WebDriver driver) throws IOException {

		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");

		String timestamp = sdf.format(d);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File(".//Screenshots//" + timestamp + ".jpg"));
	}

	public void dicegame(WebDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//Flush.properties");

		p.load(fi);

		wait = new WebDriverWait(driver, 20);

		driver.findElement(By.xpath(p.getProperty("DashboardDicegame"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("Dicegamebetbutton"))));

		WebElement Walletbalance = driver.findElement(By.xpath(p.getProperty("Walletbalance")));

		String Dashboardbalance = Walletbalance.getAttribute("innerText");

		String walletmoney = Dashboardbalance;

		float Dashboardbalance1 = Float.parseFloat(walletmoney);

		System.out.println("Wallet balance " + String.format("%.8f", Dashboardbalance1));

		WebElement Betamount = driver.findElement(By.xpath(p.getProperty("BetAmount")));

		Betamount.sendKeys(Keys.CONTROL + "a");

		Betamount.sendKeys(Keys.DELETE);

		Betamount.sendKeys("0.00000200");

		driver.findElement(By.xpath(p.getProperty("BET"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p.getProperty("PanelDicenumber"))));

		WebElement dicenumber = driver.findElement(By.xpath(p.getProperty("PanelDicenumber")));

		String Pdicenumber = dicenumber.getAttribute("innerText");

		System.out.println("Dice break number" + Pdicenumber);

		double checkdice = Double.parseDouble(Pdicenumber);

		driver.findElement(By.xpath(p.getProperty("AUTO"))).click();

		driver.findElement(By.xpath(p.getProperty("MANUAL"))).click();

		double num = 0.00000200;

		if (checkdice > 50)

		{

			double totalamount = Dashboardbalance1 + num;

			String s1 = String.format("%.8f", totalamount);

			System.out.println("Dice game win = " + s1);

		}

		else {

			double totalwalletamount = Dashboardbalance1 - num;

			String s2 = String.format("%.8f", totalwalletamount);

			System.out.println("Dice game Loss=" + s2);
		}

	}
}
