package week7_days1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import week7_day1.ReadExcel;

public class ProjectSpecifiedMethod {

	public ChromeDriver driver;
	String file;
	@Parameters ({"url","username", "password" })
	@BeforeMethod
	public void launchBrowser(String url, String username, String password) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
	}
	@AfterMethod
	public void complete() {
		driver.close();
}
	
	@DataProvider(name = "fetchData")
	public String[][] getdata() throws IOException{
		
		String[][] readdata=ReadExcel.readdata(file);
		
		return readdata;
}
	
}