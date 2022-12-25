package marathon4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import io.github.sukgu.Shadow;

public class NewRecord extends BaseClass {
	public NewRecord(ChromeDriver driver, Shadow shadow,ExtentTest node) {
		this.driver =driver;
		this.shadow=shadow;
		this.node=node;
		
		
	}

	public NewRecord enterFname(String fname) {
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys(fname);
		return this;
	}
	public NewRecord enterLname(String lname) {
	driver.findElement(By.id("sys_user.last_name")).sendKeys(lname);
	return this;
	}
	public NewRecord enterGmail(String mail) {
	driver.findElement(By.id("sys_user.email")).sendKeys(mail);
	return this;
	}
	public NewRecord enterTitle(String title) {
	driver.findElement(By.id("sys_user.title")).sendKeys(title);
	return this;
	}
	public NewRecord enterBuisnessPhone(String BuisnessPhone) {
	driver.findElement(By.id("sys_user.phone")).sendKeys(BuisnessPhone);
	return this;
	}
	public NewRecord enterMobilePhone(String MobilePhone) {
	driver.findElement(By.id("sys_user.mobile_phone")).sendKeys(MobilePhone);
	return this;
	}
	public VerifyName ClickSubmit() {
	driver.findElement(By.id("sysverb_insert_bottom")).click();
	return new VerifyName(driver, shadow,node);
}
}
