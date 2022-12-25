package marathon4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import io.github.sukgu.Shadow;

public class VerifyName extends BaseClass {
	public VerifyName(ChromeDriver driver, Shadow shadow,ExtentTest node) {
		this.driver =driver;
		this.shadow=shadow;
		this.node=node;
	}
	public VerifyName ViewName(String fname) throws InterruptedException {
		WebElement search = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(8000);
		search.clear();
		search.sendKeys(fname,Keys.RETURN);
		return this;
	}

}
