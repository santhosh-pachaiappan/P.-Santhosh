package marathon4;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateTestCases extends BaseClass {
	@BeforeTest
	public void setup() {
		excelfile="Create";
		testName="Create Callers";
		testDescription="create a new lead";
		testCatagory="smoke";
		testAuthor="santhosh";
	}
	@Test(dataProvider = "fetchData")
	public void runCreate(String uname,String password,String Callers,String fname, String lname,String mail,String title,String BuisnessPhone,String MobilePhone) throws InterruptedException, IOException {
		
		Login lp = new Login(driver, shadow,node);
		lp.EnterUserName(uname)
		.EnterPassword(password)
		.ClickLogin()
		.ClickAll()
		.enterCallers(Callers)
		.ClickCallers()
		.ClickNew()
		.enterFname(fname)
		.enterLname(lname)
		.enterGmail(mail)
		.enterTitle(title)
		.enterBuisnessPhone(BuisnessPhone)
		.enterMobilePhone(MobilePhone)
		.ClickSubmit()
		.ViewName(fname);
		
	}

}
