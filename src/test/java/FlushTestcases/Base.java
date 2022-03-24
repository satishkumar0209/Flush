package FlushTestcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	WebDriver driver;

	

	@BeforeMethod
	public void openingbrowser() throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://pojy67209hjyfrthuopvshcnqoclpn.flush.com/");
		

	}
	
	@AfterMethod
	public void closebrowser() throws InterruptedException {
		
		//driver.quit();
	}
		
}
