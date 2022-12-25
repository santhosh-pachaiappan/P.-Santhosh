package marathon4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import io.github.sukgu.Shadow;

public class CallerPage extends BaseClass {
	public CallerPage(ChromeDriver driver, Shadow shadow,ExtentTest node) {
		this.driver =driver;
		this.shadow=shadow;
		this.node=node;
	
	}
	
	public NewRecord ClickNew() {
		
		
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		return new NewRecord(driver, shadow,node);
		
	}
}
