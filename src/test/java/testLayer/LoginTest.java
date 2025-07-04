package testLayer;

import Pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.loginFunctionality("Admin","admin123");
		
	}

}
