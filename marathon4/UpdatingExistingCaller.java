package marathon4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class UpdatingExistingCaller extends BaseClass {
	public UpdatingExistingCaller(ChromeDriver driver, Shadow shadow) {
		this.driver =driver;
		this.shadow=shadow;
	}
	
		public UpdatingExistingCaller ClickButton() {
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-icon')])[2]")).click();
		return this;
		}
		public UpdatingExistingCaller ClickOpenRecord() {
		driver.findElement(By.linkText("Open Record")).click();
		return this;
		}
		public UpdatingExistingCaller EnterUpdatePhone(String Phone) {
		WebElement updatePhoneNumber = driver.findElement(By.id("sys_user.phone"));
		updatePhoneNumber.clear();
		updatePhoneNumber.sendKeys(Phone);
		return this;
		}
		public UpdatingExistingCaller ClickUpdate() {
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
		return this;
		}
		
		
		
	}


