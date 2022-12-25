package marathon4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import io.github.sukgu.Shadow;

public class HomePage extends BaseClass{
	public HomePage(ChromeDriver driver, Shadow shadow,ExtentTest node) {
		this.driver =driver;
		this.shadow=shadow;
		this.node=node;
	}
	
	public HomePage ClickAll() throws InterruptedException {
	Thread.sleep(5000);
	shadow.setImplicitWait(15);
	shadow.findElementByXPath("//div[text()='All']").click();
	return this;	
	
	}
	
	public HomePage enterCallers(String Callers) {
		
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Callers);
		return this;
		
	}
	public CallerPage ClickCallers() {
		
		shadow.findElementByXPath("//span[text()='Callers']").click();
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame);
		return new CallerPage(driver, shadow,node);
}
public Search ClickSearch() {
		
		shadow.findElementByXPath("//span[text()='Callers']").click();
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame);
		return new Search(driver, shadow,node);
}
}