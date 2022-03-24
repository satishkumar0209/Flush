package FlushTestcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class Logintestcases extends Base {

	@Test(priority = 1, enabled = true)
	public void WelcomeLogin() throws IOException {
		Loginpage page = new Loginpage();

		page.LoginWelcomeLogin(driver);
	}

	@Test(enabled = true, priority = 2)
	public void LoginWelcomeregistration() throws IOException {

		Loginpage page = new Loginpage();

		page.LoginWelcomeregistration(driver);
	}

	@Test(enabled = true, priority = 3)

	public void LoginWelcomegoogle() throws IOException {

		Loginpage page = new Loginpage();

		page.LoginWelcomeGoogle(driver);
	}

	@Test(enabled = true, priority = 4)

	public void LoginWelcomeForgotPassword() throws IOException {

		Loginpage page = new Loginpage();

		page.LoginWelcomeForgot(driver);
	}

	@Test(enabled = true, priority = 5)

	public void PasswordRecoveryBackToLogin() throws IOException {

		Loginpage page = new Loginpage();

		page.RecoveryPasswordBackToLogin(driver);
	}

	@Test(enabled = true, priority = 6)

	public void Signup() throws IOException, InterruptedException {
		
		Loginpage page = new Loginpage();

		page.signup(driver);
	}
	
	@Test(enabled = true, priority = 7)

	public void SignupLog() throws IOException, InterruptedException {
		
		Loginpage page = new Loginpage();

		page.SignupLogin(driver);
	}
	
	

	@Test(enabled = true , priority=8)
	
	public void NormaluserLogin() throws IOException {

		Loginpage page = new Loginpage();

		page.Google(driver);
	}

	@Test(enabled = true,priority=9)
	public void Joinwithyouremail() throws IOException, InterruptedException {

		Loginpage page = new Loginpage();

		page.JoinWithYourEmail(driver);

	}
	
	@Test(enabled= true ,priority=10)
	public void JoinWithYourEmailLogin() throws IOException
	{
		Loginpage page = new Loginpage();
		
		page.JoinEmailLogin(driver);
		
	}
	
	@Test(enabled= true ,priority=11)
	public void JoinEmailLoginGoogle() throws IOException 
	{
		Loginpage page = new Loginpage();
		
		page.JoinEmailGoogleLogin(driver);
		
	}

}
