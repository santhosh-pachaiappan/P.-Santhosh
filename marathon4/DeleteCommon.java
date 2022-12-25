package marathon4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class DeleteCommon extends BaseClass {
	
	public DeleteCommon(ChromeDriver driver, Shadow shadow) {
		this.driver =driver;
		this.shadow=shadow;
}
	public DeleteCommon clickButton() {
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-icon')])[2]")).click();
		return this;
		}
		public DeletingExistingCaller clickOpenRecord() {
		driver.findElement(By.linkText("Open Record")).click();
		return new DeletingExistingCaller(driver, shadow);
		}
}
