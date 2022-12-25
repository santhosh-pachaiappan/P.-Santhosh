package amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

public class Home extends Base{
	
	public Home (ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	
	public Phone enterPhone() throws IOException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone"+Keys.ENTER);
		reportStep("Phone is searched sucessfully","pass");
		return new Phone (driver,node);
	}

}
