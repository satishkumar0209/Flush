package FlushTestcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class Homepagetestcases extends Base {

	@Test(enabled = false, priority = 1)
	public void Login() throws IOException {

		Homepage page = new Homepage();

		page.Login(driver);

		page.takescreenshot(driver);
	}

	@Test(enabled = false, priority = 2)
	public void Logout() throws IOException {
		Homepage page = new Homepage();

		page.Logout(driver);

		page.takescreenshot(driver);

	}

	@Test(enabled = false, priority = 3)
	public void cashier() throws IOException {

		Homepage page = new Homepage();

		page.Login(driver);

		page.Cashier(driver);

	}

	@Test(enabled = false, priority = 4)
	public void VIP() throws IOException {
		Homepage page = new Homepage();

		page.Login(driver);

		page.VIP(driver);

	}

	@Test(enabled = false, priority = 5)
	public void Transaction() throws IOException {
		Homepage page = new Homepage();

		page.Login(driver);

		page.Transaction(driver);

	}

	@Test(enabled = false, priority = 6)
	public void Statistics() throws IOException {
		Homepage page = new Homepage();

		page.Login(driver);

		page.statistics(driver);
	}

	@Test(enabled = false, priority = 7)
	public void Settings() throws IOException {
		Homepage page = new Homepage();

		page.Login(driver);

		page.Settings(driver);
	}

	@Test(enabled = false, priority = 8)
	public void dropoptionschecking() throws IOException {

		Homepage page = new Homepage();

		page.Login(driver);

		page.Cashier(driver);

		page.Transaction(driver);

		page.statistics(driver);

		page.Settings(driver);

		page.Logot(driver);

	}

	@Test(enabled = false, priority = 9)

	public void changepassword() throws IOException {

		Homepage page = new Homepage();

		page.Login(driver);

		page.Changepassword(driver);

	}

	@Test(enabled = false, priority = 10)

	public void oldpasswordincorrect() throws IOException {

		Homepage page = new Homepage();

		page.Login(driver);

		page.Oldpasswordinvalid(driver);

	}

	@Test(enabled = false, priority = 11)

	public void Passwordnotmatch() throws IOException {

		Homepage page = new Homepage();

		page.Login(driver);

		page.Passwordnotmatch(driver);

	}

	@Test(enabled = false, priority = 12)

	public void passwordcancel() throws IOException {

		Homepage page = new Homepage();

		page.Login(driver);

		page.Passwordcancel(driver);

	}

	@Test(enabled = false, priority = 12)

	public void walletbalancelist() throws IOException {

		Homepage page = new Homepage();

		page.Login(driver);

		page.walletbalacelist(driver);

	}

	@Test (enabled = false, priority = 12)

	public void TransactionPageTabChecking() throws IOException {
		
		Homepage page = new Homepage();

		page.Login(driver);

		page.TransactionPageTabsChecking(driver);
	}
	
	@Test (enabled = false, priority = 12)
	
	public void statisticsPageTabchecking() throws IOException {
		
		Homepage page = new Homepage();

		page.Login(driver);

		page.Statisticspagechecking(driver);
		
	}
	
	@Test
	
	public void ChangingUserName() throws IOException {
		
		Homepage page = new Homepage();

		page.Login(driver);
		
		page.changingusername(driver);
	}

	@Test(enabled = false, priority = 13)
	public void dicegamebet() throws IOException {
		Homepage page = new Homepage();

		page.Login(driver);

		page.dicegame(driver);

	}

}
