package marathon4;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UpdatedTestCase extends BaseClass{
	@BeforeTest
	public void setup() {
		excelfile="Update";
		testName="Update Callers";
		testDescription="create a new lead";
		testCatagory="sanity";
		testAuthor="santhosh";
	}
	@Test(dataProvider = "fetchData")
public void runUpdate(String uname,String password,String Callers,String fname, String Phone) throws InterruptedException, IOException {
		
		Login lp = new Login(driver, shadow,node);
		lp.EnterUserName(uname)
		.EnterPassword(password)
		.ClickLogin()
		.ClickAll()
		.enterCallers(Callers)
		.ClickSearch()
		.EnterSearch(fname)
		.ClickButton()
		.ClickOpenRecord()
		.EnterUpdatePhone(Phone)
		.ClickUpdate();

}
}