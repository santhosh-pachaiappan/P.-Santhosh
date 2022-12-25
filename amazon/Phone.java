package amazon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

public class Phone extends Base {
	
	public Phone (ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public Phone clickDeliveryDay() {
		driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']")).click();
		return this;
	}
	public Phone clickRedmi() throws IOException {
		driver.findElement(By.xpath("//span[text()='Redmi']")).click();
		reportStep("filters are selected sucessfully","pass");
		return this;
	}
	public Phone clickPhone() throws InterruptedException, IOException {
		
		String windowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[contains(text(),'Redmi 10A Sport (Sea Blue, 6GB RAM, 128GB Storage)')]")).click();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		reportStep("required phone is Loaded sucessfully","pass");
		return this;
	}
	public Phone clickNewWindow() throws IOException {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String>lstwindow= new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindow.get(1));
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		reportStep("phone is added to sucessfully","pass");
		return this;
	}
	public Verify clickCart() {
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
		return new Verify(driver,node);
	}
	

}
