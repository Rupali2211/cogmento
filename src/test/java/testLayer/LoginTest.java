package testLayer;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.loginFunctionality("Admin","admin123");
		HomePage home=new HomePage();
		home.validateLogo();
		
	}

}
