package testCase;

import java.awt.AWTException;

import org.testng.annotations.Test;

import trackdfect.Login;

public class TestCases extends Login{
	@Test
	public void runLogin() throws InterruptedException, AWTException{
		
		Login lp =new Login();
		lp.VerifyWrongCredentials()
		.CorrectCredentials()
		.EmployeesDetails()
		.PrivateInformation()
		.EmployesAndScheduleActivity()
		.SchuduelActivity()
		.Logout();

	}

}
