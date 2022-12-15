package marathan_3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ProjectSpecifiedMethod {
	
	public RemoteWebDriver driver;
	
	@Parameters ({"browser","url","username", "password" })
	@BeforeMethod
	public void launchBrowser(String browser,String url, String username, String password) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions ch=new ChromeOptions();
			ch.addArguments("--disable-notifications");
			driver = new ChromeDriver(ch);
		} else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions ch=new EdgeOptions();
			ch.addArguments("--disable-notifications");
			driver = new EdgeDriver(ch);
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
	}
	@AfterMethod
	public void complete() {
		driver.close();
}
}
