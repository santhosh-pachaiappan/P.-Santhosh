package marathon4;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteTestcase extends BaseClass {
	
	@BeforeTest
	public void setup() {
		excelfile="Delete";
		testName="Delete Callers";
		testDescription="create a new lead";
		testCatagory="sanity";
		testAuthor="santhosh";
	}
	@Test(dataProvider = "fetchData")
public void runDelete(String uname,String password,String Callers,String fname) throws InterruptedException, IOException {
		
		Login lp = new Login(driver, shadow,node);
		lp.EnterUserName(uname)
		.EnterPassword(password)
		.ClickLogin()
		.ClickAll()
		.enterCallers(Callers)
		.ClickSearch().enterSearch(fname).clickButton().clickOpenRecord().clickDeleteButton().clickOkButton();

	}

}
