package marathon4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class DeletingExistingCaller extends BaseClass {
	//public String mobileNumber;
	public DeletingExistingCaller(ChromeDriver driver, Shadow shadow) {
		this.driver =driver;
		this.shadow=shadow;
}

		public  DeletingExistingCaller clickDeleteButton() {
		driver.findElement(By.xpath("(//button[text()='Delete'])[2]")).click();
		return this;//
		}
		public DeletingExistingCaller clickOkButton() {
		driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
		return this;
		}
		

	}

