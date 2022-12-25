package marathon4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import io.github.sukgu.Shadow;

public class Login extends BaseClass {
	public Login(ChromeDriver driver,Shadow shadow, ExtentTest node) {
		this.driver=driver;
		this.shadow=shadow;
		this.node=node;
	}
	
	public Login EnterUserName(String uname)throws IOException {
		driver.findElement(By.id("user_name")).sendKeys(uname);
		 return this;
			}
	public Login EnterPassword(String pwrd) throws IOException, InterruptedException {
		 driver.findElement(By.id("user_password")).sendKeys(pwrd);
		
			return this;
	}
	public HomePage ClickLogin() throws IOException {
		 driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
    return new HomePage(driver,shadow,node);
	}

}