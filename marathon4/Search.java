package marathon4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import io.github.sukgu.Shadow;

public class Search extends BaseClass {

	public Search(ChromeDriver driver, Shadow shadow,ExtentTest node) {
		this.shadow=shadow;
		this.driver=driver;
		this.node=node;
}
	
	public UpdatingExistingCaller EnterSearch(String fname) {
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(fname,Keys.RETURN);
		return new UpdatingExistingCaller(driver,shadow);
	}
	public DeleteCommon enterSearch(String fname) {
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(fname,Keys.RETURN);
		return new DeleteCommon(driver,shadow);
	}
}