package testLayer;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PimPage;

public class LoginTest {

	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.loginFunctionality("Admin","admin123");
		HomePage home=new HomePage();
		home.validateLogo();
		PimPage pim=new PimPage();
		pim.clickOnPimLink();
		pim.createEmployee();
		
	}

}
