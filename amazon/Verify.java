package amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

public class Verify extends Base {

	public Verify (ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public Verify verifyPhoneName() throws IOException {
		String text = driver.findElement(By.xpath("(//span[starts-with(text(),'Redmi 10A Sport (Sea Blue, 6GB RAM,')])[2]")).getText();
		System.out.println(text);
		reportStep(text,"pass");
		driver.close();
	
		return this;
}
}