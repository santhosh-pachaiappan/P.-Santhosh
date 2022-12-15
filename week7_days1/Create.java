package week7_days1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Create extends ProjectSpecifiedMethod {
	@BeforeTest
	public void excel () {
		file= "createLead";
	}
	@Test (dataProvider= "fetchData")
	public void runCreate(String cname, String fname, String lname, String phone ) {
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
}
	
		/*String[][]data = new String[2][4];
		data[0][0]="TestLeaf";
		data[0][1]="Santhosh";
		data[0][2]= "p";
		data[0][3]= "99";
		
		data[1][0]="LeafTest";
		data[1][1]="Santho";
		data[1][2]= "P";
		data[1][3]= "98";*/
		
	}


